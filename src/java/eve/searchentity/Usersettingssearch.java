/*
 * Usersettingssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 8.10.2021 7:21
 *
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

/**
 * Search class for Usersettings table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Usersettingssearch extends Tablesearch implements IUsersettingssearch {

    Stringsearch username = new Stringsearch("usersettings.username");
    Numbersearch value = new Numbersearch("usersettings.value");
    Foreignkeysearch settingssearcher = new Foreignkeysearch("settings", IUsersettings.settingsPKfields, IUsersettings.settingsFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Usersettings.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Usersettingssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Usersettingssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(value);
        addKeysearcher(settingssearcher);
    }

    /**
     * add a primary key instance to search for
     * @param usersettingsPK: Usersettings primery key
     */
    public void addPrimarykey(IUsersettingsPK usersettingsPK) {
        super.addPrimarykey(usersettingsPK);
    }

    /**
     * add String search values for field username, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    /**
     * add String search values for field username
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field value, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void value(Double[] values, byte[] operators) {
        addNumbervalues(value, values, operators);
    }
    
    /**
     * add Numeric search values for field value
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void value(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(value, values, operators);
        value.setAndoroperator(andor);
    }
    
    /**
     * set subsearch settings tablesearch
     * @param settingssearch: ISettingssearch
     */
    public void settings(ISettingssearch settingssearch) {
        settingssearcher.setTablesearch(settingssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Usersettings
     */
    public ISettingssearch getSettingssearch() {
        if(settingssearcher.used()) {
            return (ISettingssearch)settingssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if settingssearcher is not used
     * @return inner join statement
     */
    public String getSettingsInnerjoin() {
        return settingssearcher.getInnerjoin();
    }

}
