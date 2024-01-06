/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IOrder_history_monthsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Order_history_month;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Order_history_monthsearch extends Tablesearch implements IOrder_history_monthsearch {

    Numbersearch year = new Numbersearch("order_history_month.year");
    Numbersearch month = new Numbersearch("order_history_month.month");
    Numbersearch average = new Numbersearch("order_history_month.average");
    Numbersearch highest = new Numbersearch("order_history_month.highest");
    Numbersearch lowest = new Numbersearch("order_history_month.lowest");
    Numbersearch volume = new Numbersearch("order_history_month.volume");
    Numbersearch order_count = new Numbersearch("order_history_month.order_count");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IOrder_history_month.evetypePKfields, IOrder_history_month.evetypeFKfields);
    Foreignkeysearch regionsearcher = new Foreignkeysearch("region", IOrder_history_month.regionPKfields, IOrder_history_month.regionFKfields);
//external foreign keys

    public String getTable() {
        return Order_history_month.table;
    }

    public Order_history_monthsearch() {
        setFieldsearchers();
    }

    public Order_history_monthsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(year);
        addFieldsearcher(month);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
        addFieldsearcher(volume);
        addFieldsearcher(order_count);
        addKeysearcher(evetypesearcher);
        addKeysearcher(regionsearcher);
    }

    public void addPrimarykey(IOrder_history_monthPK order_history_monthPK) {
        super.addPrimarykey(order_history_monthPK);
    }

    public void year(long[] values, byte[] operators) {
        addNumbervalues(year, values, operators);
    }
    
    public void year(long[] values, byte[] operators, byte andor) {
        addNumbervalues(year, values, operators);
        year.setAndoroperator(andor);
    }
    
    public void month(long[] values, byte[] operators) {
        addNumbervalues(month, values, operators);
    }
    
    public void month(long[] values, byte[] operators, byte andor) {
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
    
    public void order_count(Double[] values, byte[] operators) {
        addNumbervalues(order_count, values, operators);
    }
    
    public void order_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(order_count, values, operators);
        order_count.setAndoroperator(andor);
    }
    
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

    public void region(IRegionsearch regionsearch) {
        regionsearcher.setTablesearch(regionsearch);
    }
    
    public IRegionsearch getRegionsearch() {
        if(regionsearcher.used()) {
            return (IRegionsearch)regionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getRegionInnerjoin() {
        return regionsearcher.getInnerjoin();
    }

}
