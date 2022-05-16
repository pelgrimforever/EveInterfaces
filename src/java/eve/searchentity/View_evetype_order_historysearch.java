/*
 * View_evetype_order_historysearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_evetype_order_historysearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_evetype_order_history;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_evetype_order_history table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_evetype_order_historysearch extends Tablesearch implements IView_evetype_order_historysearch {

    Numbersearch evetype = new Numbersearch("view_evetype_order_history.evetype");
    Datesearch date = new Datesearch("view_evetype_order_history.date");
    Numbersearch average = new Numbersearch("view_evetype_order_history.average");
    Numbersearch highest = new Numbersearch("view_evetype_order_history.highest");
    Numbersearch lowest = new Numbersearch("view_evetype_order_history.lowest");
    Numbersearch volume = new Numbersearch("view_evetype_order_history.volume");
    Numbersearch ordercount = new Numbersearch("view_evetype_order_history.ordercount");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_evetype_order_history.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_evetype_order_historysearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_evetype_order_historysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(evetype);
        addFieldsearcher(date);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
        addFieldsearcher(volume);
        addFieldsearcher(ordercount);
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
     * add Date search values for field date, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void date(Date[] values, byte[] operators) {
        addDatevalues(date, values, operators);
    }
    
    /**
     * add Date search values for field date
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void date(Date[] values, byte[] operators, byte andor) {
        addDatevalues(date, values, operators);
        date.setAndoroperator(andor);
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
