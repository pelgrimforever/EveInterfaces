/*
 * eSecurity_island.java
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
import eve.interfaces.logicentity.ISecurity_island;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Security_island
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Security_island Entity
 * 
 * @author Franky Laseure
 */
public class eSecurity_island extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Security_islandPK security_islandPK;
    private java.lang.String name;
    private double security_status;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "security_island";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return ISecurity_island.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISecurity_island.fieldtypes[fieldconstant-1];
    }
        
    public eSecurity_island() {
    }

    public eSecurity_island(long id) {
        this.security_islandPK = new Security_islandPK(id);
    }
  
    public eSecurity_island(Security_islandPK security_islandPK) {
        this.security_islandPK = security_islandPK;
    }

    @Override
    public boolean isEmpty() {
        return this.security_islandPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.security_islandPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.security_islandPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ISecurity_island.NAME, name);
        updates.put(ISecurity_island.SECURITY_STATUS, security_status);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Security_islandPK
     */
    @Override
    public Security_islandPK getPrimaryKey() {
        return this.security_islandPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ISecurity_island.NAME, name);
        }
        this.name = name;
    }

    public double getSecurity_status() {
        return this.security_status;
    }

    public void initSecurity_status(double security_status) {
        this.security_status = security_status;
    }

    public void setSecurity_status(double security_status) {
        updates.put(ISecurity_island.SECURITY_STATUS, security_status);
        this.security_status = security_status;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
