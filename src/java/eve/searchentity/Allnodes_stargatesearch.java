/*
 * Allnodes_stargatesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.11.2021 15:45
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IAllnodes_stargatesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Allnodes_stargate;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Allnodes_stargate table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Allnodes_stargatesearch extends Tablesearch implements IAllnodes_stargatesearch {

    Numbersearch id = new Numbersearch("allnodes_stargate.id");
    Numbersearch to_stargate = new Numbersearch("allnodes_stargate.to_stargate");
    Numbersearch system = new Numbersearch("allnodes_stargate.system");
    Numbersearch to_system = new Numbersearch("allnodes_stargate.to_system");
    Booleansearch deadend = new Booleansearch("allnodes_stargate.deadend");
//foreign keys
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Allnodes_stargate.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Allnodes_stargatesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Allnodes_stargatesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(to_stargate);
        addFieldsearcher(system);
        addFieldsearcher(to_system);
        addFieldsearcher(deadend);
    }

    /**
     * add a primary key instance to search for
     * @param allnodes_stargatePK: Allnodes_stargate primery key
     */
    public void addPrimarykey(IAllnodes_stargatePK allnodes_stargatePK) {
        super.addPrimarykey(allnodes_stargatePK);
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
     * add Numeric search values for field to_stargate, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void to_stargate(Double[] values, byte[] operators) {
        addNumbervalues(to_stargate, values, operators);
    }
    
    /**
     * add Numeric search values for field to_stargate
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void to_stargate(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(to_stargate, values, operators);
        to_stargate.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field system, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void system(Double[] values, byte[] operators) {
        addNumbervalues(system, values, operators);
    }
    
    /**
     * add Numeric search values for field system
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(system, values, operators);
        system.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field to_system, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void to_system(Double[] values, byte[] operators) {
        addNumbervalues(to_system, values, operators);
    }
    
    /**
     * add Numeric search values for field to_system
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void to_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(to_system, values, operators);
        to_system.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field deadend
     * @param value: true or false
     */
    public void deadend(Boolean value) {
        addBooleanvalue(deadend, value);
    }
    
}
