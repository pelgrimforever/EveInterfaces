/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ISyssettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class SyssettingsPK implements ISyssettingsPK {

    private java.lang.String name;
  
    public SyssettingsPK() {
    }

    public SyssettingsPK(java.lang.String name) {
        this.name = name;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"syssettings.name", name}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISyssettings.NAME, name}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public String getKeystring() {
        String key = "";
        if(getName()!=null) key += getName().length() + "_" + getName();
        return key;
    }

    public static SyssettingsPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String name = keys.substring(0, keylength);
            return new SyssettingsPK(name);
        }
    }

    public boolean equals(ISyssettingsPK syssettingsPK2) {
        boolean isequal = syssettingsPK2!=null;
        if(isequal) {
            isequal = isequal && this.name.equals(syssettingsPK2.getName());
        }
        return isequal;
    }
}
