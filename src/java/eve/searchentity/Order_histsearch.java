/*
 * Order_histsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.11.2021 14:51
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IOrder_histsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Order_hist;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Order_hist table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Order_histsearch extends Tablesearch implements IOrder_histsearch {

    Numbersearch id = new Numbersearch("order_hist.id");
    Booleansearch isopen = new Booleansearch("order_hist.isopen");
    Numbersearch volume_total = new Numbersearch("order_hist.volume_total");
    Numbersearch volume_remain = new Numbersearch("order_hist.volume_remain");
    Stringsearch range = new Stringsearch("order_hist.range");
    Numbersearch range_number = new Numbersearch("order_hist.range_number");
    Numbersearch price = new Numbersearch("order_hist.price");
    Numbersearch min_volume = new Numbersearch("order_hist.min_volume");
    Numbersearch location = new Numbersearch("order_hist.location");
    Booleansearch is_buy_order = new Booleansearch("order_hist.is_buy_order");
    Timesearch issued = new Timesearch("order_hist.issued");
    Numbersearch duration = new Numbersearch("order_hist.duration");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IOrder_hist.evetypePKfields, IOrder_hist.evetypeFKfields);
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", IOrder_hist.systemPKfields, IOrder_hist.systemFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Order_hist.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Order_histsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Order_histsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(isopen);
        addFieldsearcher(volume_total);
        addFieldsearcher(volume_remain);
        addFieldsearcher(range);
        addFieldsearcher(range_number);
        addFieldsearcher(price);
        addFieldsearcher(min_volume);
        addFieldsearcher(location);
        addFieldsearcher(is_buy_order);
        addFieldsearcher(issued);
        addFieldsearcher(duration);
        addKeysearcher(evetypesearcher);
        addKeysearcher(systemsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param order_histPK: Order_hist primery key
     */
    public void addPrimarykey(IOrder_histPK order_histPK) {
        super.addPrimarykey(order_histPK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field isopen
     * @param value: true or false
     */
    public void isopen(Boolean value) {
        addBooleanvalue(isopen, value);
    }
    
    /**
     * add Numeric search values for field volume_total, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void volume_total(Double[] values, byte[] operators) {
        addNumbervalues(volume_total, values, operators);
    }
    
    /**
     * add Numeric search values for field volume_total
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void volume_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume_total, values, operators);
        volume_total.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field volume_remain, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(volume_remain, values, operators);
    }
    
    /**
     * add Numeric search values for field volume_remain
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume_remain, values, operators);
        volume_remain.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field range, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void range(String[] values) {
        addStringvalues(range, values);
    }
    
    /**
     * add String search values for field range
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void range(String[] values, byte compare, byte andor) {
        addStringvalues(range, values);
        range.setCompareoperator(compare);
        range.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field range_number, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void range_number(Double[] values, byte[] operators) {
        addNumbervalues(range_number, values, operators);
    }
    
    /**
     * add Numeric search values for field range_number
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void range_number(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(range_number, values, operators);
        range_number.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field price, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void price(Double[] values, byte[] operators) {
        addNumbervalues(price, values, operators);
    }
    
    /**
     * add Numeric search values for field price
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(price, values, operators);
        price.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field min_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void min_volume(Double[] values, byte[] operators) {
        addNumbervalues(min_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field min_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void min_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_volume, values, operators);
        min_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field location, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void location(Double[] values, byte[] operators) {
        addNumbervalues(location, values, operators);
    }
    
    /**
     * add Numeric search values for field location
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void location(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(location, values, operators);
        location.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field is_buy_order
     * @param value: true or false
     */
    public void is_buy_order(Boolean value) {
        addBooleanvalue(is_buy_order, value);
    }
    
    /**
     * add Timestamp search values for field issued, default OR operator is used
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void issued(Timestamp[] values, byte[] operators) {
        addTimevalues(issued, values, operators);
    }
    
    /**
     * add Timestamp search values for field issued
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void issued(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(issued, values, operators);
        issued.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field duration, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void duration(Double[] values, byte[] operators) {
        addNumbervalues(duration, values, operators);
    }
    
    /**
     * add Numeric search values for field duration
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void duration(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(duration, values, operators);
        duration.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch evetype IEvetypesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get foreign key subsearch evetype IEvetypesearch
     * @return Tablesearch for Order_hist
     */
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if evetypesearcher is not used
     * @return inner join statement
     */
    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch system ISystemsearch
     * @param systemsearch: ISystemsearch
     */
    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * get foreign key subsearch system ISystemsearch
     * @return Tablesearch for Order_hist
     */
    public ISystemsearch getSystemsearch() {
        if(systemsearcher.used()) {
            return (ISystemsearch)systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemsearcher is not used
     * @return inner join statement
     */
    public String getSystemInnerjoin() {
        return systemsearcher.getInnerjoin();
    }

}
