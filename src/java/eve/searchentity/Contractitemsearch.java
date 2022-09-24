/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IContractitemsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Contractitem;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Contractitemsearch extends Tablesearch implements IContractitemsearch {

    Numbersearch id = new Numbersearch("contractitem.id");
    Booleansearch blueprint_copy = new Booleansearch("contractitem.blueprint_copy");
    Booleansearch included = new Booleansearch("contractitem.included");
    Numbersearch quantity = new Numbersearch("contractitem.quantity");
    Numbersearch material_efficiency = new Numbersearch("contractitem.material_efficiency");
    Numbersearch runs = new Numbersearch("contractitem.runs");
    Numbersearch time_efficiency = new Numbersearch("contractitem.time_efficiency");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IContractitem.evetypePKfields, IContractitem.evetypeFKfields);
    Foreignkeysearch contractsearcher = new Foreignkeysearch("contract", IContractitem.contractPKfields, IContractitem.contractFKfields);
//external foreign keys

    public String getTable() {
        return Contractitem.table;
    }

    public Contractitemsearch() {
        setFieldsearchers();
    }

    public Contractitemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(blueprint_copy);
        addFieldsearcher(included);
        addFieldsearcher(quantity);
        addFieldsearcher(material_efficiency);
        addFieldsearcher(runs);
        addFieldsearcher(time_efficiency);
        addKeysearcher(evetypesearcher);
        addKeysearcher(contractsearcher);
    }

    public void addPrimarykey(IContractitemPK contractitemPK) {
        super.addPrimarykey(contractitemPK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void blueprint_copy(Boolean value) {
        addBooleanvalue(blueprint_copy, value);
    }
    
    public void included(Boolean value) {
        addBooleanvalue(included, value);
    }
    
    public void quantity(Double[] values, byte[] operators) {
        addNumbervalues(quantity, values, operators);
    }
    
    public void quantity(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(quantity, values, operators);
        quantity.setAndoroperator(andor);
    }
    
    public void material_efficiency(Double[] values, byte[] operators) {
        addNumbervalues(material_efficiency, values, operators);
    }
    
    public void material_efficiency(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(material_efficiency, values, operators);
        material_efficiency.setAndoroperator(andor);
    }
    
    public void runs(Double[] values, byte[] operators) {
        addNumbervalues(runs, values, operators);
    }
    
    public void runs(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(runs, values, operators);
        runs.setAndoroperator(andor);
    }
    
    public void time_efficiency(Double[] values, byte[] operators) {
        addNumbervalues(time_efficiency, values, operators);
    }
    
    public void time_efficiency(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(time_efficiency, values, operators);
        time_efficiency.setAndoroperator(andor);
    }
    
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

    public void contract(IContractsearch contractsearch) {
        contractsearcher.setTablesearch(contractsearch);
    }
    
    public IContractsearch getContractsearch() {
        if(contractsearcher.used()) {
            return (IContractsearch)contractsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getContractInnerjoin() {
        return contractsearcher.getInnerjoin();
    }

}
