/*
 * Tradecombinedsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.11.2021 14:30
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ITradecombinedsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Tradecombined;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Tradecombined table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Tradecombinedsearch extends Tablesearch implements ITradecombinedsearch {

    Numbersearch jumps = new Numbersearch("tradecombined.jumps");
    Numbersearch jumpslowsec = new Numbersearch("tradecombined.jumpslowsec");
    Numbersearch jumpsnullsec = new Numbersearch("tradecombined.jumpsnullsec");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", ITradecombined.evetypePKfields, ITradecombined.evetypeFKfields);
    Foreignkeysearch systemBuy_systemsearcher = new Foreignkeysearch("system", ITradecombined.systemBuy_systemPKfields, ITradecombined.systemBuy_systemFKfields);
    Foreignkeysearch systemSell_systemsearcher = new Foreignkeysearch("system", ITradecombined.systemSell_systemPKfields, ITradecombined.systemSell_systemFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch tradecombined_sellsearcher = new Primarykeysearch("tradecombined_sell", ITradecombined_sell.tradecombinedPKfields, ITradecombined_sell.tradecombinedFKfields);
    //relational key
    Relationalkeysearch relorders1searcher = new Relationalkeysearch("tradecombined_sell", ITradecombined_sell.tradecombinedPKfields, ITradecombined_sell.tradecombinedFKfields, "orders", ITradecombined_sell.ordersBuy_order_idPKfields, ITradecombined_sell.ordersBuy_order_idFKfields);
    //relational key
    Relationalkeysearch relorders2searcher = new Relationalkeysearch("tradecombined_sell", ITradecombined_sell.tradecombinedPKfields, ITradecombined_sell.tradecombinedFKfields, "orders", ITradecombined_sell.ordersSell_order_idPKfields, ITradecombined_sell.ordersSell_order_idFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Tradecombined.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Tradecombinedsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Tradecombinedsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(jumps);
        addFieldsearcher(jumpslowsec);
        addFieldsearcher(jumpsnullsec);
        addKeysearcher(evetypesearcher);
        addKeysearcher(systemBuy_systemsearcher);
        addKeysearcher(systemSell_systemsearcher);
        addKeysearcher(tradecombined_sellsearcher);
        addKeysearcher(relorders1searcher);
        addKeysearcher(relorders2searcher);
    }

    /**
     * add a primary key instance to search for
     * @param tradecombinedPK: Tradecombined primery key
     */
    public void addPrimarykey(ITradecombinedPK tradecombinedPK) {
        super.addPrimarykey(tradecombinedPK);
    }

    /**
     * add Numeric search values for field jumps, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumps(Double[] values, byte[] operators) {
        addNumbervalues(jumps, values, operators);
    }
    
    /**
     * add Numeric search values for field jumps
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumps, values, operators);
        jumps.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpslowsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpslowsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpslowsec, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpslowsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpslowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpslowsec, values, operators);
        jumpslowsec.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpsnullsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpsnullsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpsnullsec, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpsnullsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpsnullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpsnullsec, values, operators);
        jumpsnullsec.setAndoroperator(andor);
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
     * @return Tablesearch for Tradecombined
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
     * set foreign key subsearch systemBuy_system ISystemsearch
     * @param systemsearch: ISystemsearch
     */
    public void systemBuy_system(ISystemsearch systemsearch) {
        systemBuy_systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * get foreign key subsearch systemBuy_system ISystemsearch
     * @return Tablesearch for Tradecombined
     */
    public ISystemsearch getSystembuy_systemsearch() {
        if(systemBuy_systemsearcher.used()) {
            return (ISystemsearch)systemBuy_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemBuy_systemsearcher is not used
     * @return inner join statement
     */
    public String getSystembuy_systemInnerjoin() {
        return systemBuy_systemsearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch systemSell_system ISystemsearch
     * @param systemsearch: ISystemsearch
     */
    public void systemSell_system(ISystemsearch systemsearch) {
        systemSell_systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * get foreign key subsearch systemSell_system ISystemsearch
     * @return Tablesearch for Tradecombined
     */
    public ISystemsearch getSystemsell_systemsearch() {
        if(systemSell_systemsearcher.used()) {
            return (ISystemsearch)systemSell_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemSell_systemsearcher is not used
     * @return inner join statement
     */
    public String getSystemsell_systemInnerjoin() {
        return systemSell_systemsearcher.getInnerjoin();
    }

    /**
     * set external key - foreign key subsearch ITradecombined_sellsearch
     * @param tradecombined_sellsearch: ITradecombined_sellsearch
     */
    public void tradecombined_sell(ITradecombined_sellsearch tradecombined_sellsearch) {
        tradecombined_sellsearcher.setTablesearch(tradecombined_sellsearch);
    }
    
    /**
     * get external key - foreign key subsearch ITradecombined_sellsearch
     * @return Tablesearch for ITradecombined_sellsearch
     */
    public ITradecombined_sellsearch getTradecombined_sellsearch() {
        if(tradecombined_sellsearcher.used()) {
            return (ITradecombined_sellsearch)tradecombined_sellsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch orders tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void relorders1(IOrderssearch orderssearch) {
        relorders1searcher.setTablesearch(orderssearch);
    }
    
    /**
     * get external key - relational subsearch IOrderssearch
     * @return Tablesearch for IOrderssearch
     */
    public IOrderssearch getRelOrders1search() {
        if(relorders1searcher.used()) {
            return (IOrderssearch)relorders1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch orders tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void relorders2(IOrderssearch orderssearch) {
        relorders2searcher.setTablesearch(orderssearch);
    }
    
    /**
     * get external key - relational subsearch IOrderssearch
     * @return Tablesearch for IOrderssearch
     */
    public IOrderssearch getRelOrders2search() {
        if(relorders2searcher.used()) {
            return (IOrderssearch)relorders2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
