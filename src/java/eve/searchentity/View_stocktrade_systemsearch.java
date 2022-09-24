/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_stocktrade_systemsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_stocktrade_system;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_stocktrade_systemsearch extends Tablesearch implements IView_stocktrade_systemsearch {

    Stringsearch username = new Stringsearch("view_stocktrade_system.username");
    Numbersearch id = new Numbersearch("view_stocktrade_system.id");
    Stringsearch name = new Stringsearch("view_stocktrade_system.name");
    Stringsearch region = new Stringsearch("view_stocktrade_system.region");
    Numbersearch sellprice = new Numbersearch("view_stocktrade_system.sellprice");
    Numbersearch totalvolume = new Numbersearch("view_stocktrade_system.totalvolume");

    public String getTable() {
        return View_stocktrade_system.table;
    }

    public View_stocktrade_systemsearch() {
        setFieldsearchers();
    }

    public View_stocktrade_systemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(region);
        addFieldsearcher(sellprice);
        addFieldsearcher(totalvolume);
    }

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
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
    
    public void region(String[] values) {
        addStringvalues(region, values);
    }
    
    public void region(String[] values, byte compare, byte andor) {
        addStringvalues(region, values);
        region.setCompareoperator(compare);
        region.setAndoroperator(andor);
    }
    
    public void sellprice(Double[] values, byte[] operators) {
        addNumbervalues(sellprice, values, operators);
    }
    
    public void sellprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sellprice, values, operators);
        sellprice.setAndoroperator(andor);
    }
    
    public void totalvolume(Double[] values, byte[] operators) {
        addNumbervalues(totalvolume, values, operators);
    }
    
    public void totalvolume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalvolume, values, operators);
        totalvolume.setAndoroperator(andor);
    }
    
}
