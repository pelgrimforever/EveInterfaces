/*
 * View_evetype_order_history_region_monthsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.1.2022 21:46
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_evetype_order_history_region_monthsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_evetype_order_history_region_month;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_evetype_order_history_region_month table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_evetype_order_history_region_monthsearch extends Tablesearch implements IView_evetype_order_history_region_monthsearch {

    Numbersearch region = new Numbersearch("view_evetype_order_history_region_month.region");
    Stringsearch regionname = new Stringsearch("view_evetype_order_history_region_month.regionname");
    Numbersearch evetype = new Numbersearch("view_evetype_order_history_region_month.evetype");
    Numbersearch year = new Numbersearch("view_evetype_order_history_region_month.year");
    Numbersearch month = new Numbersearch("view_evetype_order_history_region_month.month");
    Numbersearch average = new Numbersearch("view_evetype_order_history_region_month.average");
    Numbersearch highest = new Numbersearch("view_evetype_order_history_region_month.highest");
    Numbersearch lowest = new Numbersearch("view_evetype_order_history_region_month.lowest");
    Numbersearch volume = new Numbersearch("view_evetype_order_history_region_month.volume");
    Numbersearch ordercount = new Numbersearch("view_evetype_order_history_region_month.ordercount");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_evetype_order_history_region_month.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_evetype_order_history_region_monthsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_evetype_order_history_region_monthsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(region);
        addFieldsearcher(regionname);
        addFieldsearcher(evetype);
        addFieldsearcher(year);
        addFieldsearcher(month);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
        addFieldsearcher(volume);
        addFieldsearcher(ordercount);
    }

    /**
     * add Numeric search values for field region, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void region(Double[] values, byte[] operators) {
        addNumbervalues(region, values, operators);
    }
    
    /**
     * add Numeric search values for field region
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void region(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(region, values, operators);
        region.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field regionname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void regionname(String[] values) {
        addStringvalues(regionname, values);
    }
    
    /**
     * add String search values for field regionname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void regionname(String[] values, byte compare, byte andor) {
        addStringvalues(regionname, values);
        regionname.setCompareoperator(compare);
        regionname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field evetype, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    /**
     * add Numeric search values for field evetype
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field year, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void year(Double[] values, byte[] operators) {
        addNumbervalues(year, values, operators);
    }
    
    /**
     * add Numeric search values for field year
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void year(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(year, values, operators);
        year.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field month, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void month(Double[] values, byte[] operators) {
        addNumbervalues(month, values, operators);
    }
    
    /**
     * add Numeric search values for field month
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void month(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(month, values, operators);
        month.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field average, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void average(Double[] values, byte[] operators) {
        addNumbervalues(average, values, operators);
    }
    
    /**
     * add Numeric search values for field average
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void average(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(average, values, operators);
        average.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field highest, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void highest(Double[] values, byte[] operators) {
        addNumbervalues(highest, values, operators);
    }
    
    /**
     * add Numeric search values for field highest
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void highest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(highest, values, operators);
        highest.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field lowest, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void lowest(Double[] values, byte[] operators) {
        addNumbervalues(lowest, values, operators);
    }
    
    /**
     * add Numeric search values for field lowest
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void lowest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lowest, values, operators);
        lowest.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void volume(Double[] values, byte[] operators) {
        addNumbervalues(volume, values, operators);
    }
    
    /**
     * add Numeric search values for field volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume, values, operators);
        volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field ordercount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void ordercount(Double[] values, byte[] operators) {
        addNumbervalues(ordercount, values, operators);
    }
    
    /**
     * add Numeric search values for field ordercount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void ordercount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(ordercount, values, operators);
        ordercount.setAndoroperator(andor);
    }
    
}
