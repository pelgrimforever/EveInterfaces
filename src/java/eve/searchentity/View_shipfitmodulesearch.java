/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_shipfitmodulesearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_shipfitmodule;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_shipfitmodulesearch extends Tablesearch implements IView_shipfitmodulesearch {

    Stringsearch modulename = new Stringsearch("view_shipfitmodule.modulename");
    Numbersearch packaged_volume = new Numbersearch("view_shipfitmodule.packaged_volume");
    Stringsearch username = new Stringsearch("view_shipfitmodule.username");
    Stringsearch shipname = new Stringsearch("view_shipfitmodule.shipname");
    Numbersearch moduletype = new Numbersearch("view_shipfitmodule.moduletype");
    Numbersearch amount = new Numbersearch("view_shipfitmodule.amount");

    public String getTable() {
        return View_shipfitmodule.table;
    }

    public View_shipfitmodulesearch() {
        setFieldsearchers();
    }

    public View_shipfitmodulesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(modulename);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(username);
        addFieldsearcher(shipname);
        addFieldsearcher(moduletype);
        addFieldsearcher(amount);
    }

    public void modulename(String[] values) {
        addStringvalues(modulename, values);
    }
    
    public void modulename(String[] values, byte compare, byte andor) {
        addStringvalues(modulename, values);
        modulename.setCompareoperator(compare);
        modulename.setAndoroperator(andor);
    }
    
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
    }
    
    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void shipname(String[] values) {
        addStringvalues(shipname, values);
    }
    
    public void shipname(String[] values, byte compare, byte andor) {
        addStringvalues(shipname, values);
        shipname.setCompareoperator(compare);
        shipname.setAndoroperator(andor);
    }
    
    public void moduletype(Double[] values, byte[] operators) {
        addNumbervalues(moduletype, values, operators);
    }
    
    public void moduletype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(moduletype, values, operators);
        moduletype.setAndoroperator(andor);
    }
    
    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
    }
    
}
