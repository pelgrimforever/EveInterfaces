package eve.conversion.json;

import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import eve.entity.pk.SystemPK;
import eve.interfaces.entity.pk.ISystemPK;
import eve.interfaces.logicentity.ISystem;
import eve.logicentity.System;
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
public class JSONSystem {
    
    public static JSONArray toJSONArray(ArrayList systems) {
        JSONArray jsonsystems = new JSONArray();
        Iterator systemsI = systems.iterator();
        while(systemsI.hasNext()) {
            jsonsystems.add(toJSON((System)systemsI.next()));
        }
        return jsonsystems;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(ISystemPK systemPK) {
        JSONObject json = null;
        if(systemPK!=null) {
            json = new JSONObject();
            json.put("id", String.valueOf(systemPK.getId()));
        }
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(ISystem system) {
        JSONObject json = new JSONObject();
        json.put("PK", toJSON(system.getPrimaryKey()));
        json.put("constellationPK", JSONConstellation.toJSON(system.getConstellationPK()));
        json.put("name", system.getName());
        json.put("security_class", system.getSecurity_class());
        json.put("security_status", system.getSecurity_status());
        json.put("star_id", String.valueOf(system.getStar_id()));
//Custom code, do not change this line
//Custom code, do not change this line
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(Systemsearch systemsearch) {
        JSONObject json = new JSONObject();
        if(systemsearch.used()) {
            byte andoroperator = systemsearch.getAndoroperator();
            int maxresults = systemsearch.getMaxresults();
            boolean docount = systemsearch.getDocount();
            Iterator<EntityPKInterface> primarykeysI = systemsearch.getPrimarykeys().iterator();
            Iterator<IFieldsearcher> fieldsearchersI = systemsearch.getFieldsearchers().iterator();
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
            if(systemsearch.getConstellationsearch()!=null && systemsearch.getConstellationsearch().used()) {
                kss.put("constellationsearcher", JSONConstellation.toJSON((Constellationsearch)systemsearch.getConstellationsearch()));
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
    public static Systemsearch toSystemsearch(JSONObject json) {
        Systemsearch systemsearch = new Systemsearch();
        systemsearch.setANDORoperator(JSONConversion.getbyte(json, "andor"));
        systemsearch.setMaxresults(JSONConversion.getint(json, "maxresults"));
        systemsearch.setDocount(JSONConversion.getboolean(json, "docount"));
        JSONArray pks = (JSONArray)json.get("primarykeys");
        for(int i=0; i<pks.size(); i++) {
            systemsearch.addPrimarykey(SystemPK.getKey((String)pks.get(i)));
        }
        JSONObject fss = (JSONObject)json.get("fields");
        JSONObject field;
        field = (JSONObject)fss.get("id");
        if(field!=null) {
            long[] valuearray = JSONConversion.getLongvalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            systemsearch.id(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("name");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            systemsearch.name(valuearray, compareoperator, andor);
        }
        field = (JSONObject)fss.get("security_class");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            systemsearch.security_class(valuearray, compareoperator, andor);
        }
        field = (JSONObject)fss.get("security_status");
        if(field!=null) {
            Double[] valuearray = JSONConversion.getDoublevalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            systemsearch.security_status(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("star_id");
        if(field!=null) {
            Double[] valuearray = JSONConversion.getDoublevalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            systemsearch.star_id(valuearray, operators, andor);
        }
        JSONObject kss = (JSONObject)json.get("keysearch");
        JSONArray keysearch;
        keysearch = (JSONArray)kss.get("constellationsearcher");
        if(keysearch!=null) {
            for(int i=0; i<keysearch.size(); i++) {
                Constellationsearch constellationsearch = JSONConstellation.toConstellationsearch((JSONObject)keysearch.get(i));
                systemsearch.constellation(constellationsearch);
            }
        }
        return systemsearch;
    }
    
    public static SystemPK toSystemPK(JSONObject json) {
        SystemPK systemPK = null;
        if(json!=null) {
            systemPK = new SystemPK(JSONConversion.getlong(json, "id"));
        }
        return systemPK;
    }

    public static System toSystem(JSONObject json) {
        System system = new System(toSystemPK((JSONObject)json.get("PK")));
        updateSystem(system, json);
        return system;
    }

    public static void updateSystem(ISystem system, JSONObject json) {
        system.setConstellationPK(JSONConstellation.toConstellationPK((JSONObject)json.get("constellationPK")));
        system.setName(JSONConversion.getString(json, "name"));
        system.setSecurity_class(JSONConversion.getString(json, "security_class"));
        system.setSecurity_status(JSONConversion.getdouble(json, "security_status"));
        system.setStar_id(JSONConversion.getlong(json, "star_id"));
    }

    public static System initSystem(JSONObject json) {
        System system = new System(toSystemPK((JSONObject)json.get("PK")));
        system.initConstellationPK(JSONConstellation.toConstellationPK((JSONObject)json.get("constellationPK")));
        system.initName(JSONConversion.getString(json, "name"));
        system.initSecurity_class(JSONConversion.getString(json, "security_class"));
        system.initSecurity_status(JSONConversion.getdouble(json, "security_status"));
        system.initStar_id(JSONConversion.getlong(json, "star_id"));
        return system;
    }
}

