/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IShipfitorderselected;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class ShipfitorderselectedPK implements IShipfitorderselectedPK {

    private IOrdersPK ordersPK = new OrdersPK();
    private IShipfitorderPK shipfitorderPK = new ShipfitorderPK();
  
    public ShipfitorderselectedPK() {
    }

    public ShipfitorderselectedPK(java.lang.String username, java.lang.String shipname, long evetype, long orderid) {
        this.ordersPK = new OrdersPK(orderid);
        this.shipfitorderPK = new ShipfitorderPK(username, shipname, evetype);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"shipfitorderselected.username", shipfitorderPK.getUsername()}, 
            {"shipfitorderselected.shipname", shipfitorderPK.getShipname()}, 
            {"shipfitorderselected.evetype", shipfitorderPK.getEvetype()}, 
            {"shipfitorderselected.orderid", ordersPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IShipfitorderselected.USERNAME, shipfitorderPK.getUsername()}, 
            {IShipfitorderselected.SHIPNAME, shipfitorderPK.getShipname()}, 
            {IShipfitorderselected.EVETYPE, shipfitorderPK.getEvetype()}, 
            {IShipfitorderselected.ORDERID, ordersPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IOrdersPK getOrdersPK() {
        return this.ordersPK;
    }

    public void setOrdersPK(IOrdersPK ordersPK) {
        this.ordersPK = ordersPK;
    }

    public IShipfitorderPK getShipfitorderPK() {
        return this.shipfitorderPK;
    }

    public void setShipfitorderPK(IShipfitorderPK shipfitorderPK) {
        this.shipfitorderPK = shipfitorderPK;
    }

    public java.lang.String getUsername() {
        return this.shipfitorderPK.getUsername();
    }

    public void setUsername(java.lang.String username) {
        this.shipfitorderPK.setUsername(username);
    }

    public java.lang.String getShipname() {
        return this.shipfitorderPK.getShipname();
    }

    public void setShipname(java.lang.String shipname) {
        this.shipfitorderPK.setShipname(shipname);
    }

    public long getEvetype() {
        return this.shipfitorderPK.getEvetype();
    }

    public void setEvetype(long evetype) {
        this.shipfitorderPK.setEvetype(evetype);
    }

    public long getOrderid() {
        return this.ordersPK.getId();
    }

    public void setOrderid(long orderid) {
        this.ordersPK.setId(orderid);
    }

    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        if(getShipname()!=null) key += getShipname().length() + "_" + getShipname();
        key += "_";

        key += getEvetype();
        key += "_";

        key += getOrderid();
        return key;
    }

    public static ShipfitorderselectedPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String username = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String shipname = keys.substring(0, keylength);
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
            return new ShipfitorderselectedPK(username, shipname, evetype, orderid);
        }
    }

    public boolean equals(IShipfitorderselectedPK shipfitorderselectedPK2) {
        boolean isequal = shipfitorderselectedPK2!=null;
        if(isequal) {
            isequal = isequal && this.ordersPK.equals(shipfitorderselectedPK2.getOrdersPK());
            isequal = isequal && this.shipfitorderPK.equals(shipfitorderselectedPK2.getShipfitorderPK());
        }
        return isequal;
    }
}
