/*
 * eShipfitorderselected.java
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
import eve.interfaces.logicentity.IShipfitorderselected;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Shipfitorderselected
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Shipfitorderselected Entity
 * 
 * @author Franky Laseure
 */
public class eShipfitorderselected extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected ShipfitorderselectedPK shipfitorderselectedPK;
    private int amount;
	  
    public static final String table = "shipfitorderselected";
	  
    public String getFieldname(short fieldconstant) {
        return IShipfitorderselected.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IShipfitorderselected.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eShipfitorderselected.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eShipfitorderselected.connectionpool;
    }
    
    /**
     * 
     * @return table name for Shipfitorderselected
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Shipfitorderselected class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Shipfitorderselected entity
     */
    public eShipfitorderselected() {
    }

    /**
     * Constructor
     * build an empty Shipfitorderselected entity with initialized field values
     */
    public eShipfitorderselected(java.lang.String username, java.lang.String shipname, long evetype, long orderid) {
        this.shipfitorderselectedPK = new ShipfitorderselectedPK(username, shipname, evetype, orderid);
    }
  
    /**
     * Constructor
     * build an empty Shipfitorderselected entity with initialized Primarykey parameter
     * @param shipfitorderselectedPK: Shipfitorderselected Primarykey
     */
    public eShipfitorderselected(ShipfitorderselectedPK shipfitorderselectedPK) {
        this.shipfitorderselectedPK = shipfitorderselectedPK;
    }

    /**
     * @return is Shipfitorderselected Empty ?
     */
    public boolean isEmpty() {
        return this.shipfitorderselectedPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.shipfitorderselectedPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.shipfitorderselectedPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IShipfitorderselected.AMOUNT, amount);
        return getAllFields();
    }
	
    /**
     * @return ShipfitorderselectedPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return ShipfitorderselectedPK
     */
    @Override
    public ShipfitorderselectedPK getPrimaryKey() {
        return this.shipfitorderselectedPK;
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
        updates.put(IShipfitorderselected.AMOUNT, amount);
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
