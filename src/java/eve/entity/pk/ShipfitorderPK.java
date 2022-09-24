/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IShipfitorder;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class ShipfitorderPK implements IShipfitorderPK {

    private IShipfitPK shipfitPK = new ShipfitPK();
    private IEvetypePK evetypePK = new EvetypePK();
  
    public ShipfitorderPK() {
    }

    public ShipfitorderPK(java.lang.String username, java.lang.String shipname, long evetype) {
        this.shipfitPK = new ShipfitPK(username, shipname);
        this.evetypePK = new EvetypePK(evetype);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"shipfitorder.username", shipfitPK.getUsername()}, 
            {"shipfitorder.shipname", shipfitPK.getShipname()}, 
            {"shipfitorder.evetype", evetypePK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IShipfitorder.USERNAME, shipfitPK.getUsername()}, 
            {IShipfitorder.SHIPNAME, shipfitPK.getShipname()}, 
            {IShipfitorder.EVETYPE, evetypePK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IShipfitPK getShipfitPK() {
        return this.shipfitPK;
    }

    public void setShipfitPK(IShipfitPK shipfitPK) {
        this.shipfitPK = shipfitPK;
    }

    public IEvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void setEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    public java.lang.String getUsername() {
        return this.shipfitPK.getUsername();
    }

    public void setUsername(java.lang.String username) {
        this.shipfitPK.setUsername(username);
    }

    public java.lang.String getShipname() {
        return this.shipfitPK.getShipname();
    }

    public void setShipname(java.lang.String shipname) {
        this.shipfitPK.setShipname(shipname);
    }

    public long getEvetype() {
        return this.evetypePK.getId();
    }

    public void setEvetype(long evetype) {
        this.evetypePK.setId(evetype);
    }

    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        if(getShipname()!=null) key += getShipname().length() + "_" + getShipname();
        key += "_";

        key += getEvetype();
        return key;
    }

    public static ShipfitorderPK getKey(String keystring) {
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
            return new ShipfitorderPK(username, shipname, evetype);
        }
    }

    public boolean equals(IShipfitorderPK shipfitorderPK2) {
        boolean isequal = shipfitorderPK2!=null;
        if(isequal) {
            isequal = isequal && this.shipfitPK.equals(shipfitorderPK2.getShipfitPK());
            isequal = isequal && this.evetypePK.equals(shipfitorderPK2.getEvetypePK());
        }
        return isequal;
    }
}
