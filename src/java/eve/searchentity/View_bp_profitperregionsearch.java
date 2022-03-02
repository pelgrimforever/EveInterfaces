/*
 * View_bp_profitperregionsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 22.1.2022 8:34
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_bp_profitperregionsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_bp_profitperregion;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_bp_profitperregion table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_bp_profitperregionsearch extends Tablesearch implements IView_bp_profitperregionsearch {

    Numbersearch categoryid = new Numbersearch("view_bp_profitperregion.categoryid");
    Stringsearch categoryname = new Stringsearch("view_bp_profitperregion.categoryname");
    Numbersearch typegroupid = new Numbersearch("view_bp_profitperregion.typegroupid");
    Stringsearch typegroupname = new Stringsearch("view_bp_profitperregion.typegroupname");
    Numbersearch id = new Numbersearch("view_bp_profitperregion.id");
    Stringsearch name = new Stringsearch("view_bp_profitperregion.name");
    Numbersearch estimatedproductioncost = new Numbersearch("view_bp_profitperregion.estimatedproductioncost");
    Numbersearch region = new Numbersearch("view_bp_profitperregion.region");
    Stringsearch regionname = new Stringsearch("view_bp_profitperregion.regionname");
    Numbersearch year = new Numbersearch("view_bp_profitperregion.year");
    Numbersearch month = new Numbersearch("view_bp_profitperregion.month");
    Numbersearch average = new Numbersearch("view_bp_profitperregion.average");
    Numbersearch highest = new Numbersearch("view_bp_profitperregion.highest");
    Numbersearch lowest = new Numbersearch("view_bp_profitperregion.lowest");
    Numbersearch volume = new Numbersearch("view_bp_profitperregion.volume");
    Numbersearch ordercount = new Numbersearch("view_bp_profitperregion.ordercount");
    Numbersearch percprofit = new Numbersearch("view_bp_profitperregion.percprofit");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_bp_profitperregion.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_bp_profitperregionsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_bp_profitperregionsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(categoryid);
        addFieldsearcher(categoryname);
        addFieldsearcher(typegroupid);
        addFieldsearcher(typegroupname);
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(estimatedproductioncost);
        addFieldsearcher(region);
        addFieldsearcher(regionname);
        addFieldsearcher(year);
        addFieldsearcher(month);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
        addFieldsearcher(volume);
        addFieldsearcher(ordercount);
        addFieldsearcher(percprofit);
    }

    /**
     * add Numeric search values for field categoryid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void categoryid(Double[] values, byte[] operators) {
        addNumbervalues(categoryid, values, operators);
    }
    
    /**
     * add Numeric search values for field categoryid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void categoryid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(categoryid, values, operators);
        categoryid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field categoryname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void categoryname(String[] values) {
        addStringvalues(categoryname, values);
    }
    
    /**
     * add String search values for field categoryname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void categoryname(String[] values, byte compare, byte andor) {
        addStringvalues(categoryname, values);
        categoryname.setCompareoperator(compare);
        categoryname.setAndoroperator(andor);
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
    
    /**
     * add Numeric search values for field estimatedproductioncost, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void estimatedproductioncost(Double[] values, byte[] operators) {
        addNumbervalues(estimatedproductioncost, values, operators);
    }
    
    /**
     * add Numeric search values for field estimatedproductioncost
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void estimatedproductioncost(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(estimatedproductioncost, values, operators);
        estimatedproductioncost.setAndoroperator(andor);
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
    
    /**
     * add Numeric search values for field percprofit, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void percprofit(Double[] values, byte[] operators) {
        addNumbervalues(percprofit, values, operators);
    }
    
    /**
     * add Numeric search values for field percprofit
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void percprofit(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(percprofit, values, operators);
        percprofit.setAndoroperator(andor);
    }
    
}
