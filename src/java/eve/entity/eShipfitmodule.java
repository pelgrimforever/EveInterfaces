/*
 * eShipfitmodule.java
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "shipfitmodule";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IShipfitmodule.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IShipfitmodule.fieldtypes[fieldconstant-1];
    }
        
    public eShipfitmodule() {
    }

    public eShipfitmodule(java.lang.String username, java.lang.String shipname, long moduletype) {
        this.shipfitmodulePK = new ShipfitmodulePK(username, shipname, moduletype);
    }
  
    public eShipfitmodule(ShipfitmodulePK shipfitmodulePK) {
        this.shipfitmodulePK = shipfitmodulePK;
    }

    @Override
    public boolean isEmpty() {
        return this.shipfitmodulePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.shipfitmodulePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.shipfitmodulePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IShipfitmodule.AMOUNT, amount);
        return getAllFields();
    }
	
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

    public int getAmount() {
        return this.amount;
    }

    public void initAmount(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        updates.put(IShipfitmodule.AMOUNT, amount);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
