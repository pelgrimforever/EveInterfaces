/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_tradesystemsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_tradesystem;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_tradesystemsearch extends Tablesearch implements IView_tradesystemsearch {

    Numbersearch sell_regionid = new Numbersearch("view_tradesystem.sell_regionid");
    Stringsearch sell_regionname = new Stringsearch("view_tradesystem.sell_regionname");
    Numbersearch sell_systemid = new Numbersearch("view_tradesystem.sell_systemid");
    Stringsearch sell_systemname = new Stringsearch("view_tradesystem.sell_systemname");
    Numbersearch orders = new Numbersearch("view_tradesystem.orders");
    Numbersearch buy_total = new Numbersearch("view_tradesystem.buy_total");
    Numbersearch sell_total = new Numbersearch("view_tradesystem.sell_total");
    Numbersearch totalprofit = new Numbersearch("view_tradesystem.totalprofit");
    Numbersearch totalvolume = new Numbersearch("view_tradesystem.totalvolume");
    Numbersearch buy_systemid = new Numbersearch("view_tradesystem.buy_systemid");
    Stringsearch buy_systemname = new Stringsearch("view_tradesystem.buy_systemname");
    Numbersearch trade_jumps = new Numbersearch("view_tradesystem.trade_jumps");
    Numbersearch trade_jumpslowsec = new Numbersearch("view_tradesystem.trade_jumpslowsec");
    Numbersearch trade_jumpsnullsec = new Numbersearch("view_tradesystem.trade_jumpsnullsec");

    public String getTable() {
        return View_tradesystem.table;
    }

    public View_tradesystemsearch() {
        setFieldsearchers();
    }

    public View_tradesystemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(sell_regionid);
        addFieldsearcher(sell_regionname);
        addFieldsearcher(sell_systemid);
        addFieldsearcher(sell_systemname);
        addFieldsearcher(orders);
        addFieldsearcher(buy_total);
        addFieldsearcher(sell_total);
        addFieldsearcher(totalprofit);
        addFieldsearcher(totalvolume);
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
    
    public void orders(Double[] values, byte[] operators) {
        addNumbervalues(orders, values, operators);
    }
    
    public void orders(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(orders, values, operators);
        orders.setAndoroperator(andor);
    }
    
    public void buy_total(Double[] values, byte[] operators) {
        addNumbervalues(buy_total, values, operators);
    }
    
    public void buy_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_total, values, operators);
        buy_total.setAndoroperator(andor);
    }
    
    public void sell_total(Double[] values, byte[] operators) {
        addNumbervalues(sell_total, values, operators);
    }
    
    public void sell_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_total, values, operators);
        sell_total.setAndoroperator(andor);
    }
    
    public void totalprofit(Double[] values, byte[] operators) {
        addNumbervalues(totalprofit, values, operators);
    }
    
    public void totalprofit(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalprofit, values, operators);
        totalprofit.setAndoroperator(andor);
    }
    
    public void totalvolume(Double[] values, byte[] operators) {
        addNumbervalues(totalvolume, values, operators);
    }
    
    public void totalvolume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalvolume, values, operators);
        totalvolume.setAndoroperator(andor);
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
