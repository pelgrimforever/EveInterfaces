/*
 * Orderssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IOrderssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Orders;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Orders table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Orderssearch extends Tablesearch implements IOrderssearch {

    Numbersearch id = new Numbersearch("orders.id");
    Booleansearch isopen = new Booleansearch("orders.isopen");
    Numbersearch volume_total = new Numbersearch("orders.volume_total");
    Numbersearch volume_remain = new Numbersearch("orders.volume_remain");
    Stringsearch range = new Stringsearch("orders.range");
    Numbersearch range_number = new Numbersearch("orders.range_number");
    Numbersearch price = new Numbersearch("orders.price");
    Numbersearch min_volume = new Numbersearch("orders.min_volume");
    Numbersearch location = new Numbersearch("orders.location");
    Booleansearch is_buy_order = new Booleansearch("orders.is_buy_order");
    Timesearch issued = new Timesearch("orders.issued");
    Numbersearch duration = new Numbersearch("orders.duration");
    Numbersearch page = new Numbersearch("orders.page");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IOrders.evetypePKfields, IOrders.evetypeFKfields);
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", IOrders.systemPKfields, IOrders.systemFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch systemtrade_orderBuy_ordersearcher = new Primarykeysearch("systemtrade_order", ISystemtrade_order.ordersBuy_orderPKfields, ISystemtrade_order.ordersBuy_orderFKfields);
    //relational key
    Relationalkeysearch relsystemtrade1searcher = new Relationalkeysearch("systemtrade_order", ISystemtrade_order.ordersBuy_orderPKfields, ISystemtrade_order.ordersBuy_orderFKfields, "systemtrade", ISystemtrade_order.systemtradePKfields, ISystemtrade_order.systemtradeFKfields);
    //foreign key
    Primarykeysearch systemtrade_orderSell_ordersearcher = new Primarykeysearch("systemtrade_order", ISystemtrade_order.ordersSell_orderPKfields, ISystemtrade_order.ordersSell_orderFKfields);
    //relational key
    Relationalkeysearch relsystemtrade2searcher = new Relationalkeysearch("systemtrade_order", ISystemtrade_order.ordersSell_orderPKfields, ISystemtrade_order.ordersSell_orderFKfields, "systemtrade", ISystemtrade_order.systemtradePKfields, ISystemtrade_order.systemtradeFKfields);
    //foreign key
    Primarykeysearch tradecombined_sellBuy_order_idsearcher = new Primarykeysearch("tradecombined_sell", ITradecombined_sell.ordersBuy_order_idPKfields, ITradecombined_sell.ordersBuy_order_idFKfields);
    //relational key
    Relationalkeysearch reltradecombined1searcher = new Relationalkeysearch("tradecombined_sell", ITradecombined_sell.ordersBuy_order_idPKfields, ITradecombined_sell.ordersBuy_order_idFKfields, "tradecombined", ITradecombined_sell.tradecombinedPKfields, ITradecombined_sell.tradecombinedFKfields);
    //foreign key
    Primarykeysearch tradecombined_sellSell_order_idsearcher = new Primarykeysearch("tradecombined_sell", ITradecombined_sell.ordersSell_order_idPKfields, ITradecombined_sell.ordersSell_order_idFKfields);
    //relational key
    Relationalkeysearch reltradecombined2searcher = new Relationalkeysearch("tradecombined_sell", ITradecombined_sell.ordersSell_order_idPKfields, ITradecombined_sell.ordersSell_order_idFKfields, "tradecombined", ITradecombined_sell.tradecombinedPKfields, ITradecombined_sell.tradecombinedFKfields);
    //foreign key
    Primarykeysearch tradeSell_order_idsearcher = new Primarykeysearch("trade", ITrade.ordersSell_order_idPKfields, ITrade.ordersSell_order_idFKfields);
    //foreign key
    Primarykeysearch tradeBuy_order_idsearcher = new Primarykeysearch("trade", ITrade.ordersBuy_order_idPKfields, ITrade.ordersBuy_order_idFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Orders.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Orderssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Orderssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(isopen);
        addFieldsearcher(volume_total);
        addFieldsearcher(volume_remain);
        addFieldsearcher(range);
        addFieldsearcher(range_number);
        addFieldsearcher(price);
        addFieldsearcher(min_volume);
        addFieldsearcher(location);
        addFieldsearcher(is_buy_order);
        addFieldsearcher(issued);
        addFieldsearcher(duration);
        addFieldsearcher(page);
        addKeysearcher(evetypesearcher);
        addKeysearcher(systemsearcher);
        addKeysearcher(systemtrade_orderBuy_ordersearcher);
        addKeysearcher(relsystemtrade1searcher);
        addKeysearcher(systemtrade_orderSell_ordersearcher);
        addKeysearcher(relsystemtrade2searcher);
        addKeysearcher(tradecombined_sellBuy_order_idsearcher);
        addKeysearcher(reltradecombined1searcher);
        addKeysearcher(tradecombined_sellSell_order_idsearcher);
        addKeysearcher(reltradecombined2searcher);
        addKeysearcher(tradeSell_order_idsearcher);
        addKeysearcher(tradeBuy_order_idsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param ordersPK: Orders primery key
     */
    public void addPrimarykey(IOrdersPK ordersPK) {
        super.addPrimarykey(ordersPK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field isopen
     * @param value: true or false
     */
    public void isopen(Boolean value) {
        addBooleanvalue(isopen, value);
    }
    
    /**
     * add Numeric search values for field volume_total, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void volume_total(Double[] values, byte[] operators) {
        addNumbervalues(volume_total, values, operators);
    }
    
    /**
     * add Numeric search values for field volume_total
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void volume_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume_total, values, operators);
        volume_total.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field volume_remain, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(volume_remain, values, operators);
    }
    
    /**
     * add Numeric search values for field volume_remain
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume_remain, values, operators);
        volume_remain.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field range, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void range(String[] values) {
        addStringvalues(range, values);
    }
    
    /**
     * add String search values for field range
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void range(String[] values, byte compare, byte andor) {
        addStringvalues(range, values);
        range.setCompareoperator(compare);
        range.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field range_number, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void range_number(Double[] values, byte[] operators) {
        addNumbervalues(range_number, values, operators);
    }
    
    /**
     * add Numeric search values for field range_number
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void range_number(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(range_number, values, operators);
        range_number.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field price, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void price(Double[] values, byte[] operators) {
        addNumbervalues(price, values, operators);
    }
    
    /**
     * add Numeric search values for field price
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(price, values, operators);
        price.setAndoroperator(andor);
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
     * add Numeric search values for field location, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void location(Double[] values, byte[] operators) {
        addNumbervalues(location, values, operators);
    }
    
    /**
     * add Numeric search values for field location
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void location(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(location, values, operators);
        location.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field is_buy_order
     * @param value: true or false
     */
    public void is_buy_order(Boolean value) {
        addBooleanvalue(is_buy_order, value);
    }
    
    /**
     * add Timestamp search values for field issued, default OR operator is used
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void issued(Timestamp[] values, byte[] operators) {
        addTimevalues(issued, values, operators);
    }
    
    /**
     * add Timestamp search values for field issued
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void issued(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(issued, values, operators);
        issued.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field duration, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void duration(Double[] values, byte[] operators) {
        addNumbervalues(duration, values, operators);
    }
    
    /**
     * add Numeric search values for field duration
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void duration(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(duration, values, operators);
        duration.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field page, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void page(Double[] values, byte[] operators) {
        addNumbervalues(page, values, operators);
    }
    
    /**
     * add Numeric search values for field page
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void page(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(page, values, operators);
        page.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch evetype IEvetypesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get foreign key subsearch evetype IEvetypesearch
     * @return Tablesearch for Orders
     */
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if evetypesearcher is not used
     * @return inner join statement
     */
    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch system ISystemsearch
     * @param systemsearch: ISystemsearch
     */
    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * get foreign key subsearch system ISystemsearch
     * @return Tablesearch for Orders
     */
    public ISystemsearch getSystemsearch() {
        if(systemsearcher.used()) {
            return (ISystemsearch)systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemsearcher is not used
     * @return inner join statement
     */
    public String getSystemInnerjoin() {
        return systemsearcher.getInnerjoin();
    }

    /**
     * set external key - foreign key subsearch ISystemtrade_ordersearch
     * @param systemtrade_ordersearch: ISystemtrade_ordersearch
     */
    public void systemtrade_orderBuy_order(ISystemtrade_ordersearch systemtrade_ordersearch) {
        systemtrade_orderBuy_ordersearcher.setTablesearch(systemtrade_ordersearch);
    }
    
    /**
     * get external key - foreign key subsearch ISystemtrade_ordersearch
     * @return Tablesearch for ISystemtrade_ordersearch
     */
    public ISystemtrade_ordersearch getSystemtrade_orderbuy_ordersearch() {
        if(systemtrade_orderBuy_ordersearcher.used()) {
            return (ISystemtrade_ordersearch)systemtrade_orderBuy_ordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch systemtrade tablesearch
     * @param systemtradesearch: ISystemtradesearch
     */
    public void relsystemtrade1(ISystemtradesearch systemtradesearch) {
        relsystemtrade1searcher.setTablesearch(systemtradesearch);
    }
    
    /**
     * get external key - relational subsearch ISystemtradesearch
     * @return Tablesearch for ISystemtradesearch
     */
    public ISystemtradesearch getRelSystemtrade1search() {
        if(relsystemtrade1searcher.used()) {
            return (ISystemtradesearch)relsystemtrade1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch ISystemtrade_ordersearch
     * @param systemtrade_ordersearch: ISystemtrade_ordersearch
     */
    public void systemtrade_orderSell_order(ISystemtrade_ordersearch systemtrade_ordersearch) {
        systemtrade_orderSell_ordersearcher.setTablesearch(systemtrade_ordersearch);
    }
    
    /**
     * get external key - foreign key subsearch ISystemtrade_ordersearch
     * @return Tablesearch for ISystemtrade_ordersearch
     */
    public ISystemtrade_ordersearch getSystemtrade_ordersell_ordersearch() {
        if(systemtrade_orderSell_ordersearcher.used()) {
            return (ISystemtrade_ordersearch)systemtrade_orderSell_ordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch systemtrade tablesearch
     * @param systemtradesearch: ISystemtradesearch
     */
    public void relsystemtrade2(ISystemtradesearch systemtradesearch) {
        relsystemtrade2searcher.setTablesearch(systemtradesearch);
    }
    
    /**
     * get external key - relational subsearch ISystemtradesearch
     * @return Tablesearch for ISystemtradesearch
     */
    public ISystemtradesearch getRelSystemtrade2search() {
        if(relsystemtrade2searcher.used()) {
            return (ISystemtradesearch)relsystemtrade2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch ITradecombined_sellsearch
     * @param tradecombined_sellsearch: ITradecombined_sellsearch
     */
    public void tradecombined_sellBuy_order_id(ITradecombined_sellsearch tradecombined_sellsearch) {
        tradecombined_sellBuy_order_idsearcher.setTablesearch(tradecombined_sellsearch);
    }
    
    /**
     * get external key - foreign key subsearch ITradecombined_sellsearch
     * @return Tablesearch for ITradecombined_sellsearch
     */
    public ITradecombined_sellsearch getTradecombined_sellbuy_order_idsearch() {
        if(tradecombined_sellBuy_order_idsearcher.used()) {
            return (ITradecombined_sellsearch)tradecombined_sellBuy_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch tradecombined tablesearch
     * @param tradecombinedsearch: ITradecombinedsearch
     */
    public void reltradecombined1(ITradecombinedsearch tradecombinedsearch) {
        reltradecombined1searcher.setTablesearch(tradecombinedsearch);
    }
    
    /**
     * get external key - relational subsearch ITradecombinedsearch
     * @return Tablesearch for ITradecombinedsearch
     */
    public ITradecombinedsearch getRelTradecombined1search() {
        if(reltradecombined1searcher.used()) {
            return (ITradecombinedsearch)reltradecombined1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch ITradecombined_sellsearch
     * @param tradecombined_sellsearch: ITradecombined_sellsearch
     */
    public void tradecombined_sellSell_order_id(ITradecombined_sellsearch tradecombined_sellsearch) {
        tradecombined_sellSell_order_idsearcher.setTablesearch(tradecombined_sellsearch);
    }
    
    /**
     * get external key - foreign key subsearch ITradecombined_sellsearch
     * @return Tablesearch for ITradecombined_sellsearch
     */
    public ITradecombined_sellsearch getTradecombined_sellsell_order_idsearch() {
        if(tradecombined_sellSell_order_idsearcher.used()) {
            return (ITradecombined_sellsearch)tradecombined_sellSell_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch tradecombined tablesearch
     * @param tradecombinedsearch: ITradecombinedsearch
     */
    public void reltradecombined2(ITradecombinedsearch tradecombinedsearch) {
        reltradecombined2searcher.setTablesearch(tradecombinedsearch);
    }
    
    /**
     * get external key - relational subsearch ITradecombinedsearch
     * @return Tablesearch for ITradecombinedsearch
     */
    public ITradecombinedsearch getRelTradecombined2search() {
        if(reltradecombined2searcher.used()) {
            return (ITradecombinedsearch)reltradecombined2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch ITradesearch
     * @param tradesearch: ITradesearch
     */
    public void tradeSell_order_id(ITradesearch tradesearch) {
        tradeSell_order_idsearcher.setTablesearch(tradesearch);
    }
    
    /**
     * get external key - foreign key subsearch ITradesearch
     * @return Tablesearch for ITradesearch
     */
    public ITradesearch getTradesell_order_idsearch() {
        if(tradeSell_order_idsearcher.used()) {
            return (ITradesearch)tradeSell_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch ITradesearch
     * @param tradesearch: ITradesearch
     */
    public void tradeBuy_order_id(ITradesearch tradesearch) {
        tradeBuy_order_idsearcher.setTablesearch(tradesearch);
    }
    
    /**
     * get external key - foreign key subsearch ITradesearch
     * @return Tablesearch for ITradesearch
     */
    public ITradesearch getTradebuy_order_idsearch() {
        if(tradeBuy_order_idsearcher.used()) {
            return (ITradesearch)tradeBuy_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
