/*
 * eJson_orders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:46
 *
 */

package eve.entity;

import eve.eveDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
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
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Json_orders
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Json_orders Entity
 * 
 * @author Franky Laseure
 */
public class eJson_orders extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Json_ordersPK json_ordersPK;
    private piJson json;
	  
    public static final String table = "json_orders";
	  
    public String getFieldname(short fieldconstant) {
        return IJson_orders.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IJson_orders.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eJson_orders.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eJson_orders.connectionpool;
    }
    
    /**
     * 
     * @return table name for Json_orders
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.json_ordersPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.json_ordersPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IJson_orders.JSON, json);
        return getAllFields();
    }
	
    /**
     * @return Json_ordersPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Json_ordersPK
     */
    @Override
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
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
