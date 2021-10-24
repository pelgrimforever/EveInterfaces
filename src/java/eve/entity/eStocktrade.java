/*
 * eStocktrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:40
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
	  
    public static final String table = "stocktrade";
	  
    public String getFieldname(short fieldconstant) {
        return IStocktrade.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStocktrade.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eStocktrade.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eStocktrade.connectionpool;
    }
    
    /**
     * 
     * @return table name for Stocktrade
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Stocktrade class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Stocktrade entity
     */
    public eStocktrade() {
    }

    /**
     * Constructor
     * build an empty Stocktrade entity with initialized field values
     */
    public eStocktrade(java.lang.String username, long evetype, long orderid) {
        this.stocktradePK = new StocktradePK(username, evetype, orderid);
    }
  
    /**
     * Constructor
     * build an empty Stocktrade entity with initialized Primarykey parameter
     * @param stocktradePK: Stocktrade Primarykey
     */
    public eStocktrade(StocktradePK stocktradePK) {
        this.stocktradePK = stocktradePK;
    }

    /**
     * @return is Stocktrade Empty ?
     */
    public boolean isEmpty() {
        return this.stocktradePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.stocktradePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.stocktradePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IStocktrade.SELLAMOUNT, sellamount);
        return getAllFields();
    }
	
    /**
     * @return StocktradePK
     */
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

    /**
     * 
     * @return sellamount value
     */
    public long getSellamount() {
        return this.sellamount;
    }

    /**
     * set sellamount value
     * @param sellamount: new value
     */
    public void initSellamount(long sellamount) {
        this.sellamount = sellamount;
    }

    /**
     * set sellamount value
     * @param sellamount: new value
     */
    public void setSellamount(long sellamount) {
        updates.put(IStocktrade.SELLAMOUNT, sellamount);
        this.sellamount = sellamount;
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
