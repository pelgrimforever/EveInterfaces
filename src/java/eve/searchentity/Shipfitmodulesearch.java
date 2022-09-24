/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IShipfitmodulesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Shipfitmodule;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Shipfitmodulesearch extends Tablesearch implements IShipfitmodulesearch {

    Numbersearch amount = new Numbersearch("shipfitmodule.amount");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IShipfitmodule.evetypePKfields, IShipfitmodule.evetypeFKfields);
    Foreignkeysearch shipfitsearcher = new Foreignkeysearch("shipfit", IShipfitmodule.shipfitPKfields, IShipfitmodule.shipfitFKfields);
//external foreign keys

    public String getTable() {
        return Shipfitmodule.table;
    }

    public Shipfitmodulesearch() {
        setFieldsearchers();
    }

    public Shipfitmodulesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(amount);
        addKeysearcher(evetypesearcher);
        addKeysearcher(shipfitsearcher);
    }

    public void addPrimarykey(IShipfitmodulePK shipfitmodulePK) {
        super.addPrimarykey(shipfitmodulePK);
    }

    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
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

    public void shipfit(IShipfitsearch shipfitsearch) {
        shipfitsearcher.setTablesearch(shipfitsearch);
    }
    
    public IShipfitsearch getShipfitsearch() {
        if(shipfitsearcher.used()) {
            return (IShipfitsearch)shipfitsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getShipfitInnerjoin() {
        return shipfitsearcher.getInnerjoin();
    }

}
