/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_stocksearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_stock;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_stocksearch extends Tablesearch implements IView_stocksearch {

    Stringsearch username = new Stringsearch("view_stock.username");
    Numbersearch evetype = new Numbersearch("view_stock.evetype");
    Numbersearch amount = new Numbersearch("view_stock.amount");
    Stringsearch name = new Stringsearch("view_stock.name");

    public String getTable() {
        return View_stock.table;
    }

    public View_stocksearch() {
        setFieldsearchers();
    }

    public View_stocksearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(evetype);
        addFieldsearcher(amount);
        addFieldsearcher(name);
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
    
    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
}
