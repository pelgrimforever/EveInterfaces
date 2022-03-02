/*
 * eEveuser.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.1.2022 20:53
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
import eve.interfaces.logicentity.IEveuser;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Eveuser
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Eveuser Entity
 * 
 * @author Franky Laseure
 */
public class eEveuser extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected EveuserPK eveuserPK;
    private java.sql.Date createdat;
    private boolean admin;
	  
    public static final String table = "eveuser";
	  
    public String getFieldname(short fieldconstant) {
        return IEveuser.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IEveuser.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eEveuser.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eEveuser.connectionpool;
    }
    
    /**
     * 
     * @return table name for Eveuser
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Eveuser class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Eveuser entity
     */
    public eEveuser() {
    }

    /**
     * Constructor
     * build an empty Eveuser entity with initialized field values
     */
    public eEveuser(java.lang.String username) {
        this.eveuserPK = new EveuserPK(username);
    }
  
    /**
     * Constructor
     * build an empty Eveuser entity with initialized Primarykey parameter
     * @param eveuserPK: Eveuser Primarykey
     */
    public eEveuser(EveuserPK eveuserPK) {
        this.eveuserPK = eveuserPK;
    }

    /**
     * @return is Eveuser Empty ?
     */
    public boolean isEmpty() {
        return this.eveuserPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.eveuserPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.eveuserPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IEveuser.CREATEDAT, createdat);
        updates.put(IEveuser.ADMIN, admin);
        return getAllFields();
    }
	
    /**
     * @return EveuserPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return EveuserPK
     */
    @Override
    public EveuserPK getPrimaryKey() {
        return this.eveuserPK;
    }

    /**
     * 
     * @return createdat value
     */
    public java.sql.Date getCreatedat() {
        return this.createdat;
    }

    /**
     * set createdat value
     * @param createdat: new value
     */
    public void initCreatedat(java.sql.Date createdat) {
        this.createdat = createdat;
    }

    /**
     * set createdat value
     * @param createdat: new value
     */
    public void setCreatedat(java.sql.Date createdat) {
	if(createdat==null && createdat!=this.createdat || createdat!=null && !createdat.equals(this.createdat)) {
            updates.put(IEveuser.CREATEDAT, createdat);
        }
        this.createdat = createdat;
    }

    /**
     * 
     * @return admin value
     */
    public boolean getAdmin() {
        return this.admin;
    }

    /**
     * set admin value
     * @param admin: new value
     */
    public void initAdmin(boolean admin) {
        this.admin = admin;
    }

    /**
     * set admin value
     * @param admin: new value
     */
    public void setAdmin(boolean admin) {
        updates.put(IEveuser.ADMIN, admin);
        this.admin = admin;
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
