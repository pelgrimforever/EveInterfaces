/*
 * Shipfitorderselectedsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
 *
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

/**
 * Search class for Shipfitorderselected table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Shipfitorderselectedsearch extends Tablesearch implements IShipfitorderselectedsearch {

    Numbersearch amount = new Numbersearch("shipfitorderselected.amount");
//foreign keys
    Foreignkeysearch orderssearcher = new Foreignkeysearch("orders", IShipfitorderselected.ordersPKfields, IShipfitorderselected.ordersFKfields);
    Foreignkeysearch shipfitordersearcher = new Foreignkeysearch("shipfitorder", IShipfitorderselected.shipfitorderPKfields, IShipfitorderselected.shipfitorderFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Shipfitorderselected.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Shipfitorderselectedsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Shipfitorderselectedsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(amount);
        addKeysearcher(orderssearcher);
        addKeysearcher(shipfitordersearcher);
    }

    /**
     * add a primary key instance to search for
     * @param shipfitorderselectedPK: Shipfitorderselected primery key
     */
    public void addPrimarykey(IShipfitorderselectedPK shipfitorderselectedPK) {
        super.addPrimarykey(shipfitorderselectedPK);
    }

    /**
     * add Numeric search values for field amount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    /**
     * add Numeric search values for field amount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch orders IOrderssearch
     * @param orderssearch: IOrderssearch
     */
    public void orders(IOrderssearch orderssearch) {
        orderssearcher.setTablesearch(orderssearch);
    }
    
    /**
     * get foreign key subsearch orders IOrderssearch
     * @return Tablesearch for Shipfitorderselected
     */
    public IOrderssearch getOrderssearch() {
        if(orderssearcher.used()) {
            return (IOrderssearch)orderssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if orderssearcher is not used
     * @return inner join statement
     */
    public String getOrdersInnerjoin() {
        return orderssearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch shipfitorder IShipfitordersearch
     * @param shipfitordersearch: IShipfitordersearch
     */
    public void shipfitorder(IShipfitordersearch shipfitordersearch) {
        shipfitordersearcher.setTablesearch(shipfitordersearch);
    }
    
    /**
     * get foreign key subsearch shipfitorder IShipfitordersearch
     * @return Tablesearch for Shipfitorderselected
     */
    public IShipfitordersearch getShipfitordersearch() {
        if(shipfitordersearcher.used()) {
            return (IShipfitordersearch)shipfitordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if shipfitordersearcher is not used
     * @return inner join statement
     */
    public String getShipfitorderInnerjoin() {
        return shipfitordersearcher.getInnerjoin();
    }

}
