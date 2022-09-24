/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_shipfitordersearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_shipfitorder;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_shipfitordersearch extends Tablesearch implements IView_shipfitordersearch {

    Stringsearch evetypename = new Stringsearch("view_shipfitorder.evetypename");
    Numbersearch packaged_volume = new Numbersearch("view_shipfitorder.packaged_volume");
    Stringsearch username = new Stringsearch("view_shipfitorder.username");
    Stringsearch shipname = new Stringsearch("view_shipfitorder.shipname");
    Numbersearch evetype = new Numbersearch("view_shipfitorder.evetype");
    Numbersearch amountwanted = new Numbersearch("view_shipfitorder.amountwanted");
    Numbersearch amountinstock = new Numbersearch("view_shipfitorder.amountinstock");
    Numbersearch amountplanned = new Numbersearch("view_shipfitorder.amountplanned");

    public String getTable() {
        return View_shipfitorder.table;
    }

    public View_shipfitordersearch() {
        setFieldsearchers();
    }

    public View_shipfitordersearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(evetypename);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(username);
        addFieldsearcher(shipname);
        addFieldsearcher(evetype);
        addFieldsearcher(amountwanted);
        addFieldsearcher(amountinstock);
        addFieldsearcher(amountplanned);
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
    
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
    public void amountwanted(Double[] values, byte[] operators) {
        addNumbervalues(amountwanted, values, operators);
    }
    
    public void amountwanted(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountwanted, values, operators);
        amountwanted.setAndoroperator(andor);
    }
    
    public void amountinstock(Double[] values, byte[] operators) {
        addNumbervalues(amountinstock, values, operators);
    }
    
    public void amountinstock(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountinstock, values, operators);
        amountinstock.setAndoroperator(andor);
    }
    
    public void amountplanned(Double[] values, byte[] operators) {
        addNumbervalues(amountplanned, values, operators);
    }
    
    public void amountplanned(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountplanned, values, operators);
        amountplanned.setAndoroperator(andor);
    }
    
}
