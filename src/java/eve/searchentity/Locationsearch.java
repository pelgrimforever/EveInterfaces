/*
 * Locationsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ILocationsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eLocation;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Location table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Locationsearch extends Tablesearch implements ILocationsearch {

    Numbersearch id = new Numbersearch("location.id");
    Stringsearch name = new Stringsearch("location.name");
    Booleansearch visited = new Booleansearch("location.visited");
    Booleansearch access = new Booleansearch("location.access");
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", ILocation.systemPKfields, ILocation.systemFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Locationsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Locationsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(visited);
        addFieldsearcher(access);
        addKeysearcher(systemsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param locationPK: Location primery key
     */
    public void addPrimarykey(ILocationPK locationPK) {
        super.addPrimarykey(locationPK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
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
     * add Boolean search values for field visited
     * @param value: true or false
     */
    public void visited(Boolean value) {
        addBooleanvalue(visited, value);
    }
    
    /**
     * add Boolean search values for field access
     * @param value: true or false
     */
    public void access(Boolean value) {
        addBooleanvalue(access, value);
    }
    
    /**
     * set subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Location
     */
    public ISystemsearch getSystemsearch() {
        if(systemsearcher.used()) {
            return (ISystemsearch)systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemsearcher is not used
     * @return inner join statement
     */
    public String getSystemInnerjoin() {
        return systemsearcher.getInnerjoin();
    }

}
