/*
 * eFrontendpage_auth.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
import eve.interfaces.logicentity.IFrontendpage_auth;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Frontendpage_auth
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Frontendpage_auth Entity
 * 
 * @author Franky Laseure
 */
public class eFrontendpage_auth extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Frontendpage_authPK frontendpage_authPK;
	  
    public static final String table = "frontendpage_auth";
	  
    public String getFieldname(short fieldconstant) {
        return IFrontendpage_auth.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFrontendpage_auth.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eFrontendpage_auth.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eFrontendpage_auth.connectionpool;
    }
    
    /**
     * 
     * @return table name for Frontendpage_auth
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Frontendpage_auth class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Frontendpage_auth entity
     */
    public eFrontendpage_auth() {
    }

    /**
     * Constructor
     * build an empty Frontendpage_auth entity with initialized field values
     */
    public eFrontendpage_auth(java.lang.String username, java.lang.String frontendpage) {
        this.frontendpage_authPK = new Frontendpage_authPK(username, frontendpage);
    }
  
    /**
     * Constructor
     * build an empty Frontendpage_auth entity with initialized Primarykey parameter
     * @param frontendpage_authPK: Frontendpage_auth Primarykey
     */
    public eFrontendpage_auth(Frontendpage_authPK frontendpage_authPK) {
        this.frontendpage_authPK = frontendpage_authPK;
    }

    /**
     * @return is Frontendpage_auth Empty ?
     */
    public boolean isEmpty() {
        return this.frontendpage_authPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.frontendpage_authPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.frontendpage_authPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
    /**
     * @return Frontendpage_authPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Frontendpage_authPK
     */
    @Override
    public Frontendpage_authPK getPrimaryKey() {
        return this.frontendpage_authPK;
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
