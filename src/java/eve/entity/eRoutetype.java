/*
 * eRoutetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:40
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
	  
    public static final String table = "routetype";
	  
    public String getFieldname(short fieldconstant) {
        return IRoutetype.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRoutetype.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eRoutetype.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eRoutetype.connectionpool;
    }
    
    /**
     * 
     * @return table name for Routetype
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Routetype class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Routetype entity
     */
    public eRoutetype() {
    }

    /**
     * Constructor
     * build an empty Routetype entity with initialized field values
     */
    public eRoutetype(long id) {
        this.routetypePK = new RoutetypePK(id);
    }
  
    /**
     * Constructor
     * build an empty Routetype entity with initialized Primarykey parameter
     * @param routetypePK: Routetype Primarykey
     */
    public eRoutetype(RoutetypePK routetypePK) {
        this.routetypePK = routetypePK;
    }

    /**
     * @return is Routetype Empty ?
     */
    public boolean isEmpty() {
        return this.routetypePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.routetypePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.routetypePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IRoutetype.SECURITY_ISLAND, this.security_islandPK.getId());

        updates.put(IRoutetype.NAME, name);
        return getAllFields();
    }
	
    /**
     * @return RoutetypePK
     */
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

    /**
     * 
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void initName(java.lang.String name) {
        this.name = name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IRoutetype.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return foreign key security_islandPK, instance of Security_islandPK
     */
    public Security_islandPK getSecurity_islandPK() {
        return this.security_islandPK;
    }

    /**
     * set foreign key security_island
     * @param security_islandPK: instance of Security_islandPK
     */
    public void initSecurity_islandPK(ISecurity_islandPK security_islandPK) {
        this.security_islandPK = (Security_islandPK)security_islandPK;
    }

    /**
     * set foreign key security_island
     * @param security_islandPK: instance of Security_islandPK
     */
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

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
