/*
 * View_security_island_systemcountsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_security_island_systemcountsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.view.eView_security_island_systemcount;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_security_island_systemcount table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_security_island_systemcountsearch extends Tablesearch implements IView_security_island_systemcountsearch {

    Numbersearch id = new Numbersearch("view_security_island_systemcount.id");
    Stringsearch name = new Stringsearch("view_security_island_systemcount.name");
    Numbersearch systems = new Numbersearch("view_security_island_systemcount.systems");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_security_island_systemcountsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_security_island_systemcountsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(systems);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(Double[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(Double[] values, byte[] operators, byte andor) {
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
     * add Numeric search values for field systems, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void systems(Double[] values, byte[] operators) {
        addNumbervalues(systems, values, operators);
    }
    
    /**
     * add Numeric search values for field systems
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void systems(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(systems, values, operators);
        systems.setAndoroperator(andor);
    }
    
}
