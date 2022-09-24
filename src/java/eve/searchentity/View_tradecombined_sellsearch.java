/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

    public String getTable() {
        return View_tradecombined_sell.table;
    }

    public View_tradecombined_sellsearch() {
        setFieldsearchers();
    }

    public View_tradecombined_sellsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void sell_system(Double[] values, byte[] operators) {
        addNumbervalues(sell_system, values, operators);
    }
    
    public void sell_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_system, values, operators);
        sell_system.setAndoroperator(andor);
    }
    
    public void buy_system(Double[] values, byte[] operators) {
        addNumbervalues(buy_system, values, operators);
    }
    
    public void buy_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_system, values, operators);
        buy_system.setAndoroperator(andor);
    }
    
    public void orderamount(Double[] values, byte[] operators) {
        addNumbervalues(orderamount, values, operators);
    }
    
    public void orderamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(orderamount, values, operators);
        orderamount.setAndoroperator(andor);
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
    
    public void sell_locationid(Double[] values, byte[] operators) {
        addNumbervalues(sell_locationid, values, operators);
    }
    
    public void sell_locationid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_locationid, values, operators);
        sell_locationid.setAndoroperator(andor);
    }
    
    public void sell_stationname(String[] values) {
        addStringvalues(sell_stationname, values);
    }
    
    public void sell_stationname(String[] values, byte compare, byte andor) {
        addStringvalues(sell_stationname, values);
        sell_stationname.setCompareoperator(compare);
        sell_stationname.setAndoroperator(andor);
    }
    
    public void evetype_id(Double[] values, byte[] operators) {
        addNumbervalues(evetype_id, values, operators);
    }
    
    public void evetype_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype_id, values, operators);
        evetype_id.setAndoroperator(andor);
    }
    
    public void evetype_name(String[] values) {
        addStringvalues(evetype_name, values);
    }
    
    public void evetype_name(String[] values, byte compare, byte andor) {
        addStringvalues(evetype_name, values);
        evetype_name.setCompareoperator(compare);
        evetype_name.setAndoroperator(andor);
    }
    
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
    }
    
    public void sell_id(Double[] values, byte[] operators) {
        addNumbervalues(sell_id, values, operators);
    }
    
    public void sell_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_id, values, operators);
        sell_id.setAndoroperator(andor);
    }
    
    public void sell_volume_total(Double[] values, byte[] operators) {
        addNumbervalues(sell_volume_total, values, operators);
    }
    
    public void sell_volume_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_volume_total, values, operators);
        sell_volume_total.setAndoroperator(andor);
    }
    
    public void sell_volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(sell_volume_remain, values, operators);
    }
    
    public void sell_volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_volume_remain, values, operators);
        sell_volume_remain.setAndoroperator(andor);
    }
    
    public void sell_min_volume(Double[] values, byte[] operators) {
        addNumbervalues(sell_min_volume, values, operators);
    }
    
    public void sell_min_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_min_volume, values, operators);
        sell_min_volume.setAndoroperator(andor);
    }
    
    public void sell_updated(Double[] values, byte[] operators) {
        addNumbervalues(sell_updated, values, operators);
    }
    
    public void sell_updated(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_updated, values, operators);
        sell_updated.setAndoroperator(andor);
    }
    
    public void buy_id(Double[] values, byte[] operators) {
        addNumbervalues(buy_id, values, operators);
    }
    
    public void buy_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_id, values, operators);
        buy_id.setAndoroperator(andor);
    }
    
    public void sell_price(Double[] values, byte[] operators) {
        addNumbervalues(sell_price, values, operators);
    }
    
    public void sell_price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_price, values, operators);
        sell_price.setAndoroperator(andor);
    }
    
    public void buy_volume_total(Double[] values, byte[] operators) {
        addNumbervalues(buy_volume_total, values, operators);
    }
    
    public void buy_volume_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_volume_total, values, operators);
        buy_volume_total.setAndoroperator(andor);
    }
    
    public void buy_volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(buy_volume_remain, values, operators);
    }
    
    public void buy_volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_volume_remain, values, operators);
        buy_volume_remain.setAndoroperator(andor);
    }
    
    public void buy_min_volume(Double[] values, byte[] operators) {
        addNumbervalues(buy_min_volume, values, operators);
    }
    
    public void buy_min_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_min_volume, values, operators);
        buy_min_volume.setAndoroperator(andor);
    }
    
    public void buy_updated(Double[] values, byte[] operators) {
        addNumbervalues(buy_updated, values, operators);
    }
    
    public void buy_updated(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_updated, values, operators);
        buy_updated.setAndoroperator(andor);
    }
    
    public void buy_price(Double[] values, byte[] operators) {
        addNumbervalues(buy_price, values, operators);
    }
    
    public void buy_price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_price, values, operators);
        buy_price.setAndoroperator(andor);
    }
    
    public void buy_locationid(Double[] values, byte[] operators) {
        addNumbervalues(buy_locationid, values, operators);
    }
    
    public void buy_locationid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_locationid, values, operators);
        buy_locationid.setAndoroperator(andor);
    }
    
    public void buy_stationname(String[] values) {
        addStringvalues(buy_stationname, values);
    }
    
    public void buy_stationname(String[] values, byte compare, byte andor) {
        addStringvalues(buy_stationname, values);
        buy_stationname.setCompareoperator(compare);
        buy_stationname.setAndoroperator(andor);
    }
    
}
