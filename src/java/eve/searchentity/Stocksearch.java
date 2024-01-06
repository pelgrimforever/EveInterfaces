/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

public class Stocksearch extends Tablesearch implements IStocksearch {

    Stringsearch username = new Stringsearch("stock.username");
    Numbersearch amount = new Numbersearch("stock.amount");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IStock.evetypePKfields, IStock.evetypeFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch stocktradesearcher = new Primarykeysearch("stocktrade", IStocktrade.stockPKfields, IStocktrade.stockFKfields);

    public String getTable() {
        return Stock.table;
    }

    public Stocksearch() {
        setFieldsearchers();
    }

    public Stocksearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(amount);
        addKeysearcher(evetypesearcher);
        addKeysearcher(stocktradesearcher);
    }

    public void addPrimarykey(IStockPK stockPK) {
        super.addPrimarykey(stockPK);
    }

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
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

    public void stocktrade(IStocktradesearch stocktradesearch) {
        stocktradesearcher.setTablesearch(stocktradesearch);
    }
    
    public IStocktradesearch getStocktradesearch() {
        if(stocktradesearcher.used()) {
            return (IStocktradesearch)stocktradesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
