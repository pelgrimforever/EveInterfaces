/*
 * eJson_orders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IJson_orders;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Json_orders
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Json_orders Entity
 * 
 * @author Franky Laseure
 */
public class eJson_orders extends AbstractEntity implements EntityInterface {

    protected Json_ordersPK json_ordersPK;
    private piJson json;
	  
    public static final String table = "json_orders";
    public static final String SQLWhere1 = "id = :json_orders.id:";
    public static final String SQLSelect1 = "select json_orders.* from json_orders where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from json_orders where " + SQLWhere1;
    public static final String SQLSelectAll = "select json_orders.* from json_orders";
	  
    public String getFieldname(short fieldconstant) {
        return IJson_orders.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IJson_orders.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Json_orders
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Json_orders (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Json_orders (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Json_orderss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Json_orders class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Json_orders entity
     */
    public eJson_orders() {
    }

    /**
     * Constructor
     * build an empty Json_orders entity with initialized field values
     */
    public eJson_orders(int id) {
        this.json_ordersPK = new Json_ordersPK(id);
    }
  
    /**
     * Constructor
     * build an empty Json_orders entity with initialized Primarykey parameter
     * @param json_ordersPK: Json_orders Primarykey
     */
    public eJson_orders(Json_ordersPK json_ordersPK) {
        this.json_ordersPK = json_ordersPK;
    }

    /**
     * @return is Json_orders Empty ?
     */
    public boolean isEmpty() {
        return this.json_ordersPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.json_ordersPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.json_ordersPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IJson_orders.JSON, json);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
    public Json_ordersPK getPrimaryKey() {
        return this.json_ordersPK;
    }

    /**
     * 
     * @return json value
     */
    public piJson getJson() {
        return this.json;
    }

    /**
     * set json value
     * @param json: new value
     */
    public void initJson(piJson json) {
        this.json = json;
    }

    /**
     * set json value
     * @param json: new value
     */
    public void setJson(piJson json) {
	if(json==null && json!=this.json || json!=null && !json.equals(this.json)) {
            updates.put(IJson_orders.JSON, json);
        }
        this.json = json;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
