/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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
    Numbersearch avg_buyorder = new Numbersearch("view_order.avg_buyorder");
    Numbersearch avg_sellorder = new Numbersearch("view_order.avg_sellorder");

    public String getTable() {
        return View_order.table;
    }

    public View_ordersearch() {
        setFieldsearchers();
    }

    public View_ordersearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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
        addFieldsearcher(avg_buyorder);
        addFieldsearcher(avg_sellorder);
    }

    public void id(Double[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void isopen(Boolean value) {
        addBooleanvalue(isopen, value);
    }
    
    public void system(Double[] values, byte[] operators) {
        addNumbervalues(system, values, operators);
    }
    
    public void system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(system, values, operators);
        system.setAndoroperator(andor);
    }
    
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
    public void volume_total(Double[] values, byte[] operators) {
        addNumbervalues(volume_total, values, operators);
    }
    
    public void volume_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume_total, values, operators);
        volume_total.setAndoroperator(andor);
    }
    
    public void volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(volume_remain, values, operators);
    }
    
    public void volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume_remain, values, operators);
        volume_remain.setAndoroperator(andor);
    }
    
    public void range(String[] values) {
        addStringvalues(range, values);
    }
    
    public void range(String[] values, byte compare, byte andor) {
        addStringvalues(range, values);
        range.setCompareoperator(compare);
        range.setAndoroperator(andor);
    }
    
    public void range_number(Double[] values, byte[] operators) {
        addNumbervalues(range_number, values, operators);
    }
    
    public void range_number(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(range_number, values, operators);
        range_number.setAndoroperator(andor);
    }
    
    public void price(Double[] values, byte[] operators) {
        addNumbervalues(price, values, operators);
    }
    
    public void price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(price, values, operators);
        price.setAndoroperator(andor);
    }
    
    public void min_volume(Double[] values, byte[] operators) {
        addNumbervalues(min_volume, values, operators);
    }
    
    public void min_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_volume, values, operators);
        min_volume.setAndoroperator(andor);
    }
    
    public void location(Double[] values, byte[] operators) {
        addNumbervalues(location, values, operators);
    }
    
    public void location(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(location, values, operators);
        location.setAndoroperator(andor);
    }
    
    public void is_buy_order(Boolean value) {
        addBooleanvalue(is_buy_order, value);
    }
    
    public void issued(Timestamp[] values, byte[] operators) {
        addTimevalues(issued, values, operators);
    }
    
    public void issued(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(issued, values, operators);
        issued.setAndoroperator(andor);
    }
    
    public void duration(Double[] values, byte[] operators) {
        addNumbervalues(duration, values, operators);
    }
    
    public void duration(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(duration, values, operators);
        duration.setAndoroperator(andor);
    }
    
    public void page(Double[] values, byte[] operators) {
        addNumbervalues(page, values, operators);
    }
    
    public void page(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(page, values, operators);
        page.setAndoroperator(andor);
    }
    
    public void stationid(Double[] values, byte[] operators) {
        addNumbervalues(stationid, values, operators);
    }
    
    public void stationid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(stationid, values, operators);
        stationid.setAndoroperator(andor);
    }
    
    public void stationname(String[] values) {
        addStringvalues(stationname, values);
    }
    
    public void stationname(String[] values, byte compare, byte andor) {
        addStringvalues(stationname, values);
        stationname.setCompareoperator(compare);
        stationname.setAndoroperator(andor);
    }
    
    public void locationid(Double[] values, byte[] operators) {
        addNumbervalues(locationid, values, operators);
    }
    
    public void locationid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(locationid, values, operators);
        locationid.setAndoroperator(andor);
    }
    
    public void locationname(String[] values) {
        addStringvalues(locationname, values);
    }
    
    public void locationname(String[] values, byte compare, byte andor) {
        addStringvalues(locationname, values);
        locationname.setCompareoperator(compare);
        locationname.setAndoroperator(andor);
    }
    
    public void systemname(String[] values) {
        addStringvalues(systemname, values);
    }
    
    public void systemname(String[] values, byte compare, byte andor) {
        addStringvalues(systemname, values);
        systemname.setCompareoperator(compare);
        systemname.setAndoroperator(andor);
    }
    
    public void security_status(Double[] values, byte[] operators) {
        addNumbervalues(security_status, values, operators);
    }
    
    public void security_status(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(security_status, values, operators);
        security_status.setAndoroperator(andor);
    }
    
    public void constellation(Double[] values, byte[] operators) {
        addNumbervalues(constellation, values, operators);
    }
    
    public void constellation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(constellation, values, operators);
        constellation.setAndoroperator(andor);
    }
    
    public void constellationname(String[] values) {
        addStringvalues(constellationname, values);
    }
    
    public void constellationname(String[] values, byte compare, byte andor) {
        addStringvalues(constellationname, values);
        constellationname.setCompareoperator(compare);
        constellationname.setAndoroperator(andor);
    }
    
    public void region(Double[] values, byte[] operators) {
        addNumbervalues(region, values, operators);
    }
    
    public void region(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(region, values, operators);
        region.setAndoroperator(andor);
    }
    
    public void regionname(String[] values) {
        addStringvalues(regionname, values);
    }
    
    public void regionname(String[] values, byte compare, byte andor) {
        addStringvalues(regionname, values);
        regionname.setCompareoperator(compare);
        regionname.setAndoroperator(andor);
    }
    
    public void evetypename(String[] values) {
        addStringvalues(evetypename, values);
    }
    
    public void evetypename(String[] values, byte compare, byte andor) {
        addStringvalues(evetypename, values);
        evetypename.setCompareoperator(compare);
        evetypename.setAndoroperator(andor);
    }
    
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
    }
    
    public void avg_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_buyorder, values, operators);
    }
    
    public void avg_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_buyorder, values, operators);
        avg_buyorder.setAndoroperator(andor);
    }
    
    public void avg_sellorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_sellorder, values, operators);
    }
    
    public void avg_sellorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_sellorder, values, operators);
        avg_sellorder.setAndoroperator(andor);
    }
    
}
