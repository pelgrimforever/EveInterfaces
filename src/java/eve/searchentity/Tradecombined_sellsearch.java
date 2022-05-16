/*
 * Tradecombined_sellsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
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

/**
 * Search class for Tradecombined_sell table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
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

    /**
     * @return tablename
     */
    public String getTable() {
        return Tradecombined_sell.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Tradecombined_sellsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Tradecombined_sellsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(amount);
        addFieldsearcher(buy_order_value);
        addFieldsearcher(sell_order_value);
        addFieldsearcher(profit);
        addKeysearcher(ordersBuy_order_idsearcher);
        addKeysearcher(ordersSell_order_idsearcher);
        addKeysearcher(tradecombinedsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param tradecombined_sellPK: Tradecombined_sell primery key
     */
    public void addPrimarykey(ITradecombined_sellPK tradecombined_sellPK) {
        super.addPrimarykey(tradecombined_sellPK);
    }

    /**
     * add Numeric search values for field amount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    /**
     * add Numeric search values for field amount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
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
     * set foreign key subsearch ordersBuy_order_id IOrderssearch
     * @param orderssearch: IOrderssearch
     */
    public void ordersBuy_order_id(IOrderssearch orderssearch) {
        ordersBuy_order_idsearcher.setTablesearch(orderssearch);
    }
    
    /**
     * get foreign key subsearch ordersBuy_order_id IOrderssearch
     * @return Tablesearch for Tradecombined_sell
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

    /**
     * set foreign key subsearch ordersSell_order_id IOrderssearch
     * @param orderssearch: IOrderssearch
     */
    public void ordersSell_order_id(IOrderssearch orderssearch) {
        ordersSell_order_idsearcher.setTablesearch(orderssearch);
    }
    
    /**
     * get foreign key subsearch ordersSell_order_id IOrderssearch
     * @return Tablesearch for Tradecombined_sell
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
     * set foreign key subsearch tradecombined ITradecombinedsearch
     * @param tradecombinedsearch: ITradecombinedsearch
     */
    public void tradecombined(ITradecombinedsearch tradecombinedsearch) {
        tradecombinedsearcher.setTablesearch(tradecombinedsearch);
    }
    
    /**
     * get foreign key subsearch tradecombined ITradecombinedsearch
     * @return Tablesearch for Tradecombined_sell
     */
    public ITradecombinedsearch getTradecombinedsearch() {
        if(tradecombinedsearcher.used()) {
            return (ITradecombinedsearch)tradecombinedsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if tradecombinedsearcher is not used
     * @return inner join statement
     */
    public String getTradecombinedInnerjoin() {
        return tradecombinedsearcher.getInnerjoin();
    }

}
