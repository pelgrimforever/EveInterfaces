/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IOrder_historysearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Order_history;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Order_historysearch extends Tablesearch implements IOrder_historysearch {

    Datesearch date = new Datesearch("order_history.date");
    Numbersearch average = new Numbersearch("order_history.average");
    Numbersearch highest = new Numbersearch("order_history.highest");
    Numbersearch lowest = new Numbersearch("order_history.lowest");
    Numbersearch volume = new Numbersearch("order_history.volume");
    Numbersearch order_count = new Numbersearch("order_history.order_count");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IOrder_history.evetypePKfields, IOrder_history.evetypeFKfields);
    Foreignkeysearch regionsearcher = new Foreignkeysearch("region", IOrder_history.regionPKfields, IOrder_history.regionFKfields);
//external foreign keys

    public String getTable() {
        return Order_history.table;
    }

    public Order_historysearch() {
        setFieldsearchers();
    }

    public Order_historysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(date);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
        addFieldsearcher(volume);
        addFieldsearcher(order_count);
        addKeysearcher(evetypesearcher);
        addKeysearcher(regionsearcher);
    }

    public void addPrimarykey(IOrder_historyPK order_historyPK) {
        super.addPrimarykey(order_historyPK);
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
