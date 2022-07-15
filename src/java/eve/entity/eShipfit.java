/*
 * eShipfit.java
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
import eve.interfaces.logicentity.IShipfit;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Shipfit
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Shipfit Entity
 * 
 * @author Franky Laseure
 */
public class eShipfit extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected ShipfitPK shipfitPK;
    private EvetypePK evetypePK;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "shipfit";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IShipfit.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IShipfit.fieldtypes[fieldconstant-1];
    }
        
    public eShipfit() {
    }

    public eShipfit(java.lang.String username, java.lang.String shipname) {
        this.shipfitPK = new ShipfitPK(username, shipname);
    }
  
    public eShipfit(ShipfitPK shipfitPK) {
        this.shipfitPK = shipfitPK;
    }

    @Override
    public boolean isEmpty() {
        return this.shipfitPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.shipfitPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.shipfitPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IShipfit.EVETYPE, this.evetypePK.getId());

        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return ShipfitPK
     */
    @Override
    public ShipfitPK getPrimaryKey() {
        return this.shipfitPK;
    }

    public EvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void initEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = (EvetypePK)evetypePK;
    }

    public void setEvetypePK(IEvetypePK evetypePK) {
	if(evetypePK==null && evetypePK!=this.evetypePK || evetypePK!=null) {
            if(evetypePK==null) {
                updates.put(IShipfit.EVETYPE, null);
            } else {
                updates.put(IShipfit.EVETYPE, evetypePK.getId());
            }
        }
        this.evetypePK = (EvetypePK)evetypePK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
