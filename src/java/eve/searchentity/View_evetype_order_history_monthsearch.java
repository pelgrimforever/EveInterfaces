/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_evetype_order_history_monthsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_evetype_order_history_month;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_evetype_order_history_monthsearch extends Tablesearch implements IView_evetype_order_history_monthsearch {

    Numbersearch evetype = new Numbersearch("view_evetype_order_history_month.evetype");
    Numbersearch year = new Numbersearch("view_evetype_order_history_month.year");
    Numbersearch month = new Numbersearch("view_evetype_order_history_month.month");
    Numbersearch average = new Numbersearch("view_evetype_order_history_month.average");
    Numbersearch highest = new Numbersearch("view_evetype_order_history_month.highest");
    Numbersearch lowest = new Numbersearch("view_evetype_order_history_month.lowest");
    Numbersearch volume = new Numbersearch("view_evetype_order_history_month.volume");
    Numbersearch ordercount = new Numbersearch("view_evetype_order_history_month.ordercount");

    public String getTable() {
        return View_evetype_order_history_month.table;
    }

    public View_evetype_order_history_monthsearch() {
        setFieldsearchers();
    }

    public View_evetype_order_history_monthsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(evetype);
        addFieldsearcher(year);
        addFieldsearcher(month);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
        addFieldsearcher(volume);
        addFieldsearcher(ordercount);
    }

    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
    public void year(Double[] values, byte[] operators) {
        addNumbervalues(year, values, operators);
    }
    
    public void year(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(year, values, operators);
        year.setAndoroperator(andor);
    }
    
    public void month(Double[] values, byte[] operators) {
        addNumbervalues(month, values, operators);
    }
    
    public void month(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(month, values, operators);
        month.setAndoroperator(andor);
    }
    
    public void average(Double[] values, byte[] operators) {
        addNumbervalues(average, values, operators);
    }
    
    public void average(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(average, values, operators);
        average.setAndoroperator(andor);
    }
    
    public void highest(Double[] values, byte[] operators) {
        addNumbervalues(highest, values, operators);
    }
    
    public void highest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(highest, values, operators);
        highest.setAndoroperator(andor);
    }
    
    public void lowest(Double[] values, byte[] operators) {
        addNumbervalues(lowest, values, operators);
    }
    
    public void lowest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lowest, values, operators);
        lowest.setAndoroperator(andor);
    }
    
    public void volume(Double[] values, byte[] operators) {
        addNumbervalues(volume, values, operators);
    }
    
    public void volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume, values, operators);
        volume.setAndoroperator(andor);
    }
    
    public void ordercount(Double[] values, byte[] operators) {
        addNumbervalues(ordercount, values, operators);
    }
    
    public void ordercount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(ordercount, values, operators);
        ordercount.setAndoroperator(andor);
    }
    
}
