/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IUsersettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class UsersettingsPK implements IUsersettingsPK {

    private ISettingsPK settingsPK = new SettingsPK();
    private java.lang.String username;
  
    public UsersettingsPK() {
    }

    public UsersettingsPK(java.lang.String username, java.lang.String name) {
        this.settingsPK = new SettingsPK(name);
        this.username = username;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"usersettings.name", settingsPK.getName()}, 
            {"usersettings.username", username}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IUsersettings.NAME, settingsPK.getName()}, 
            {IUsersettings.USERNAME, username}
        };
        return new Entityvalues(keyfields);
    }

    public ISettingsPK getSettingsPK() {
        return this.settingsPK;
    }

    public void setSettingsPK(ISettingsPK settingsPK) {
        this.settingsPK = settingsPK;
    }

    public java.lang.String getName() {
        return this.settingsPK.getName();
    }

    public void setName(java.lang.String name) {
        this.settingsPK.setName(name);
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
        key += "_";

        if(getName()!=null) key += getName().length() + "_" + getName();
        return key;
    }

    public static UsersettingsPK getKey(String keystring) {
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
            String name = keys.substring(0, keylength);
            return new UsersettingsPK(username, name);
        }
    }

    public boolean equals(IUsersettingsPK usersettingsPK2) {
        boolean isequal = usersettingsPK2!=null;
        if(isequal) {
            isequal = isequal && this.settingsPK.equals(usersettingsPK2.getSettingsPK());
            isequal = isequal && this.username.equals(usersettingsPK2.getUsername());
        }
        return isequal;
    }
}
