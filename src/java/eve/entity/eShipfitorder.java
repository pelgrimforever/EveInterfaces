/*
 * eShipfitorder.java
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
import eve.interfaces.logicentity.IShipfitorder;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Shipfitorder
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Shipfitorder Entity
 * 
 * @author Franky Laseure
 */
public class eShipfitorder extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected ShipfitorderPK shipfitorderPK;
    private int amountwanted;
    private int amountinstock;
	  
    public static final String table = "shipfitorder";
	  
    public String getFieldname(short fieldconstant) {
        return IShipfitorder.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IShipfitorder.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eShipfitorder.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eShipfitorder.connectionpool;
    }
    
    /**
     * 
     * @return table name for Shipfitorder
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Shipfitorder class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Shipfitorder entity
     */
    public eShipfitorder() {
    }

    /**
     * Constructor
     * build an empty Shipfitorder entity with initialized field values
     */
    public eShipfitorder(java.lang.String username, java.lang.String shipname, long evetype) {
        this.shipfitorderPK = new ShipfitorderPK(username, shipname, evetype);
    }
  
    /**
     * Constructor
     * build an empty Shipfitorder entity with initialized Primarykey parameter
     * @param shipfitorderPK: Shipfitorder Primarykey
     */
    public eShipfitorder(ShipfitorderPK shipfitorderPK) {
        this.shipfitorderPK = shipfitorderPK;
    }

    /**
     * @return is Shipfitorder Empty ?
     */
    public boolean isEmpty() {
        return this.shipfitorderPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.shipfitorderPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.shipfitorderPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IShipfitorder.AMOUNTWANTED, amountwanted);
        updates.put(IShipfitorder.AMOUNTINSTOCK, amountinstock);
        return getAllFields();
    }
	
    /**
     * @return ShipfitorderPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return ShipfitorderPK
     */
    @Override
    public ShipfitorderPK getPrimaryKey() {
        return this.shipfitorderPK;
    }

    /**
     * 
     * @return amountwanted value
     */
    public int getAmountwanted() {
        return this.amountwanted;
    }

    /**
     * set amountwanted value
     * @param amountwanted: new value
     */
    public void initAmountwanted(int amountwanted) {
        this.amountwanted = amountwanted;
    }

    /**
     * set amountwanted value
     * @param amountwanted: new value
     */
    public void setAmountwanted(int amountwanted) {
        updates.put(IShipfitorder.AMOUNTWANTED, amountwanted);
        this.amountwanted = amountwanted;
    }

    /**
     * 
     * @return amountinstock value
     */
    public int getAmountinstock() {
        return this.amountinstock;
    }

    /**
     * set amountinstock value
     * @param amountinstock: new value
     */
    public void initAmountinstock(int amountinstock) {
        this.amountinstock = amountinstock;
    }

    /**
     * set amountinstock value
     * @param amountinstock: new value
     */
    public void setAmountinstock(int amountinstock) {
        updates.put(IShipfitorder.AMOUNTINSTOCK, amountinstock);
        this.amountinstock = amountinstock;
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
