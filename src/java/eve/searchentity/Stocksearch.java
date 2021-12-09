/*
 * Stocksearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.11.2021 14:30
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IStocksearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Stock;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Stock table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Stocksearch extends Tablesearch implements IStocksearch {

    Stringsearch username = new Stringsearch("stock.username");
    Numbersearch amount = new Numbersearch("stock.amount");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IStock.evetypePKfields, IStock.evetypeFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch stocktradesearcher = new Primarykeysearch("stocktrade", IStocktrade.stockPKfields, IStocktrade.stockFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Stock.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Stocksearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Stocksearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(amount);
        addKeysearcher(evetypesearcher);
        addKeysearcher(stocktradesearcher);
    }

    /**
     * add a primary key instance to search for
     * @param stockPK: Stock primery key
     */
    public void addPrimarykey(IStockPK stockPK) {
        super.addPrimarykey(stockPK);
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
     * @return Tablesearch for Stock
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
     * set external key - foreign key subsearch IStocktradesearch
     * @param stocktradesearch: IStocktradesearch
     */
    public void stocktrade(IStocktradesearch stocktradesearch) {
        stocktradesearcher.setTablesearch(stocktradesearch);
    }
    
    /**
     * get external key - foreign key subsearch IStocktradesearch
     * @return Tablesearch for IStocktradesearch
     */
    public IStocktradesearch getStocktradesearch() {
        if(stocktradesearcher.used()) {
            return (IStocktradesearch)stocktradesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
