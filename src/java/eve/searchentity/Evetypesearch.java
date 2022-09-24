/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IEvetypesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Evetype;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Evetypesearch extends Tablesearch implements IEvetypesearch {

    Numbersearch id = new Numbersearch("evetype.id");
    Stringsearch name = new Stringsearch("evetype.name");
    Booleansearch published = new Booleansearch("evetype.published");
    Stringsearch description = new Stringsearch("evetype.description");
    Numbersearch capacity = new Numbersearch("evetype.capacity");
    Numbersearch icon = new Numbersearch("evetype.icon");
    Numbersearch mass = new Numbersearch("evetype.mass");
    Numbersearch packaged_volume = new Numbersearch("evetype.packaged_volume");
    Numbersearch portion_size = new Numbersearch("evetype.portion_size");
    Numbersearch radius = new Numbersearch("evetype.radius");
    Numbersearch volume = new Numbersearch("evetype.volume");
    Numbersearch avg_buyorder = new Numbersearch("evetype.avg_buyorder");
    Numbersearch avg_sellorder = new Numbersearch("evetype.avg_sellorder");
    Numbersearch min_buyorder = new Numbersearch("evetype.min_buyorder");
    Numbersearch max_buyorder = new Numbersearch("evetype.max_buyorder");
    Numbersearch min_selorder = new Numbersearch("evetype.min_selorder");
    Numbersearch max_selorder = new Numbersearch("evetype.max_selorder");
    Numbersearch average = new Numbersearch("evetype.average");
    Numbersearch highest = new Numbersearch("evetype.highest");
    Numbersearch lowest = new Numbersearch("evetype.lowest");
    Numbersearch order_count = new Numbersearch("evetype.order_count");
    Booleansearch configuredbp = new Booleansearch("evetype.configuredbp");
    Numbersearch estimatedproductioncost = new Numbersearch("evetype.estimatedproductioncost");
//foreign keys
    Foreignkeysearch market_groupsearcher = new Foreignkeysearch("market_group", IEvetype.market_groupPKfields, IEvetype.market_groupFKfields);
    Foreignkeysearch typegroupsearcher = new Foreignkeysearch("typegroup", IEvetype.typegroupPKfields, IEvetype.typegroupFKfields);
    Foreignkeysearch graphicsearcher = new Foreignkeysearch("graphic", IEvetype.graphicPKfields, IEvetype.graphicFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch wishlistsearcher = new Primarykeysearch("wishlist", IWishlist.evetypePKfields, IWishlist.evetypeFKfields);
    //foreign key
    Primarykeysearch materialinputsearcher = new Primarykeysearch("materialinput", IMaterialinput.evetypePKfields, IMaterialinput.evetypeFKfields);
    //foreign key
    Primarykeysearch bpmaterialBpsearcher = new Primarykeysearch("bpmaterial", IBpmaterial.evetypeBpPKfields, IBpmaterial.evetypeBpFKfields);
    //foreign key
    Primarykeysearch bpmaterialMaterialsearcher = new Primarykeysearch("bpmaterial", IBpmaterial.evetypeMaterialPKfields, IBpmaterial.evetypeMaterialFKfields);
    //foreign key
    Primarykeysearch order_history_monthsearcher = new Primarykeysearch("order_history_month", IOrder_history_month.evetypePKfields, IOrder_history_month.evetypeFKfields);
    //relational key
    Relationalkeysearch relregion1searcher = new Relationalkeysearch("order_history_month", IOrder_history_month.evetypePKfields, IOrder_history_month.evetypeFKfields, "region", IOrder_history_month.regionPKfields, IOrder_history_month.regionFKfields);
    //foreign key
    Primarykeysearch stocksearcher = new Primarykeysearch("stock", IStock.evetypePKfields, IStock.evetypeFKfields);
    //foreign key
    Primarykeysearch order_historysearcher = new Primarykeysearch("order_history", IOrder_history.evetypePKfields, IOrder_history.evetypeFKfields);
    //relational key
    Relationalkeysearch relregion2searcher = new Relationalkeysearch("order_history", IOrder_history.evetypePKfields, IOrder_history.evetypeFKfields, "region", IOrder_history.regionPKfields, IOrder_history.regionFKfields);
    //foreign key
    Primarykeysearch shipfitmodulesearcher = new Primarykeysearch("shipfitmodule", IShipfitmodule.evetypePKfields, IShipfitmodule.evetypeFKfields);
    //relational key
    Relationalkeysearch relshipfit1searcher = new Relationalkeysearch("shipfitmodule", IShipfitmodule.evetypePKfields, IShipfitmodule.evetypeFKfields, "shipfit", IShipfitmodule.shipfitPKfields, IShipfitmodule.shipfitFKfields);
    //foreign key
    Primarykeysearch shipfitordersearcher = new Primarykeysearch("shipfitorder", IShipfitorder.evetypePKfields, IShipfitorder.evetypeFKfields);
    //relational key
    Relationalkeysearch relshipfit2searcher = new Relationalkeysearch("shipfitorder", IShipfitorder.evetypePKfields, IShipfitorder.evetypeFKfields, "shipfit", IShipfitorder.shipfitPKfields, IShipfitorder.shipfitFKfields);
    //foreign key
    Primarykeysearch tradecombinedsearcher = new Primarykeysearch("tradecombined", ITradecombined.evetypePKfields, ITradecombined.evetypeFKfields);
    //relational key
    Relationalkeysearch relsystem1searcher = new Relationalkeysearch("tradecombined", ITradecombined.evetypePKfields, ITradecombined.evetypeFKfields, "system", ITradecombined.systemBuy_systemPKfields, ITradecombined.systemBuy_systemFKfields);
    //relational key
    Relationalkeysearch relsystem2searcher = new Relationalkeysearch("tradecombined", ITradecombined.evetypePKfields, ITradecombined.evetypeFKfields, "system", ITradecombined.systemSell_systemPKfields, ITradecombined.systemSell_systemFKfields);
    //foreign key
    Primarykeysearch userbpsearcher = new Primarykeysearch("userbp", IUserbp.evetypePKfields, IUserbp.evetypeFKfields);

    public String getTable() {
        return Evetype.table;
    }

    public Evetypesearch() {
        setFieldsearchers();
    }

    public Evetypesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(published);
        addFieldsearcher(description);
        addFieldsearcher(capacity);
        addFieldsearcher(icon);
        addFieldsearcher(mass);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(portion_size);
        addFieldsearcher(radius);
        addFieldsearcher(volume);
        addFieldsearcher(avg_buyorder);
        addFieldsearcher(avg_sellorder);
        addFieldsearcher(min_buyorder);
        addFieldsearcher(max_buyorder);
        addFieldsearcher(min_selorder);
        addFieldsearcher(max_selorder);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
        addFieldsearcher(order_count);
        addFieldsearcher(configuredbp);
        addFieldsearcher(estimatedproductioncost);
        addKeysearcher(market_groupsearcher);
        addKeysearcher(typegroupsearcher);
        addKeysearcher(graphicsearcher);
        addKeysearcher(wishlistsearcher);
        addKeysearcher(materialinputsearcher);
        addKeysearcher(bpmaterialBpsearcher);
        addKeysearcher(bpmaterialMaterialsearcher);
        addKeysearcher(order_history_monthsearcher);
        addKeysearcher(relregion1searcher);
        addKeysearcher(stocksearcher);
        addKeysearcher(order_historysearcher);
        addKeysearcher(relregion2searcher);
        addKeysearcher(shipfitmodulesearcher);
        addKeysearcher(relshipfit1searcher);
        addKeysearcher(shipfitordersearcher);
        addKeysearcher(relshipfit2searcher);
        addKeysearcher(tradecombinedsearcher);
        addKeysearcher(relsystem1searcher);
        addKeysearcher(relsystem2searcher);
        addKeysearcher(userbpsearcher);
    }

    public void addPrimarykey(IEvetypePK evetypePK) {
        super.addPrimarykey(evetypePK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void published(Boolean value) {
        addBooleanvalue(published, value);
    }
    
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    public void capacity(Double[] values, byte[] operators) {
        addNumbervalues(capacity, values, operators);
    }
    
    public void capacity(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(capacity, values, operators);
        capacity.setAndoroperator(andor);
    }
    
    public void icon(Double[] values, byte[] operators) {
        addNumbervalues(icon, values, operators);
    }
    
    public void icon(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(icon, values, operators);
        icon.setAndoroperator(andor);
    }
    
    public void mass(Double[] values, byte[] operators) {
        addNumbervalues(mass, values, operators);
    }
    
    public void mass(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(mass, values, operators);
        mass.setAndoroperator(andor);
    }
    
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
    }
    
    public void portion_size(Double[] values, byte[] operators) {
        addNumbervalues(portion_size, values, operators);
    }
    
    public void portion_size(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(portion_size, values, operators);
        portion_size.setAndoroperator(andor);
    }
    
    public void radius(Double[] values, byte[] operators) {
        addNumbervalues(radius, values, operators);
    }
    
    public void radius(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(radius, values, operators);
        radius.setAndoroperator(andor);
    }
    
    public void volume(Double[] values, byte[] operators) {
        addNumbervalues(volume, values, operators);
    }
    
    public void volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume, values, operators);
        volume.setAndoroperator(andor);
    }
    
    public void avg_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_buyorder, values, operators);
    }
    
    public void avg_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_buyorder, values, operators);
        avg_buyorder.setAndoroperator(andor);
    }
    
    public void avg_sellorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_sellorder, values, operators);
    }
    
    public void avg_sellorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_sellorder, values, operators);
        avg_sellorder.setAndoroperator(andor);
    }
    
    public void min_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(min_buyorder, values, operators);
    }
    
    public void min_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_buyorder, values, operators);
        min_buyorder.setAndoroperator(andor);
    }
    
    public void max_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(max_buyorder, values, operators);
    }
    
    public void max_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_buyorder, values, operators);
        max_buyorder.setAndoroperator(andor);
    }
    
    public void min_selorder(Double[] values, byte[] operators) {
        addNumbervalues(min_selorder, values, operators);
    }
    
    public void min_selorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_selorder, values, operators);
        min_selorder.setAndoroperator(andor);
    }
    
    public void max_selorder(Double[] values, byte[] operators) {
        addNumbervalues(max_selorder, values, operators);
    }
    
    public void max_selorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_selorder, values, operators);
        max_selorder.setAndoroperator(andor);
    }
    
    public void average(Double[] values, byte[] operators) {
        addNumbervalues(average, values, operators);
    }
    
    public void average(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(average, values, operators);
        average.setAndoroperator(andor);
    }
    
    public void highest(Double[] values, byte[] operators) {
        addNumbervalues(highest, values, operators);
    }
    
    public void highest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(highest, values, operators);
        highest.setAndoroperator(andor);
    }
    
    public void lowest(Double[] values, byte[] operators) {
        addNumbervalues(lowest, values, operators);
    }
    
    public void lowest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lowest, values, operators);
        lowest.setAndoroperator(andor);
    }
    
    public void order_count(Double[] values, byte[] operators) {
        addNumbervalues(order_count, values, operators);
    }
    
    public void order_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(order_count, values, operators);
        order_count.setAndoroperator(andor);
    }
    
    public void configuredbp(Boolean value) {
        addBooleanvalue(configuredbp, value);
    }
    
    public void estimatedproductioncost(Double[] values, byte[] operators) {
        addNumbervalues(estimatedproductioncost, values, operators);
    }
    
    public void estimatedproductioncost(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(estimatedproductioncost, values, operators);
        estimatedproductioncost.setAndoroperator(andor);
    }
    
    public void market_group(IMarket_groupsearch market_groupsearch) {
        market_groupsearcher.setTablesearch(market_groupsearch);
    }
    
    public IMarket_groupsearch getMarket_groupsearch() {
        if(market_groupsearcher.used()) {
            return (IMarket_groupsearch)market_groupsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getMarket_groupInnerjoin() {
        return market_groupsearcher.getInnerjoin();
    }

    public void typegroup(ITypegroupsearch typegroupsearch) {
        typegroupsearcher.setTablesearch(typegroupsearch);
    }
    
    public ITypegroupsearch getTypegroupsearch() {
        if(typegroupsearcher.used()) {
            return (ITypegroupsearch)typegroupsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getTypegroupInnerjoin() {
        return typegroupsearcher.getInnerjoin();
    }

    public void graphic(IGraphicsearch graphicsearch) {
        graphicsearcher.setTablesearch(graphicsearch);
    }
    
    public IGraphicsearch getGraphicsearch() {
        if(graphicsearcher.used()) {
            return (IGraphicsearch)graphicsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getGraphicInnerjoin() {
        return graphicsearcher.getInnerjoin();
    }

    public void wishlist(IWishlistsearch wishlistsearch) {
        wishlistsearcher.setTablesearch(wishlistsearch);
    }
    
    public IWishlistsearch getWishlistsearch() {
        if(wishlistsearcher.used()) {
            return (IWishlistsearch)wishlistsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void materialinput(IMaterialinputsearch materialinputsearch) {
        materialinputsearcher.setTablesearch(materialinputsearch);
    }
    
    public IMaterialinputsearch getMaterialinputsearch() {
        if(materialinputsearcher.used()) {
            return (IMaterialinputsearch)materialinputsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void bpmaterialBp(IBpmaterialsearch bpmaterialsearch) {
        bpmaterialBpsearcher.setTablesearch(bpmaterialsearch);
    }
    
    public IBpmaterialsearch getBpmaterialbpsearch() {
        if(bpmaterialBpsearcher.used()) {
            return (IBpmaterialsearch)bpmaterialBpsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void bpmaterialMaterial(IBpmaterialsearch bpmaterialsearch) {
        bpmaterialMaterialsearcher.setTablesearch(bpmaterialsearch);
    }
    
    public IBpmaterialsearch getBpmaterialmaterialsearch() {
        if(bpmaterialMaterialsearcher.used()) {
            return (IBpmaterialsearch)bpmaterialMaterialsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void order_history_month(IOrder_history_monthsearch order_history_monthsearch) {
        order_history_monthsearcher.setTablesearch(order_history_monthsearch);
    }
    
    public IOrder_history_monthsearch getOrder_history_monthsearch() {
        if(order_history_monthsearcher.used()) {
            return (IOrder_history_monthsearch)order_history_monthsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relregion1(IRegionsearch regionsearch) {
        relregion1searcher.setTablesearch(regionsearch);
    }
    
    public IRegionsearch getRelRegion1search() {
        if(relregion1searcher.used()) {
            return (IRegionsearch)relregion1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
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

    public void order_history(IOrder_historysearch order_historysearch) {
        order_historysearcher.setTablesearch(order_historysearch);
    }
    
    public IOrder_historysearch getOrder_historysearch() {
        if(order_historysearcher.used()) {
            return (IOrder_historysearch)order_historysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relregion2(IRegionsearch regionsearch) {
        relregion2searcher.setTablesearch(regionsearch);
    }
    
    public IRegionsearch getRelRegion2search() {
        if(relregion2searcher.used()) {
            return (IRegionsearch)relregion2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void shipfitmodule(IShipfitmodulesearch shipfitmodulesearch) {
        shipfitmodulesearcher.setTablesearch(shipfitmodulesearch);
    }
    
    public IShipfitmodulesearch getShipfitmodulesearch() {
        if(shipfitmodulesearcher.used()) {
            return (IShipfitmodulesearch)shipfitmodulesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relshipfit1(IShipfitsearch shipfitsearch) {
        relshipfit1searcher.setTablesearch(shipfitsearch);
    }
    
    public IShipfitsearch getRelShipfit1search() {
        if(relshipfit1searcher.used()) {
            return (IShipfitsearch)relshipfit1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void shipfitorder(IShipfitordersearch shipfitordersearch) {
        shipfitordersearcher.setTablesearch(shipfitordersearch);
    }
    
    public IShipfitordersearch getShipfitordersearch() {
        if(shipfitordersearcher.used()) {
            return (IShipfitordersearch)shipfitordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relshipfit2(IShipfitsearch shipfitsearch) {
        relshipfit2searcher.setTablesearch(shipfitsearch);
    }
    
    public IShipfitsearch getRelShipfit2search() {
        if(relshipfit2searcher.used()) {
            return (IShipfitsearch)relshipfit2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void tradecombined(ITradecombinedsearch tradecombinedsearch) {
        tradecombinedsearcher.setTablesearch(tradecombinedsearch);
    }
    
    public ITradecombinedsearch getTradecombinedsearch() {
        if(tradecombinedsearcher.used()) {
            return (ITradecombinedsearch)tradecombinedsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relsystem1(ISystemsearch systemsearch) {
        relsystem1searcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getRelSystem1search() {
        if(relsystem1searcher.used()) {
            return (ISystemsearch)relsystem1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relsystem2(ISystemsearch systemsearch) {
        relsystem2searcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getRelSystem2search() {
        if(relsystem2searcher.used()) {
            return (ISystemsearch)relsystem2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void userbp(IUserbpsearch userbpsearch) {
        userbpsearcher.setTablesearch(userbpsearch);
    }
    
    public IUserbpsearch getUserbpsearch() {
        if(userbpsearcher.used()) {
            return (IUserbpsearch)userbpsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
