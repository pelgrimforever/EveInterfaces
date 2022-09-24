/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IBpmaterialsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Bpmaterial;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Bpmaterialsearch extends Tablesearch implements IBpmaterialsearch {

    Numbersearch amount = new Numbersearch("bpmaterial.amount");
//foreign keys
    Foreignkeysearch evetypeBpsearcher = new Foreignkeysearch("evetype", IBpmaterial.evetypeBpPKfields, IBpmaterial.evetypeBpFKfields);
    Foreignkeysearch evetypeMaterialsearcher = new Foreignkeysearch("evetype", IBpmaterial.evetypeMaterialPKfields, IBpmaterial.evetypeMaterialFKfields);
//external foreign keys

    public String getTable() {
        return Bpmaterial.table;
    }

    public Bpmaterialsearch() {
        setFieldsearchers();
    }

    public Bpmaterialsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(amount);
        addKeysearcher(evetypeBpsearcher);
        addKeysearcher(evetypeMaterialsearcher);
    }

    public void addPrimarykey(IBpmaterialPK bpmaterialPK) {
        super.addPrimarykey(bpmaterialPK);
    }

    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
    }
    
    public void evetypeBp(IEvetypesearch evetypesearch) {
        evetypeBpsearcher.setTablesearch(evetypesearch);
    }
    
    public IEvetypesearch getEvetypebpsearch() {
        if(evetypeBpsearcher.used()) {
            return (IEvetypesearch)evetypeBpsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getEvetypebpInnerjoin() {
        return evetypeBpsearcher.getInnerjoin();
    }

    public void evetypeMaterial(IEvetypesearch evetypesearch) {
        evetypeMaterialsearcher.setTablesearch(evetypesearch);
    }
    
    public IEvetypesearch getEvetypematerialsearch() {
        if(evetypeMaterialsearcher.used()) {
            return (IEvetypesearch)evetypeMaterialsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getEvetypematerialInnerjoin() {
        return evetypeMaterialsearcher.getInnerjoin();
    }

}
