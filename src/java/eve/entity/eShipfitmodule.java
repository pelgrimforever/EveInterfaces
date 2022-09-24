/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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
        
    @Override
    public String getDbtool() {
        return eShipfitmodule.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eShipfitmodule.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eShipfitmodule() {
    }

    public eShipfitmodule(java.lang.String username, java.lang.String shipname, long moduletype) {
        this.shipfitmodulePK = new ShipfitmodulePK(username, shipname, moduletype);
    }
  
    public eShipfitmodule(ShipfitmodulePK shipfitmodulePK) {
        this.shipfitmodulePK = shipfitmodulePK;
    }

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
