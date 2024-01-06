/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_bp_profitperregionsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_bp_profitperregion;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_bp_profitperregionsearch extends Tablesearch implements IView_bp_profitperregionsearch {

    Numbersearch categoryid = new Numbersearch("view_bp_profitperregion.categoryid");
    Stringsearch categoryname = new Stringsearch("view_bp_profitperregion.categoryname");
    Numbersearch typegroupid = new Numbersearch("view_bp_profitperregion.typegroupid");
    Stringsearch typegroupname = new Stringsearch("view_bp_profitperregion.typegroupname");
    Numbersearch id = new Numbersearch("view_bp_profitperregion.id");
    Stringsearch name = new Stringsearch("view_bp_profitperregion.name");
    Numbersearch estimatedproductioncost = new Numbersearch("view_bp_profitperregion.estimatedproductioncost");
    Numbersearch region = new Numbersearch("view_bp_profitperregion.region");
    Stringsearch regionname = new Stringsearch("view_bp_profitperregion.regionname");
    Numbersearch year = new Numbersearch("view_bp_profitperregion.year");
    Numbersearch month = new Numbersearch("view_bp_profitperregion.month");
    Numbersearch average = new Numbersearch("view_bp_profitperregion.average");
    Numbersearch highest = new Numbersearch("view_bp_profitperregion.highest");
    Numbersearch lowest = new Numbersearch("view_bp_profitperregion.lowest");
    Numbersearch volume = new Numbersearch("view_bp_profitperregion.volume");
    Numbersearch ordercount = new Numbersearch("view_bp_profitperregion.ordercount");
    Numbersearch percprofit = new Numbersearch("view_bp_profitperregion.percprofit");

    public String getTable() {
        return View_bp_profitperregion.table;
    }

    public View_bp_profitperregionsearch() {
        setFieldsearchers();
    }

    public View_bp_profitperregionsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(categoryid);
        addFieldsearcher(categoryname);
        addFieldsearcher(typegroupid);
        addFieldsearcher(typegroupname);
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(estimatedproductioncost);
        addFieldsearcher(region);
        addFieldsearcher(regionname);
        addFieldsearcher(year);
        addFieldsearcher(month);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
        addFieldsearcher(volume);
        addFieldsearcher(ordercount);
        addFieldsearcher(percprofit);
    }

    public void categoryid(Double[] values, byte[] operators) {
        addNumbervalues(categoryid, values, operators);
    }
    
    public void categoryid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(categoryid, values, operators);
        categoryid.setAndoroperator(andor);
    }
    
    public void categoryname(String[] values) {
        addStringvalues(categoryname, values);
    }
    
    public void categoryname(String[] values, byte compare, byte andor) {
        addStringvalues(categoryname, values);
        categoryname.setCompareoperator(compare);
        categoryname.setAndoroperator(andor);
    }
    
    public void typegroupid(Double[] values, byte[] operators) {
        addNumbervalues(typegroupid, values, operators);
    }
    
    public void typegroupid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(typegroupid, values, operators);
        typegroupid.setAndoroperator(andor);
    }
    
    public void typegroupname(String[] values) {
        addStringvalues(typegroupname, values);
    }
    
    public void typegroupname(String[] values, byte compare, byte andor) {
        addStringvalues(typegroupname, values);
        typegroupname.setCompareoperator(compare);
        typegroupname.setAndoroperator(andor);
    }
    
    public void id(Double[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void estimatedproductioncost(Double[] values, byte[] operators) {
        addNumbervalues(estimatedproductioncost, values, operators);
    }
    
    public void estimatedproductioncost(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(estimatedproductioncost, values, operators);
        estimatedproductioncost.setAndoroperator(andor);
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
    
    public void year(Double[] values, byte[] operators) {
        addNumbervalues(year, values, operators);
    }
    
    public void year(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(year, values, operators);
        year.setAndoroperator(andor);
    }
    
    public void month(Double[] values, byte[] operators) {
        addNumbervalues(month, values, operators);
    }
    
    public void month(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(month, values, operators);
        month.setAndoroperator(andor);
    }
    
    public void average(Double[] values, byte[] operators) {
        addNumbervalues(average, values, operators);
    }
    
    public void average(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(average, values, operators);
        average.setAndoroperator(andor);
    }
    
    public void highest(Double[] values, byte[] operators) {
        addNumbervalues(highest, values, operators);
    }
    
    public void highest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(highest, values, operators);
        highest.setAndoroperator(andor);
    }
    
    public void lowest(Double[] values, byte[] operators) {
        addNumbervalues(lowest, values, operators);
    }
    
    public void lowest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lowest, values, operators);
        lowest.setAndoroperator(andor);
    }
    
    public void volume(Double[] values, byte[] operators) {
        addNumbervalues(volume, values, operators);
    }
    
    public void volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume, values, operators);
        volume.setAndoroperator(andor);
    }
    
    public void ordercount(Double[] values, byte[] operators) {
        addNumbervalues(ordercount, values, operators);
    }
    
    public void ordercount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(ordercount, values, operators);
        ordercount.setAndoroperator(andor);
    }
    
    public void percprofit(Double[] values, byte[] operators) {
        addNumbervalues(percprofit, values, operators);
    }
    
    public void percprofit(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(percprofit, values, operators);
        percprofit.setAndoroperator(andor);
    }
    
}
