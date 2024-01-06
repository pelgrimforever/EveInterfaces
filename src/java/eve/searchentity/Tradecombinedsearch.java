/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

    public String getTable() {
        return Tradecombined.table;
    }

    public Tradecombinedsearch() {
        setFieldsearchers();
    }

    public Tradecombinedsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void addPrimarykey(ITradecombinedPK tradecombinedPK) {
        super.addPrimarykey(tradecombinedPK);
    }

    public void jumps(Double[] values, byte[] operators) {
        addNumbervalues(jumps, values, operators);
    }
    
    public void jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumps, values, operators);
        jumps.setAndoroperator(andor);
    }
    
    public void jumpslowsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpslowsec, values, operators);
    }
    
    public void jumpslowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpslowsec, values, operators);
        jumpslowsec.setAndoroperator(andor);
    }
    
    public void jumpsnullsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpsnullsec, values, operators);
    }
    
    public void jumpsnullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpsnullsec, values, operators);
        jumpsnullsec.setAndoroperator(andor);
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

    public void systemBuy_system(ISystemsearch systemsearch) {
        systemBuy_systemsearcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getSystembuy_systemsearch() {
        if(systemBuy_systemsearcher.used()) {
            return (ISystemsearch)systemBuy_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSystembuy_systemInnerjoin() {
        return systemBuy_systemsearcher.getInnerjoin();
    }

    public void systemSell_system(ISystemsearch systemsearch) {
        systemSell_systemsearcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getSystemsell_systemsearch() {
        if(systemSell_systemsearcher.used()) {
            return (ISystemsearch)systemSell_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSystemsell_systemInnerjoin() {
        return systemSell_systemsearcher.getInnerjoin();
    }

    public void tradecombined_sell(ITradecombined_sellsearch tradecombined_sellsearch) {
        tradecombined_sellsearcher.setTablesearch(tradecombined_sellsearch);
    }
    
    public ITradecombined_sellsearch getTradecombined_sellsearch() {
        if(tradecombined_sellsearcher.used()) {
            return (ITradecombined_sellsearch)tradecombined_sellsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relorders1(IOrderssearch orderssearch) {
        relorders1searcher.setTablesearch(orderssearch);
    }
    
    public IOrderssearch getRelOrders1search() {
        if(relorders1searcher.used()) {
            return (IOrderssearch)relorders1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relorders2(IOrderssearch orderssearch) {
        relorders2searcher.setTablesearch(orderssearch);
    }
    
    public IOrderssearch getRelOrders2search() {
        if(relorders2searcher.used()) {
            return (IOrderssearch)relorders2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
