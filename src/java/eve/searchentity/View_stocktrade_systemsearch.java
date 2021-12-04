/*
 * View_stocktrade_systemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.11.2021 14:51
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_stocktrade_systemsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_stocktrade_system;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_stocktrade_system table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_stocktrade_systemsearch extends Tablesearch implements IView_stocktrade_systemsearch {

    Stringsearch username = new Stringsearch("view_stocktrade_system.username");
    Numbersearch id = new Numbersearch("view_stocktrade_system.id");
    Stringsearch name = new Stringsearch("view_stocktrade_system.name");
    Stringsearch region = new Stringsearch("view_stocktrade_system.region");
    Numbersearch sellprice = new Numbersearch("view_stocktrade_system.sellprice");
    Numbersearch totalvolume = new Numbersearch("view_stocktrade_system.totalvolume");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_stocktrade_system.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_stocktrade_systemsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_stocktrade_systemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(region);
        addFieldsearcher(sellprice);
        addFieldsearcher(totalvolume);
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
     * add String search values for field region, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void region(String[] values) {
        addStringvalues(region, values);
    }
    
    /**
     * add String search values for field region
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void region(String[] values, byte compare, byte andor) {
        addStringvalues(region, values);
        region.setCompareoperator(compare);
        region.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sellprice, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sellprice(Double[] values, byte[] operators) {
        addNumbervalues(sellprice, values, operators);
    }
    
    /**
     * add Numeric search values for field sellprice
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sellprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sellprice, values, operators);
        sellprice.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field totalvolume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void totalvolume(Double[] values, byte[] operators) {
        addNumbervalues(totalvolume, values, operators);
    }
    
    /**
     * add Numeric search values for field totalvolume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void totalvolume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalvolume, values, operators);
        totalvolume.setAndoroperator(andor);
    }
    
}
