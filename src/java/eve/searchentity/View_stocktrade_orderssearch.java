/*
 * View_stocktrade_orderssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.11.2021 15:45
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_stocktrade_orderssearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_stocktrade_orders;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_stocktrade_orders table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_stocktrade_orderssearch extends Tablesearch implements IView_stocktrade_orderssearch {

    Stringsearch username = new Stringsearch("view_stocktrade_orders.username");
    Numbersearch system = new Numbersearch("view_stocktrade_orders.system");
    Numbersearch locationid = new Numbersearch("view_stocktrade_orders.locationid");
    Stringsearch stationname = new Stringsearch("view_stocktrade_orders.stationname");
    Stringsearch locationname = new Stringsearch("view_stocktrade_orders.locationname");
    Numbersearch evetypeid = new Numbersearch("view_stocktrade_orders.evetypeid");
    Stringsearch evetypename = new Stringsearch("view_stocktrade_orders.evetypename");
    Numbersearch packaged_volume = new Numbersearch("view_stocktrade_orders.packaged_volume");
    Numbersearch min_volume = new Numbersearch("view_stocktrade_orders.min_volume");
    Numbersearch sellamount = new Numbersearch("view_stocktrade_orders.sellamount");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_stocktrade_orders.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_stocktrade_orderssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_stocktrade_orderssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(system);
        addFieldsearcher(locationid);
        addFieldsearcher(stationname);
        addFieldsearcher(locationname);
        addFieldsearcher(evetypeid);
        addFieldsearcher(evetypename);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(min_volume);
        addFieldsearcher(sellamount);
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
     * add Numeric search values for field system, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void system(Double[] values, byte[] operators) {
        addNumbervalues(system, values, operators);
    }
    
    /**
     * add Numeric search values for field system
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(system, values, operators);
        system.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field locationid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void locationid(Double[] values, byte[] operators) {
        addNumbervalues(locationid, values, operators);
    }
    
    /**
     * add Numeric search values for field locationid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void locationid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(locationid, values, operators);
        locationid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field stationname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void stationname(String[] values) {
        addStringvalues(stationname, values);
    }
    
    /**
     * add String search values for field stationname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void stationname(String[] values, byte compare, byte andor) {
        addStringvalues(stationname, values);
        stationname.setCompareoperator(compare);
        stationname.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field locationname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void locationname(String[] values) {
        addStringvalues(locationname, values);
    }
    
    /**
     * add String search values for field locationname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void locationname(String[] values, byte compare, byte andor) {
        addStringvalues(locationname, values);
        locationname.setCompareoperator(compare);
        locationname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field evetypeid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void evetypeid(Double[] values, byte[] operators) {
        addNumbervalues(evetypeid, values, operators);
    }
    
    /**
     * add Numeric search values for field evetypeid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void evetypeid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetypeid, values, operators);
        evetypeid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field evetypename, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void evetypename(String[] values) {
        addStringvalues(evetypename, values);
    }
    
    /**
     * add String search values for field evetypename
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void evetypename(String[] values, byte compare, byte andor) {
        addStringvalues(evetypename, values);
        evetypename.setCompareoperator(compare);
        evetypename.setAndoroperator(andor);
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
     * add Numeric search values for field min_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void min_volume(Double[] values, byte[] operators) {
        addNumbervalues(min_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field min_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void min_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_volume, values, operators);
        min_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sellamount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sellamount(Double[] values, byte[] operators) {
        addNumbervalues(sellamount, values, operators);
    }
    
    /**
     * add Numeric search values for field sellamount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sellamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sellamount, values, operators);
        sellamount.setAndoroperator(andor);
    }
    
}
