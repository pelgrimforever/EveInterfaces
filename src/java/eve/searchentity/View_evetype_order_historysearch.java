/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_evetype_order_historysearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_evetype_order_history;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_evetype_order_historysearch extends Tablesearch implements IView_evetype_order_historysearch {

    Numbersearch evetype = new Numbersearch("view_evetype_order_history.evetype");
    Datesearch date = new Datesearch("view_evetype_order_history.date");
    Numbersearch average = new Numbersearch("view_evetype_order_history.average");
    Numbersearch highest = new Numbersearch("view_evetype_order_history.highest");
    Numbersearch lowest = new Numbersearch("view_evetype_order_history.lowest");
    Numbersearch volume = new Numbersearch("view_evetype_order_history.volume");
    Numbersearch ordercount = new Numbersearch("view_evetype_order_history.ordercount");

    public String getTable() {
        return View_evetype_order_history.table;
    }

    public View_evetype_order_historysearch() {
        setFieldsearchers();
    }

    public View_evetype_order_historysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(evetype);
        addFieldsearcher(date);
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
    
    public void date(Date[] values, byte[] operators) {
        addDatevalues(date, values, operators);
    }
    
    public void date(Date[] values, byte[] operators, byte andor) {
        addDatevalues(date, values, operators);
        date.setAndoroperator(andor);
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
