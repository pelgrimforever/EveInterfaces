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
import eve.interfaces.logicentity.IStocktrade;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eStocktrade.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eStocktrade.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eStocktrade() {
    }

    public eStocktrade(java.lang.String username, long evetype, long orderid) {
        this.stocktradePK = new StocktradePK(username, evetype, orderid);
    }
  
    public eStocktrade(StocktradePK stocktradePK) {
        this.stocktradePK = stocktradePK;
    }

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
