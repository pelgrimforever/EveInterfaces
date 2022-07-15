/*
 * eStocktrade.java
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
import eve.interfaces.logicentity.IStocktrade;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Stocktrade
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Stocktrade Entity
 * 
 * @author Franky Laseure
 */
public class eStocktrade extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected StocktradePK stocktradePK;
    private long sellamount;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "stocktrade";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IStocktrade.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStocktrade.fieldtypes[fieldconstant-1];
    }
        
    public eStocktrade() {
    }

    public eStocktrade(java.lang.String username, long evetype, long orderid) {
        this.stocktradePK = new StocktradePK(username, evetype, orderid);
    }
  
    public eStocktrade(StocktradePK stocktradePK) {
        this.stocktradePK = stocktradePK;
    }

    @Override
    public boolean isEmpty() {
        return this.stocktradePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.stocktradePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.stocktradePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IStocktrade.SELLAMOUNT, sellamount);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return StocktradePK
     */
    @Override
    public StocktradePK getPrimaryKey() {
        return this.stocktradePK;
    }

    public long getSellamount() {
        return this.sellamount;
    }

    public void initSellamount(long sellamount) {
        this.sellamount = sellamount;
    }

    public void setSellamount(long sellamount) {
        updates.put(IStocktrade.SELLAMOUNT, sellamount);
        this.sellamount = sellamount;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
