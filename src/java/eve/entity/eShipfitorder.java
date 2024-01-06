/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
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
import eve.interfaces.logicentity.IShipfitorder;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eShipfitorder.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eShipfitorder.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eShipfitorder() {
    }

    public eShipfitorder(java.lang.String username, java.lang.String shipname, long evetype) {
        this.shipfitorderPK = new ShipfitorderPK(username, shipname, evetype);
    }
  
    public eShipfitorder(ShipfitorderPK shipfitorderPK) {
        this.shipfitorderPK = shipfitorderPK;
    }

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
