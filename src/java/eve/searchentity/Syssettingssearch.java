/*
 * Syssettingssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISyssettingssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Syssettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Syssettings table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Syssettingssearch extends Tablesearch implements ISyssettingssearch {

    Stringsearch name = new Stringsearch("syssettings.name");
    Stringsearch value = new Stringsearch("syssettings.value");
//foreign keys
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Syssettings.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Syssettingssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Syssettingssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(name);
        addFieldsearcher(value);
    }

    /**
     * add a primary key instance to search for
     * @param syssettingsPK: Syssettings primery key
     */
    public void addPrimarykey(ISyssettingsPK syssettingsPK) {
        super.addPrimarykey(syssettingsPK);
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
    
}
