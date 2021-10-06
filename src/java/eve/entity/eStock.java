/*
 * eStock.java
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
import eve.interfaces.logicentity.IStock;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Stock
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Stock Entity
 * 
 * @author Franky Laseure
 */
public class eStock extends AbstractEntity implements EntityInterface {

    protected StockPK stockPK;
    private long amount;
	  
    public static final String table = "stock";
    public static final String SQLWhere1 = "username = :stock.username: and evetype = :stock.evetype:";
    public static final String SQLSelect1 = "select stock.* from stock where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from stock where " + SQLWhere1;
    public static final String SQLSelectAll = "select stock.* from stock";
	  
    public String getFieldname(short fieldconstant) {
        return IStock.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStock.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Stock
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Stock (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Stock (=Primarykey)
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
     * @return SQL select statement for all Stocks
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Stock class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Stock entity
     */
    public eStock() {
    }

    /**
     * Constructor
     * build an empty Stock entity with initialized field values
     */
    public eStock(java.lang.String username, long evetype) {
        this.stockPK = new StockPK(username, evetype);
    }
  
    /**
     * Constructor
     * build an empty Stock entity with initialized Primarykey parameter
     * @param stockPK: Stock Primarykey
     */
    public eStock(StockPK stockPK) {
        this.stockPK = stockPK;
    }

    /**
     * @return is Stock Empty ?
     */
    public boolean isEmpty() {
        return this.stockPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.stockPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.stockPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IStock.AMOUNT, amount);
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
    public StockPK getPrimaryKey() {
        return this.stockPK;
    }

    /**
     * 
     * @return amount value
     */
    public long getAmount() {
        return this.amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void initAmount(long amount) {
        this.amount = amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void setAmount(long amount) {
        updates.put(IStock.AMOUNT, amount);

        this.amount = amount;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
