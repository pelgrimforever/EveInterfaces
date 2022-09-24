/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

public class Order_history_maxdatesearch extends Tablesearch implements IOrder_history_maxdatesearch {

    Datesearch maxdate = new Datesearch("order_history_maxdate.maxdate");

    public String getTable() {
        return Order_history_maxdate.table;
    }

    public Order_history_maxdatesearch() {
        setFieldsearchers();
    }

    public Order_history_maxdatesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(maxdate);
    }

    public void maxdate(Date[] values, byte[] operators) {
        addDatevalues(maxdate, values, operators);
    }
    
    public void maxdate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(maxdate, values, operators);
        maxdate.setAndoroperator(andor);
    }
    
}
