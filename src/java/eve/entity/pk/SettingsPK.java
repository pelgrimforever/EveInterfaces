/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ISettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class SettingsPK implements ISettingsPK {

    private java.lang.String name;
  
    public SettingsPK() {
    }

    public SettingsPK(java.lang.String name) {
        this.name = name;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"settings.name", name}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISettings.NAME, name}
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

    public static SettingsPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String name = keys.substring(0, keylength);
            return new SettingsPK(name);
        }
    }

    public boolean equals(ISettingsPK settingsPK2) {
        boolean isequal = settingsPK2!=null;
        if(isequal) {
            isequal = isequal && this.name.equals(settingsPK2.getName());
        }
        return isequal;
    }
}
