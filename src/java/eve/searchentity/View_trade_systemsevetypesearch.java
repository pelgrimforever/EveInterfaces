/*
 * View_trade_systemsevetypesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_trade_systemsevetypesearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_trade_systemsevetype;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_trade_systemsevetype table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_trade_systemsevetypesearch extends Tablesearch implements IView_trade_systemsevetypesearch {

    Numbersearch systemsell = new Numbersearch("view_trade_systemsevetype.systemsell");
    Numbersearch systembuy = new Numbersearch("view_trade_systemsevetype.systembuy");
    Numbersearch evetype = new Numbersearch("view_trade_systemsevetype.evetype");
    Numbersearch jumps = new Numbersearch("view_trade_systemsevetype.jumps");
    Numbersearch jumpslowsec = new Numbersearch("view_trade_systemsevetype.jumpslowsec");
    Numbersearch jumpsnullsec = new Numbersearch("view_trade_systemsevetype.jumpsnullsec");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_trade_systemsevetype.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_trade_systemsevetypesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_trade_systemsevetypesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(systemsell);
        addFieldsearcher(systembuy);
        addFieldsearcher(evetype);
        addFieldsearcher(jumps);
        addFieldsearcher(jumpslowsec);
        addFieldsearcher(jumpsnullsec);
    }

    /**
     * add Numeric search values for field systemsell, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void systemsell(Double[] values, byte[] operators) {
        addNumbervalues(systemsell, values, operators);
    }
    
    /**
     * add Numeric search values for field systemsell
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void systemsell(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(systemsell, values, operators);
        systemsell.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field systembuy, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void systembuy(Double[] values, byte[] operators) {
        addNumbervalues(systembuy, values, operators);
    }
    
    /**
     * add Numeric search values for field systembuy
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void systembuy(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(systembuy, values, operators);
        systembuy.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field evetype, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    /**
     * add Numeric search values for field evetype
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumps, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumps(Double[] values, byte[] operators) {
        addNumbervalues(jumps, values, operators);
    }
    
    /**
     * add Numeric search values for field jumps
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumps, values, operators);
        jumps.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpslowsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpslowsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpslowsec, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpslowsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpslowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpslowsec, values, operators);
        jumpslowsec.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpsnullsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpsnullsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpsnullsec, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpsnullsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpsnullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpsnullsec, values, operators);
        jumpsnullsec.setAndoroperator(andor);
    }
    
}
