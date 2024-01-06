/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IEveuser;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class EveuserPK implements IEveuserPK {

    private java.lang.String username;
  
    public EveuserPK() {
    }

    public EveuserPK(java.lang.String username) {
        this.username = username;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"eveuser.username", username}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IEveuser.USERNAME, username}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        return key;
    }

    public static EveuserPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String username = keys.substring(0, keylength);
            return new EveuserPK(username);
        }
    }

    public boolean equals(IEveuserPK eveuserPK2) {
        boolean isequal = eveuserPK2!=null;
        if(isequal) {
            isequal = isequal && this.username.equals(eveuserPK2.getUsername());
        }
        return isequal;
    }
}
