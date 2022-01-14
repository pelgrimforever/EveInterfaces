/*
 * eShipfit.java
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
	  
    public static final String table = "shipfit";
	  
    public String getFieldname(short fieldconstant) {
        return IShipfit.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IShipfit.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eShipfit.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eShipfit.connectionpool;
    }
    
    /**
     * 
     * @return table name for Shipfit
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Shipfit class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Shipfit entity
     */
    public eShipfit() {
    }

    /**
     * Constructor
     * build an empty Shipfit entity with initialized field values
     */
    public eShipfit(java.lang.String username, java.lang.String shipname) {
        this.shipfitPK = new ShipfitPK(username, shipname);
    }
  
    /**
     * Constructor
     * build an empty Shipfit entity with initialized Primarykey parameter
     * @param shipfitPK: Shipfit Primarykey
     */
    public eShipfit(ShipfitPK shipfitPK) {
        this.shipfitPK = shipfitPK;
    }

    /**
     * @return is Shipfit Empty ?
     */
    public boolean isEmpty() {
        return this.shipfitPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.shipfitPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.shipfitPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IShipfit.EVETYPE, this.evetypePK.getId());

        return getAllFields();
    }
	
    /**
     * @return ShipfitPK
     */
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

    /**
     * 
     * @return foreign key evetypePK, instance of EvetypePK
     */
    public EvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
    public void initEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = (EvetypePK)evetypePK;
    }

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
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

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
