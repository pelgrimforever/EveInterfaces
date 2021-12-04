/*
 * View_tradecombined_sellsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.11.2021 14:51
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_tradecombined_sellsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_tradecombined_sell;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_tradecombined_sell table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_tradecombined_sellsearch extends Tablesearch implements IView_tradecombined_sellsearch {

    Numbersearch sell_system = new Numbersearch("view_tradecombined_sell.sell_system");
    Numbersearch buy_system = new Numbersearch("view_tradecombined_sell.buy_system");
    Numbersearch orderamount = new Numbersearch("view_tradecombined_sell.orderamount");
    Numbersearch buy_order_value = new Numbersearch("view_tradecombined_sell.buy_order_value");
    Numbersearch sell_order_value = new Numbersearch("view_tradecombined_sell.sell_order_value");
    Numbersearch profit = new Numbersearch("view_tradecombined_sell.profit");
    Numbersearch sell_locationid = new Numbersearch("view_tradecombined_sell.sell_locationid");
    Stringsearch sell_stationname = new Stringsearch("view_tradecombined_sell.sell_stationname");
    Numbersearch evetype_id = new Numbersearch("view_tradecombined_sell.evetype_id");
    Stringsearch evetype_name = new Stringsearch("view_tradecombined_sell.evetype_name");
    Numbersearch packaged_volume = new Numbersearch("view_tradecombined_sell.packaged_volume");
    Numbersearch sell_id = new Numbersearch("view_tradecombined_sell.sell_id");
    Numbersearch sell_volume_total = new Numbersearch("view_tradecombined_sell.sell_volume_total");
    Numbersearch sell_volume_remain = new Numbersearch("view_tradecombined_sell.sell_volume_remain");
    Numbersearch sell_min_volume = new Numbersearch("view_tradecombined_sell.sell_min_volume");
    Numbersearch sell_updated = new Numbersearch("view_tradecombined_sell.sell_updated");
    Numbersearch buy_id = new Numbersearch("view_tradecombined_sell.buy_id");
    Numbersearch sell_price = new Numbersearch("view_tradecombined_sell.sell_price");
    Numbersearch buy_volume_total = new Numbersearch("view_tradecombined_sell.buy_volume_total");
    Numbersearch buy_volume_remain = new Numbersearch("view_tradecombined_sell.buy_volume_remain");
    Numbersearch buy_min_volume = new Numbersearch("view_tradecombined_sell.buy_min_volume");
    Numbersearch buy_updated = new Numbersearch("view_tradecombined_sell.buy_updated");
    Numbersearch buy_price = new Numbersearch("view_tradecombined_sell.buy_price");
    Numbersearch buy_locationid = new Numbersearch("view_tradecombined_sell.buy_locationid");
    Stringsearch buy_stationname = new Stringsearch("view_tradecombined_sell.buy_stationname");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_tradecombined_sell.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_tradecombined_sellsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_tradecombined_sellsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(sell_system);
        addFieldsearcher(buy_system);
        addFieldsearcher(orderamount);
        addFieldsearcher(buy_order_value);
        addFieldsearcher(sell_order_value);
        addFieldsearcher(profit);
        addFieldsearcher(sell_locationid);
        addFieldsearcher(sell_stationname);
        addFieldsearcher(evetype_id);
        addFieldsearcher(evetype_name);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(sell_id);
        addFieldsearcher(sell_volume_total);
        addFieldsearcher(sell_volume_remain);
        addFieldsearcher(sell_min_volume);
        addFieldsearcher(sell_updated);
        addFieldsearcher(buy_id);
        addFieldsearcher(sell_price);
        addFieldsearcher(buy_volume_total);
        addFieldsearcher(buy_volume_remain);
        addFieldsearcher(buy_min_volume);
        addFieldsearcher(buy_updated);
        addFieldsearcher(buy_price);
        addFieldsearcher(buy_locationid);
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
     * add Numeric search values for field orderamount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void orderamount(Double[] values, byte[] operators) {
        addNumbervalues(orderamount, values, operators);
    }
    
    /**
     * add Numeric search values for field orderamount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void orderamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(orderamount, values, operators);
        orderamount.setAndoroperator(andor);
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
     * add Numeric search values for field sell_volume_total, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_volume_total(Double[] values, byte[] operators) {
        addNumbervalues(sell_volume_total, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_volume_total
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_volume_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_volume_total, values, operators);
        sell_volume_total.setAndoroperator(andor);
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
     * add Numeric search values for field sell_min_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_min_volume(Double[] values, byte[] operators) {
        addNumbervalues(sell_min_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_min_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_min_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_min_volume, values, operators);
        sell_min_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_updated, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_updated(Double[] values, byte[] operators) {
        addNumbervalues(sell_updated, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_updated
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_updated(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_updated, values, operators);
        sell_updated.setAndoroperator(andor);
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
     * add Numeric search values for field buy_volume_total, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_volume_total(Double[] values, byte[] operators) {
        addNumbervalues(buy_volume_total, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_volume_total
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_volume_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_volume_total, values, operators);
        buy_volume_total.setAndoroperator(andor);
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
     * add Numeric search values for field buy_min_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_min_volume(Double[] values, byte[] operators) {
        addNumbervalues(buy_min_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_min_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_min_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_min_volume, values, operators);
        buy_min_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_updated, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_updated(Double[] values, byte[] operators) {
        addNumbervalues(buy_updated, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_updated
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_updated(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_updated, values, operators);
        buy_updated.setAndoroperator(andor);
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
    
}
