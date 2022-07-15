/*
 * eShipfitorderselected.java
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "shipfitorderselected";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IShipfitorderselected.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IShipfitorderselected.fieldtypes[fieldconstant-1];
    }
        
    public eShipfitorderselected() {
    }

    public eShipfitorderselected(java.lang.String username, java.lang.String shipname, long evetype, long orderid) {
        this.shipfitorderselectedPK = new ShipfitorderselectedPK(username, shipname, evetype, orderid);
    }
  
    public eShipfitorderselected(ShipfitorderselectedPK shipfitorderselectedPK) {
        this.shipfitorderselectedPK = shipfitorderselectedPK;
    }

    @Override
    public boolean isEmpty() {
        return this.shipfitorderselectedPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.shipfitorderselectedPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.shipfitorderselectedPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IShipfitorderselected.AMOUNT, amount);
        return getAllFields();
    }
	
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

    public int getAmount() {
        return this.amount;
    }

    public void initAmount(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        updates.put(IShipfitorderselected.AMOUNT, amount);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
