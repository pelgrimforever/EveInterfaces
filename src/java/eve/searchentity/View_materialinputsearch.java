/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_materialinputsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_materialinput;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_materialinputsearch extends Tablesearch implements IView_materialinputsearch {

    Stringsearch username = new Stringsearch("view_materialinput.username");
    Numbersearch evetype = new Numbersearch("view_materialinput.evetype");
    Timesearch addtimestamp = new Timesearch("view_materialinput.addtimestamp");
    Numbersearch amount = new Numbersearch("view_materialinput.amount");
    Numbersearch unitprice = new Numbersearch("view_materialinput.unitprice");
    Numbersearch usedamount = new Numbersearch("view_materialinput.usedamount");
    Stringsearch name = new Stringsearch("view_materialinput.name");
    Numbersearch packaged_volume = new Numbersearch("view_materialinput.packaged_volume");
    Numbersearch average = new Numbersearch("view_materialinput.average");
    Numbersearch highest = new Numbersearch("view_materialinput.highest");
    Numbersearch lowest = new Numbersearch("view_materialinput.lowest");

    public String getTable() {
        return View_materialinput.table;
    }

    public View_materialinputsearch() {
        setFieldsearchers();
    }

    public View_materialinputsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(evetype);
        addFieldsearcher(addtimestamp);
        addFieldsearcher(amount);
        addFieldsearcher(unitprice);
        addFieldsearcher(usedamount);
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
    
    public void addtimestamp(Timestamp[] values, byte[] operators) {
        addTimevalues(addtimestamp, values, operators);
    }
    
    public void addtimestamp(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(addtimestamp, values, operators);
        addtimestamp.setAndoroperator(andor);
    }
    
    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
    }
    
    public void unitprice(Double[] values, byte[] operators) {
        addNumbervalues(unitprice, values, operators);
    }
    
    public void unitprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(unitprice, values, operators);
        unitprice.setAndoroperator(andor);
    }
    
    public void usedamount(Double[] values, byte[] operators) {
        addNumbervalues(usedamount, values, operators);
    }
    
    public void usedamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(usedamount, values, operators);
        usedamount.setAndoroperator(andor);
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
