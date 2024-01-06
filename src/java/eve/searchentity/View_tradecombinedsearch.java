/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_tradecombinedsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_tradecombined;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_tradecombinedsearch extends Tablesearch implements IView_tradecombinedsearch {

    Numbersearch sell_regionid = new Numbersearch("view_tradecombined.sell_regionid");
    Stringsearch sell_regionname = new Stringsearch("view_tradecombined.sell_regionname");
    Numbersearch sell_systemid = new Numbersearch("view_tradecombined.sell_systemid");
    Stringsearch sell_systemname = new Stringsearch("view_tradecombined.sell_systemname");
    Numbersearch evetype_id = new Numbersearch("view_tradecombined.evetype_id");
    Stringsearch evetype_name = new Stringsearch("view_tradecombined.evetype_name");
    Numbersearch packaged_volume = new Numbersearch("view_tradecombined.packaged_volume");
    Numbersearch orders = new Numbersearch("view_tradecombined.orders");
    Numbersearch totalamount = new Numbersearch("view_tradecombined.totalamount");
    Numbersearch buy_order_total = new Numbersearch("view_tradecombined.buy_order_total");
    Numbersearch sell_order_total = new Numbersearch("view_tradecombined.sell_order_total");
    Numbersearch totalprofit = new Numbersearch("view_tradecombined.totalprofit");
    Numbersearch buy_systemid = new Numbersearch("view_tradecombined.buy_systemid");
    Stringsearch buy_systemname = new Stringsearch("view_tradecombined.buy_systemname");
    Numbersearch trade_jumps = new Numbersearch("view_tradecombined.trade_jumps");
    Numbersearch trade_jumpslowsec = new Numbersearch("view_tradecombined.trade_jumpslowsec");
    Numbersearch trade_jumpsnullsec = new Numbersearch("view_tradecombined.trade_jumpsnullsec");

    public String getTable() {
        return View_tradecombined.table;
    }

    public View_tradecombinedsearch() {
        setFieldsearchers();
    }

    public View_tradecombinedsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(sell_regionid);
        addFieldsearcher(sell_regionname);
        addFieldsearcher(sell_systemid);
        addFieldsearcher(sell_systemname);
        addFieldsearcher(evetype_id);
        addFieldsearcher(evetype_name);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(orders);
        addFieldsearcher(totalamount);
        addFieldsearcher(buy_order_total);
        addFieldsearcher(sell_order_total);
        addFieldsearcher(totalprofit);
        addFieldsearcher(buy_systemid);
        addFieldsearcher(buy_systemname);
        addFieldsearcher(trade_jumps);
        addFieldsearcher(trade_jumpslowsec);
        addFieldsearcher(trade_jumpsnullsec);
    }

    public void sell_regionid(Double[] values, byte[] operators) {
        addNumbervalues(sell_regionid, values, operators);
    }
    
    public void sell_regionid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_regionid, values, operators);
        sell_regionid.setAndoroperator(andor);
    }
    
    public void sell_regionname(String[] values) {
        addStringvalues(sell_regionname, values);
    }
    
    public void sell_regionname(String[] values, byte compare, byte andor) {
        addStringvalues(sell_regionname, values);
        sell_regionname.setCompareoperator(compare);
        sell_regionname.setAndoroperator(andor);
    }
    
    public void sell_systemid(Double[] values, byte[] operators) {
        addNumbervalues(sell_systemid, values, operators);
    }
    
    public void sell_systemid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_systemid, values, operators);
        sell_systemid.setAndoroperator(andor);
    }
    
    public void sell_systemname(String[] values) {
        addStringvalues(sell_systemname, values);
    }
    
    public void sell_systemname(String[] values, byte compare, byte andor) {
        addStringvalues(sell_systemname, values);
        sell_systemname.setCompareoperator(compare);
        sell_systemname.setAndoroperator(andor);
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
    
    public void orders(Double[] values, byte[] operators) {
        addNumbervalues(orders, values, operators);
    }
    
    public void orders(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(orders, values, operators);
        orders.setAndoroperator(andor);
    }
    
    public void totalamount(Double[] values, byte[] operators) {
        addNumbervalues(totalamount, values, operators);
    }
    
    public void totalamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalamount, values, operators);
        totalamount.setAndoroperator(andor);
    }
    
    public void buy_order_total(Double[] values, byte[] operators) {
        addNumbervalues(buy_order_total, values, operators);
    }
    
    public void buy_order_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_order_total, values, operators);
        buy_order_total.setAndoroperator(andor);
    }
    
    public void sell_order_total(Double[] values, byte[] operators) {
        addNumbervalues(sell_order_total, values, operators);
    }
    
    public void sell_order_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_order_total, values, operators);
        sell_order_total.setAndoroperator(andor);
    }
    
    public void totalprofit(Double[] values, byte[] operators) {
        addNumbervalues(totalprofit, values, operators);
    }
    
    public void totalprofit(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalprofit, values, operators);
        totalprofit.setAndoroperator(andor);
    }
    
    public void buy_systemid(Double[] values, byte[] operators) {
        addNumbervalues(buy_systemid, values, operators);
    }
    
    public void buy_systemid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_systemid, values, operators);
        buy_systemid.setAndoroperator(andor);
    }
    
    public void buy_systemname(String[] values) {
        addStringvalues(buy_systemname, values);
    }
    
    public void buy_systemname(String[] values, byte compare, byte andor) {
        addStringvalues(buy_systemname, values);
        buy_systemname.setCompareoperator(compare);
        buy_systemname.setAndoroperator(andor);
    }
    
    public void trade_jumps(Double[] values, byte[] operators) {
        addNumbervalues(trade_jumps, values, operators);
    }
    
    public void trade_jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_jumps, values, operators);
        trade_jumps.setAndoroperator(andor);
    }
    
    public void trade_jumpslowsec(Double[] values, byte[] operators) {
        addNumbervalues(trade_jumpslowsec, values, operators);
    }
    
    public void trade_jumpslowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_jumpslowsec, values, operators);
        trade_jumpslowsec.setAndoroperator(andor);
    }
    
    public void trade_jumpsnullsec(Double[] values, byte[] operators) {
        addNumbervalues(trade_jumpsnullsec, values, operators);
    }
    
    public void trade_jumpsnullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(trade_jumpsnullsec, values, operators);
        trade_jumpsnullsec.setAndoroperator(andor);
    }
    
}
