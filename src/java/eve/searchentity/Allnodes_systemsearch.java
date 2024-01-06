/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IAllnodes_systemsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Allnodes_system;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Allnodes_systemsearch extends Tablesearch implements IAllnodes_systemsearch {

    Numbersearch id = new Numbersearch("allnodes_system.id");
    Booleansearch deadend = new Booleansearch("allnodes_system.deadend");
//foreign keys
//external foreign keys

    public String getTable() {
        return Allnodes_system.table;
    }

    public Allnodes_systemsearch() {
        setFieldsearchers();
    }

    public Allnodes_systemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(deadend);
    }

    public void addPrimarykey(IAllnodes_systemPK allnodes_systemPK) {
        super.addPrimarykey(allnodes_systemPK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void deadend(Boolean value) {
        addBooleanvalue(deadend, value);
    }
    
}
