/*
 * Stocktradesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IStocktradesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Stocktrade;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Stocktrade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Stocktradesearch extends Tablesearch implements IStocktradesearch {

    Numbersearch orderid = new Numbersearch("stocktrade.orderid");
    Numbersearch sellamount = new Numbersearch("stocktrade.sellamount");
//foreign keys
    Foreignkeysearch stocksearcher = new Foreignkeysearch("stock", IStocktrade.stockPKfields, IStocktrade.stockFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Stocktrade.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Stocktradesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Stocktradesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(orderid);
        addFieldsearcher(sellamount);
        addKeysearcher(stocksearcher);
    }

    /**
     * add a primary key instance to search for
     * @param stocktradePK: Stocktrade primery key
     */
    public void addPrimarykey(IStocktradePK stocktradePK) {
        super.addPrimarykey(stocktradePK);
    }

    /**
     * add Numeric search values for field orderid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void orderid(long[] values, byte[] operators) {
        addNumbervalues(orderid, values, operators);
    }
    
    /**
     * add Numeric search values for field orderid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void orderid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(orderid, values, operators);
        orderid.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field sellamount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void sellamount(Double[] values, byte[] operators) {
        addNumbervalues(sellamount, values, operators);
    }
    
    /**
     * add Numeric search values for field sellamount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void sellamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sellamount, values, operators);
        sellamount.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch stock IStocksearch
     * @param stocksearch: IStocksearch
     */
    public void stock(IStocksearch stocksearch) {
        stocksearcher.setTablesearch(stocksearch);
    }
    
    /**
     * get foreign key subsearch stock IStocksearch
     * @return Tablesearch for Stocktrade
     */
    public IStocksearch getStocksearch() {
        if(stocksearcher.used()) {
            return (IStocksearch)stocksearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if stocksearcher is not used
     * @return inner join statement
     */
    public String getStockInnerjoin() {
        return stocksearcher.getInnerjoin();
    }

}
