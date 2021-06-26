/*
 * Categorysearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ICategorysearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eCategory;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Category table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Categorysearch extends Tablesearch implements ICategorysearch {

    Numbersearch id = new Numbersearch("category.id");
    Stringsearch name = new Stringsearch("category.name");
    Booleansearch published = new Booleansearch("category.published");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Categorysearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Categorysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(published);
    }

    /**
     * add a primary key instance to search for
     * @param categoryPK: Category primery key
     */
    public void addPrimarykey(ICategoryPK categoryPK) {
        super.addPrimarykey(categoryPK);
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
     * add String search values for field name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    /**
     * add String search values for field name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field published
     * @param value: true or false
     */
    public void published(Boolean value) {
        addBooleanvalue(published, value);
    }
    
}
