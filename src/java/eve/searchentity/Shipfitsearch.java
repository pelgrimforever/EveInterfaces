/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IShipfitsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Shipfit;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Shipfitsearch extends Tablesearch implements IShipfitsearch {

    Stringsearch username = new Stringsearch("shipfit.username");
    Stringsearch shipname = new Stringsearch("shipfit.shipname");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IShipfit.evetypePKfields, IShipfit.evetypeFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch shipfitmodulesearcher = new Primarykeysearch("shipfitmodule", IShipfitmodule.shipfitPKfields, IShipfitmodule.shipfitFKfields);
    //foreign key
    Primarykeysearch shipfitordersearcher = new Primarykeysearch("shipfitorder", IShipfitorder.shipfitPKfields, IShipfitorder.shipfitFKfields);

    public String getTable() {
        return Shipfit.table;
    }

    public Shipfitsearch() {
        setFieldsearchers();
    }

    public Shipfitsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(shipname);
        addKeysearcher(evetypesearcher);
        addKeysearcher(shipfitmodulesearcher);
        addKeysearcher(shipfitordersearcher);
    }

    public void addPrimarykey(IShipfitPK shipfitPK) {
        super.addPrimarykey(shipfitPK);
    }

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void shipname(String[] values) {
        addStringvalues(shipname, values);
    }
    
    public void shipname(String[] values, byte compare, byte andor) {
        addStringvalues(shipname, values);
        shipname.setCompareoperator(compare);
        shipname.setAndoroperator(andor);
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

    public void shipfitmodule(IShipfitmodulesearch shipfitmodulesearch) {
        shipfitmodulesearcher.setTablesearch(shipfitmodulesearch);
    }
    
    public IShipfitmodulesearch getShipfitmodulesearch() {
        if(shipfitmodulesearcher.used()) {
            return (IShipfitmodulesearch)shipfitmodulesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
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

}
