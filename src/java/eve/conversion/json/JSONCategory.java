package eve.conversion.json;

import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import eve.entity.pk.CategoryPK;
import eve.interfaces.entity.pk.ICategoryPK;
import eve.interfaces.logicentity.ICategory;
import eve.logicentity.Category;
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
public class JSONCategory {
    
    public static JSONArray toJSONArray(ArrayList categorys) {
        JSONArray jsoncategorys = new JSONArray();
        Iterator categorysI = categorys.iterator();
        while(categorysI.hasNext()) {
            jsoncategorys.add(toJSON((Category)categorysI.next()));
        }
        return jsoncategorys;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(ICategoryPK categoryPK) {
        JSONObject json = null;
        if(categoryPK!=null) {
            json = new JSONObject();
            json.put("id", String.valueOf(categoryPK.getId()));
        }
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(ICategory category) {
        JSONObject json = new JSONObject();
        json.put("PK", toJSON(category.getPrimaryKey()));
        json.put("name", category.getName());
        json.put("published", category.getPublished());
//Custom code, do not change this line
//Custom code, do not change this line
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(Categorysearch categorysearch) {
        JSONObject json = new JSONObject();
        if(categorysearch.used()) {
            byte andoroperator = categorysearch.getAndoroperator();
            int maxresults = categorysearch.getMaxresults();
            boolean docount = categorysearch.getDocount();
            Iterator<EntityPKInterface> primarykeysI = categorysearch.getPrimarykeys().iterator();
            Iterator<IFieldsearcher> fieldsearchersI = categorysearch.getFieldsearchers().iterator();
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
    public static Categorysearch toCategorysearch(JSONObject json) {
        Categorysearch categorysearch = new Categorysearch();
        categorysearch.setANDORoperator(JSONConversion.getbyte(json, "andor"));
        categorysearch.setMaxresults(JSONConversion.getint(json, "maxresults"));
        categorysearch.setDocount(JSONConversion.getboolean(json, "docount"));
        JSONArray pks = (JSONArray)json.get("primarykeys");
        for(int i=0; i<pks.size(); i++) {
            categorysearch.addPrimarykey(CategoryPK.getKey((String)pks.get(i)));
        }
        JSONObject fss = (JSONObject)json.get("fields");
        JSONObject field;
        field = (JSONObject)fss.get("id");
        if(field!=null) {
            long[] valuearray = JSONConversion.getLongvalues(field);
            byte[] operators = JSONConversion.getNumberoperators(field);
            byte andor = JSONConversion.getbyte(field, "andor");
            categorysearch.id(valuearray, operators, andor);
        }
        field = (JSONObject)fss.get("name");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            categorysearch.name(valuearray, compareoperator, andor);
        }
        field = (JSONObject)fss.get("published");
        if(field!=null) {
            boolean value = JSONConversion.getBooleanvalue(field);
            categorysearch.published(value);
        }
        JSONObject kss = (JSONObject)json.get("keysearch");
        JSONArray keysearch;
        return categorysearch;
    }
    
    public static CategoryPK toCategoryPK(JSONObject json) {
        CategoryPK categoryPK = null;
        if(json!=null) {
            categoryPK = new CategoryPK(JSONConversion.getlong(json, "id"));
        }
        return categoryPK;
    }

    public static Category toCategory(JSONObject json) {
        Category category = new Category(toCategoryPK((JSONObject)json.get("PK")));
        updateCategory(category, json);
        return category;
    }

    public static void updateCategory(ICategory category, JSONObject json) {
        category.setName(JSONConversion.getString(json, "name"));
        category.setPublished(JSONConversion.getboolean(json, "published"));
    }

    public static Category initCategory(JSONObject json) {
        Category category = new Category(toCategoryPK((JSONObject)json.get("PK")));
        category.initName(JSONConversion.getString(json, "name"));
        category.initPublished(JSONConversion.getboolean(json, "published"));
        return category;
    }
}

