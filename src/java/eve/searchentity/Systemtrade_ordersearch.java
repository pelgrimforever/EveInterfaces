/*
 * Systemtrade_ordersearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISystemtrade_ordersearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eSystemtrade_order;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Systemtrade_order table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Systemtrade_ordersearch extends Tablesearch implements ISystemtrade_ordersearch {

    Numbersearch amount = new Numbersearch("systemtrade_order.amount");
    Numbersearch sellprice = new Numbersearch("systemtrade_order.sellprice");
    Numbersearch buyprice = new Numbersearch("systemtrade_order.buyprice");
    Numbersearch profit = new Numbersearch("systemtrade_order.profit");
    Numbersearch cargovolume = new Numbersearch("systemtrade_order.cargovolume");
    Foreignkeysearch ordersBuy_ordersearcher = new Foreignkeysearch("orders", ISystemtrade_order.ordersBuy_orderPKfields, ISystemtrade_order.ordersBuy_orderFKfields);
    Foreignkeysearch ordersSell_ordersearcher = new Foreignkeysearch("orders", ISystemtrade_order.ordersSell_orderPKfields, ISystemtrade_order.ordersSell_orderFKfields);
    Foreignkeysearch systemtradesearcher = new Foreignkeysearch("systemtrade", ISystemtrade_order.systemtradePKfields, ISystemtrade_order.systemtradeFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Systemtrade_ordersearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Systemtrade_ordersearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(amount);
        addFieldsearcher(sellprice);
        addFieldsearcher(buyprice);
        addFieldsearcher(profit);
        addFieldsearcher(cargovolume);
        addKeysearcher(ordersBuy_ordersearcher);
        addKeysearcher(ordersSell_ordersearcher);
        addKeysearcher(systemtradesearcher);
    }

    /**
     * add a primary key instance to search for
     * @param systemtrade_orderPK: Systemtrade_order primery key
     */
    public void addPrimarykey(ISystemtrade_orderPK systemtrade_orderPK) {
        super.addPrimarykey(systemtrade_orderPK);
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
     * add Numeric search values for field sellprice, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sellprice(Double[] values, byte[] operators) {
        addNumbervalues(sellprice, values, operators);
    }
    
    /**
     * add Numeric search values for field sellprice
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sellprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sellprice, values, operators);
        sellprice.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buyprice, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buyprice(Double[] values, byte[] operators) {
        addNumbervalues(buyprice, values, operators);
    }
    
    /**
     * add Numeric search values for field buyprice
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buyprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buyprice, values, operators);
        buyprice.setAndoroperator(andor);
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
     * add Numeric search values for field cargovolume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void cargovolume(Double[] values, byte[] operators) {
        addNumbervalues(cargovolume, values, operators);
    }
    
    /**
     * add Numeric search values for field cargovolume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void cargovolume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(cargovolume, values, operators);
        cargovolume.setAndoroperator(andor);
    }
    
    /**
     * set subsearch ordersBuy_order tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void ordersBuy_order(IOrderssearch orderssearch) {
        ordersBuy_ordersearcher.setTablesearch(orderssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Systemtrade_order
     */
    public IOrderssearch getOrdersbuy_ordersearch() {
        if(ordersBuy_ordersearcher.used()) {
            return (IOrderssearch)ordersBuy_ordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if ordersBuy_ordersearcher is not used
     * @return inner join statement
     */
    public String getOrdersbuy_orderInnerjoin() {
        return ordersBuy_ordersearcher.getInnerjoin();
    }

    /**
     * set subsearch ordersSell_order tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void ordersSell_order(IOrderssearch orderssearch) {
        ordersSell_ordersearcher.setTablesearch(orderssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Systemtrade_order
     */
    public IOrderssearch getOrderssell_ordersearch() {
        if(ordersSell_ordersearcher.used()) {
            return (IOrderssearch)ordersSell_ordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if ordersSell_ordersearcher is not used
     * @return inner join statement
     */
    public String getOrderssell_orderInnerjoin() {
        return ordersSell_ordersearcher.getInnerjoin();
    }

    /**
     * set subsearch systemtrade tablesearch
     * @param systemtradesearch: ISystemtradesearch
     */
    public void systemtrade(ISystemtradesearch systemtradesearch) {
        systemtradesearcher.setTablesearch(systemtradesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Systemtrade_order
     */
    public ISystemtradesearch getSystemtradesearch() {
        if(systemtradesearcher.used()) {
            return (ISystemtradesearch)systemtradesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemtradesearcher is not used
     * @return inner join statement
     */
    public String getSystemtradeInnerjoin() {
        return systemtradesearcher.getInnerjoin();
    }

}
