/*
 * View_systemtradeorderssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_systemtradeorderssearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.view.eView_systemtradeorders;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_systemtradeorders table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_systemtradeorderssearch extends Tablesearch implements IView_systemtradeorderssearch {

    Numbersearch buy_totalprice = new Numbersearch("view_systemtradeorders.buy_totalprice");
    Numbersearch sell_totalprice = new Numbersearch("view_systemtradeorders.sell_totalprice");
    Numbersearch cargo_volume = new Numbersearch("view_systemtradeorders.cargo_volume");
    Numbersearch sellorderid = new Numbersearch("view_systemtradeorders.sellorderid");
    Numbersearch buyorderid = new Numbersearch("view_systemtradeorders.buyorderid");
    Numbersearch evetype = new Numbersearch("view_systemtradeorders.evetype");
    Numbersearch packaged_volume = new Numbersearch("view_systemtradeorders.packaged_volume");
    Numbersearch security_island = new Numbersearch("view_systemtradeorders.security_island");
    Numbersearch sell_system = new Numbersearch("view_systemtradeorders.sell_system");
    Numbersearch buy_system = new Numbersearch("view_systemtradeorders.buy_system");
    Numbersearch jumps = new Numbersearch("view_systemtradeorders.jumps");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_systemtradeorderssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_systemtradeorderssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(buy_totalprice);
        addFieldsearcher(sell_totalprice);
        addFieldsearcher(cargo_volume);
        addFieldsearcher(sellorderid);
        addFieldsearcher(buyorderid);
        addFieldsearcher(evetype);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(security_island);
        addFieldsearcher(sell_system);
        addFieldsearcher(buy_system);
        addFieldsearcher(jumps);
    }

    /**
     * add Numeric search values for field buy_totalprice, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_totalprice(Double[] values, byte[] operators) {
        addNumbervalues(buy_totalprice, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_totalprice
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_totalprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_totalprice, values, operators);
        buy_totalprice.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_totalprice, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_totalprice(Double[] values, byte[] operators) {
        addNumbervalues(sell_totalprice, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_totalprice
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_totalprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_totalprice, values, operators);
        sell_totalprice.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field cargo_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void cargo_volume(Double[] values, byte[] operators) {
        addNumbervalues(cargo_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field cargo_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void cargo_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(cargo_volume, values, operators);
        cargo_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sellorderid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sellorderid(Double[] values, byte[] operators) {
        addNumbervalues(sellorderid, values, operators);
    }
    
    /**
     * add Numeric search values for field sellorderid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sellorderid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sellorderid, values, operators);
        sellorderid.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buyorderid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buyorderid(Double[] values, byte[] operators) {
        addNumbervalues(buyorderid, values, operators);
    }
    
    /**
     * add Numeric search values for field buyorderid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buyorderid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buyorderid, values, operators);
        buyorderid.setAndoroperator(andor);
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
     * add Numeric search values for field packaged_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field packaged_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field security_island, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void security_island(Double[] values, byte[] operators) {
        addNumbervalues(security_island, values, operators);
    }
    
    /**
     * add Numeric search values for field security_island
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void security_island(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(security_island, values, operators);
        security_island.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_system, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_system(Double[] values, byte[] operators) {
        addNumbervalues(sell_system, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_system
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_system, values, operators);
        sell_system.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_system, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_system(Double[] values, byte[] operators) {
        addNumbervalues(buy_system, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_system
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_system, values, operators);
        buy_system.setAndoroperator(andor);
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
    
}
