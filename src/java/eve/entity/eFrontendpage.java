/*
 * eFrontendpage.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 13.1.2022 17:48
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
import eve.interfaces.logicentity.IFrontendpage;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Frontendpage
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Frontendpage Entity
 * 
 * @author Franky Laseure
 */
public class eFrontendpage extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected FrontendpagePK frontendpagePK;
	  
    public static final String table = "frontendpage";
	  
    public String getFieldname(short fieldconstant) {
        return IFrontendpage.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFrontendpage.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eFrontendpage.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eFrontendpage.connectionpool;
    }
    
    /**
     * 
     * @return table name for Frontendpage
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Frontendpage class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Frontendpage entity
     */
    public eFrontendpage() {
    }

    /**
     * Constructor
     * build an empty Frontendpage entity with initialized field values
     */
    public eFrontendpage(java.lang.String name) {
        this.frontendpagePK = new FrontendpagePK(name);
    }
  
    /**
     * Constructor
     * build an empty Frontendpage entity with initialized Primarykey parameter
     * @param frontendpagePK: Frontendpage Primarykey
     */
    public eFrontendpage(FrontendpagePK frontendpagePK) {
        this.frontendpagePK = frontendpagePK;
    }

    /**
     * @return is Frontendpage Empty ?
     */
    public boolean isEmpty() {
        return this.frontendpagePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.frontendpagePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.frontendpagePK.getPrimarykeyvalues();	  
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
     * @return FrontendpagePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return FrontendpagePK
     */
    @Override
    public FrontendpagePK getPrimaryKey() {
        return this.frontendpagePK;
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
