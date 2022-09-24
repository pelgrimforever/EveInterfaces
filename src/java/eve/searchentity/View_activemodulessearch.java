/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_activemodulessearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_activemodules;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_activemodulessearch extends Tablesearch implements IView_activemodulessearch {

    Numbersearch typegroupid = new Numbersearch("view_activemodules.typegroupid");
    Stringsearch typegroupname = new Stringsearch("view_activemodules.typegroupname");
    Numbersearch id = new Numbersearch("view_activemodules.id");
    Stringsearch name = new Stringsearch("view_activemodules.name");

    public String getTable() {
        return View_activemodules.table;
    }

    public View_activemodulessearch() {
        setFieldsearchers();
    }

    public View_activemodulessearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(typegroupid);
        addFieldsearcher(typegroupname);
        addFieldsearcher(id);
        addFieldsearcher(name);
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
    
}
