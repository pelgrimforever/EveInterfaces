package eve.conversion.json;

import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import eve.entity.pk.ConstellationPK;
import eve.interfaces.entity.pk.IConstellationPK;
import eve.interfaces.logicentity.IConstellation;
import eve.logicentity.Constellation;
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
public class JSONConstellation {
    
    public static JSONArray toJSONArray(ArrayList constellations) {
        JSONArray jsonconstellations = new JSONArray();
        Iterator constellationsI = constellations.iterator();
        while(constellationsI.hasNext()) {
            jsonconstellations.add(toJSON((Constellation)constellationsI.next()));
        }
        return jsonconstellations;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(IConstellationPK constellationPK) {
        JSONObject json = null;
        if(constellationPK!=null) {
            json = new JSONObject();
            json.put("id", String.valueOf(constellationPK.getId()));
        }
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(IConstellation constellation) {
        JSONObject json = new JSONObject();
        json.put("PK", toJSON(constellation.getPrimaryKey()));
        json.put("regionPK", JSONRegion.toJSON(constellation.getRegionPK()));
        json.put("name", constellation.getName());
//Custom code, do not change this line
//Custom code, do not change this line
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(Constellationsearch constellationsearch) {
        JSONObject json = new JSONObject();
        if(constellationsearch.used()) {
            byte andoroperator = constellationsearch.getAndoroperator();
            int maxresults = constellationsearch.getMaxresults();
            boolean docount = constellationsearch.getDocount();
            Iterator<EntityPKInterface> primarykeysI = constellationsearch.getPrimarykeys().iterator();
            Iterator<IFieldsearcher> fieldsearchersI = constellationsearch.getFieldsearchers().iterator();
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
            if(constellationsearch.getRegionsearch()!=null && constellationsearch.getRegionsearch().used()) {
                kss.put("regionsearcher", JSONRegion.toJSON((Regionsearch)constellationsearch.getRegionsearch()));
            }
            json.put("keysearch", kss);
        }
        return json;
    }

    /**
     * 
     * @param json: JSONObject with the Filmsearch parameters
     * @return 
     */
    public static Constellationsearch toConstellationsearch(JSONObject json) {
        Constellationsearch constellationsearch = new Constellationsearch();
        constellationsearch.setANDORoperator(JSONConversion.getbyte(json, "andor"));
        constellationsearch.setMaxresults(JSONConversion.getint(json, "maxresults"));
        constellationsearch.setDocount(JSONConversion.getboolean(json, "docount"));
        JSONArray pks = (JSONArray)json.get("primarykeys");
        for(int i=0; i<pks.size(); i++) {
            constellationsearch.addPrimarykey(ConstellationPK.getKey((String)pks.get(i)));
        }
        JSONObject fss = (JSONObject)json.get("fields");
        JSONObject field;
        field = (JSONObject)fss.get("id");
        if(field!=null) {
            long[] valuearray = JSONConversion.getLongvalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            constellationsearch.id(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("name");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            constellationsearch.name(valuearray, compareoperator, andor);
        }
        JSONObject kss = (JSONObject)json.get("keysearch");
        JSONArray keysearch;
        keysearch = (JSONArray)kss.get("regionsearcher");
        if(keysearch!=null) {
            for(int i=0; i<keysearch.size(); i++) {
                Regionsearch regionsearch = JSONRegion.toRegionsearch((JSONObject)keysearch.get(i));
                constellationsearch.region(regionsearch);
            }
        }
        return constellationsearch;
    }
    
    public static ConstellationPK toConstellationPK(JSONObject json) {
        ConstellationPK constellationPK = null;
        if(json!=null) {
            constellationPK = new ConstellationPK(JSONConversion.getlong(json, "id"));
        }
        return constellationPK;
    }

    public static Constellation toConstellation(JSONObject json) {
        Constellation constellation = new Constellation(toConstellationPK((JSONObject)json.get("PK")));
        updateConstellation(constellation, json);
        return constellation;
    }

    public static void updateConstellation(IConstellation constellation, JSONObject json) {
        constellation.setRegionPK(JSONRegion.toRegionPK((JSONObject)json.get("regionPK")));
        constellation.setName(JSONConversion.getString(json, "name"));
    }

    public static Constellation initConstellation(JSONObject json) {
        Constellation constellation = new Constellation(toConstellationPK((JSONObject)json.get("PK")));
        constellation.initRegionPK(JSONRegion.toRegionPK((JSONObject)json.get("regionPK")));
        constellation.initName(JSONConversion.getString(json, "name"));
        return constellation;
    }
}

