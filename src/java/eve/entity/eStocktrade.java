/*
 * eStocktrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
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

/**
 * Entity class Stocktrade
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Stocktrade Entity
 * 
 * @author Franky Laseure
 */
public class eStocktrade extends AbstractEntity implements EntityInterface {

    protected StocktradePK stocktradePK;
    private long sellamount;
	  
    public static final String table = "stocktrade";
    public static final String SQLWhere1 = "username = :stocktrade.username: and evetype = :stocktrade.evetype: and orderid = :stocktrade.orderid:";
    public static final String SQLSelect1 = "select stocktrade.* from stocktrade where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from stocktrade where " + SQLWhere1;
    public static final String SQLSelectAll = "select stocktrade.* from stocktrade";
	  
    public String getFieldname(short fieldconstant) {
        return IStocktrade.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStocktrade.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Stocktrade
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Stocktrade (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Stocktrade (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Stocktrades
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.stocktradePK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.stocktradePK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IStocktrade.SELLAMOUNT, sellamount);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
