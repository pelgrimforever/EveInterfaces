/*
 * Tradesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2021 15:16
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ITradesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Trade;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Trade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Tradesearch extends Tablesearch implements ITradesearch {

    Numbersearch total_volume = new Numbersearch("trade.total_volume");
    Numbersearch buy_order_value = new Numbersearch("trade.buy_order_value");
    Numbersearch sell_order_value = new Numbersearch("trade.sell_order_value");
    Numbersearch profit = new Numbersearch("trade.profit");
    Numbersearch jumps = new Numbersearch("trade.jumps");
    Numbersearch runs = new Numbersearch("trade.runs");
    Numbersearch total_jumps = new Numbersearch("trade.total_jumps");
    Numbersearch profit_per_jump = new Numbersearch("trade.profit_per_jump");
    Numbersearch singlerun_profit_per_jump = new Numbersearch("trade.singlerun_profit_per_jump");
    Numbersearch maxunits_per_run = new Numbersearch("trade.maxunits_per_run");
    Foreignkeysearch ordersSell_order_idsearcher = new Foreignkeysearch("orders", ITrade.ordersSell_order_idPKfields, ITrade.ordersSell_order_idFKfields);
    Foreignkeysearch ordersBuy_order_idsearcher = new Foreignkeysearch("orders", ITrade.ordersBuy_order_idPKfields, ITrade.ordersBuy_order_idFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Trade.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Tradesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Tradesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(total_volume);
        addFieldsearcher(buy_order_value);
        addFieldsearcher(sell_order_value);
        addFieldsearcher(profit);
        addFieldsearcher(jumps);
        addFieldsearcher(runs);
        addFieldsearcher(total_jumps);
        addFieldsearcher(profit_per_jump);
        addFieldsearcher(singlerun_profit_per_jump);
        addFieldsearcher(maxunits_per_run);
        addKeysearcher(ordersSell_order_idsearcher);
        addKeysearcher(ordersBuy_order_idsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param tradePK: Trade primery key
     */
    public void addPrimarykey(ITradePK tradePK) {
        super.addPrimarykey(tradePK);
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
     * add Numeric search values for field total_jumps, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void total_jumps(Double[] values, byte[] operators) {
        addNumbervalues(total_jumps, values, operators);
    }
    
    /**
     * add Numeric search values for field total_jumps
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void total_jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(total_jumps, values, operators);
        total_jumps.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field profit_per_jump, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void profit_per_jump(Double[] values, byte[] operators) {
        addNumbervalues(profit_per_jump, values, operators);
    }
    
    /**
     * add Numeric search values for field profit_per_jump
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void profit_per_jump(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(profit_per_jump, values, operators);
        profit_per_jump.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field singlerun_profit_per_jump, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void singlerun_profit_per_jump(Double[] values, byte[] operators) {
        addNumbervalues(singlerun_profit_per_jump, values, operators);
    }
    
    /**
     * add Numeric search values for field singlerun_profit_per_jump
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void singlerun_profit_per_jump(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(singlerun_profit_per_jump, values, operators);
        singlerun_profit_per_jump.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field maxunits_per_run, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void maxunits_per_run(Double[] values, byte[] operators) {
        addNumbervalues(maxunits_per_run, values, operators);
    }
    
    /**
     * add Numeric search values for field maxunits_per_run
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void maxunits_per_run(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(maxunits_per_run, values, operators);
        maxunits_per_run.setAndoroperator(andor);
    }
    
    /**
     * set subsearch ordersSell_order_id tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void ordersSell_order_id(IOrderssearch orderssearch) {
        ordersSell_order_idsearcher.setTablesearch(orderssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Trade
     */
    public IOrderssearch getOrderssell_order_idsearch() {
        if(ordersSell_order_idsearcher.used()) {
            return (IOrderssearch)ordersSell_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if ordersSell_order_idsearcher is not used
     * @return inner join statement
     */
    public String getOrderssell_order_idInnerjoin() {
        return ordersSell_order_idsearcher.getInnerjoin();
    }

    /**
     * set subsearch ordersBuy_order_id tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void ordersBuy_order_id(IOrderssearch orderssearch) {
        ordersBuy_order_idsearcher.setTablesearch(orderssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Trade
     */
    public IOrderssearch getOrdersbuy_order_idsearch() {
        if(ordersBuy_order_idsearcher.used()) {
            return (IOrderssearch)ordersBuy_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if ordersBuy_order_idsearcher is not used
     * @return inner join statement
     */
    public String getOrdersbuy_order_idInnerjoin() {
        return ordersBuy_order_idsearcher.getInnerjoin();
    }

}
