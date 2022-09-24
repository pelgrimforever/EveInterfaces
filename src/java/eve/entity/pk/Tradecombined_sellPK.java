/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ITradecombined_sell;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Tradecombined_sellPK implements ITradecombined_sellPK {

    private IOrdersPK ordersBuy_order_idPK = new OrdersPK();
    private IOrdersPK ordersSell_order_idPK = new OrdersPK();
    private ITradecombinedPK tradecombinedPK = new TradecombinedPK();
  
    public Tradecombined_sellPK() {
    }

    public Tradecombined_sellPK(long sell_system, long buy_system, long evetype, long buy_order_id, long sell_order_id) {
        this.ordersBuy_order_idPK = new OrdersPK(buy_order_id);
        this.ordersSell_order_idPK = new OrdersPK(sell_order_id);
        this.tradecombinedPK = new TradecombinedPK(sell_system, buy_system, evetype);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"tradecombined_sell.sell_system", tradecombinedPK.getSell_system()}, 
            {"tradecombined_sell.buy_system", tradecombinedPK.getBuy_system()}, 
            {"tradecombined_sell.evetype", tradecombinedPK.getEvetype()}, 
            {"tradecombined_sell.buy_order_id", ordersBuy_order_idPK.getId()}, 
            {"tradecombined_sell.sell_order_id", ordersSell_order_idPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ITradecombined_sell.SELL_SYSTEM, tradecombinedPK.getSell_system()}, 
            {ITradecombined_sell.BUY_SYSTEM, tradecombinedPK.getBuy_system()}, 
            {ITradecombined_sell.EVETYPE, tradecombinedPK.getEvetype()}, 
            {ITradecombined_sell.BUY_ORDER_ID, ordersBuy_order_idPK.getId()}, 
            {ITradecombined_sell.SELL_ORDER_ID, ordersSell_order_idPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IOrdersPK getOrdersbuy_order_idPK() {
        return this.ordersBuy_order_idPK;
    }

    public void setOrdersbuy_order_idPK(IOrdersPK ordersPK) {
        this.ordersBuy_order_idPK = ordersPK;
    }

    public IOrdersPK getOrderssell_order_idPK() {
        return this.ordersSell_order_idPK;
    }

    public void setOrderssell_order_idPK(IOrdersPK ordersPK) {
        this.ordersSell_order_idPK = ordersPK;
    }

    public ITradecombinedPK getTradecombinedPK() {
        return this.tradecombinedPK;
    }

    public void setTradecombinedPK(ITradecombinedPK tradecombinedPK) {
        this.tradecombinedPK = tradecombinedPK;
    }

    public long getSell_system() {
        return this.tradecombinedPK.getSell_system();
    }

    public void setSell_system(long sell_system) {
        this.tradecombinedPK.setSell_system(sell_system);
    }

    public long getBuy_system() {
        return this.tradecombinedPK.getBuy_system();
    }

    public void setBuy_system(long buy_system) {
        this.tradecombinedPK.setBuy_system(buy_system);
    }

    public long getEvetype() {
        return this.tradecombinedPK.getEvetype();
    }

    public void setEvetype(long evetype) {
        this.tradecombinedPK.setEvetype(evetype);
    }

    public long getBuy_order_id() {
        return this.ordersBuy_order_idPK.getId();
    }

    public void setBuy_order_id(long buy_order_id) {
        this.ordersBuy_order_idPK.setId(buy_order_id);
    }

    public long getSell_order_id() {
        return this.ordersSell_order_idPK.getId();
    }

    public void setSell_order_id(long sell_order_id) {
        this.ordersSell_order_idPK.setId(sell_order_id);
    }

    public String getKeystring() {
        String key = "";
        key += getSell_system();
        key += "_";

        key += getBuy_system();
        key += "_";

        key += getEvetype();
        key += "_";

        key += getBuy_order_id();
        key += "_";

        key += getSell_order_id();
        return key;
    }

    public static Tradecombined_sellPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long sell_system = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long buy_system = Long.valueOf(keys.substring(0, keylength));
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
            long buy_order_id = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long sell_order_id = Long.valueOf(keys.substring(0, keylength));
            return new Tradecombined_sellPK(sell_system, buy_system, evetype, buy_order_id, sell_order_id);
        }
    }

    public boolean equals(ITradecombined_sellPK tradecombined_sellPK2) {
        boolean isequal = tradecombined_sellPK2!=null;
        if(isequal) {
            isequal = isequal && this.ordersBuy_order_idPK.equals(tradecombined_sellPK2.getOrdersbuy_order_idPK());
            isequal = isequal && this.ordersSell_order_idPK.equals(tradecombined_sellPK2.getOrderssell_order_idPK());
            isequal = isequal && this.tradecombinedPK.equals(tradecombined_sellPK2.getTradecombinedPK());
        }
        return isequal;
    }
}
