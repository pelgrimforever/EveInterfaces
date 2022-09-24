/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IUsersettingssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Usersettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Usersettingssearch extends Tablesearch implements IUsersettingssearch {

    Stringsearch username = new Stringsearch("usersettings.username");
    Stringsearch value = new Stringsearch("usersettings.value");
//foreign keys
    Foreignkeysearch settingssearcher = new Foreignkeysearch("settings", IUsersettings.settingsPKfields, IUsersettings.settingsFKfields);
//external foreign keys

    public String getTable() {
        return Usersettings.table;
    }

    public Usersettingssearch() {
        setFieldsearchers();
    }

    public Usersettingssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(value);
        addKeysearcher(settingssearcher);
    }

    public void addPrimarykey(IUsersettingsPK usersettingsPK) {
        super.addPrimarykey(usersettingsPK);
    }

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void value(String[] values) {
        addStringvalues(value, values);
    }
    
    public void value(String[] values, byte compare, byte andor) {
        addStringvalues(value, values);
        value.setCompareoperator(compare);
        value.setAndoroperator(andor);
    }
    
    public void settings(ISettingssearch settingssearch) {
        settingssearcher.setTablesearch(settingssearch);
    }
    
    public ISettingssearch getSettingssearch() {
        if(settingssearcher.used()) {
            return (ISettingssearch)settingssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSettingsInnerjoin() {
        return settingssearcher.getInnerjoin();
    }

}
