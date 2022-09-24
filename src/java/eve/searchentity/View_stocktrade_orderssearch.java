/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_stocktrade_orderssearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_stocktrade_orders;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_stocktrade_orderssearch extends Tablesearch implements IView_stocktrade_orderssearch {

    Stringsearch username = new Stringsearch("view_stocktrade_orders.username");
    Numbersearch system = new Numbersearch("view_stocktrade_orders.system");
    Numbersearch locationid = new Numbersearch("view_stocktrade_orders.locationid");
    Stringsearch stationname = new Stringsearch("view_stocktrade_orders.stationname");
    Stringsearch locationname = new Stringsearch("view_stocktrade_orders.locationname");
    Numbersearch evetypeid = new Numbersearch("view_stocktrade_orders.evetypeid");
    Stringsearch evetypename = new Stringsearch("view_stocktrade_orders.evetypename");
    Numbersearch packaged_volume = new Numbersearch("view_stocktrade_orders.packaged_volume");
    Numbersearch min_volume = new Numbersearch("view_stocktrade_orders.min_volume");
    Numbersearch orderid = new Numbersearch("view_stocktrade_orders.orderid");
    Numbersearch sellamount = new Numbersearch("view_stocktrade_orders.sellamount");
    Numbersearch price = new Numbersearch("view_stocktrade_orders.price");
    Numbersearch totalprice = new Numbersearch("view_stocktrade_orders.totalprice");

    public String getTable() {
        return View_stocktrade_orders.table;
    }

    public View_stocktrade_orderssearch() {
        setFieldsearchers();
    }

    public View_stocktrade_orderssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(system);
        addFieldsearcher(locationid);
        addFieldsearcher(stationname);
        addFieldsearcher(locationname);
        addFieldsearcher(evetypeid);
        addFieldsearcher(evetypename);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(min_volume);
        addFieldsearcher(orderid);
        addFieldsearcher(sellamount);
        addFieldsearcher(price);
        addFieldsearcher(totalprice);
    }

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void system(Double[] values, byte[] operators) {
        addNumbervalues(system, values, operators);
    }
    
    public void system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(system, values, operators);
        system.setAndoroperator(andor);
    }
    
    public void locationid(Double[] values, byte[] operators) {
        addNumbervalues(locationid, values, operators);
    }
    
    public void locationid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(locationid, values, operators);
        locationid.setAndoroperator(andor);
    }
    
    public void stationname(String[] values) {
        addStringvalues(stationname, values);
    }
    
    public void stationname(String[] values, byte compare, byte andor) {
        addStringvalues(stationname, values);
        stationname.setCompareoperator(compare);
        stationname.setAndoroperator(andor);
    }
    
    public void locationname(String[] values) {
        addStringvalues(locationname, values);
    }
    
    public void locationname(String[] values, byte compare, byte andor) {
        addStringvalues(locationname, values);
        locationname.setCompareoperator(compare);
        locationname.setAndoroperator(andor);
    }
    
    public void evetypeid(Double[] values, byte[] operators) {
        addNumbervalues(evetypeid, values, operators);
    }
    
    public void evetypeid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetypeid, values, operators);
        evetypeid.setAndoroperator(andor);
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
    
    public void min_volume(Double[] values, byte[] operators) {
        addNumbervalues(min_volume, values, operators);
    }
    
    public void min_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_volume, values, operators);
        min_volume.setAndoroperator(andor);
    }
    
    public void orderid(Double[] values, byte[] operators) {
        addNumbervalues(orderid, values, operators);
    }
    
    public void orderid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(orderid, values, operators);
        orderid.setAndoroperator(andor);
    }
    
    public void sellamount(Double[] values, byte[] operators) {
        addNumbervalues(sellamount, values, operators);
    }
    
    public void sellamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sellamount, values, operators);
        sellamount.setAndoroperator(andor);
    }
    
    public void price(Double[] values, byte[] operators) {
        addNumbervalues(price, values, operators);
    }
    
    public void price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(price, values, operators);
        price.setAndoroperator(andor);
    }
    
    public void totalprice(Double[] values, byte[] operators) {
        addNumbervalues(totalprice, values, operators);
    }
    
    public void totalprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalprice, values, operators);
        totalprice.setAndoroperator(andor);
    }
    
}
