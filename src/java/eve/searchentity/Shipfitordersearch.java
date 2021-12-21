/*
 * Shipfitordersearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 20.11.2021 17:22
 *
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

/**
 * Search class for Shipfitorder table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
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

    /**
     * @return tablename
     */
    public String getTable() {
        return Shipfitorder.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Shipfitordersearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Shipfitordersearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(amountwanted);
        addFieldsearcher(amountinstock);
        addKeysearcher(shipfitsearcher);
        addKeysearcher(evetypesearcher);
        addKeysearcher(shipfitorderselectedsearcher);
        addKeysearcher(relorderssearcher);
    }

    /**
     * add a primary key instance to search for
     * @param shipfitorderPK: Shipfitorder primery key
     */
    public void addPrimarykey(IShipfitorderPK shipfitorderPK) {
        super.addPrimarykey(shipfitorderPK);
    }

    /**
     * add Numeric search values for field amountwanted, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void amountwanted(Double[] values, byte[] operators) {
        addNumbervalues(amountwanted, values, operators);
    }
    
    /**
     * add Numeric search values for field amountwanted
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void amountwanted(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountwanted, values, operators);
        amountwanted.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field amountinstock, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void amountinstock(Double[] values, byte[] operators) {
        addNumbervalues(amountinstock, values, operators);
    }
    
    /**
     * add Numeric search values for field amountinstock
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void amountinstock(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountinstock, values, operators);
        amountinstock.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch shipfit IShipfitsearch
     * @param shipfitsearch: IShipfitsearch
     */
    public void shipfit(IShipfitsearch shipfitsearch) {
        shipfitsearcher.setTablesearch(shipfitsearch);
    }
    
    /**
     * get foreign key subsearch shipfit IShipfitsearch
     * @return Tablesearch for Shipfitorder
     */
    public IShipfitsearch getShipfitsearch() {
        if(shipfitsearcher.used()) {
            return (IShipfitsearch)shipfitsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if shipfitsearcher is not used
     * @return inner join statement
     */
    public String getShipfitInnerjoin() {
        return shipfitsearcher.getInnerjoin();
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
     * @return Tablesearch for Shipfitorder
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
     * set external key - foreign key subsearch IShipfitorderselectedsearch
     * @param shipfitorderselectedsearch: IShipfitorderselectedsearch
     */
    public void shipfitorderselected(IShipfitorderselectedsearch shipfitorderselectedsearch) {
        shipfitorderselectedsearcher.setTablesearch(shipfitorderselectedsearch);
    }
    
    /**
     * get external key - foreign key subsearch IShipfitorderselectedsearch
     * @return Tablesearch for IShipfitorderselectedsearch
     */
    public IShipfitorderselectedsearch getShipfitorderselectedsearch() {
        if(shipfitorderselectedsearcher.used()) {
            return (IShipfitorderselectedsearch)shipfitorderselectedsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch orders tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void relorders(IOrderssearch orderssearch) {
        relorderssearcher.setTablesearch(orderssearch);
    }
    
    /**
     * get external key - relational subsearch IOrderssearch
     * @return Tablesearch for IOrderssearch
     */
    public IOrderssearch getRelOrderssearch() {
        if(relorderssearcher.used()) {
            return (IOrderssearch)relorderssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
