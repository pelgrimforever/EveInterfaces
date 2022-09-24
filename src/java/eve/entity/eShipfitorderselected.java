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
import eve.interfaces.logicentity.IShipfitorderselected;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eShipfitorderselected.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eShipfitorderselected.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eShipfitorderselected() {
    }

    public eShipfitorderselected(java.lang.String username, java.lang.String shipname, long evetype, long orderid) {
        this.shipfitorderselectedPK = new ShipfitorderselectedPK(username, shipname, evetype, orderid);
    }
  
    public eShipfitorderselected(ShipfitorderselectedPK shipfitorderselectedPK) {
        this.shipfitorderselectedPK = shipfitorderselectedPK;
    }

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
