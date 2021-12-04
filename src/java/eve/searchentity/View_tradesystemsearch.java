/*
 * View_tradesystemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.11.2021 14:51
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_tradesystemsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_tradesystem;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_tradesystem table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_tradesystemsearch extends Tablesearch implements IView_tradesystemsearch {

    Numbersearch sell_regionid = new Numbersearch("view_tradesystem.sell_regionid");
    Stringsearch sell_regionname = new Stringsearch("view_tradesystem.sell_regionname");
    Numbersearch sell_systemid = new Numbersearch("view_tradesystem.sell_systemid");
    Stringsearch sell_systemname = new Stringsearch("view_tradesystem.sell_systemname");
    Numbersearch orders = new Numbersearch("view_tradesystem.orders");
    Numbersearch buy_total = new Numbersearch("view_tradesystem.buy_total");
    Numbersearch sell_total = new Numbersearch("view_tradesystem.sell_total");
    Numbersearch totalprofit = new Numbersearch("view_tradesystem.totalprofit");
    Numbersearch totalvolume = new Numbersearch("view_tradesystem.totalvolume");
    Numbersearch buy_systemid = new Numbersearch("view_tradesystem.buy_systemid");
    Stringsearch buy_systemname = new Stringsearch("view_tradesystem.buy_systemname");
    Numbersearch trade_jumps = new Numbersearch("view_tradesystem.trade_jumps");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_tradesystem.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_tradesystemsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_tradesystemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(sell_regionid);
        addFieldsearcher(sell_regionname);
        addFieldsearcher(sell_systemid);
        addFieldsearcher(sell_systemname);
        addFieldsearcher(orders);
        addFieldsearcher(buy_total);
        addFieldsearcher(sell_total);
        addFieldsearcher(totalprofit);
        addFieldsearcher(totalvolume);
        addFieldsearcher(buy_systemid);
        addFieldsearcher(buy_systemname);
        addFieldsearcher(trade_jumps);
    }

    /**
     * add Numeric search values for field sell_regionid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_regionid(Double[] values, byte[] operators) {
        addNumbervalues(sell_regionid, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_regionid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_regionid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_regionid, values, operators);
        sell_regionid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field sell_regionname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void sell_regionname(String[] values) {
        addStringvalues(sell_regionname, values);
    }
    
    /**
     * add String search values for field sell_regionname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void sell_regionname(String[] values, byte compare, byte andor) {
        addStringvalues(sell_regionname, values);
        sell_regionname.setCompareoperator(compare);
        sell_regionname.setAndoroperator(andor);
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
     * add String search values for field sell_systemname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void sell_systemname(String[] values) {
        addStringvalues(sell_systemname, values);
    }
    
    /**
     * add String search values for field sell_systemname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void sell_systemname(String[] values, byte compare, byte andor) {
        addStringvalues(sell_systemname, values);
        sell_systemname.setCompareoperator(compare);
        sell_systemname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field orders, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void orders(Double[] values, byte[] operators) {
        addNumbervalues(orders, values, operators);
    }
    
    /**
     * add Numeric search values for field orders
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void orders(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(orders, values, operators);
        orders.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_total, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_total(Double[] values, byte[] operators) {
        addNumbervalues(buy_total, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_total
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_total, values, operators);
        buy_total.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_total, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_total(Double[] values, byte[] operators) {
        addNumbervalues(sell_total, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_total
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_total, values, operators);
        sell_total.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field totalprofit, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void totalprofit(Double[] values, byte[] operators) {
        addNumbervalues(totalprofit, values, operators);
    }
    
    /**
     * add Numeric search values for field totalprofit
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void totalprofit(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalprofit, values, operators);
        totalprofit.setAndoroperator(andor);
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
     * add String search values for field buy_systemname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void buy_systemname(String[] values) {
        addStringvalues(buy_systemname, values);
    }
    
    /**
     * add String search values for field buy_systemname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void buy_systemname(String[] values, byte compare, byte andor) {
        addStringvalues(buy_systemname, values);
        buy_systemname.setCompareoperator(compare);
        buy_systemname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field trade_jumps, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void trade_jumps(Double[] values, byte[] operators) {
        addNumbervalues(trade_jumps, values, operators);
    }
    
    /**
     * add Numeric search values for field trade_jumps
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void trade_jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_jumps, values, operators);
        trade_jumps.setAndoroperator(andor);
    }
    
}
