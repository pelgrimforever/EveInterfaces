/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IOrder_history;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Order_historyPK implements IOrder_historyPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private IRegionPK regionPK = new RegionPK();
    private java.sql.Date date;
  
    public Order_historyPK() {
    }

    public Order_historyPK(long region, long evetype, java.sql.Date date) {
        this.evetypePK = new EvetypePK(evetype);
        this.regionPK = new RegionPK(region);
        this.date = date;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"order_history.region", regionPK.getId()}, 
            {"order_history.evetype", evetypePK.getId()}, 
            {"order_history.date", date}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IOrder_history.REGION, regionPK.getId()}, 
            {IOrder_history.EVETYPE, evetypePK.getId()}, 
            {IOrder_history.DATE, date}
        };
        return new Entityvalues(keyfields);
    }

    public IEvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void setEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    public IRegionPK getRegionPK() {
        return this.regionPK;
    }

    public void setRegionPK(IRegionPK regionPK) {
        this.regionPK = regionPK;
    }

    public long getRegion() {
        return this.regionPK.getId();
    }

    public void setRegion(long region) {
        this.regionPK.setId(region);
    }

    public long getEvetype() {
        return this.evetypePK.getId();
    }

    public void setEvetype(long evetype) {
        this.evetypePK.setId(evetype);
    }

    public java.sql.Date getDate() {
        return this.date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public String getKeystring() {
        String key = "";
        key += getRegion();
        key += "_";

        key += getEvetype();
        key += "_";

        if(getDate()!=null) key += getDate().getTime();
        return key;
    }

    public static Order_historyPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long region = Long.valueOf(keys.substring(0, keylength));
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
            java.sql.Date date = new Date(Long.valueOf(keys.substring(0, keylength)));
            return new Order_historyPK(region, evetype, date);
        }
    }

    public boolean equals(IOrder_historyPK order_historyPK2) {
        boolean isequal = order_historyPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(order_historyPK2.getEvetypePK());
            isequal = isequal && this.regionPK.equals(order_historyPK2.getRegionPK());
            isequal = isequal && this.date.equals(order_historyPK2.getDate());
        }
        return isequal;
    }
}
