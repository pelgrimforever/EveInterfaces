/*
 * Allnodes_systemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IAllnodes_systemsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Allnodes_system;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Allnodes_system table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Allnodes_systemsearch extends Tablesearch implements IAllnodes_systemsearch {

    Numbersearch id = new Numbersearch("allnodes_system.id");
    Booleansearch deadend = new Booleansearch("allnodes_system.deadend");
//foreign keys
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Allnodes_system.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Allnodes_systemsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Allnodes_systemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(deadend);
    }

    /**
     * add a primary key instance to search for
     * @param allnodes_systemPK: Allnodes_system primery key
     */
    public void addPrimarykey(IAllnodes_systemPK allnodes_systemPK) {
        super.addPrimarykey(allnodes_systemPK);
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
     * add Boolean search values for field deadend
     * @param value: true or false
     */
    public void deadend(Boolean value) {
        addBooleanvalue(deadend, value);
    }
    
}
