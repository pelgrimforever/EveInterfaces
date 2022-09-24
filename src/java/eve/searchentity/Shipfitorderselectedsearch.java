/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IShipfitorderselectedsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Shipfitorderselected;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Shipfitorderselectedsearch extends Tablesearch implements IShipfitorderselectedsearch {

    Numbersearch amount = new Numbersearch("shipfitorderselected.amount");
//foreign keys
    Foreignkeysearch orderssearcher = new Foreignkeysearch("orders", IShipfitorderselected.ordersPKfields, IShipfitorderselected.ordersFKfields);
    Foreignkeysearch shipfitordersearcher = new Foreignkeysearch("shipfitorder", IShipfitorderselected.shipfitorderPKfields, IShipfitorderselected.shipfitorderFKfields);
//external foreign keys

    public String getTable() {
        return Shipfitorderselected.table;
    }

    public Shipfitorderselectedsearch() {
        setFieldsearchers();
    }

    public Shipfitorderselectedsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(amount);
        addKeysearcher(orderssearcher);
        addKeysearcher(shipfitordersearcher);
    }

    public void addPrimarykey(IShipfitorderselectedPK shipfitorderselectedPK) {
        super.addPrimarykey(shipfitorderselectedPK);
    }

    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
    }
    
    public void orders(IOrderssearch orderssearch) {
        orderssearcher.setTablesearch(orderssearch);
    }
    
    public IOrderssearch getOrderssearch() {
        if(orderssearcher.used()) {
            return (IOrderssearch)orderssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getOrdersInnerjoin() {
        return orderssearcher.getInnerjoin();
    }

    public void shipfitorder(IShipfitordersearch shipfitordersearch) {
        shipfitordersearcher.setTablesearch(shipfitordersearch);
    }
    
    public IShipfitordersearch getShipfitordersearch() {
        if(shipfitordersearcher.used()) {
            return (IShipfitordersearch)shipfitordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getShipfitorderInnerjoin() {
        return shipfitordersearcher.getInnerjoin();
    }

}
