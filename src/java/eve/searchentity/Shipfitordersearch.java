/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IShipfitordersearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Shipfitorder;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Shipfitordersearch extends Tablesearch implements IShipfitordersearch {

    Numbersearch amountwanted = new Numbersearch("shipfitorder.amountwanted");
    Numbersearch amountinstock = new Numbersearch("shipfitorder.amountinstock");
//foreign keys
    Foreignkeysearch shipfitsearcher = new Foreignkeysearch("shipfit", IShipfitorder.shipfitPKfields, IShipfitorder.shipfitFKfields);
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IShipfitorder.evetypePKfields, IShipfitorder.evetypeFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch shipfitorderselectedsearcher = new Primarykeysearch("shipfitorderselected", IShipfitorderselected.shipfitorderPKfields, IShipfitorderselected.shipfitorderFKfields);
    //relational key
    Relationalkeysearch relorderssearcher = new Relationalkeysearch("shipfitorderselected", IShipfitorderselected.shipfitorderPKfields, IShipfitorderselected.shipfitorderFKfields, "orders", IShipfitorderselected.ordersPKfields, IShipfitorderselected.ordersFKfields);

    public String getTable() {
        return Shipfitorder.table;
    }

    public Shipfitordersearch() {
        setFieldsearchers();
    }

    public Shipfitordersearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(amountwanted);
        addFieldsearcher(amountinstock);
        addKeysearcher(shipfitsearcher);
        addKeysearcher(evetypesearcher);
        addKeysearcher(shipfitorderselectedsearcher);
        addKeysearcher(relorderssearcher);
    }

    public void addPrimarykey(IShipfitorderPK shipfitorderPK) {
        super.addPrimarykey(shipfitorderPK);
    }

    public void amountwanted(Double[] values, byte[] operators) {
        addNumbervalues(amountwanted, values, operators);
    }
    
    public void amountwanted(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountwanted, values, operators);
        amountwanted.setAndoroperator(andor);
    }
    
    public void amountinstock(Double[] values, byte[] operators) {
        addNumbervalues(amountinstock, values, operators);
    }
    
    public void amountinstock(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountinstock, values, operators);
        amountinstock.setAndoroperator(andor);
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

    public void shipfitorderselected(IShipfitorderselectedsearch shipfitorderselectedsearch) {
        shipfitorderselectedsearcher.setTablesearch(shipfitorderselectedsearch);
    }
    
    public IShipfitorderselectedsearch getShipfitorderselectedsearch() {
        if(shipfitorderselectedsearcher.used()) {
            return (IShipfitorderselectedsearch)shipfitorderselectedsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relorders(IOrderssearch orderssearch) {
        relorderssearcher.setTablesearch(orderssearch);
    }
    
    public IOrderssearch getRelOrderssearch() {
        if(relorderssearcher.used()) {
            return (IOrderssearch)relorderssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
