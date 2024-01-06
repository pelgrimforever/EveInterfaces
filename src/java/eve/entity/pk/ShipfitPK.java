/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IShipfit;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class ShipfitPK implements IShipfitPK {

    private java.lang.String username;
    private java.lang.String shipname;
  
    public ShipfitPK() {
    }

    public ShipfitPK(java.lang.String username, java.lang.String shipname) {
        this.username = username;
        this.shipname = shipname;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"shipfit.username", username}, 
            {"shipfit.shipname", shipname}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IShipfit.USERNAME, username}, 
            {IShipfit.SHIPNAME, shipname}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public java.lang.String getShipname() {
        return this.shipname;
    }

    public void setShipname(java.lang.String shipname) {
        this.shipname = shipname;
    }

    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        if(getShipname()!=null) key += getShipname().length() + "_" + getShipname();
        return key;
    }

    public static ShipfitPK getKey(String keystring) {
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
            return new ShipfitPK(username, shipname);
        }
    }

    public boolean equals(IShipfitPK shipfitPK2) {
        boolean isequal = shipfitPK2!=null;
        if(isequal) {
            isequal = isequal && this.username.equals(shipfitPK2.getUsername());
            isequal = isequal && this.shipname.equals(shipfitPK2.getShipname());
        }
        return isequal;
    }
}
