/*
 * View_materialinputavgsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.0.2022 17:52
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_materialinputavgsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_materialinputavg;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_materialinputavg table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_materialinputavgsearch extends Tablesearch implements IView_materialinputavgsearch {

    Stringsearch username = new Stringsearch("view_materialinputavg.username");
    Numbersearch evetype = new Numbersearch("view_materialinputavg.evetype");
    Timesearch lastbuytimestamp = new Timesearch("view_materialinputavg.lastbuytimestamp");
    Numbersearch totalamount = new Numbersearch("view_materialinputavg.totalamount");
    Numbersearch avgunitprice = new Numbersearch("view_materialinputavg.avgunitprice");
    Numbersearch totalusedamount = new Numbersearch("view_materialinputavg.totalusedamount");
    Stringsearch name = new Stringsearch("view_materialinputavg.name");
    Numbersearch packaged_volume = new Numbersearch("view_materialinputavg.packaged_volume");
    Numbersearch average = new Numbersearch("view_materialinputavg.average");
    Numbersearch highest = new Numbersearch("view_materialinputavg.highest");
    Numbersearch lowest = new Numbersearch("view_materialinputavg.lowest");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_materialinputavg.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_materialinputavgsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_materialinputavgsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(evetype);
        addFieldsearcher(lastbuytimestamp);
        addFieldsearcher(totalamount);
        addFieldsearcher(avgunitprice);
        addFieldsearcher(totalusedamount);
        addFieldsearcher(name);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
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
     * add Timestamp search values for field lastbuytimestamp, default OR operator is used
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void lastbuytimestamp(Timestamp[] values, byte[] operators) {
        addTimevalues(lastbuytimestamp, values, operators);
    }
    
    /**
     * add Timestamp search values for field lastbuytimestamp
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void lastbuytimestamp(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(lastbuytimestamp, values, operators);
        lastbuytimestamp.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field totalamount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void totalamount(Double[] values, byte[] operators) {
        addNumbervalues(totalamount, values, operators);
    }
    
    /**
     * add Numeric search values for field totalamount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void totalamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalamount, values, operators);
        totalamount.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field avgunitprice, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void avgunitprice(Double[] values, byte[] operators) {
        addNumbervalues(avgunitprice, values, operators);
    }
    
    /**
     * add Numeric search values for field avgunitprice
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void avgunitprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avgunitprice, values, operators);
        avgunitprice.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field totalusedamount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void totalusedamount(Double[] values, byte[] operators) {
        addNumbervalues(totalusedamount, values, operators);
    }
    
    /**
     * add Numeric search values for field totalusedamount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void totalusedamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalusedamount, values, operators);
        totalusedamount.setAndoroperator(andor);
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
     * add Numeric search values for field packaged_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field packaged_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
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
    
}
