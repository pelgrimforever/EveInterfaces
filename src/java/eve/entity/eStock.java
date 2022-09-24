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
import eve.interfaces.logicentity.IStock;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eStock extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected StockPK stockPK;
    private long amount;
	  
    public static final String table = "stock";
	  
    public String getFieldname(short fieldconstant) {
        return IStock.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStock.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eStock.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eStock.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eStock() {
    }

    public eStock(java.lang.String username, long evetype) {
        this.stockPK = new StockPK(username, evetype);
    }
  
    public eStock(StockPK stockPK) {
        this.stockPK = stockPK;
    }

    public boolean isEmpty() {
        return this.stockPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.stockPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.stockPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IStock.AMOUNT, amount);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public StockPK getPrimaryKey() {
        return this.stockPK;
    }

    public long getAmount() {
        return this.amount;
    }

    public void initAmount(long amount) {
        this.amount = amount;
    }

    public void setAmount(long amount) {
        updates.put(IStock.AMOUNT, amount);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
