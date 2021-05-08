package eve.conversion.json;

import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import eve.entity.pk.EvetypePK;
import eve.interfaces.entity.pk.IEvetypePK;
import eve.interfaces.logicentity.IEvetype;
import eve.logicentity.Evetype;
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
public class JSONEvetype {
    
    public static JSONArray toJSONArray(ArrayList evetypes) {
        JSONArray jsonevetypes = new JSONArray();
        Iterator evetypesI = evetypes.iterator();
        while(evetypesI.hasNext()) {
            jsonevetypes.add(toJSON((Evetype)evetypesI.next()));
        }
        return jsonevetypes;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(IEvetypePK evetypePK) {
        JSONObject json = null;
        if(evetypePK!=null) {
            json = new JSONObject();
            json.put("id", String.valueOf(evetypePK.getId()));
        }
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(IEvetype evetype) {
        JSONObject json = new JSONObject();
        json.put("PK", toJSON(evetype.getPrimaryKey()));
        json.put("market_groupPK", JSONMarket_group.toJSON(evetype.getMarket_groupPK()));
        json.put("typegroupPK", JSONTypegroup.toJSON(evetype.getTypegroupPK()));
        json.put("graphicPK", JSONGraphic.toJSON(evetype.getGraphicPK()));
        json.put("name", evetype.getName());
        json.put("published", evetype.getPublished());
        json.put("description", evetype.getDescription());
        json.put("capacity", evetype.getCapacity());
        json.put("icon", String.valueOf(evetype.getIcon()));
        json.put("mass", evetype.getMass());
        json.put("packaged_volume", evetype.getPackaged_volume());
        json.put("portion_size", evetype.getPortion_size());
        json.put("radius", evetype.getRadius());
        json.put("volume", evetype.getVolume());
//Custom code, do not change this line
//Custom code, do not change this line
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(Evetypesearch evetypesearch) {
        JSONObject json = new JSONObject();
        if(evetypesearch.used()) {
            byte andoroperator = evetypesearch.getAndoroperator();
            int maxresults = evetypesearch.getMaxresults();
            boolean docount = evetypesearch.getDocount();
            Iterator<EntityPKInterface> primarykeysI = evetypesearch.getPrimarykeys().iterator();
            Iterator<IFieldsearcher> fieldsearchersI = evetypesearch.getFieldsearchers().iterator();
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
            if(evetypesearch.getMarket_groupsearch()!=null && evetypesearch.getMarket_groupsearch().used()) {
                kss.put("market_groupsearcher", JSONMarket_group.toJSON((Market_groupsearch)evetypesearch.getMarket_groupsearch()));
            }
            if(evetypesearch.getTypegroupsearch()!=null && evetypesearch.getTypegroupsearch().used()) {
                kss.put("typegroupsearcher", JSONTypegroup.toJSON((Typegroupsearch)evetypesearch.getTypegroupsearch()));
            }
            if(evetypesearch.getGraphicsearch()!=null && evetypesearch.getGraphicsearch().used()) {
                kss.put("graphicsearcher", JSONGraphic.toJSON((Graphicsearch)evetypesearch.getGraphicsearch()));
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
    public static Evetypesearch toEvetypesearch(JSONObject json) {
        Evetypesearch evetypesearch = new Evetypesearch();
        evetypesearch.setANDORoperator(JSONConversion.getbyte(json, "andor"));
        evetypesearch.setMaxresults(JSONConversion.getint(json, "maxresults"));
        evetypesearch.setDocount(JSONConversion.getboolean(json, "docount"));
        JSONArray pks = (JSONArray)json.get("primarykeys");
        for(int i=0; i<pks.size(); i++) {
            evetypesearch.addPrimarykey(EvetypePK.getKey((String)pks.get(i)));
        }
        JSONObject fss = (JSONObject)json.get("fields");
        JSONObject field;
        field = (JSONObject)fss.get("id");
        if(field!=null) {
            long[] valuearray = JSONConversion.getLongvalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            evetypesearch.id(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("name");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            evetypesearch.name(valuearray, compareoperator, andor);
        }
        field = (JSONObject)fss.get("published");
        if(field!=null) {
            boolean value = JSONConversion.getBooleanvalue(field);
            evetypesearch.published(value);
        }
        field = (JSONObject)fss.get("description");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            evetypesearch.description(valuearray, compareoperator, andor);
        }
        field = (JSONObject)fss.get("capacity");
        if(field!=null) {
            Double[] valuearray = JSONConversion.getDoublevalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            evetypesearch.capacity(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("icon");
        if(field!=null) {
            Double[] valuearray = JSONConversion.getDoublevalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            evetypesearch.icon(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("mass");
        if(field!=null) {
            Double[] valuearray = JSONConversion.getDoublevalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            evetypesearch.mass(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("packaged_volume");
        if(field!=null) {
            Double[] valuearray = JSONConversion.getDoublevalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            evetypesearch.packaged_volume(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("portion_size");
        if(field!=null) {
            Double[] valuearray = JSONConversion.getDoublevalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            evetypesearch.portion_size(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("radius");
        if(field!=null) {
            Double[] valuearray = JSONConversion.getDoublevalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            evetypesearch.radius(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("volume");
        if(field!=null) {
            Double[] valuearray = JSONConversion.getDoublevalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            evetypesearch.volume(valuearray, operators, andor);
        }
        JSONObject kss = (JSONObject)json.get("keysearch");
        JSONArray keysearch;
        keysearch = (JSONArray)kss.get("market_groupsearcher");
        if(keysearch!=null) {
            for(int i=0; i<keysearch.size(); i++) {
                Market_groupsearch market_groupsearch = JSONMarket_group.toMarket_groupsearch((JSONObject)keysearch.get(i));
                evetypesearch.market_group(market_groupsearch);
            }
        }
        keysearch = (JSONArray)kss.get("typegroupsearcher");
        if(keysearch!=null) {
            for(int i=0; i<keysearch.size(); i++) {
                Typegroupsearch typegroupsearch = JSONTypegroup.toTypegroupsearch((JSONObject)keysearch.get(i));
                evetypesearch.typegroup(typegroupsearch);
            }
        }
        keysearch = (JSONArray)kss.get("graphicsearcher");
        if(keysearch!=null) {
            for(int i=0; i<keysearch.size(); i++) {
                Graphicsearch graphicsearch = JSONGraphic.toGraphicsearch((JSONObject)keysearch.get(i));
                evetypesearch.graphic(graphicsearch);
            }
        }
        return evetypesearch;
    }
    
    public static EvetypePK toEvetypePK(JSONObject json) {
        EvetypePK evetypePK = null;
        if(json!=null) {
            evetypePK = new EvetypePK(JSONConversion.getlong(json, "id"));
        }
        return evetypePK;
    }

    public static Evetype toEvetype(JSONObject json) {
        Evetype evetype = new Evetype(toEvetypePK((JSONObject)json.get("PK")));
        updateEvetype(evetype, json);
        return evetype;
    }

    public static void updateEvetype(IEvetype evetype, JSONObject json) {
        evetype.setMarket_groupPK(JSONMarket_group.toMarket_groupPK((JSONObject)json.get("market_groupPK")));
        evetype.setTypegroupPK(JSONTypegroup.toTypegroupPK((JSONObject)json.get("typegroupPK")));
        evetype.setGraphicPK(JSONGraphic.toGraphicPK((JSONObject)json.get("graphicPK")));
        evetype.setName(JSONConversion.getString(json, "name"));
        evetype.setPublished(JSONConversion.getboolean(json, "published"));
        evetype.setDescription(JSONConversion.getString(json, "description"));
        evetype.setCapacity(JSONConversion.getdouble(json, "capacity"));
        evetype.setIcon(JSONConversion.getlong(json, "icon"));
        evetype.setMass(JSONConversion.getdouble(json, "mass"));
        evetype.setPackaged_volume(JSONConversion.getdouble(json, "packaged_volume"));
        evetype.setPortion_size(JSONConversion.getint(json, "portion_size"));
        evetype.setRadius(JSONConversion.getdouble(json, "radius"));
        evetype.setVolume(JSONConversion.getdouble(json, "volume"));
    }

    public static Evetype initEvetype(JSONObject json) {
        Evetype evetype = new Evetype(toEvetypePK((JSONObject)json.get("PK")));
        evetype.initMarket_groupPK(JSONMarket_group.toMarket_groupPK((JSONObject)json.get("market_groupPK")));
        evetype.initTypegroupPK(JSONTypegroup.toTypegroupPK((JSONObject)json.get("typegroupPK")));
        evetype.initGraphicPK(JSONGraphic.toGraphicPK((JSONObject)json.get("graphicPK")));
        evetype.initName(JSONConversion.getString(json, "name"));
        evetype.initPublished(JSONConversion.getboolean(json, "published"));
        evetype.initDescription(JSONConversion.getString(json, "description"));
        evetype.initCapacity(JSONConversion.getdouble(json, "capacity"));
        evetype.initIcon(JSONConversion.getlong(json, "icon"));
        evetype.initMass(JSONConversion.getdouble(json, "mass"));
        evetype.initPackaged_volume(JSONConversion.getdouble(json, "packaged_volume"));
        evetype.initPortion_size(JSONConversion.getint(json, "portion_size"));
        evetype.initRadius(JSONConversion.getdouble(json, "radius"));
        evetype.initVolume(JSONConversion.getdouble(json, "volume"));
        return evetype;
    }
}

