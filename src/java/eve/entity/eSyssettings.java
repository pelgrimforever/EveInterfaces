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
import eve.interfaces.logicentity.ISyssettings;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eSyssettings extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected SyssettingsPK syssettingsPK;
    private java.lang.String value;
	  
    public static final String table = "syssettings";
	  
    public String getFieldname(short fieldconstant) {
        return ISyssettings.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISyssettings.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eSyssettings.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eSyssettings.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eSyssettings() {
    }

    public eSyssettings(java.lang.String name) {
        this.syssettingsPK = new SyssettingsPK(name);
    }
  
    public eSyssettings(SyssettingsPK syssettingsPK) {
        this.syssettingsPK = syssettingsPK;
    }

    public boolean isEmpty() {
        return this.syssettingsPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.syssettingsPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.syssettingsPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ISyssettings.VALUE, value);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public SyssettingsPK getPrimaryKey() {
        return this.syssettingsPK;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public void initValue(java.lang.String value) {
        this.value = value;
    }

    public void setValue(java.lang.String value) {
	if(value==null && value!=this.value || value!=null && !value.equals(this.value)) {
            updates.put(ISyssettings.VALUE, value);
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
