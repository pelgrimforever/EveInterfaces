/*
 * View_tradecombinedsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_tradecombinedsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_tradecombined;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_tradecombined table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_tradecombinedsearch extends Tablesearch implements IView_tradecombinedsearch {

    Numbersearch sell_regionid = new Numbersearch("view_tradecombined.sell_regionid");
    Stringsearch sell_regionname = new Stringsearch("view_tradecombined.sell_regionname");
    Numbersearch sell_systemid = new Numbersearch("view_tradecombined.sell_systemid");
    Stringsearch sell_systemname = new Stringsearch("view_tradecombined.sell_systemname");
    Numbersearch evetype_id = new Numbersearch("view_tradecombined.evetype_id");
    Stringsearch evetype_name = new Stringsearch("view_tradecombined.evetype_name");
    Numbersearch packaged_volume = new Numbersearch("view_tradecombined.packaged_volume");
    Numbersearch orders = new Numbersearch("view_tradecombined.orders");
    Numbersearch totalamount = new Numbersearch("view_tradecombined.totalamount");
    Numbersearch buy_order_total = new Numbersearch("view_tradecombined.buy_order_total");
    Numbersearch sell_order_total = new Numbersearch("view_tradecombined.sell_order_total");
    Numbersearch totalprofit = new Numbersearch("view_tradecombined.totalprofit");
    Numbersearch buy_systemid = new Numbersearch("view_tradecombined.buy_systemid");
    Stringsearch buy_systemname = new Stringsearch("view_tradecombined.buy_systemname");
    Numbersearch trade_jumps = new Numbersearch("view_tradecombined.trade_jumps");
    Numbersearch trade_jumpslowsec = new Numbersearch("view_tradecombined.trade_jumpslowsec");
    Numbersearch trade_jumpsnullsec = new Numbersearch("view_tradecombined.trade_jumpsnullsec");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_tradecombined.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_tradecombinedsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_tradecombinedsearch(byte andor) {
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
        addFieldsearcher(evetype_id);
        addFieldsearcher(evetype_name);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(orders);
        addFieldsearcher(totalamount);
        addFieldsearcher(buy_order_total);
        addFieldsearcher(sell_order_total);
        addFieldsearcher(totalprofit);
        addFieldsearcher(buy_systemid);
        addFieldsearcher(buy_systemname);
        addFieldsearcher(trade_jumps);
        addFieldsearcher(trade_jumpslowsec);
        addFieldsearcher(trade_jumpsnullsec);
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
     * add Numeric search values for field evetype_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void evetype_id(Double[] values, byte[] operators) {
        addNumbervalues(evetype_id, values, operators);
    }
    
    /**
     * add Numeric search values for field evetype_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void evetype_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype_id, values, operators);
        evetype_id.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field evetype_name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void evetype_name(String[] values) {
        addStringvalues(evetype_name, values);
    }
    
    /**
     * add String search values for field evetype_name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void evetype_name(String[] values, byte compare, byte andor) {
        addStringvalues(evetype_name, values);
        evetype_name.setCompareoperator(compare);
        evetype_name.setAndoroperator(andor);
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
     * add Numeric search values for field buy_order_total, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_order_total(Double[] values, byte[] operators) {
        addNumbervalues(buy_order_total, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_order_total
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_order_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_order_total, values, operators);
        buy_order_total.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_order_total, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_order_total(Double[] values, byte[] operators) {
        addNumbervalues(sell_order_total, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_order_total
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_order_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_order_total, values, operators);
        sell_order_total.setAndoroperator(andor);
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
    
    /**
     * add Numeric search values for field trade_jumpslowsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void trade_jumpslowsec(Double[] values, byte[] operators) {
        addNumbervalues(trade_jumpslowsec, values, operators);
    }
    
    /**
     * add Numeric search values for field trade_jumpslowsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void trade_jumpslowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_jumpslowsec, values, operators);
        trade_jumpslowsec.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field trade_jumpsnullsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void trade_jumpsnullsec(Double[] values, byte[] operators) {
        addNumbervalues(trade_jumpsnullsec, values, operators);
    }
    
    /**
     * add Numeric search values for field trade_jumpsnullsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void trade_jumpsnullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_jumpsnullsec, values, operators);
        trade_jumpsnullsec.setAndoroperator(andor);
    }
    
}
