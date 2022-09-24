/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_order_region_evetypesearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_order_region_evetype;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_order_region_evetypesearch extends Tablesearch implements IView_order_region_evetypesearch {

    Numbersearch region = new Numbersearch("view_order_region_evetype.region");
    Numbersearch evetype = new Numbersearch("view_order_region_evetype.evetype");

    public String getTable() {
        return View_order_region_evetype.table;
    }

    public View_order_region_evetypesearch() {
        setFieldsearchers();
    }

    public View_order_region_evetypesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(region);
        addFieldsearcher(evetype);
    }

    public void region(Double[] values, byte[] operators) {
        addNumbervalues(region, values, operators);
    }
    
    public void region(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(region, values, operators);
        region.setAndoroperator(andor);
    }
    
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
}
