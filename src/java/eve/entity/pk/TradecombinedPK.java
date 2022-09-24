/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ITradecombined;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class TradecombinedPK implements ITradecombinedPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private ISystemPK systemBuy_systemPK = new SystemPK();
    private ISystemPK systemSell_systemPK = new SystemPK();
  
    public TradecombinedPK() {
    }

    public TradecombinedPK(long sell_system, long buy_system, long evetype) {
        this.evetypePK = new EvetypePK(evetype);
        this.systemBuy_systemPK = new SystemPK(buy_system);
        this.systemSell_systemPK = new SystemPK(sell_system);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"tradecombined.sell_system", systemSell_systemPK.getId()}, 
            {"tradecombined.buy_system", systemBuy_systemPK.getId()}, 
            {"tradecombined.evetype", evetypePK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ITradecombined.SELL_SYSTEM, systemSell_systemPK.getId()}, 
            {ITradecombined.BUY_SYSTEM, systemBuy_systemPK.getId()}, 
            {ITradecombined.EVETYPE, evetypePK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IEvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void setEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    public ISystemPK getSystembuy_systemPK() {
        return this.systemBuy_systemPK;
    }

    public void setSystembuy_systemPK(ISystemPK systemPK) {
        this.systemBuy_systemPK = systemPK;
    }

    public ISystemPK getSystemsell_systemPK() {
        return this.systemSell_systemPK;
    }

    public void setSystemsell_systemPK(ISystemPK systemPK) {
        this.systemSell_systemPK = systemPK;
    }

    public long getSell_system() {
        return this.systemSell_systemPK.getId();
    }

    public void setSell_system(long sell_system) {
        this.systemSell_systemPK.setId(sell_system);
    }

    public long getBuy_system() {
        return this.systemBuy_systemPK.getId();
    }

    public void setBuy_system(long buy_system) {
        this.systemBuy_systemPK.setId(buy_system);
    }

    public long getEvetype() {
        return this.evetypePK.getId();
    }

    public void setEvetype(long evetype) {
        this.evetypePK.setId(evetype);
    }

    public String getKeystring() {
        String key = "";
        key += getSell_system();
        key += "_";

        key += getBuy_system();
        key += "_";

        key += getEvetype();
        return key;
    }

    public static TradecombinedPK getKey(String keystring) {
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
            return new TradecombinedPK(sell_system, buy_system, evetype);
        }
    }

    public boolean equals(ITradecombinedPK tradecombinedPK2) {
        boolean isequal = tradecombinedPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(tradecombinedPK2.getEvetypePK());
            isequal = isequal && this.systemBuy_systemPK.equals(tradecombinedPK2.getSystembuy_systemPK());
            isequal = isequal && this.systemSell_systemPK.equals(tradecombinedPK2.getSystemsell_systemPK());
        }
        return isequal;
    }
}
