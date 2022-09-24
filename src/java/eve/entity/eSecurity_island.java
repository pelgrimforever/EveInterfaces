/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
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
import eve.interfaces.logicentity.ISecurity_island;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eSecurity_island extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Security_islandPK security_islandPK;
    private java.lang.String name;
    private double security_status;
	  
    public static final String table = "security_island";
	  
    public String getFieldname(short fieldconstant) {
        return ISecurity_island.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISecurity_island.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eSecurity_island.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eSecurity_island.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eSecurity_island() {
    }

    public eSecurity_island(long id) {
        this.security_islandPK = new Security_islandPK(id);
    }
  
    public eSecurity_island(Security_islandPK security_islandPK) {
        this.security_islandPK = security_islandPK;
    }

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
