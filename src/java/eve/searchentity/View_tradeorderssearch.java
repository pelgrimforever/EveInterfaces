/*
 * View_tradeorderssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_tradeorderssearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.view.eView_tradeorders;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_tradeorders table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_tradeorderssearch extends Tablesearch implements IView_tradeorderssearch {

    Numbersearch tradevolume = new Numbersearch("view_tradeorders.tradevolume");
    Numbersearch buy_totalprice = new Numbersearch("view_tradeorders.buy_totalprice");
    Numbersearch sell_totalprice = new Numbersearch("view_tradeorders.sell_totalprice");
    Numbersearch cargo_volume = new Numbersearch("view_tradeorders.cargo_volume");
    Numbersearch sell_id = new Numbersearch("view_tradeorders.sell_id");
    Numbersearch sell_system = new Numbersearch("view_tradeorders.sell_system");
    Numbersearch sell_location = new Numbersearch("view_tradeorders.sell_location");
    Numbersearch sell_evetype = new Numbersearch("view_tradeorders.sell_evetype");
    Numbersearch sell_packaged_volume = new Numbersearch("view_tradeorders.sell_packaged_volume");
    Numbersearch sell_volume_remain = new Numbersearch("view_tradeorders.sell_volume_remain");
    Numbersearch sell_price = new Numbersearch("view_tradeorders.sell_price");
    Numbersearch security_island = new Numbersearch("view_tradeorders.security_island");
    Numbersearch buy_id = new Numbersearch("view_tradeorders.buy_id");
    Numbersearch buy_system = new Numbersearch("view_tradeorders.buy_system");
    Numbersearch buy_location = new Numbersearch("view_tradeorders.buy_location");
    Numbersearch buy_volume_remain = new Numbersearch("view_tradeorders.buy_volume_remain");
    Numbersearch buy_price = new Numbersearch("view_tradeorders.buy_price");
    Numbersearch jumps = new Numbersearch("view_tradeorders.jumps");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_tradeorderssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_tradeorderssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(tradevolume);
        addFieldsearcher(buy_totalprice);
        addFieldsearcher(sell_totalprice);
        addFieldsearcher(cargo_volume);
        addFieldsearcher(sell_id);
        addFieldsearcher(sell_system);
        addFieldsearcher(sell_location);
        addFieldsearcher(sell_evetype);
        addFieldsearcher(sell_packaged_volume);
        addFieldsearcher(sell_volume_remain);
        addFieldsearcher(sell_price);
        addFieldsearcher(security_island);
        addFieldsearcher(buy_id);
        addFieldsearcher(buy_system);
        addFieldsearcher(buy_location);
        addFieldsearcher(buy_volume_remain);
        addFieldsearcher(buy_price);
        addFieldsearcher(jumps);
    }

    /**
     * add Numeric search values for field tradevolume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void tradevolume(Double[] values, byte[] operators) {
        addNumbervalues(tradevolume, values, operators);
    }
    
    /**
     * add Numeric search values for field tradevolume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void tradevolume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(tradevolume, values, operators);
        tradevolume.setAndoroperator(andor);
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
     * add Numeric search values for field sell_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_id(Double[] values, byte[] operators) {
        addNumbervalues(sell_id, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_id, values, operators);
        sell_id.setAndoroperator(andor);
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
     * add Numeric search values for field sell_location, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_location(Double[] values, byte[] operators) {
        addNumbervalues(sell_location, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_location
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_location(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_location, values, operators);
        sell_location.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_evetype, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_evetype(Double[] values, byte[] operators) {
        addNumbervalues(sell_evetype, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_evetype
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_evetype, values, operators);
        sell_evetype.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_packaged_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(sell_packaged_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_packaged_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_packaged_volume, values, operators);
        sell_packaged_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_volume_remain, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(sell_volume_remain, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_volume_remain
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_volume_remain, values, operators);
        sell_volume_remain.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sell_price, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sell_price(Double[] values, byte[] operators) {
        addNumbervalues(sell_price, values, operators);
    }
    
    /**
     * add Numeric search values for field sell_price
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sell_price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_price, values, operators);
        sell_price.setAndoroperator(andor);
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
     * add Numeric search values for field buy_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_id(Double[] values, byte[] operators) {
        addNumbervalues(buy_id, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_id, values, operators);
        buy_id.setAndoroperator(andor);
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
     * add Numeric search values for field buy_location, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_location(Double[] values, byte[] operators) {
        addNumbervalues(buy_location, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_location
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_location(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_location, values, operators);
        buy_location.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_volume_remain, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(buy_volume_remain, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_volume_remain
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_volume_remain, values, operators);
        buy_volume_remain.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field buy_price, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void buy_price(Double[] values, byte[] operators) {
        addNumbervalues(buy_price, values, operators);
    }
    
    /**
     * add Numeric search values for field buy_price
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void buy_price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_price, values, operators);
        buy_price.setAndoroperator(andor);
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
