/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_security_island_systemcountsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_security_island_systemcount;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_security_island_systemcountsearch extends Tablesearch implements IView_security_island_systemcountsearch {

    Numbersearch id = new Numbersearch("view_security_island_systemcount.id");
    Stringsearch name = new Stringsearch("view_security_island_systemcount.name");
    Numbersearch systems = new Numbersearch("view_security_island_systemcount.systems");

    public String getTable() {
        return View_security_island_systemcount.table;
    }

    public View_security_island_systemcountsearch() {
        setFieldsearchers();
    }

    public View_security_island_systemcountsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(systems);
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
    
    public void systems(Double[] values, byte[] operators) {
        addNumbervalues(systems, values, operators);
    }
    
    public void systems(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(systems, values, operators);
        systems.setAndoroperator(andor);
    }
    
}
