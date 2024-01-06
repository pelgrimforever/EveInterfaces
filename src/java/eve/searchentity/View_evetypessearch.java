/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_evetypessearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_evetypes;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_evetypessearch extends Tablesearch implements IView_evetypessearch {

    Numbersearch category = new Numbersearch("view_evetypes.category");
    Numbersearch typegroupid = new Numbersearch("view_evetypes.typegroupid");
    Stringsearch typegroupname = new Stringsearch("view_evetypes.typegroupname");
    Numbersearch id = new Numbersearch("view_evetypes.id");
    Stringsearch name = new Stringsearch("view_evetypes.name");
    Booleansearch configuredbp = new Booleansearch("view_evetypes.configuredbp");

    public String getTable() {
        return View_evetypes.table;
    }

    public View_evetypessearch() {
        setFieldsearchers();
    }

    public View_evetypessearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(category);
        addFieldsearcher(typegroupid);
        addFieldsearcher(typegroupname);
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(configuredbp);
    }

    public void category(Double[] values, byte[] operators) {
        addNumbervalues(category, values, operators);
    }
    
    public void category(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(category, values, operators);
        category.setAndoroperator(andor);
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
    
    public void configuredbp(Boolean value) {
        addBooleanvalue(configuredbp, value);
    }
    
}
