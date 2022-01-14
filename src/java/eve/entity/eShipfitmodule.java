/*
 * eShipfitmodule.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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
import eve.interfaces.logicentity.IShipfitmodule;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Shipfitmodule
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Shipfitmodule Entity
 * 
 * @author Franky Laseure
 */
public class eShipfitmodule extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected ShipfitmodulePK shipfitmodulePK;
    private int amount;
	  
    public static final String table = "shipfitmodule";
	  
    public String getFieldname(short fieldconstant) {
        return IShipfitmodule.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IShipfitmodule.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eShipfitmodule.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eShipfitmodule.connectionpool;
    }
    
    /**
     * 
     * @return table name for Shipfitmodule
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Shipfitmodule class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Shipfitmodule entity
     */
    public eShipfitmodule() {
    }

    /**
     * Constructor
     * build an empty Shipfitmodule entity with initialized field values
     */
    public eShipfitmodule(java.lang.String username, java.lang.String shipname, long moduletype) {
        this.shipfitmodulePK = new ShipfitmodulePK(username, shipname, moduletype);
    }
  
    /**
     * Constructor
     * build an empty Shipfitmodule entity with initialized Primarykey parameter
     * @param shipfitmodulePK: Shipfitmodule Primarykey
     */
    public eShipfitmodule(ShipfitmodulePK shipfitmodulePK) {
        this.shipfitmodulePK = shipfitmodulePK;
    }

    /**
     * @return is Shipfitmodule Empty ?
     */
    public boolean isEmpty() {
        return this.shipfitmodulePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.shipfitmodulePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.shipfitmodulePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IShipfitmodule.AMOUNT, amount);
        return getAllFields();
    }
	
    /**
     * @return ShipfitmodulePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return ShipfitmodulePK
     */
    @Override
    public ShipfitmodulePK getPrimaryKey() {
        return this.shipfitmodulePK;
    }

    /**
     * 
     * @return amount value
     */
    public int getAmount() {
        return this.amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void initAmount(int amount) {
        this.amount = amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void setAmount(int amount) {
        updates.put(IShipfitmodule.AMOUNT, amount);
        this.amount = amount;
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
