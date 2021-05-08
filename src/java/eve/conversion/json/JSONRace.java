package eve.conversion.json;

import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import eve.entity.pk.RacePK;
import eve.interfaces.entity.pk.IRacePK;
import eve.interfaces.logicentity.IRace;
import eve.logicentity.Race;
import eve.searchentity.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Franky Laseure
 */
public class JSONRace {
    
    public static JSONArray toJSONArray(ArrayList races) {
        JSONArray jsonraces = new JSONArray();
        Iterator racesI = races.iterator();
        while(racesI.hasNext()) {
            jsonraces.add(toJSON((Race)racesI.next()));
        }
        return jsonraces;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(IRacePK racePK) {
        JSONObject json = null;
        if(racePK!=null) {
            json = new JSONObject();
            json.put("id", String.valueOf(racePK.getId()));
        }
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(IRace race) {
        JSONObject json = new JSONObject();
        json.put("PK", toJSON(race.getPrimaryKey()));
        json.put("name", race.getName());
        json.put("description", race.getDescription());
        json.put("alliance", String.valueOf(race.getAlliance()));
//Custom code, do not change this line
//Custom code, do not change this line
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(Racesearch racesearch) {
        JSONObject json = new JSONObject();
        if(racesearch.used()) {
            byte andoroperator = racesearch.getAndoroperator();
            int maxresults = racesearch.getMaxresults();
            boolean docount = racesearch.getDocount();
            Iterator<EntityPKInterface> primarykeysI = racesearch.getPrimarykeys().iterator();
            Iterator<IFieldsearcher> fieldsearchersI = racesearch.getFieldsearchers().iterator();
            EntityPKInterface primarykey;
            IFieldsearcher fieldsearcher;
            
            json.put("andor", andoroperator);
            json.put("maxresults", maxresults);
            json.put("docount", docount);
            JSONArray pks = new JSONArray();
            int i = 0;
            while(primarykeysI.hasNext()) {
                primarykey = primarykeysI.next();
                pks.add(primarykey.getKeystring());
            }
            json.put("primarykeys", pks);
            JSONObject fss = new JSONObject();
            while(fieldsearchersI.hasNext()) {
                fieldsearcher = fieldsearchersI.next();
                if(fieldsearcher.used()) {
                    fss.put(fieldsearcher.getShortFieldname(), JSONConversion.toJSON(fieldsearcher));
                }
            }
            json.put("fields", fss);
            JSONObject kss = new JSONObject();
            json.put("keysearch", kss);
        }
        return json;
    }

    /**
     * 
     * @param json: JSONObject with the Filmsearch parameters
     * @return 
     */
    public static Racesearch toRacesearch(JSONObject json) {
        Racesearch racesearch = new Racesearch();
        racesearch.setANDORoperator(JSONConversion.getbyte(json, "andor"));
        racesearch.setMaxresults(JSONConversion.getint(json, "maxresults"));
        racesearch.setDocount(JSONConversion.getboolean(json, "docount"));
        JSONArray pks = (JSONArray)json.get("primarykeys");
        for(int i=0; i<pks.size(); i++) {
            racesearch.addPrimarykey(RacePK.getKey((String)pks.get(i)));
        }
        JSONObject fss = (JSONObject)json.get("fields");
        JSONObject field;
        field = (JSONObject)fss.get("id");
        if(field!=null) {
            long[] valuearray = JSONConversion.getLongvalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            racesearch.id(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("name");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            racesearch.name(valuearray, compareoperator, andor);
        }
        field = (JSONObject)fss.get("description");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            racesearch.description(valuearray, compareoperator, andor);
        }
        field = (JSONObject)fss.get("alliance");
        if(field!=null) {
            Double[] valuearray = JSONConversion.getDoublevalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            racesearch.alliance(valuearray, operators, andor);
        }
        JSONObject kss = (JSONObject)json.get("keysearch");
        JSONArray keysearch;
        return racesearch;
    }
    
    public static RacePK toRacePK(JSONObject json) {
        RacePK racePK = null;
        if(json!=null) {
            racePK = new RacePK(JSONConversion.getlong(json, "id"));
        }
        return racePK;
    }

    public static Race toRace(JSONObject json) {
        Race race = new Race(toRacePK((JSONObject)json.get("PK")));
        updateRace(race, json);
        return race;
    }

    public static void updateRace(IRace race, JSONObject json) {
        race.setName(JSONConversion.getString(json, "name"));
        race.setDescription(JSONConversion.getString(json, "description"));
        race.setAlliance(JSONConversion.getlong(json, "alliance"));
    }

    public static Race initRace(JSONObject json) {
        Race race = new Race(toRacePK((JSONObject)json.get("PK")));
        race.initName(JSONConversion.getString(json, "name"));
        race.initDescription(JSONConversion.getString(json, "description"));
        race.initAlliance(JSONConversion.getlong(json, "alliance"));
        return race;
    }
}

