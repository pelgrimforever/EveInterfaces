/*
 * View_ordersearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2021 15:16
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_ordersearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_order;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_order table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_ordersearch extends Tablesearch implements IView_ordersearch {

    Numbersearch id = new Numbersearch("view_order.id");
    Booleansearch isopen = new Booleansearch("view_order.isopen");
    Numbersearch system = new Numbersearch("view_order.system");
    Numbersearch evetype = new Numbersearch("view_order.evetype");
    Numbersearch volume_total = new Numbersearch("view_order.volume_total");
    Numbersearch volume_remain = new Numbersearch("view_order.volume_remain");
    Stringsearch range = new Stringsearch("view_order.range");
    Numbersearch range_number = new Numbersearch("view_order.range_number");
    Numbersearch price = new Numbersearch("view_order.price");
    Numbersearch min_volume = new Numbersearch("view_order.min_volume");
    Numbersearch location = new Numbersearch("view_order.location");
    Booleansearch is_buy_order = new Booleansearch("view_order.is_buy_order");
    Timesearch issued = new Timesearch("view_order.issued");
    Numbersearch duration = new Numbersearch("view_order.duration");
    Numbersearch page = new Numbersearch("view_order.page");
    Numbersearch stationid = new Numbersearch("view_order.stationid");
    Stringsearch stationname = new Stringsearch("view_order.stationname");
    Numbersearch locationid = new Numbersearch("view_order.locationid");
    Stringsearch locationname = new Stringsearch("view_order.locationname");
    Stringsearch systemname = new Stringsearch("view_order.systemname");
    Numbersearch security_status = new Numbersearch("view_order.security_status");
    Numbersearch constellation = new Numbersearch("view_order.constellation");
    Stringsearch constellationname = new Stringsearch("view_order.constellationname");
    Numbersearch region = new Numbersearch("view_order.region");
    Stringsearch regionname = new Stringsearch("view_order.regionname");
    Stringsearch evetypename = new Stringsearch("view_order.evetypename");
    Numbersearch packaged_volume = new Numbersearch("view_order.packaged_volume");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_order.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_ordersearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_ordersearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(isopen);
        addFieldsearcher(system);
        addFieldsearcher(evetype);
        addFieldsearcher(volume_total);
        addFieldsearcher(volume_remain);
        addFieldsearcher(range);
        addFieldsearcher(range_number);
        addFieldsearcher(price);
        addFieldsearcher(min_volume);
        addFieldsearcher(location);
        addFieldsearcher(is_buy_order);
        addFieldsearcher(issued);
        addFieldsearcher(duration);
        addFieldsearcher(page);
        addFieldsearcher(stationid);
        addFieldsearcher(stationname);
        addFieldsearcher(locationid);
        addFieldsearcher(locationname);
        addFieldsearcher(systemname);
        addFieldsearcher(security_status);
        addFieldsearcher(constellation);
        addFieldsearcher(constellationname);
        addFieldsearcher(region);
        addFieldsearcher(regionname);
        addFieldsearcher(evetypename);
        addFieldsearcher(packaged_volume);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(Double[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field isopen
     * @param value: true or false
     */
    public void isopen(Boolean value) {
        addBooleanvalue(isopen, value);
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
     * add Numeric search values for field volume_total, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void volume_total(Double[] values, byte[] operators) {
        addNumbervalues(volume_total, values, operators);
    }
    
    /**
     * add Numeric search values for field volume_total
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void volume_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume_total, values, operators);
        volume_total.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field volume_remain, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(volume_remain, values, operators);
    }
    
    /**
     * add Numeric search values for field volume_remain
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume_remain, values, operators);
        volume_remain.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field range, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void range(String[] values) {
        addStringvalues(range, values);
    }
    
    /**
     * add String search values for field range
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void range(String[] values, byte compare, byte andor) {
        addStringvalues(range, values);
        range.setCompareoperator(compare);
        range.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field range_number, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void range_number(Double[] values, byte[] operators) {
        addNumbervalues(range_number, values, operators);
    }
    
    /**
     * add Numeric search values for field range_number
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void range_number(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(range_number, values, operators);
        range_number.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field price, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void price(Double[] values, byte[] operators) {
        addNumbervalues(price, values, operators);
    }
    
    /**
     * add Numeric search values for field price
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(price, values, operators);
        price.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field min_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void min_volume(Double[] values, byte[] operators) {
        addNumbervalues(min_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field min_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void min_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_volume, values, operators);
        min_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field location, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void location(Double[] values, byte[] operators) {
        addNumbervalues(location, values, operators);
    }
    
    /**
     * add Numeric search values for field location
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void location(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(location, values, operators);
        location.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field is_buy_order
     * @param value: true or false
     */
    public void is_buy_order(Boolean value) {
        addBooleanvalue(is_buy_order, value);
    }
    
    /**
     * add Timestamp search values for field issued, default OR operator is used
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void issued(Timestamp[] values, byte[] operators) {
        addTimevalues(issued, values, operators);
    }
    
    /**
     * add Timestamp search values for field issued
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void issued(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(issued, values, operators);
        issued.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field duration, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void duration(Double[] values, byte[] operators) {
        addNumbervalues(duration, values, operators);
    }
    
    /**
     * add Numeric search values for field duration
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void duration(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(duration, values, operators);
        duration.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field page, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void page(Double[] values, byte[] operators) {
        addNumbervalues(page, values, operators);
    }
    
    /**
     * add Numeric search values for field page
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void page(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(page, values, operators);
        page.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field stationid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void stationid(Double[] values, byte[] operators) {
        addNumbervalues(stationid, values, operators);
    }
    
    /**
     * add Numeric search values for field stationid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void stationid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(stationid, values, operators);
        stationid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field stationname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void stationname(String[] values) {
        addStringvalues(stationname, values);
    }
    
    /**
     * add String search values for field stationname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void stationname(String[] values, byte compare, byte andor) {
        addStringvalues(stationname, values);
        stationname.setCompareoperator(compare);
        stationname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field locationid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void locationid(Double[] values, byte[] operators) {
        addNumbervalues(locationid, values, operators);
    }
    
    /**
     * add Numeric search values for field locationid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void locationid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(locationid, values, operators);
        locationid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field locationname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void locationname(String[] values) {
        addStringvalues(locationname, values);
    }
    
    /**
     * add String search values for field locationname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void locationname(String[] values, byte compare, byte andor) {
        addStringvalues(locationname, values);
        locationname.setCompareoperator(compare);
        locationname.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field systemname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void systemname(String[] values) {
        addStringvalues(systemname, values);
    }
    
    /**
     * add String search values for field systemname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void systemname(String[] values, byte compare, byte andor) {
        addStringvalues(systemname, values);
        systemname.setCompareoperator(compare);
        systemname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field security_status, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void security_status(Double[] values, byte[] operators) {
        addNumbervalues(security_status, values, operators);
    }
    
    /**
     * add Numeric search values for field security_status
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void security_status(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(security_status, values, operators);
        security_status.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field constellation, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void constellation(Double[] values, byte[] operators) {
        addNumbervalues(constellation, values, operators);
    }
    
    /**
     * add Numeric search values for field constellation
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void constellation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(constellation, values, operators);
        constellation.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field constellationname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void constellationname(String[] values) {
        addStringvalues(constellationname, values);
    }
    
    /**
     * add String search values for field constellationname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void constellationname(String[] values, byte compare, byte andor) {
        addStringvalues(constellationname, values);
        constellationname.setCompareoperator(compare);
        constellationname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field region, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void region(Double[] values, byte[] operators) {
        addNumbervalues(region, values, operators);
    }
    
    /**
     * add Numeric search values for field region
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void region(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(region, values, operators);
        region.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field regionname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void regionname(String[] values) {
        addStringvalues(regionname, values);
    }
    
    /**
     * add String search values for field regionname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void regionname(String[] values, byte compare, byte andor) {
        addStringvalues(regionname, values);
        regionname.setCompareoperator(compare);
        regionname.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field evetypename, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void evetypename(String[] values) {
        addStringvalues(evetypename, values);
    }
    
    /**
     * add String search values for field evetypename
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void evetypename(String[] values, byte compare, byte andor) {
        addStringvalues(evetypename, values);
        evetypename.setCompareoperator(compare);
        evetypename.setAndoroperator(andor);
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
    
}
