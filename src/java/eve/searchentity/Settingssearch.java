/*
 * Settingssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
 *
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

/**
 * Search class for Settings table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Settingssearch extends Tablesearch implements ISettingssearch {

    Stringsearch name = new Stringsearch("settings.name");
    Stringsearch value = new Stringsearch("settings.value");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch usersettingssearcher = new Primarykeysearch("usersettings", IUsersettings.settingsPKfields, IUsersettings.settingsFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Settings.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Settingssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Settingssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(name);
        addFieldsearcher(value);
        addKeysearcher(usersettingssearcher);
    }

    /**
     * add a primary key instance to search for
     * @param settingsPK: Settings primery key
     */
    public void addPrimarykey(ISettingsPK settingsPK) {
        super.addPrimarykey(settingsPK);
    }

    /**
     * add String search values for field name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    /**
     * add String search values for field name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field value, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void value(String[] values) {
        addStringvalues(value, values);
    }
    
    /**
     * add String search values for field value
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void value(String[] values, byte compare, byte andor) {
        addStringvalues(value, values);
        value.setCompareoperator(compare);
        value.setAndoroperator(andor);
    }
    
    /**
     * set external key - foreign key subsearch IUsersettingssearch
     * @param usersettingssearch: IUsersettingssearch
     */
    public void usersettings(IUsersettingssearch usersettingssearch) {
        usersettingssearcher.setTablesearch(usersettingssearch);
    }
    
    /**
     * get external key - foreign key subsearch IUsersettingssearch
     * @return Tablesearch for IUsersettingssearch
     */
    public IUsersettingssearch getUsersettingssearch() {
        if(usersettingssearcher.used()) {
            return (IUsersettingssearch)usersettingssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
