/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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
    Numbersearch jumpslowsec = new Numbersearch("trade.jumpslowsec");
    Numbersearch jumpsnullsec = new Numbersearch("trade.jumpsnullsec");
//foreign keys
    Foreignkeysearch ordersSell_order_idsearcher = new Foreignkeysearch("orders", ITrade.ordersSell_order_idPKfields, ITrade.ordersSell_order_idFKfields);
    Foreignkeysearch ordersBuy_order_idsearcher = new Foreignkeysearch("orders", ITrade.ordersBuy_order_idPKfields, ITrade.ordersBuy_order_idFKfields);
//external foreign keys

    public String getTable() {
        return Trade.table;
    }

    public Tradesearch() {
        setFieldsearchers();
    }

    public Tradesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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
        addFieldsearcher(jumpslowsec);
        addFieldsearcher(jumpsnullsec);
        addKeysearcher(ordersSell_order_idsearcher);
        addKeysearcher(ordersBuy_order_idsearcher);
    }

    public void addPrimarykey(ITradePK tradePK) {
        super.addPrimarykey(tradePK);
    }

    public void total_volume(Double[] values, byte[] operators) {
        addNumbervalues(total_volume, values, operators);
    }
    
    public void total_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(total_volume, values, operators);
        total_volume.setAndoroperator(andor);
    }
    
    public void buy_order_value(Double[] values, byte[] operators) {
        addNumbervalues(buy_order_value, values, operators);
    }
    
    public void buy_order_value(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_order_value, values, operators);
        buy_order_value.setAndoroperator(andor);
    }
    
    public void sell_order_value(Double[] values, byte[] operators) {
        addNumbervalues(sell_order_value, values, operators);
    }
    
    public void sell_order_value(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_order_value, values, operators);
        sell_order_value.setAndoroperator(andor);
    }
    
    public void profit(Double[] values, byte[] operators) {
        addNumbervalues(profit, values, operators);
    }
    
    public void profit(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(profit, values, operators);
        profit.setAndoroperator(andor);
    }
    
    public void jumps(Double[] values, byte[] operators) {
        addNumbervalues(jumps, values, operators);
    }
    
    public void jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumps, values, operators);
        jumps.setAndoroperator(andor);
    }
    
    public void runs(Double[] values, byte[] operators) {
        addNumbervalues(runs, values, operators);
    }
    
    public void runs(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(runs, values, operators);
        runs.setAndoroperator(andor);
    }
    
    public void total_jumps(Double[] values, byte[] operators) {
        addNumbervalues(total_jumps, values, operators);
    }
    
    public void total_jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(total_jumps, values, operators);
        total_jumps.setAndoroperator(andor);
    }
    
    public void profit_per_jump(Double[] values, byte[] operators) {
        addNumbervalues(profit_per_jump, values, operators);
    }
    
    public void profit_per_jump(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(profit_per_jump, values, operators);
        profit_per_jump.setAndoroperator(andor);
    }
    
    public void singlerun_profit_per_jump(Double[] values, byte[] operators) {
        addNumbervalues(singlerun_profit_per_jump, values, operators);
    }
    
    public void singlerun_profit_per_jump(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(singlerun_profit_per_jump, values, operators);
        singlerun_profit_per_jump.setAndoroperator(andor);
    }
    
    public void maxunits_per_run(Double[] values, byte[] operators) {
        addNumbervalues(maxunits_per_run, values, operators);
    }
    
    public void maxunits_per_run(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(maxunits_per_run, values, operators);
        maxunits_per_run.setAndoroperator(andor);
    }
    
    public void jumpslowsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpslowsec, values, operators);
    }
    
    public void jumpslowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpslowsec, values, operators);
        jumpslowsec.setAndoroperator(andor);
    }
    
    public void jumpsnullsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpsnullsec, values, operators);
    }
    
    public void jumpsnullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpsnullsec, values, operators);
        jumpsnullsec.setAndoroperator(andor);
    }
    
    public void ordersSell_order_id(IOrderssearch orderssearch) {
        ordersSell_order_idsearcher.setTablesearch(orderssearch);
    }
    
    public IOrderssearch getOrderssell_order_idsearch() {
        if(ordersSell_order_idsearcher.used()) {
            return (IOrderssearch)ordersSell_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getOrderssell_order_idInnerjoin() {
        return ordersSell_order_idsearcher.getInnerjoin();
    }

    public void ordersBuy_order_id(IOrderssearch orderssearch) {
        ordersBuy_order_idsearcher.setTablesearch(orderssearch);
    }
    
    public IOrderssearch getOrdersbuy_order_idsearch() {
        if(ordersBuy_order_idsearcher.used()) {
            return (IOrderssearch)ordersBuy_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getOrdersbuy_order_idInnerjoin() {
        return ordersBuy_order_idsearcher.getInnerjoin();
    }

}
