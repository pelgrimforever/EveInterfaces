/*
 * View_contractswithprofitsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_contractswithprofitsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_contractswithprofit;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_contractswithprofit table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_contractswithprofitsearch extends Tablesearch implements IView_contractswithprofitsearch {

    Numbersearch id = new Numbersearch("view_contractswithprofit.id");
    Timesearch date_expired = new Timesearch("view_contractswithprofit.date_expired");
    Timesearch date_issued = new Timesearch("view_contractswithprofit.date_issued");
    Numbersearch days_to_complete = new Numbersearch("view_contractswithprofit.days_to_complete");
    Numbersearch end_location_id = new Numbersearch("view_contractswithprofit.end_location_id");
    Numbersearch price = new Numbersearch("view_contractswithprofit.price");
    Numbersearch reward = new Numbersearch("view_contractswithprofit.reward");
    Numbersearch start_location_id = new Numbersearch("view_contractswithprofit.start_location_id");
    Stringsearch name = new Stringsearch("view_contractswithprofit.name");
    Stringsearch systemname = new Stringsearch("view_contractswithprofit.systemname");
    Stringsearch regionname = new Stringsearch("view_contractswithprofit.regionname");
    Stringsearch title = new Stringsearch("view_contractswithprofit.title");
    Numbersearch volume = new Numbersearch("view_contractswithprofit.volume");
    Numbersearch sellprice = new Numbersearch("view_contractswithprofit.sellprice");
    Numbersearch buyprice = new Numbersearch("view_contractswithprofit.buyprice");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_contractswithprofit.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_contractswithprofitsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_contractswithprofitsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(date_expired);
        addFieldsearcher(date_issued);
        addFieldsearcher(days_to_complete);
        addFieldsearcher(end_location_id);
        addFieldsearcher(price);
        addFieldsearcher(reward);
        addFieldsearcher(start_location_id);
        addFieldsearcher(name);
        addFieldsearcher(systemname);
        addFieldsearcher(regionname);
        addFieldsearcher(title);
        addFieldsearcher(volume);
        addFieldsearcher(sellprice);
        addFieldsearcher(buyprice);
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
     * add Timestamp search values for field date_expired, default OR operator is used
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void date_expired(Timestamp[] values, byte[] operators) {
        addTimevalues(date_expired, values, operators);
    }
    
    /**
     * add Timestamp search values for field date_expired
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void date_expired(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_expired, values, operators);
        date_expired.setAndoroperator(andor);
    }
    
    /**
     * add Timestamp search values for field date_issued, default OR operator is used
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void date_issued(Timestamp[] values, byte[] operators) {
        addTimevalues(date_issued, values, operators);
    }
    
    /**
     * add Timestamp search values for field date_issued
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void date_issued(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_issued, values, operators);
        date_issued.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field days_to_complete, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void days_to_complete(Double[] values, byte[] operators) {
        addNumbervalues(days_to_complete, values, operators);
    }
    
    /**
     * add Numeric search values for field days_to_complete
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void days_to_complete(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(days_to_complete, values, operators);
        days_to_complete.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field end_location_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void end_location_id(Double[] values, byte[] operators) {
        addNumbervalues(end_location_id, values, operators);
    }
    
    /**
     * add Numeric search values for field end_location_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void end_location_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(end_location_id, values, operators);
        end_location_id.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field price, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void price(Double[] values, byte[] operators) {
        addNumbervalues(price, values, operators);
    }
    
    /**
     * add Numeric search values for field price
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(price, values, operators);
        price.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field reward, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void reward(Double[] values, byte[] operators) {
        addNumbervalues(reward, values, operators);
    }
    
    /**
     * add Numeric search values for field reward
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void reward(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(reward, values, operators);
        reward.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field start_location_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void start_location_id(Double[] values, byte[] operators) {
        addNumbervalues(start_location_id, values, operators);
    }
    
    /**
     * add Numeric search values for field start_location_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void start_location_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(start_location_id, values, operators);
        start_location_id.setAndoroperator(andor);
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
     * add String search values for field systemname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void systemname(String[] values) {
        addStringvalues(systemname, values);
    }
    
    /**
     * add String search values for field systemname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void systemname(String[] values, byte compare, byte andor) {
        addStringvalues(systemname, values);
        systemname.setCompareoperator(compare);
        systemname.setAndoroperator(andor);
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
     * add String search values for field title, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void title(String[] values) {
        addStringvalues(title, values);
    }
    
    /**
     * add String search values for field title
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void title(String[] values, byte compare, byte andor) {
        addStringvalues(title, values);
        title.setCompareoperator(compare);
        title.setAndoroperator(andor);
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
     * add Numeric search values for field buyprice, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buyprice(Double[] values, byte[] operators) {
        addNumbervalues(buyprice, values, operators);
    }
    
    /**
     * add Numeric search values for field buyprice
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buyprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buyprice, values, operators);
        buyprice.setAndoroperator(andor);
    }
    
}
