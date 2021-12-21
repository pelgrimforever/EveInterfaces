/*
 * View_evetypessearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 18.11.2021 18:23
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_evetypessearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_evetypes;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_evetypes table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_evetypessearch extends Tablesearch implements IView_evetypessearch {

    Numbersearch category = new Numbersearch("view_evetypes.category");
    Numbersearch typegroupid = new Numbersearch("view_evetypes.typegroupid");
    Stringsearch typegroupname = new Stringsearch("view_evetypes.typegroupname");
    Numbersearch id = new Numbersearch("view_evetypes.id");
    Stringsearch name = new Stringsearch("view_evetypes.name");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_evetypes.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_evetypessearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_evetypessearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(category);
        addFieldsearcher(typegroupid);
        addFieldsearcher(typegroupname);
        addFieldsearcher(id);
        addFieldsearcher(name);
    }

    /**
     * add Numeric search values for field category, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void category(Double[] values, byte[] operators) {
        addNumbervalues(category, values, operators);
    }
    
    /**
     * add Numeric search values for field category
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void category(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(category, values, operators);
        category.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field typegroupid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void typegroupid(Double[] values, byte[] operators) {
        addNumbervalues(typegroupid, values, operators);
    }
    
    /**
     * add Numeric search values for field typegroupid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void typegroupid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(typegroupid, values, operators);
        typegroupid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field typegroupname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void typegroupname(String[] values) {
        addStringvalues(typegroupname, values);
    }
    
    /**
     * add String search values for field typegroupname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void typegroupname(String[] values, byte compare, byte andor) {
        addStringvalues(typegroupname, values);
        typegroupname.setCompareoperator(compare);
        typegroupname.setAndoroperator(andor);
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
    
}
