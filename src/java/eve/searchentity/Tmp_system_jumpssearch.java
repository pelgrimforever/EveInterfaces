/*
 * Tmp_system_jumpssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ITmp_system_jumpssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eTmp_system_jumps;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Tmp_system_jumps table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Tmp_system_jumpssearch extends Tablesearch implements ITmp_system_jumpssearch {

    Numbersearch system = new Numbersearch("tmp_system_jumps.system");
    Numbersearch jump = new Numbersearch("tmp_system_jumps.jump");
    Numbersearch maxjumps = new Numbersearch("tmp_system_jumps.maxjumps");
    Numbersearch previoussystem = new Numbersearch("tmp_system_jumps.previoussystem");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Tmp_system_jumpssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Tmp_system_jumpssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(system);
        addFieldsearcher(jump);
        addFieldsearcher(maxjumps);
        addFieldsearcher(previoussystem);
    }

    /**
     * add a primary key instance to search for
     * @param tmp_system_jumpsPK: Tmp_system_jumps primery key
     */
    public void addPrimarykey(ITmp_system_jumpsPK tmp_system_jumpsPK) {
        super.addPrimarykey(tmp_system_jumpsPK);
    }

    /**
     * add Numeric search values for field system, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void system(long[] values, byte[] operators) {
        addNumbervalues(system, values, operators);
    }
    
    /**
     * add Numeric search values for field system
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void system(long[] values, byte[] operators, byte andor) {
        addNumbervalues(system, values, operators);
        system.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jump, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jump(Double[] values, byte[] operators) {
        addNumbervalues(jump, values, operators);
    }
    
    /**
     * add Numeric search values for field jump
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jump(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jump, values, operators);
        jump.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field maxjumps, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void maxjumps(Double[] values, byte[] operators) {
        addNumbervalues(maxjumps, values, operators);
    }
    
    /**
     * add Numeric search values for field maxjumps
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void maxjumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(maxjumps, values, operators);
        maxjumps.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field previoussystem, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void previoussystem(Double[] values, byte[] operators) {
        addNumbervalues(previoussystem, values, operators);
    }
    
    /**
     * add Numeric search values for field previoussystem
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void previoussystem(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(previoussystem, values, operators);
        previoussystem.setAndoroperator(andor);
    }
    
}
