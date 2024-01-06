/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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
        
    @Override
    public String getDbtool() {
        return eJson_orders.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eJson_orders.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eJson_orders() {
    }

    public eJson_orders(int id) {
        this.json_ordersPK = new Json_ordersPK(id);
    }
  
    public eJson_orders(Json_ordersPK json_ordersPK) {
        this.json_ordersPK = json_ordersPK;
    }

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
