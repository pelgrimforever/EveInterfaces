/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_contractswithprofitsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_contractswithprofit;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_contractswithprofitsearch extends Tablesearch implements IView_contractswithprofitsearch {

    Numbersearch id = new Numbersearch("view_contractswithprofit.id");
    Timesearch date_expired = new Timesearch("view_contractswithprofit.date_expired");
    Timesearch date_issued = new Timesearch("view_contractswithprofit.date_issued");
    Numbersearch days_to_complete = new Numbersearch("view_contractswithprofit.days_to_complete");
    Numbersearch end_location_id = new Numbersearch("view_contractswithprofit.end_location_id");
    Numbersearch price = new Numbersearch("view_contractswithprofit.price");
    Numbersearch reward = new Numbersearch("view_contractswithprofit.reward");
    Numbersearch start_location_id = new Numbersearch("view_contractswithprofit.start_location_id");
    Stringsearch name = new Stringsearch("view_contractswithprofit.name");
    Stringsearch systemname = new Stringsearch("view_contractswithprofit.systemname");
    Stringsearch regionname = new Stringsearch("view_contractswithprofit.regionname");
    Stringsearch title = new Stringsearch("view_contractswithprofit.title");
    Numbersearch volume = new Numbersearch("view_contractswithprofit.volume");
    Numbersearch sellprice = new Numbersearch("view_contractswithprofit.sellprice");
    Numbersearch buyprice = new Numbersearch("view_contractswithprofit.buyprice");

    public String getTable() {
        return View_contractswithprofit.table;
    }

    public View_contractswithprofitsearch() {
        setFieldsearchers();
    }

    public View_contractswithprofitsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(date_expired);
        addFieldsearcher(date_issued);
        addFieldsearcher(days_to_complete);
        addFieldsearcher(end_location_id);
        addFieldsearcher(price);
        addFieldsearcher(reward);
        addFieldsearcher(start_location_id);
        addFieldsearcher(name);
        addFieldsearcher(systemname);
        addFieldsearcher(regionname);
        addFieldsearcher(title);
        addFieldsearcher(volume);
        addFieldsearcher(sellprice);
        addFieldsearcher(buyprice);
    }

    public void id(Double[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void date_expired(Timestamp[] values, byte[] operators) {
        addTimevalues(date_expired, values, operators);
    }
    
    public void date_expired(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_expired, values, operators);
        date_expired.setAndoroperator(andor);
    }
    
    public void date_issued(Timestamp[] values, byte[] operators) {
        addTimevalues(date_issued, values, operators);
    }
    
    public void date_issued(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_issued, values, operators);
        date_issued.setAndoroperator(andor);
    }
    
    public void days_to_complete(Double[] values, byte[] operators) {
        addNumbervalues(days_to_complete, values, operators);
    }
    
    public void days_to_complete(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(days_to_complete, values, operators);
        days_to_complete.setAndoroperator(andor);
    }
    
    public void end_location_id(Double[] values, byte[] operators) {
        addNumbervalues(end_location_id, values, operators);
    }
    
    public void end_location_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(end_location_id, values, operators);
        end_location_id.setAndoroperator(andor);
    }
    
    public void price(Double[] values, byte[] operators) {
        addNumbervalues(price, values, operators);
    }
    
    public void price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(price, values, operators);
        price.setAndoroperator(andor);
    }
    
    public void reward(Double[] values, byte[] operators) {
        addNumbervalues(reward, values, operators);
    }
    
    public void reward(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(reward, values, operators);
        reward.setAndoroperator(andor);
    }
    
    public void start_location_id(Double[] values, byte[] operators) {
        addNumbervalues(start_location_id, values, operators);
    }
    
    public void start_location_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(start_location_id, values, operators);
        start_location_id.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void systemname(String[] values) {
        addStringvalues(systemname, values);
    }
    
    public void systemname(String[] values, byte compare, byte andor) {
        addStringvalues(systemname, values);
        systemname.setCompareoperator(compare);
        systemname.setAndoroperator(andor);
    }
    
    public void regionname(String[] values) {
        addStringvalues(regionname, values);
    }
    
    public void regionname(String[] values, byte compare, byte andor) {
        addStringvalues(regionname, values);
        regionname.setCompareoperator(compare);
        regionname.setAndoroperator(andor);
    }
    
    public void title(String[] values) {
        addStringvalues(title, values);
    }
    
    public void title(String[] values, byte compare, byte andor) {
        addStringvalues(title, values);
        title.setCompareoperator(compare);
        title.setAndoroperator(andor);
    }
    
    public void volume(Double[] values, byte[] operators) {
        addNumbervalues(volume, values, operators);
    }
    
    public void volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume, values, operators);
        volume.setAndoroperator(andor);
    }
    
    public void sellprice(Double[] values, byte[] operators) {
        addNumbervalues(sellprice, values, operators);
    }
    
    public void sellprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sellprice, values, operators);
        sellprice.setAndoroperator(andor);
    }
    
    public void buyprice(Double[] values, byte[] operators) {
        addNumbervalues(buyprice, values, operators);
    }
    
    public void buyprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buyprice, values, operators);
        buyprice.setAndoroperator(andor);
    }
    
}
