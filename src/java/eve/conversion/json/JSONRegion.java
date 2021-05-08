package eve.conversion.json;

import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import eve.entity.pk.RegionPK;
import eve.interfaces.entity.pk.IRegionPK;
import eve.interfaces.logicentity.IRegion;
import eve.logicentity.Region;
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
public class JSONRegion {
    
    public static JSONArray toJSONArray(ArrayList regions) {
        JSONArray jsonregions = new JSONArray();
        Iterator regionsI = regions.iterator();
        while(regionsI.hasNext()) {
            jsonregions.add(toJSON((Region)regionsI.next()));
        }
        return jsonregions;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(IRegionPK regionPK) {
        JSONObject json = null;
        if(regionPK!=null) {
            json = new JSONObject();
            json.put("id", String.valueOf(regionPK.getId()));
        }
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(IRegion region) {
        JSONObject json = new JSONObject();
        json.put("PK", toJSON(region.getPrimaryKey()));
        json.put("name", region.getName());
//Custom code, do not change this line
//Custom code, do not change this line
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(Regionsearch regionsearch) {
        JSONObject json = new JSONObject();
        if(regionsearch.used()) {
            byte andoroperator = regionsearch.getAndoroperator();
            int maxresults = regionsearch.getMaxresults();
            boolean docount = regionsearch.getDocount();
            Iterator<EntityPKInterface> primarykeysI = regionsearch.getPrimarykeys().iterator();
            Iterator<IFieldsearcher> fieldsearchersI = regionsearch.getFieldsearchers().iterator();
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
    public static Regionsearch toRegionsearch(JSONObject json) {
        Regionsearch regionsearch = new Regionsearch();
        regionsearch.setANDORoperator(JSONConversion.getbyte(json, "andor"));
        regionsearch.setMaxresults(JSONConversion.getint(json, "maxresults"));
        regionsearch.setDocount(JSONConversion.getboolean(json, "docount"));
        JSONArray pks = (JSONArray)json.get("primarykeys");
        for(int i=0; i<pks.size(); i++) {
            regionsearch.addPrimarykey(RegionPK.getKey((String)pks.get(i)));
        }
        JSONObject fss = (JSONObject)json.get("fields");
        JSONObject field;
        field = (JSONObject)fss.get("id");
        if(field!=null) {
            long[] valuearray = JSONConversion.getLongvalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            regionsearch.id(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("name");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            regionsearch.name(valuearray, compareoperator, andor);
        }
        JSONObject kss = (JSONObject)json.get("keysearch");
        JSONArray keysearch;
        return regionsearch;
    }
    
    public static RegionPK toRegionPK(JSONObject json) {
        RegionPK regionPK = null;
        if(json!=null) {
            regionPK = new RegionPK(JSONConversion.getlong(json, "id"));
        }
        return regionPK;
    }

    public static Region toRegion(JSONObject json) {
        Region region = new Region(toRegionPK((JSONObject)json.get("PK")));
        updateRegion(region, json);
        return region;
    }

    public static void updateRegion(IRegion region, JSONObject json) {
        region.setName(JSONConversion.getString(json, "name"));
    }

    public static Region initRegion(JSONObject json) {
        Region region = new Region(toRegionPK((JSONObject)json.get("PK")));
        region.initName(JSONConversion.getString(json, "name"));
        return region;
    }
}

