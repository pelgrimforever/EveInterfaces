/*
 * eShipfitorder.java
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "shipfitorder";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IShipfitorder.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IShipfitorder.fieldtypes[fieldconstant-1];
    }
        
    public eShipfitorder() {
    }

    public eShipfitorder(java.lang.String username, java.lang.String shipname, long evetype) {
        this.shipfitorderPK = new ShipfitorderPK(username, shipname, evetype);
    }
  
    public eShipfitorder(ShipfitorderPK shipfitorderPK) {
        this.shipfitorderPK = shipfitorderPK;
    }

    @Override
    public boolean isEmpty() {
        return this.shipfitorderPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.shipfitorderPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.shipfitorderPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IShipfitorder.AMOUNTWANTED, amountwanted);
        updates.put(IShipfitorder.AMOUNTINSTOCK, amountinstock);
        return getAllFields();
    }
	
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

    public int getAmountwanted() {
        return this.amountwanted;
    }

    public void initAmountwanted(int amountwanted) {
        this.amountwanted = amountwanted;
    }

    public void setAmountwanted(int amountwanted) {
        updates.put(IShipfitorder.AMOUNTWANTED, amountwanted);
        this.amountwanted = amountwanted;
    }

    public int getAmountinstock() {
        return this.amountinstock;
    }

    public void initAmountinstock(int amountinstock) {
        this.amountinstock = amountinstock;
    }

    public void setAmountinstock(int amountinstock) {
        updates.put(IShipfitorder.AMOUNTINSTOCK, amountinstock);
        this.amountinstock = amountinstock;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
