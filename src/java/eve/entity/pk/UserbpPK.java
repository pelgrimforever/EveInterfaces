/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IUserbp;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class UserbpPK implements IUserbpPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private java.lang.String username;
    private int serialnumber;
  
    public UserbpPK() {
    }

    public UserbpPK(java.lang.String username, long bp, int serialnumber) {
        this.evetypePK = new EvetypePK(bp);
        this.username = username;
        this.serialnumber = serialnumber;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"userbp.bp", evetypePK.getId()}, 
            {"userbp.username", username}, 
            {"userbp.serialnumber", serialnumber}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IUserbp.BP, evetypePK.getId()}, 
            {IUserbp.USERNAME, username}, 
            {IUserbp.SERIALNUMBER, serialnumber}
        };
        return new Entityvalues(keyfields);
    }

    public IEvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void setEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    public long getBp() {
        return this.evetypePK.getId();
    }

    public void setBp(long bp) {
        this.evetypePK.setId(bp);
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public int getSerialnumber() {
        return this.serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        key += getBp();
        key += "_";

        key += getSerialnumber();
        return key;
    }

    public static UserbpPK getKey(String keystring) {
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
            long bp = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int serialnumber = Integer.valueOf(keys.substring(0, keylength));
            return new UserbpPK(username, bp, serialnumber);
        }
    }

    public boolean equals(IUserbpPK userbpPK2) {
        boolean isequal = userbpPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(userbpPK2.getEvetypePK());
            isequal = isequal && this.username.equals(userbpPK2.getUsername());
            isequal = isequal && this.serialnumber == userbpPK2.getSerialnumber();
        }
        return isequal;
    }
}
