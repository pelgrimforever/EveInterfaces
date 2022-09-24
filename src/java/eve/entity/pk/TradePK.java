/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ITrade;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class TradePK implements ITradePK {

    private IOrdersPK ordersSell_order_idPK = new OrdersPK();
    private IOrdersPK ordersBuy_order_idPK = new OrdersPK();
  
    public TradePK() {
    }

    public TradePK(long sell_order_id, long buy_order_id) {
        this.ordersSell_order_idPK = new OrdersPK(sell_order_id);
        this.ordersBuy_order_idPK = new OrdersPK(buy_order_id);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"trade.sell_order_id", ordersSell_order_idPK.getId()}, 
            {"trade.buy_order_id", ordersBuy_order_idPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ITrade.SELL_ORDER_ID, ordersSell_order_idPK.getId()}, 
            {ITrade.BUY_ORDER_ID, ordersBuy_order_idPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IOrdersPK getOrderssell_order_idPK() {
        return this.ordersSell_order_idPK;
    }

    public void setOrderssell_order_idPK(IOrdersPK ordersPK) {
        this.ordersSell_order_idPK = ordersPK;
    }

    public IOrdersPK getOrdersbuy_order_idPK() {
        return this.ordersBuy_order_idPK;
    }

    public void setOrdersbuy_order_idPK(IOrdersPK ordersPK) {
        this.ordersBuy_order_idPK = ordersPK;
    }

    public long getSell_order_id() {
        return this.ordersSell_order_idPK.getId();
    }

    public void setSell_order_id(long sell_order_id) {
        this.ordersSell_order_idPK.setId(sell_order_id);
    }

    public long getBuy_order_id() {
        return this.ordersBuy_order_idPK.getId();
    }

    public void setBuy_order_id(long buy_order_id) {
        this.ordersBuy_order_idPK.setId(buy_order_id);
    }

    public String getKeystring() {
        String key = "";
        key += getSell_order_id();
        key += "_";

        key += getBuy_order_id();
        return key;
    }

    public static TradePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long sell_order_id = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long buy_order_id = Long.valueOf(keys.substring(0, keylength));
            return new TradePK(sell_order_id, buy_order_id);
        }
    }

    public boolean equals(ITradePK tradePK2) {
        boolean isequal = tradePK2!=null;
        if(isequal) {
            isequal = isequal && this.ordersSell_order_idPK.equals(tradePK2.getOrderssell_order_idPK());
            isequal = isequal && this.ordersBuy_order_idPK.equals(tradePK2.getOrdersbuy_order_idPK());
        }
        return isequal;
    }
}
