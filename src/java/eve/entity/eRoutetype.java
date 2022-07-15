/*
 * eRoutetype.java
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
import eve.interfaces.logicentity.IRoutetype;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Routetype
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Routetype Entity
 * 
 * @author Franky Laseure
 */
public class eRoutetype extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected RoutetypePK routetypePK;
    private Security_islandPK security_islandPK;
    private java.lang.String name;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "routetype";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IRoutetype.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRoutetype.fieldtypes[fieldconstant-1];
    }
        
    public eRoutetype() {
    }

    public eRoutetype(long id) {
        this.routetypePK = new RoutetypePK(id);
    }
  
    public eRoutetype(RoutetypePK routetypePK) {
        this.routetypePK = routetypePK;
    }

    @Override
    public boolean isEmpty() {
        return this.routetypePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.routetypePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.routetypePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IRoutetype.SECURITY_ISLAND, this.security_islandPK.getId());

        updates.put(IRoutetype.NAME, name);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return RoutetypePK
     */
    @Override
    public RoutetypePK getPrimaryKey() {
        return this.routetypePK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IRoutetype.NAME, name);
        }
        this.name = name;
    }

    public Security_islandPK getSecurity_islandPK() {
        return this.security_islandPK;
    }

    public void initSecurity_islandPK(ISecurity_islandPK security_islandPK) {
        this.security_islandPK = (Security_islandPK)security_islandPK;
    }

    public void setSecurity_islandPK(ISecurity_islandPK security_islandPK) {
	if(security_islandPK==null && security_islandPK!=this.security_islandPK || security_islandPK!=null) {
            if(security_islandPK==null) {
                updates.put(IRoutetype.SECURITY_ISLAND, null);
            } else {
                updates.put(IRoutetype.SECURITY_ISLAND, security_islandPK.getId());
            }
        }
        this.security_islandPK = (Security_islandPK)security_islandPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
