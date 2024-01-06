/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IShipfitmodule;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class ShipfitmodulePK implements IShipfitmodulePK {

    private IEvetypePK evetypePK = new EvetypePK();
    private IShipfitPK shipfitPK = new ShipfitPK();
  
    public ShipfitmodulePK() {
    }

    public ShipfitmodulePK(java.lang.String username, java.lang.String shipname, long moduletype) {
        this.evetypePK = new EvetypePK(moduletype);
        this.shipfitPK = new ShipfitPK(username, shipname);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"shipfitmodule.username", shipfitPK.getUsername()}, 
            {"shipfitmodule.shipname", shipfitPK.getShipname()}, 
            {"shipfitmodule.moduletype", evetypePK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IShipfitmodule.USERNAME, shipfitPK.getUsername()}, 
            {IShipfitmodule.SHIPNAME, shipfitPK.getShipname()}, 
            {IShipfitmodule.MODULETYPE, evetypePK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IEvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void setEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    public IShipfitPK getShipfitPK() {
        return this.shipfitPK;
    }

    public void setShipfitPK(IShipfitPK shipfitPK) {
        this.shipfitPK = shipfitPK;
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

    public long getModuletype() {
        return this.evetypePK.getId();
    }

    public void setModuletype(long moduletype) {
        this.evetypePK.setId(moduletype);
    }

    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        if(getShipname()!=null) key += getShipname().length() + "_" + getShipname();
        key += "_";

        key += getModuletype();
        return key;
    }

    public static ShipfitmodulePK getKey(String keystring) {
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
            long moduletype = Long.valueOf(keys.substring(0, keylength));
            return new ShipfitmodulePK(username, shipname, moduletype);
        }
    }

    public boolean equals(IShipfitmodulePK shipfitmodulePK2) {
        boolean isequal = shipfitmodulePK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(shipfitmodulePK2.getEvetypePK());
            isequal = isequal && this.shipfitPK.equals(shipfitmodulePK2.getShipfitPK());
        }
        return isequal;
    }
}
