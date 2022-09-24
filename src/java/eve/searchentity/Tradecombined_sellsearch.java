/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.ITradecombined_sellsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Tradecombined_sell;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Tradecombined_sellsearch extends Tablesearch implements ITradecombined_sellsearch {

    Numbersearch amount = new Numbersearch("tradecombined_sell.amount");
    Numbersearch buy_order_value = new Numbersearch("tradecombined_sell.buy_order_value");
    Numbersearch sell_order_value = new Numbersearch("tradecombined_sell.sell_order_value");
    Numbersearch profit = new Numbersearch("tradecombined_sell.profit");
//foreign keys
    Foreignkeysearch ordersBuy_order_idsearcher = new Foreignkeysearch("orders", ITradecombined_sell.ordersBuy_order_idPKfields, ITradecombined_sell.ordersBuy_order_idFKfields);
    Foreignkeysearch ordersSell_order_idsearcher = new Foreignkeysearch("orders", ITradecombined_sell.ordersSell_order_idPKfields, ITradecombined_sell.ordersSell_order_idFKfields);
    Foreignkeysearch tradecombinedsearcher = new Foreignkeysearch("tradecombined", ITradecombined_sell.tradecombinedPKfields, ITradecombined_sell.tradecombinedFKfields);
//external foreign keys

    public String getTable() {
        return Tradecombined_sell.table;
    }

    public Tradecombined_sellsearch() {
        setFieldsearchers();
    }

    public Tradecombined_sellsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(amount);
        addFieldsearcher(buy_order_value);
        addFieldsearcher(sell_order_value);
        addFieldsearcher(profit);
        addKeysearcher(ordersBuy_order_idsearcher);
        addKeysearcher(ordersSell_order_idsearcher);
        addKeysearcher(tradecombinedsearcher);
    }

    public void addPrimarykey(ITradecombined_sellPK tradecombined_sellPK) {
        super.addPrimarykey(tradecombined_sellPK);
    }

    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
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

    public void tradecombined(ITradecombinedsearch tradecombinedsearch) {
        tradecombinedsearcher.setTablesearch(tradecombinedsearch);
    }
    
    public ITradecombinedsearch getTradecombinedsearch() {
        if(tradecombinedsearcher.used()) {
            return (ITradecombinedsearch)tradecombinedsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getTradecombinedInnerjoin() {
        return tradecombinedsearcher.getInnerjoin();
    }

}
