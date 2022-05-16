/*
 * Shipfitsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
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

/**
 * Search class for Shipfit table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
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

    /**
     * @return tablename
     */
    public String getTable() {
        return Shipfit.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Shipfitsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Shipfitsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(shipname);
        addKeysearcher(evetypesearcher);
        addKeysearcher(shipfitmodulesearcher);
        addKeysearcher(shipfitordersearcher);
    }

    /**
     * add a primary key instance to search for
     * @param shipfitPK: Shipfit primery key
     */
    public void addPrimarykey(IShipfitPK shipfitPK) {
        super.addPrimarykey(shipfitPK);
    }

    /**
     * add String search values for field username, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    /**
     * add String search values for field username
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field shipname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void shipname(String[] values) {
        addStringvalues(shipname, values);
    }
    
    /**
     * add String search values for field shipname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void shipname(String[] values, byte compare, byte andor) {
        addStringvalues(shipname, values);
        shipname.setCompareoperator(compare);
        shipname.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch evetype IEvetypesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get foreign key subsearch evetype IEvetypesearch
     * @return Tablesearch for Shipfit
     */
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if evetypesearcher is not used
     * @return inner join statement
     */
    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

    /**
     * set external key - foreign key subsearch IShipfitmodulesearch
     * @param shipfitmodulesearch: IShipfitmodulesearch
     */
    public void shipfitmodule(IShipfitmodulesearch shipfitmodulesearch) {
        shipfitmodulesearcher.setTablesearch(shipfitmodulesearch);
    }
    
    /**
     * get external key - foreign key subsearch IShipfitmodulesearch
     * @return Tablesearch for IShipfitmodulesearch
     */
    public IShipfitmodulesearch getShipfitmodulesearch() {
        if(shipfitmodulesearcher.used()) {
            return (IShipfitmodulesearch)shipfitmodulesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IShipfitordersearch
     * @param shipfitordersearch: IShipfitordersearch
     */
    public void shipfitorder(IShipfitordersearch shipfitordersearch) {
        shipfitordersearcher.setTablesearch(shipfitordersearch);
    }
    
    /**
     * get external key - foreign key subsearch IShipfitordersearch
     * @return Tablesearch for IShipfitordersearch
     */
    public IShipfitordersearch getShipfitordersearch() {
        if(shipfitordersearcher.used()) {
            return (IShipfitordersearch)shipfitordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
