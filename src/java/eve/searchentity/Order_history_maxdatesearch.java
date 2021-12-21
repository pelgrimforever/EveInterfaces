/*
 * Order_history_maxdatesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.11.2021 15:45
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IOrder_history_maxdatesearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.Order_history_maxdate;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Order_history_maxdate table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Order_history_maxdatesearch extends Tablesearch implements IOrder_history_maxdatesearch {

    Datesearch maxdate = new Datesearch("order_history_maxdate.maxdate");

    /**
     * @return viewname
     */
    public String getTable() {
        return Order_history_maxdate.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Order_history_maxdatesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Order_history_maxdatesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(maxdate);
    }

    /**
     * add Date search values for field maxdate, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void maxdate(Date[] values, byte[] operators) {
        addDatevalues(maxdate, values, operators);
    }
    
    /**
     * add Date search values for field maxdate
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void maxdate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(maxdate, values, operators);
        maxdate.setAndoroperator(andor);
    }
    
}
