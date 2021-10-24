/*
 * View_systemtradesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:40
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_systemtradesearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_systemtrade;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_systemtrade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_systemtradesearch extends Tablesearch implements IView_systemtradesearch {

    Numbersearch sell_system = new Numbersearch("view_systemtrade.sell_system");
    Numbersearch buy_system = new Numbersearch("view_systemtrade.buy_system");
    Numbersearch ordercount = new Numbersearch("view_systemtrade.ordercount");
    Numbersearch totalsell = new Numbersearch("view_systemtrade.totalsell");
    Numbersearch totalbuy = new Numbersearch("view_systemtrade.totalbuy");
    Numbersearch profit = new Numbersearch("view_systemtrade.profit");
    Numbersearch total_cargo_volume = new Numbersearch("view_systemtrade.total_cargo_volume");
    Numbersearch jumps = new Numbersearch("view_systemtrade.jumps");
    Stringsearch regionsellname = new Stringsearch("view_systemtrade.regionsellname");
    Stringsearch systemsellname = new Stringsearch("view_systemtrade.systemsellname");
    Stringsearch regionbuyname = new Stringsearch("view_systemtrade.regionbuyname");
    Stringsearch systembuyname = new Stringsearch("view_systemtrade.systembuyname");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_systemtrade.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_systemtradesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_systemtradesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(sell_system);
        addFieldsearcher(buy_system);
        addFieldsearcher(ordercount);
        addFieldsearcher(totalsell);
        addFieldsearcher(totalbuy);
        addFieldsearcher(profit);
        addFieldsearcher(total_cargo_volume);
        addFieldsearcher(jumps);
        addFieldsearcher(regionsellname);
        addFieldsearcher(systemsellname);
        addFieldsearcher(regionbuyname);
        addFieldsearcher(systembuyname);
    }

    /**
     * add Numeric search values for field sell_system, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_system(Double[] values, byte[] operators) {
        addNumbervalues(sell_system, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_system
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_system, values, operators);
        sell_system.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_system, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_system(Double[] values, byte[] operators) {
        addNumbervalues(buy_system, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_system
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_system, values, operators);
        buy_system.setAndoroperator(andor);
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
     * add Numeric search values for field totalsell, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void totalsell(Double[] values, byte[] operators) {
        addNumbervalues(totalsell, values, operators);
    }
    
    /**
     * add Numeric search values for field totalsell
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void totalsell(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalsell, values, operators);
        totalsell.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field totalbuy, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void totalbuy(Double[] values, byte[] operators) {
        addNumbervalues(totalbuy, values, operators);
    }
    
    /**
     * add Numeric search values for field totalbuy
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void totalbuy(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalbuy, values, operators);
        totalbuy.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field profit, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void profit(Double[] values, byte[] operators) {
        addNumbervalues(profit, values, operators);
    }
    
    /**
     * add Numeric search values for field profit
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void profit(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(profit, values, operators);
        profit.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field total_cargo_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void total_cargo_volume(Double[] values, byte[] operators) {
        addNumbervalues(total_cargo_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field total_cargo_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void total_cargo_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(total_cargo_volume, values, operators);
        total_cargo_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumps, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumps(Double[] values, byte[] operators) {
        addNumbervalues(jumps, values, operators);
    }
    
    /**
     * add Numeric search values for field jumps
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumps, values, operators);
        jumps.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field regionsellname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void regionsellname(String[] values) {
        addStringvalues(regionsellname, values);
    }
    
    /**
     * add String search values for field regionsellname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void regionsellname(String[] values, byte compare, byte andor) {
        addStringvalues(regionsellname, values);
        regionsellname.setCompareoperator(compare);
        regionsellname.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field systemsellname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void systemsellname(String[] values) {
        addStringvalues(systemsellname, values);
    }
    
    /**
     * add String search values for field systemsellname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void systemsellname(String[] values, byte compare, byte andor) {
        addStringvalues(systemsellname, values);
        systemsellname.setCompareoperator(compare);
        systemsellname.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field regionbuyname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void regionbuyname(String[] values) {
        addStringvalues(regionbuyname, values);
    }
    
    /**
     * add String search values for field regionbuyname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void regionbuyname(String[] values, byte compare, byte andor) {
        addStringvalues(regionbuyname, values);
        regionbuyname.setCompareoperator(compare);
        regionbuyname.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field systembuyname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void systembuyname(String[] values) {
        addStringvalues(systembuyname, values);
    }
    
    /**
     * add String search values for field systembuyname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void systembuyname(String[] values, byte compare, byte andor) {
        addStringvalues(systembuyname, values);
        systembuyname.setCompareoperator(compare);
        systembuyname.setAndoroperator(andor);
    }
    
}
