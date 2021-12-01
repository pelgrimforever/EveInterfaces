/*
 * View_systemtrade_ordersearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_systemtrade_ordersearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_systemtrade_order;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_systemtrade_order table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_systemtrade_ordersearch extends Tablesearch implements IView_systemtrade_ordersearch {

    Numbersearch sell_system = new Numbersearch("view_systemtrade_order.sell_system");
    Numbersearch buy_system = new Numbersearch("view_systemtrade_order.buy_system");
    Numbersearch sell_order = new Numbersearch("view_systemtrade_order.sell_order");
    Numbersearch buy_order = new Numbersearch("view_systemtrade_order.buy_order");
    Numbersearch amount = new Numbersearch("view_systemtrade_order.amount");
    Numbersearch sellprice = new Numbersearch("view_systemtrade_order.sellprice");
    Numbersearch buyprice = new Numbersearch("view_systemtrade_order.buyprice");
    Numbersearch profit = new Numbersearch("view_systemtrade_order.profit");
    Numbersearch cargovolume = new Numbersearch("view_systemtrade_order.cargovolume");
    Numbersearch evetype = new Numbersearch("view_systemtrade_order.evetype");
    Stringsearch evetypename = new Stringsearch("view_systemtrade_order.evetypename");
    Numbersearch sell_volume_remain = new Numbersearch("view_systemtrade_order.sell_volume_remain");
    Numbersearch sell_price = new Numbersearch("view_systemtrade_order.sell_price");
    Numbersearch sell_station = new Numbersearch("view_systemtrade_order.sell_station");
    Stringsearch sell_stationname = new Stringsearch("view_systemtrade_order.sell_stationname");
    Numbersearch buy_volume_remain = new Numbersearch("view_systemtrade_order.buy_volume_remain");
    Numbersearch buy_price = new Numbersearch("view_systemtrade_order.buy_price");
    Numbersearch buy_station = new Numbersearch("view_systemtrade_order.buy_station");
    Stringsearch buy_stationname = new Stringsearch("view_systemtrade_order.buy_stationname");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_systemtrade_order.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_systemtrade_ordersearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_systemtrade_ordersearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(sell_system);
        addFieldsearcher(buy_system);
        addFieldsearcher(sell_order);
        addFieldsearcher(buy_order);
        addFieldsearcher(amount);
        addFieldsearcher(sellprice);
        addFieldsearcher(buyprice);
        addFieldsearcher(profit);
        addFieldsearcher(cargovolume);
        addFieldsearcher(evetype);
        addFieldsearcher(evetypename);
        addFieldsearcher(sell_volume_remain);
        addFieldsearcher(sell_price);
        addFieldsearcher(sell_station);
        addFieldsearcher(sell_stationname);
        addFieldsearcher(buy_volume_remain);
        addFieldsearcher(buy_price);
        addFieldsearcher(buy_station);
        addFieldsearcher(buy_stationname);
    }

    /**
     * add Numeric search values for field sell_system, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_system(Double[] values, byte[] operators) {
        addNumbervalues(sell_system, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_system
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_system, values, operators);
        sell_system.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_system, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_system(Double[] values, byte[] operators) {
        addNumbervalues(buy_system, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_system
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_system, values, operators);
        buy_system.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_order, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_order(Double[] values, byte[] operators) {
        addNumbervalues(sell_order, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_order
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_order(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_order, values, operators);
        sell_order.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_order, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_order(Double[] values, byte[] operators) {
        addNumbervalues(buy_order, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_order
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_order(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_order, values, operators);
        buy_order.setAndoroperator(andor);
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
     * add Numeric search values for field evetype, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    /**
     * add Numeric search values for field evetype
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field evetypename, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void evetypename(String[] values) {
        addStringvalues(evetypename, values);
    }
    
    /**
     * add String search values for field evetypename
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void evetypename(String[] values, byte compare, byte andor) {
        addStringvalues(evetypename, values);
        evetypename.setCompareoperator(compare);
        evetypename.setAndoroperator(andor);
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
     * add Numeric search values for field sell_station, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_station(Double[] values, byte[] operators) {
        addNumbervalues(sell_station, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_station
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_station(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_station, values, operators);
        sell_station.setAndoroperator(andor);
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
     * add Numeric search values for field buy_station, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_station(Double[] values, byte[] operators) {
        addNumbervalues(buy_station, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_station
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_station(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_station, values, operators);
        buy_station.setAndoroperator(andor);
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
    
}
