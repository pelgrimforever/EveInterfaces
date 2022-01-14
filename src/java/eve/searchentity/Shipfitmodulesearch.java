/*
 * Shipfitmodulesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
 *
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

/**
 * Search class for Shipfitmodule table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Shipfitmodulesearch extends Tablesearch implements IShipfitmodulesearch {

    Numbersearch amount = new Numbersearch("shipfitmodule.amount");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IShipfitmodule.evetypePKfields, IShipfitmodule.evetypeFKfields);
    Foreignkeysearch shipfitsearcher = new Foreignkeysearch("shipfit", IShipfitmodule.shipfitPKfields, IShipfitmodule.shipfitFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Shipfitmodule.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Shipfitmodulesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Shipfitmodulesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(amount);
        addKeysearcher(evetypesearcher);
        addKeysearcher(shipfitsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param shipfitmodulePK: Shipfitmodule primery key
     */
    public void addPrimarykey(IShipfitmodulePK shipfitmodulePK) {
        super.addPrimarykey(shipfitmodulePK);
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
     * set foreign key subsearch evetype IEvetypesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get foreign key subsearch evetype IEvetypesearch
     * @return Tablesearch for Shipfitmodule
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
     * set foreign key subsearch shipfit IShipfitsearch
     * @param shipfitsearch: IShipfitsearch
     */
    public void shipfit(IShipfitsearch shipfitsearch) {
        shipfitsearcher.setTablesearch(shipfitsearch);
    }
    
    /**
     * get foreign key subsearch shipfit IShipfitsearch
     * @return Tablesearch for Shipfitmodule
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

}
