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
import eve.interfaces.logicentity.IShipfit;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eShipfit.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eShipfit.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eShipfit() {
    }

    public eShipfit(java.lang.String username, java.lang.String shipname) {
        this.shipfitPK = new ShipfitPK(username, shipname);
    }
  
    public eShipfit(ShipfitPK shipfitPK) {
        this.shipfitPK = shipfitPK;
    }

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
