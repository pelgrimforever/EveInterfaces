/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_materialinputavgsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_materialinputavg;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_materialinputavgsearch extends Tablesearch implements IView_materialinputavgsearch {

    Stringsearch username = new Stringsearch("view_materialinputavg.username");
    Numbersearch evetype = new Numbersearch("view_materialinputavg.evetype");
    Timesearch lastbuytimestamp = new Timesearch("view_materialinputavg.lastbuytimestamp");
    Numbersearch totalamount = new Numbersearch("view_materialinputavg.totalamount");
    Numbersearch avgunitprice = new Numbersearch("view_materialinputavg.avgunitprice");
    Numbersearch totalusedamount = new Numbersearch("view_materialinputavg.totalusedamount");
    Stringsearch name = new Stringsearch("view_materialinputavg.name");
    Numbersearch packaged_volume = new Numbersearch("view_materialinputavg.packaged_volume");
    Numbersearch average = new Numbersearch("view_materialinputavg.average");
    Numbersearch highest = new Numbersearch("view_materialinputavg.highest");
    Numbersearch lowest = new Numbersearch("view_materialinputavg.lowest");

    public String getTable() {
        return View_materialinputavg.table;
    }

    public View_materialinputavgsearch() {
        setFieldsearchers();
    }

    public View_materialinputavgsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(evetype);
        addFieldsearcher(lastbuytimestamp);
        addFieldsearcher(totalamount);
        addFieldsearcher(avgunitprice);
        addFieldsearcher(totalusedamount);
        addFieldsearcher(name);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
    }

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
    public void lastbuytimestamp(Timestamp[] values, byte[] operators) {
        addTimevalues(lastbuytimestamp, values, operators);
    }
    
    public void lastbuytimestamp(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(lastbuytimestamp, values, operators);
        lastbuytimestamp.setAndoroperator(andor);
    }
    
    public void totalamount(Double[] values, byte[] operators) {
        addNumbervalues(totalamount, values, operators);
    }
    
    public void totalamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalamount, values, operators);
        totalamount.setAndoroperator(andor);
    }
    
    public void avgunitprice(Double[] values, byte[] operators) {
        addNumbervalues(avgunitprice, values, operators);
    }
    
    public void avgunitprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avgunitprice, values, operators);
        avgunitprice.setAndoroperator(andor);
    }
    
    public void totalusedamount(Double[] values, byte[] operators) {
        addNumbervalues(totalusedamount, values, operators);
    }
    
    public void totalusedamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalusedamount, values, operators);
        totalusedamount.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
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
    
}
