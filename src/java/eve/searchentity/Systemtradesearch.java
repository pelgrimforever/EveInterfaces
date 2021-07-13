/*
 * Systemtradesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISystemtradesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eSystemtrade;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Systemtrade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Systemtradesearch extends Tablesearch implements ISystemtradesearch {

    Numbersearch profit = new Numbersearch("systemtrade.profit");
    Numbersearch total_cargo_volume = new Numbersearch("systemtrade.total_cargo_volume");
    Numbersearch jumps = new Numbersearch("systemtrade.jumps");
    Foreignkeysearch systemSell_systemsearcher = new Foreignkeysearch("system", ISystemtrade.systemSell_systemPKfields, ISystemtrade.systemSell_systemFKfields);
    Foreignkeysearch systemBuy_systemsearcher = new Foreignkeysearch("system", ISystemtrade.systemBuy_systemPKfields, ISystemtrade.systemBuy_systemFKfields);
    Primarykeysearch systemtrade_ordersearcher = new Primarykeysearch("systemtrade_order", ISystemtrade_order.systemtradePKfields, ISystemtrade_order.systemtradeFKfields);
    Relationalkeysearch orders1searcher = new Relationalkeysearch("systemtrade_order", ISystemtrade_order.systemtradePKfields, ISystemtrade_order.systemtradeFKfields, "orders", ISystemtrade_order.ordersBuy_orderPKfields, ISystemtrade_order.ordersBuy_orderFKfields);
    Relationalkeysearch orders2searcher = new Relationalkeysearch("systemtrade_order", ISystemtrade_order.systemtradePKfields, ISystemtrade_order.systemtradeFKfields, "orders", ISystemtrade_order.ordersSell_orderPKfields, ISystemtrade_order.ordersSell_orderFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Systemtradesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Systemtradesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(profit);
        addFieldsearcher(total_cargo_volume);
        addFieldsearcher(jumps);
        addKeysearcher(systemSell_systemsearcher);
        addKeysearcher(systemBuy_systemsearcher);
        addKeysearcher(systemtrade_ordersearcher);
        addKeysearcher(orders1searcher);
        addKeysearcher(orders2searcher);
    }

    /**
     * add a primary key instance to search for
     * @param systemtradePK: Systemtrade primery key
     */
    public void addPrimarykey(ISystemtradePK systemtradePK) {
        super.addPrimarykey(systemtradePK);
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
     * set subsearch systemSell_system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void systemSell_system(ISystemsearch systemsearch) {
        systemSell_systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Systemtrade
     */
    public ISystemsearch getSystemsell_systemsearch() {
        if(systemSell_systemsearcher.used()) {
            return (ISystemsearch)systemSell_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemSell_systemsearcher is not used
     * @return inner join statement
     */
    public String getSystemsell_systemInnerjoin() {
        return systemSell_systemsearcher.getInnerjoin();
    }

    /**
     * set subsearch systemBuy_system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void systemBuy_system(ISystemsearch systemsearch) {
        systemBuy_systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Systemtrade
     */
    public ISystemsearch getSystembuy_systemsearch() {
        if(systemBuy_systemsearcher.used()) {
            return (ISystemsearch)systemBuy_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemBuy_systemsearcher is not used
     * @return inner join statement
     */
    public String getSystembuy_systemInnerjoin() {
        return systemBuy_systemsearcher.getInnerjoin();
    }

    /**
     * set subsearch systemtrade_order tablesearch
     * @param systemtrade_ordersearch: ISystemtrade_ordersearch
     */
    public void systemtrade_order(ISystemtrade_ordersearch systemtrade_ordersearch) {
        systemtrade_ordersearcher.setTablesearch(systemtrade_ordersearch);
    }
    
    /**
     * 
     * @return Tablesearch for Systemtrade
     */
    public ISystemtrade_ordersearch getSystemtrade_ordersearch() {
        if(systemtrade_ordersearcher.used()) {
            return (ISystemtrade_ordersearch)systemtrade_ordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch orders tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void orders1(IOrderssearch orderssearch) {
        orders1searcher.setTablesearch(orderssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Systemtrade
     */
    public IOrderssearch getOrders1search() {
        if(orders1searcher.used()) {
            return (IOrderssearch)orders1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch orders tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void orders2(IOrderssearch orderssearch) {
        orders2searcher.setTablesearch(orderssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Systemtrade
     */
    public IOrderssearch getOrders2search() {
        if(orders2searcher.used()) {
            return (IOrderssearch)orders2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
