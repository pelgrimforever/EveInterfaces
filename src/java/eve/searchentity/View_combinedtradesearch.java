/*
 * View_combinedtradesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_combinedtradesearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.view.eView_combinedtrade;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_combinedtrade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_combinedtradesearch extends Tablesearch implements IView_combinedtradesearch {

    Stringsearch sellregion = new Stringsearch("view_combinedtrade.sellregion");
    Stringsearch buyregion = new Stringsearch("view_combinedtrade.buyregion");
    Numbersearch sell_systemid = new Numbersearch("view_combinedtrade.sell_systemid");
    Stringsearch sellsystem = new Stringsearch("view_combinedtrade.sellsystem");
    Numbersearch buy_systemid = new Numbersearch("view_combinedtrade.buy_systemid");
    Stringsearch buysystem = new Stringsearch("view_combinedtrade.buysystem");
    Numbersearch total_volume = new Numbersearch("view_combinedtrade.total_volume");
    Numbersearch buy_order_value = new Numbersearch("view_combinedtrade.buy_order_value");
    Numbersearch sell_order_value = new Numbersearch("view_combinedtrade.sell_order_value");
    Numbersearch profit = new Numbersearch("view_combinedtrade.profit");
    Numbersearch jumps = new Numbersearch("view_combinedtrade.jumps");
    Numbersearch runs = new Numbersearch("view_combinedtrade.runs");
    Numbersearch ordercount = new Numbersearch("view_combinedtrade.ordercount");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_combinedtradesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_combinedtradesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(sellregion);
        addFieldsearcher(buyregion);
        addFieldsearcher(sell_systemid);
        addFieldsearcher(sellsystem);
        addFieldsearcher(buy_systemid);
        addFieldsearcher(buysystem);
        addFieldsearcher(total_volume);
        addFieldsearcher(buy_order_value);
        addFieldsearcher(sell_order_value);
        addFieldsearcher(profit);
        addFieldsearcher(jumps);
        addFieldsearcher(runs);
        addFieldsearcher(ordercount);
    }

    /**
     * add String search values for field sellregion, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void sellregion(String[] values) {
        addStringvalues(sellregion, values);
    }
    
    /**
     * add String search values for field sellregion
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void sellregion(String[] values, byte compare, byte andor) {
        addStringvalues(sellregion, values);
        sellregion.setCompareoperator(compare);
        sellregion.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field buyregion, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void buyregion(String[] values) {
        addStringvalues(buyregion, values);
    }
    
    /**
     * add String search values for field buyregion
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void buyregion(String[] values, byte compare, byte andor) {
        addStringvalues(buyregion, values);
        buyregion.setCompareoperator(compare);
        buyregion.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_systemid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_systemid(Double[] values, byte[] operators) {
        addNumbervalues(sell_systemid, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_systemid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_systemid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_systemid, values, operators);
        sell_systemid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field sellsystem, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void sellsystem(String[] values) {
        addStringvalues(sellsystem, values);
    }
    
    /**
     * add String search values for field sellsystem
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void sellsystem(String[] values, byte compare, byte andor) {
        addStringvalues(sellsystem, values);
        sellsystem.setCompareoperator(compare);
        sellsystem.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_systemid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_systemid(Double[] values, byte[] operators) {
        addNumbervalues(buy_systemid, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_systemid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_systemid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_systemid, values, operators);
        buy_systemid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field buysystem, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void buysystem(String[] values) {
        addStringvalues(buysystem, values);
    }
    
    /**
     * add String search values for field buysystem
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void buysystem(String[] values, byte compare, byte andor) {
        addStringvalues(buysystem, values);
        buysystem.setCompareoperator(compare);
        buysystem.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field total_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void total_volume(Double[] values, byte[] operators) {
        addNumbervalues(total_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field total_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void total_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(total_volume, values, operators);
        total_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_order_value, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_order_value(Double[] values, byte[] operators) {
        addNumbervalues(buy_order_value, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_order_value
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_order_value(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_order_value, values, operators);
        buy_order_value.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_order_value, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_order_value(Double[] values, byte[] operators) {
        addNumbervalues(sell_order_value, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_order_value
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_order_value(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_order_value, values, operators);
        sell_order_value.setAndoroperator(andor);
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
     * add Numeric search values for field runs, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void runs(Double[] values, byte[] operators) {
        addNumbervalues(runs, values, operators);
    }
    
    /**
     * add Numeric search values for field runs
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void runs(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(runs, values, operators);
        runs.setAndoroperator(andor);
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
