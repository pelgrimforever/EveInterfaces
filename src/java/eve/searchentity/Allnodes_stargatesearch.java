/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IAllnodes_stargatesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Allnodes_stargate;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Allnodes_stargatesearch extends Tablesearch implements IAllnodes_stargatesearch {

    Numbersearch id = new Numbersearch("allnodes_stargate.id");
    Numbersearch to_stargate = new Numbersearch("allnodes_stargate.to_stargate");
    Numbersearch system = new Numbersearch("allnodes_stargate.system");
    Numbersearch to_system = new Numbersearch("allnodes_stargate.to_system");
    Booleansearch deadend = new Booleansearch("allnodes_stargate.deadend");
//foreign keys
//external foreign keys

    public String getTable() {
        return Allnodes_stargate.table;
    }

    public Allnodes_stargatesearch() {
        setFieldsearchers();
    }

    public Allnodes_stargatesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(to_stargate);
        addFieldsearcher(system);
        addFieldsearcher(to_system);
        addFieldsearcher(deadend);
    }

    public void addPrimarykey(IAllnodes_stargatePK allnodes_stargatePK) {
        super.addPrimarykey(allnodes_stargatePK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void to_stargate(Double[] values, byte[] operators) {
        addNumbervalues(to_stargate, values, operators);
    }
    
    public void to_stargate(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(to_stargate, values, operators);
        to_stargate.setAndoroperator(andor);
    }
    
    public void system(Double[] values, byte[] operators) {
        addNumbervalues(system, values, operators);
    }
    
    public void system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(system, values, operators);
        system.setAndoroperator(andor);
    }
    
    public void to_system(Double[] values, byte[] operators) {
        addNumbervalues(to_system, values, operators);
    }
    
    public void to_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(to_system, values, operators);
        to_system.setAndoroperator(andor);
    }
    
    public void deadend(Boolean value) {
        addBooleanvalue(deadend, value);
    }
    
}
