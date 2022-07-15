/*
 * eJson_orders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:24
 *
 */

package eve.entity;

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

import eve.eveDatabaseproperties;
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "json_orders";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IJson_orders.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IJson_orders.fieldtypes[fieldconstant-1];
    }
        
    public eJson_orders() {
    }

    public eJson_orders(int id) {
        this.json_ordersPK = new Json_ordersPK(id);
    }
  
    public eJson_orders(Json_ordersPK json_ordersPK) {
        this.json_ordersPK = json_ordersPK;
    }

    @Override
    public boolean isEmpty() {
        return this.json_ordersPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.json_ordersPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.json_ordersPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IJson_orders.JSON, json);
        return getAllFields();
    }
	
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

    public piJson getJson() {
        return this.json;
    }

    public void initJson(piJson json) {
        this.json = json;
    }

    public void setJson(piJson json) {
	if(json==null && json!=this.json || json!=null && !json.equals(this.json)) {
            updates.put(IJson_orders.JSON, json);
        }
        this.json = json;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
