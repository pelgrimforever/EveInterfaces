/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IJson_orderssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Json_orders;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Json_orderssearch extends Tablesearch implements IJson_orderssearch {

    Numbersearch id = new Numbersearch("json_orders.id");
    Stringsearch json = new Stringsearch("json_orders.json");
//foreign keys
//external foreign keys

    public String getTable() {
        return Json_orders.table;
    }

    public Json_orderssearch() {
        setFieldsearchers();
    }

    public Json_orderssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(json);
    }

    public void addPrimarykey(IJson_ordersPK json_ordersPK) {
        super.addPrimarykey(json_ordersPK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void json(String[] values) {
        addStringvalues(json, values);
    }
    
    public void json(String[] values, byte compare, byte andor) {
        addStringvalues(json, values);
        json.setCompareoperator(compare);
        json.setAndoroperator(andor);
    }
    
}
