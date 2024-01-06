/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

public class Stocktradesearch extends Tablesearch implements IStocktradesearch {

    Numbersearch orderid = new Numbersearch("stocktrade.orderid");
    Numbersearch sellamount = new Numbersearch("stocktrade.sellamount");
//foreign keys
    Foreignkeysearch stocksearcher = new Foreignkeysearch("stock", IStocktrade.stockPKfields, IStocktrade.stockFKfields);
//external foreign keys

    public String getTable() {
        return Stocktrade.table;
    }

    public Stocktradesearch() {
        setFieldsearchers();
    }

    public Stocktradesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(orderid);
        addFieldsearcher(sellamount);
        addKeysearcher(stocksearcher);
    }

    public void addPrimarykey(IStocktradePK stocktradePK) {
        super.addPrimarykey(stocktradePK);
    }

    public void orderid(long[] values, byte[] operators) {
        addNumbervalues(orderid, values, operators);
    }
    
    public void orderid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(orderid, values, operators);
        orderid.setAndoroperator(andor);
    }
    
    public void sellamount(Double[] values, byte[] operators) {
        addNumbervalues(sellamount, values, operators);
    }
    
    public void sellamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sellamount, values, operators);
        sellamount.setAndoroperator(andor);
    }
    
    public void stock(IStocksearch stocksearch) {
        stocksearcher.setTablesearch(stocksearch);
    }
    
    public IStocksearch getStocksearch() {
        if(stocksearcher.used()) {
            return (IStocksearch)stocksearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getStockInnerjoin() {
        return stocksearcher.getInnerjoin();
    }

}
