/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IOrderssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Orders;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Orderssearch extends Tablesearch implements IOrderssearch {

    Numbersearch id = new Numbersearch("orders.id");
    Booleansearch isopen = new Booleansearch("orders.isopen");
    Numbersearch volume_total = new Numbersearch("orders.volume_total");
    Numbersearch volume_remain = new Numbersearch("orders.volume_remain");
    Stringsearch range = new Stringsearch("orders.range");
    Numbersearch range_number = new Numbersearch("orders.range_number");
    Numbersearch price = new Numbersearch("orders.price");
    Numbersearch min_volume = new Numbersearch("orders.min_volume");
    Numbersearch location = new Numbersearch("orders.location");
    Booleansearch is_buy_order = new Booleansearch("orders.is_buy_order");
    Timesearch issued = new Timesearch("orders.issued");
    Numbersearch duration = new Numbersearch("orders.duration");
    Numbersearch page = new Numbersearch("orders.page");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IOrders.evetypePKfields, IOrders.evetypeFKfields);
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", IOrders.systemPKfields, IOrders.systemFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch tradecombined_sellBuy_order_idsearcher = new Primarykeysearch("tradecombined_sell", ITradecombined_sell.ordersBuy_order_idPKfields, ITradecombined_sell.ordersBuy_order_idFKfields);
    //relational key
    Relationalkeysearch reltradecombined1searcher = new Relationalkeysearch("tradecombined_sell", ITradecombined_sell.ordersBuy_order_idPKfields, ITradecombined_sell.ordersBuy_order_idFKfields, "tradecombined", ITradecombined_sell.tradecombinedPKfields, ITradecombined_sell.tradecombinedFKfields);
    //foreign key
    Primarykeysearch tradecombined_sellSell_order_idsearcher = new Primarykeysearch("tradecombined_sell", ITradecombined_sell.ordersSell_order_idPKfields, ITradecombined_sell.ordersSell_order_idFKfields);
    //relational key
    Relationalkeysearch reltradecombined2searcher = new Relationalkeysearch("tradecombined_sell", ITradecombined_sell.ordersSell_order_idPKfields, ITradecombined_sell.ordersSell_order_idFKfields, "tradecombined", ITradecombined_sell.tradecombinedPKfields, ITradecombined_sell.tradecombinedFKfields);
    //foreign key
    Primarykeysearch shipfitorderselectedsearcher = new Primarykeysearch("shipfitorderselected", IShipfitorderselected.ordersPKfields, IShipfitorderselected.ordersFKfields);
    //relational key
    Relationalkeysearch relshipfitordersearcher = new Relationalkeysearch("shipfitorderselected", IShipfitorderselected.ordersPKfields, IShipfitorderselected.ordersFKfields, "shipfitorder", IShipfitorderselected.shipfitorderPKfields, IShipfitorderselected.shipfitorderFKfields);
    //foreign key
    Primarykeysearch tradeSell_order_idsearcher = new Primarykeysearch("trade", ITrade.ordersSell_order_idPKfields, ITrade.ordersSell_order_idFKfields);
    //foreign key
    Primarykeysearch tradeBuy_order_idsearcher = new Primarykeysearch("trade", ITrade.ordersBuy_order_idPKfields, ITrade.ordersBuy_order_idFKfields);

    public String getTable() {
        return Orders.table;
    }

    public Orderssearch() {
        setFieldsearchers();
    }

    public Orderssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(isopen);
        addFieldsearcher(volume_total);
        addFieldsearcher(volume_remain);
        addFieldsearcher(range);
        addFieldsearcher(range_number);
        addFieldsearcher(price);
        addFieldsearcher(min_volume);
        addFieldsearcher(location);
        addFieldsearcher(is_buy_order);
        addFieldsearcher(issued);
        addFieldsearcher(duration);
        addFieldsearcher(page);
        addKeysearcher(evetypesearcher);
        addKeysearcher(systemsearcher);
        addKeysearcher(tradecombined_sellBuy_order_idsearcher);
        addKeysearcher(reltradecombined1searcher);
        addKeysearcher(tradecombined_sellSell_order_idsearcher);
        addKeysearcher(reltradecombined2searcher);
        addKeysearcher(shipfitorderselectedsearcher);
        addKeysearcher(relshipfitordersearcher);
        addKeysearcher(tradeSell_order_idsearcher);
        addKeysearcher(tradeBuy_order_idsearcher);
    }

    public void addPrimarykey(IOrdersPK ordersPK) {
        super.addPrimarykey(ordersPK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void isopen(Boolean value) {
        addBooleanvalue(isopen, value);
    }
    
    public void volume_total(Double[] values, byte[] operators) {
        addNumbervalues(volume_total, values, operators);
    }
    
    public void volume_total(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume_total, values, operators);
        volume_total.setAndoroperator(andor);
    }
    
    public void volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(volume_remain, values, operators);
    }
    
    public void volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume_remain, values, operators);
        volume_remain.setAndoroperator(andor);
    }
    
    public void range(String[] values) {
        addStringvalues(range, values);
    }
    
    public void range(String[] values, byte compare, byte andor) {
        addStringvalues(range, values);
        range.setCompareoperator(compare);
        range.setAndoroperator(andor);
    }
    
    public void range_number(Double[] values, byte[] operators) {
        addNumbervalues(range_number, values, operators);
    }
    
    public void range_number(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(range_number, values, operators);
        range_number.setAndoroperator(andor);
    }
    
    public void price(Double[] values, byte[] operators) {
        addNumbervalues(price, values, operators);
    }
    
    public void price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(price, values, operators);
        price.setAndoroperator(andor);
    }
    
    public void min_volume(Double[] values, byte[] operators) {
        addNumbervalues(min_volume, values, operators);
    }
    
    public void min_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_volume, values, operators);
        min_volume.setAndoroperator(andor);
    }
    
    public void location(Double[] values, byte[] operators) {
        addNumbervalues(location, values, operators);
    }
    
    public void location(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(location, values, operators);
        location.setAndoroperator(andor);
    }
    
    public void is_buy_order(Boolean value) {
        addBooleanvalue(is_buy_order, value);
    }
    
    public void issued(Timestamp[] values, byte[] operators) {
        addTimevalues(issued, values, operators);
    }
    
    public void issued(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(issued, values, operators);
        issued.setAndoroperator(andor);
    }
    
    public void duration(Double[] values, byte[] operators) {
        addNumbervalues(duration, values, operators);
    }
    
    public void duration(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(duration, values, operators);
        duration.setAndoroperator(andor);
    }
    
    public void page(Double[] values, byte[] operators) {
        addNumbervalues(page, values, operators);
    }
    
    public void page(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(page, values, operators);
        page.setAndoroperator(andor);
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

    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getSystemsearch() {
        if(systemsearcher.used()) {
            return (ISystemsearch)systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSystemInnerjoin() {
        return systemsearcher.getInnerjoin();
    }

    public void tradecombined_sellBuy_order_id(ITradecombined_sellsearch tradecombined_sellsearch) {
        tradecombined_sellBuy_order_idsearcher.setTablesearch(tradecombined_sellsearch);
    }
    
    public ITradecombined_sellsearch getTradecombined_sellbuy_order_idsearch() {
        if(tradecombined_sellBuy_order_idsearcher.used()) {
            return (ITradecombined_sellsearch)tradecombined_sellBuy_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void reltradecombined1(ITradecombinedsearch tradecombinedsearch) {
        reltradecombined1searcher.setTablesearch(tradecombinedsearch);
    }
    
    public ITradecombinedsearch getRelTradecombined1search() {
        if(reltradecombined1searcher.used()) {
            return (ITradecombinedsearch)reltradecombined1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void tradecombined_sellSell_order_id(ITradecombined_sellsearch tradecombined_sellsearch) {
        tradecombined_sellSell_order_idsearcher.setTablesearch(tradecombined_sellsearch);
    }
    
    public ITradecombined_sellsearch getTradecombined_sellsell_order_idsearch() {
        if(tradecombined_sellSell_order_idsearcher.used()) {
            return (ITradecombined_sellsearch)tradecombined_sellSell_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void reltradecombined2(ITradecombinedsearch tradecombinedsearch) {
        reltradecombined2searcher.setTablesearch(tradecombinedsearch);
    }
    
    public ITradecombinedsearch getRelTradecombined2search() {
        if(reltradecombined2searcher.used()) {
            return (ITradecombinedsearch)reltradecombined2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void shipfitorderselected(IShipfitorderselectedsearch shipfitorderselectedsearch) {
        shipfitorderselectedsearcher.setTablesearch(shipfitorderselectedsearch);
    }
    
    public IShipfitorderselectedsearch getShipfitorderselectedsearch() {
        if(shipfitorderselectedsearcher.used()) {
            return (IShipfitorderselectedsearch)shipfitorderselectedsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relshipfitorder(IShipfitordersearch shipfitordersearch) {
        relshipfitordersearcher.setTablesearch(shipfitordersearch);
    }
    
    public IShipfitordersearch getRelShipfitordersearch() {
        if(relshipfitordersearcher.used()) {
            return (IShipfitordersearch)relshipfitordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void tradeSell_order_id(ITradesearch tradesearch) {
        tradeSell_order_idsearcher.setTablesearch(tradesearch);
    }
    
    public ITradesearch getTradesell_order_idsearch() {
        if(tradeSell_order_idsearcher.used()) {
            return (ITradesearch)tradeSell_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void tradeBuy_order_id(ITradesearch tradesearch) {
        tradeBuy_order_idsearcher.setTablesearch(tradesearch);
    }
    
    public ITradesearch getTradebuy_order_idsearch() {
        if(tradeBuy_order_idsearcher.used()) {
            return (ITradesearch)tradeBuy_order_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
