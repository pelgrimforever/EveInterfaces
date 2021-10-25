/*
 * View_tradesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2021 15:16
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_tradesearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_trade;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_trade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_tradesearch extends Tablesearch implements IView_tradesearch {

    Numbersearch sell_regionid = new Numbersearch("view_trade.sell_regionid");
    Stringsearch sell_regionname = new Stringsearch("view_trade.sell_regionname");
    Numbersearch sell_systemid = new Numbersearch("view_trade.sell_systemid");
    Stringsearch sell_systemname = new Stringsearch("view_trade.sell_systemname");
    Numbersearch sell_locationid = new Numbersearch("view_trade.sell_locationid");
    Stringsearch sell_stationname = new Stringsearch("view_trade.sell_stationname");
    Numbersearch evetype_id = new Numbersearch("view_trade.evetype_id");
    Stringsearch evetype_name = new Stringsearch("view_trade.evetype_name");
    Numbersearch packaged_volume = new Numbersearch("view_trade.packaged_volume");
    Numbersearch sell_id = new Numbersearch("view_trade.sell_id");
    Numbersearch buy_id = new Numbersearch("view_trade.buy_id");
    Numbersearch sell_volume_remain = new Numbersearch("view_trade.sell_volume_remain");
    Numbersearch sell_price = new Numbersearch("view_trade.sell_price");
    Numbersearch buy_price = new Numbersearch("view_trade.buy_price");
    Numbersearch buy_systemid = new Numbersearch("view_trade.buy_systemid");
    Stringsearch buy_systemname = new Stringsearch("view_trade.buy_systemname");
    Numbersearch buy_locationid = new Numbersearch("view_trade.buy_locationid");
    Stringsearch buy_stationname = new Stringsearch("view_trade.buy_stationname");
    Numbersearch buy_volume_remain = new Numbersearch("view_trade.buy_volume_remain");
    Numbersearch total_volume = new Numbersearch("view_trade.total_volume");
    Numbersearch sell_total = new Numbersearch("view_trade.sell_total");
    Numbersearch buy_total = new Numbersearch("view_trade.buy_total");
    Numbersearch trade_profit = new Numbersearch("view_trade.trade_profit");
    Numbersearch trade_jumps = new Numbersearch("view_trade.trade_jumps");
    Numbersearch trade_profit_per_jump = new Numbersearch("view_trade.trade_profit_per_jump");
    Numbersearch trade_runs = new Numbersearch("view_trade.trade_runs");
    Numbersearch trade_total_jumps = new Numbersearch("view_trade.trade_total_jumps");
    Numbersearch trade_singlerunprofit = new Numbersearch("view_trade.trade_singlerunprofit");
    Numbersearch trade_maxunits_per_run = new Numbersearch("view_trade.trade_maxunits_per_run");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_trade.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_tradesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_tradesearch(byte andor) {
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
        addFieldsearcher(sell_locationid);
        addFieldsearcher(sell_stationname);
        addFieldsearcher(evetype_id);
        addFieldsearcher(evetype_name);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(sell_id);
        addFieldsearcher(buy_id);
        addFieldsearcher(sell_volume_remain);
        addFieldsearcher(sell_price);
        addFieldsearcher(buy_price);
        addFieldsearcher(buy_systemid);
        addFieldsearcher(buy_systemname);
        addFieldsearcher(buy_locationid);
        addFieldsearcher(buy_stationname);
        addFieldsearcher(buy_volume_remain);
        addFieldsearcher(total_volume);
        addFieldsearcher(sell_total);
        addFieldsearcher(buy_total);
        addFieldsearcher(trade_profit);
        addFieldsearcher(trade_jumps);
        addFieldsearcher(trade_profit_per_jump);
        addFieldsearcher(trade_runs);
        addFieldsearcher(trade_total_jumps);
        addFieldsearcher(trade_singlerunprofit);
        addFieldsearcher(trade_maxunits_per_run);
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
     * add Numeric search values for field sell_locationid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_locationid(Double[] values, byte[] operators) {
        addNumbervalues(sell_locationid, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_locationid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_locationid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_locationid, values, operators);
        sell_locationid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field sell_stationname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void sell_stationname(String[] values) {
        addStringvalues(sell_stationname, values);
    }
    
    /**
     * add String search values for field sell_stationname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void sell_stationname(String[] values, byte compare, byte andor) {
        addStringvalues(sell_stationname, values);
        sell_stationname.setCompareoperator(compare);
        sell_stationname.setAndoroperator(andor);
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
     * add Numeric search values for field sell_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_id(Double[] values, byte[] operators) {
        addNumbervalues(sell_id, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_id, values, operators);
        sell_id.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_id(Double[] values, byte[] operators) {
        addNumbervalues(buy_id, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_id, values, operators);
        buy_id.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_volume_remain, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(sell_volume_remain, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_volume_remain
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_volume_remain, values, operators);
        sell_volume_remain.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_price, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_price(Double[] values, byte[] operators) {
        addNumbervalues(sell_price, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_price
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_price, values, operators);
        sell_price.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_price, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_price(Double[] values, byte[] operators) {
        addNumbervalues(buy_price, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_price
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_price, values, operators);
        buy_price.setAndoroperator(andor);
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
     * add Numeric search values for field buy_locationid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_locationid(Double[] values, byte[] operators) {
        addNumbervalues(buy_locationid, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_locationid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_locationid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_locationid, values, operators);
        buy_locationid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field buy_stationname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void buy_stationname(String[] values) {
        addStringvalues(buy_stationname, values);
    }
    
    /**
     * add String search values for field buy_stationname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void buy_stationname(String[] values, byte compare, byte andor) {
        addStringvalues(buy_stationname, values);
        buy_stationname.setCompareoperator(compare);
        buy_stationname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_volume_remain, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(buy_volume_remain, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_volume_remain
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_volume_remain, values, operators);
        buy_volume_remain.setAndoroperator(andor);
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
     * add Numeric search values for field trade_profit, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void trade_profit(Double[] values, byte[] operators) {
        addNumbervalues(trade_profit, values, operators);
    }
    
    /**
     * add Numeric search values for field trade_profit
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void trade_profit(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_profit, values, operators);
        trade_profit.setAndoroperator(andor);
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
     * add Numeric search values for field trade_profit_per_jump, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void trade_profit_per_jump(Double[] values, byte[] operators) {
        addNumbervalues(trade_profit_per_jump, values, operators);
    }
    
    /**
     * add Numeric search values for field trade_profit_per_jump
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void trade_profit_per_jump(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_profit_per_jump, values, operators);
        trade_profit_per_jump.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field trade_runs, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void trade_runs(Double[] values, byte[] operators) {
        addNumbervalues(trade_runs, values, operators);
    }
    
    /**
     * add Numeric search values for field trade_runs
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void trade_runs(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_runs, values, operators);
        trade_runs.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field trade_total_jumps, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void trade_total_jumps(Double[] values, byte[] operators) {
        addNumbervalues(trade_total_jumps, values, operators);
    }
    
    /**
     * add Numeric search values for field trade_total_jumps
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void trade_total_jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_total_jumps, values, operators);
        trade_total_jumps.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field trade_singlerunprofit, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void trade_singlerunprofit(Double[] values, byte[] operators) {
        addNumbervalues(trade_singlerunprofit, values, operators);
    }
    
    /**
     * add Numeric search values for field trade_singlerunprofit
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void trade_singlerunprofit(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_singlerunprofit, values, operators);
        trade_singlerunprofit.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field trade_maxunits_per_run, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void trade_maxunits_per_run(Double[] values, byte[] operators) {
        addNumbervalues(trade_maxunits_per_run, values, operators);
    }
    
    /**
     * add Numeric search values for field trade_maxunits_per_run
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void trade_maxunits_per_run(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_maxunits_per_run, values, operators);
        trade_maxunits_per_run.setAndoroperator(andor);
    }
    
}
