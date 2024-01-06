/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IStocktrade;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class StocktradePK implements IStocktradePK {

    private IStockPK stockPK = new StockPK();
    private long orderid;
  
    public StocktradePK() {
    }

    public StocktradePK(java.lang.String username, long evetype, long orderid) {
        this.stockPK = new StockPK(username, evetype);
        this.orderid = orderid;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"stocktrade.username", stockPK.getUsername()}, 
            {"stocktrade.evetype", stockPK.getEvetype()}, 
            {"stocktrade.orderid", orderid}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IStocktrade.USERNAME, stockPK.getUsername()}, 
            {IStocktrade.EVETYPE, stockPK.getEvetype()}, 
            {IStocktrade.ORDERID, orderid}
        };
        return new Entityvalues(keyfields);
    }

    public IStockPK getStockPK() {
        return this.stockPK;
    }

    public void setStockPK(IStockPK stockPK) {
        this.stockPK = stockPK;
    }

    public java.lang.String getUsername() {
        return this.stockPK.getUsername();
    }

    public void setUsername(java.lang.String username) {
        this.stockPK.setUsername(username);
    }

    public long getEvetype() {
        return this.stockPK.getEvetype();
    }

    public void setEvetype(long evetype) {
        this.stockPK.setEvetype(evetype);
    }

    public long getOrderid() {
        return this.orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        key += getEvetype();
        key += "_";

        key += getOrderid();
        return key;
    }

    public static StocktradePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String username = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long evetype = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long orderid = Long.valueOf(keys.substring(0, keylength));
            return new StocktradePK(username, evetype, orderid);
        }
    }

    public boolean equals(IStocktradePK stocktradePK2) {
        boolean isequal = stocktradePK2!=null;
        if(isequal) {
            isequal = isequal && this.stockPK.equals(stocktradePK2.getStockPK());
            isequal = isequal && this.orderid == stocktradePK2.getOrderid();
        }
        return isequal;
    }
}
