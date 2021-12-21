/*
 * Json_orderssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.11.2021 15:45
 *
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

/**
 * Search class for Json_orders table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Json_orderssearch extends Tablesearch implements IJson_orderssearch {

    Numbersearch id = new Numbersearch("json_orders.id");
    Stringsearch json = new Stringsearch("json_orders.json");
//foreign keys
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Json_orders.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Json_orderssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Json_orderssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(json);
    }

    /**
     * add a primary key instance to search for
     * @param json_ordersPK: Json_orders primery key
     */
    public void addPrimarykey(IJson_ordersPK json_ordersPK) {
        super.addPrimarykey(json_ordersPK);
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
     * add String search values for field json, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void json(String[] values) {
        addStringvalues(json, values);
    }
    
    /**
     * add String search values for field json
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void json(String[] values, byte compare, byte andor) {
        addStringvalues(json, values);
        json.setCompareoperator(compare);
        json.setAndoroperator(andor);
    }
    
}
