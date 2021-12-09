/*
 * Order_historysearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.11.2021 14:30
 *
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

/**
 * Search class for Order_history table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
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

    /**
     * @return tablename
     */
    public String getTable() {
        return Order_history.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Order_historysearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Order_historysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
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

    /**
     * add a primary key instance to search for
     * @param order_historyPK: Order_history primery key
     */
    public void addPrimarykey(IOrder_historyPK order_historyPK) {
        super.addPrimarykey(order_historyPK);
    }

    /**
     * add Date search values for field date, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void date(Date[] values, byte[] operators) {
        addDatevalues(date, values, operators);
    }
    
    /**
     * add Date search values for field date
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void date(Date[] values, byte[] operators, byte andor) {
        addDatevalues(date, values, operators);
        date.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field average, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void average(Double[] values, byte[] operators) {
        addNumbervalues(average, values, operators);
    }
    
    /**
     * add Numeric search values for field average
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void average(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(average, values, operators);
        average.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field highest, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void highest(Double[] values, byte[] operators) {
        addNumbervalues(highest, values, operators);
    }
    
    /**
     * add Numeric search values for field highest
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void highest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(highest, values, operators);
        highest.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field lowest, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void lowest(Double[] values, byte[] operators) {
        addNumbervalues(lowest, values, operators);
    }
    
    /**
     * add Numeric search values for field lowest
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void lowest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lowest, values, operators);
        lowest.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void volume(Double[] values, byte[] operators) {
        addNumbervalues(volume, values, operators);
    }
    
    /**
     * add Numeric search values for field volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume, values, operators);
        volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field order_count, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void order_count(Double[] values, byte[] operators) {
        addNumbervalues(order_count, values, operators);
    }
    
    /**
     * add Numeric search values for field order_count
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void order_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(order_count, values, operators);
        order_count.setAndoroperator(andor);
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
     * @return Tablesearch for Order_history
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
     * set foreign key subsearch region IRegionsearch
     * @param regionsearch: IRegionsearch
     */
    public void region(IRegionsearch regionsearch) {
        regionsearcher.setTablesearch(regionsearch);
    }
    
    /**
     * get foreign key subsearch region IRegionsearch
     * @return Tablesearch for Order_history
     */
    public IRegionsearch getRegionsearch() {
        if(regionsearcher.used()) {
            return (IRegionsearch)regionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if regionsearcher is not used
     * @return inner join statement
     */
    public String getRegionInnerjoin() {
        return regionsearcher.getInnerjoin();
    }

}
