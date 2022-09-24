/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISettingssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Settings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Settingssearch extends Tablesearch implements ISettingssearch {

    Stringsearch name = new Stringsearch("settings.name");
    Stringsearch value = new Stringsearch("settings.value");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch usersettingssearcher = new Primarykeysearch("usersettings", IUsersettings.settingsPKfields, IUsersettings.settingsFKfields);

    public String getTable() {
        return Settings.table;
    }

    public Settingssearch() {
        setFieldsearchers();
    }

    public Settingssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(name);
        addFieldsearcher(value);
        addKeysearcher(usersettingssearcher);
    }

    public void addPrimarykey(ISettingsPK settingsPK) {
        super.addPrimarykey(settingsPK);
    }

    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void value(String[] values) {
        addStringvalues(value, values);
    }
    
    public void value(String[] values, byte compare, byte andor) {
        addStringvalues(value, values);
        value.setCompareoperator(compare);
        value.setAndoroperator(andor);
    }
    
    public void usersettings(IUsersettingssearch usersettingssearch) {
        usersettingssearcher.setTablesearch(usersettingssearch);
    }
    
    public IUsersettingssearch getUsersettingssearch() {
        if(usersettingssearcher.used()) {
            return (IUsersettingssearch)usersettingssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
