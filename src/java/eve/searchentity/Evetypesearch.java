/*
 * Evetypesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.0.2022 16:47
 *
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

/**
 * Search class for Evetype table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
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

    /**
     * @return tablename
     */
    public String getTable() {
        return Evetype.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Evetypesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Evetypesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
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
    }

    /**
     * add a primary key instance to search for
     * @param evetypePK: Evetype primery key
     */
    public void addPrimarykey(IEvetypePK evetypePK) {
        super.addPrimarykey(evetypePK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    /**
     * add String search values for field name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field published
     * @param value: true or false
     */
    public void published(Boolean value) {
        addBooleanvalue(published, value);
    }
    
    /**
     * add String search values for field description, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    /**
     * add String search values for field description
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field capacity, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void capacity(Double[] values, byte[] operators) {
        addNumbervalues(capacity, values, operators);
    }
    
    /**
     * add Numeric search values for field capacity
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void capacity(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(capacity, values, operators);
        capacity.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field icon, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void icon(Double[] values, byte[] operators) {
        addNumbervalues(icon, values, operators);
    }
    
    /**
     * add Numeric search values for field icon
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void icon(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(icon, values, operators);
        icon.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field mass, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void mass(Double[] values, byte[] operators) {
        addNumbervalues(mass, values, operators);
    }
    
    /**
     * add Numeric search values for field mass
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void mass(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(mass, values, operators);
        mass.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field packaged_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field packaged_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field portion_size, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void portion_size(Double[] values, byte[] operators) {
        addNumbervalues(portion_size, values, operators);
    }
    
    /**
     * add Numeric search values for field portion_size
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void portion_size(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(portion_size, values, operators);
        portion_size.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field radius, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void radius(Double[] values, byte[] operators) {
        addNumbervalues(radius, values, operators);
    }
    
    /**
     * add Numeric search values for field radius
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void radius(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(radius, values, operators);
        radius.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void volume(Double[] values, byte[] operators) {
        addNumbervalues(volume, values, operators);
    }
    
    /**
     * add Numeric search values for field volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume, values, operators);
        volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field avg_buyorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void avg_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_buyorder, values, operators);
    }
    
    /**
     * add Numeric search values for field avg_buyorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void avg_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_buyorder, values, operators);
        avg_buyorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field avg_sellorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void avg_sellorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_sellorder, values, operators);
    }
    
    /**
     * add Numeric search values for field avg_sellorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void avg_sellorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_sellorder, values, operators);
        avg_sellorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field min_buyorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void min_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(min_buyorder, values, operators);
    }
    
    /**
     * add Numeric search values for field min_buyorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void min_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_buyorder, values, operators);
        min_buyorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field max_buyorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void max_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(max_buyorder, values, operators);
    }
    
    /**
     * add Numeric search values for field max_buyorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void max_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_buyorder, values, operators);
        max_buyorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field min_selorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void min_selorder(Double[] values, byte[] operators) {
        addNumbervalues(min_selorder, values, operators);
    }
    
    /**
     * add Numeric search values for field min_selorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void min_selorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_selorder, values, operators);
        min_selorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field max_selorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void max_selorder(Double[] values, byte[] operators) {
        addNumbervalues(max_selorder, values, operators);
    }
    
    /**
     * add Numeric search values for field max_selorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void max_selorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_selorder, values, operators);
        max_selorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field average, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void average(Double[] values, byte[] operators) {
        addNumbervalues(average, values, operators);
    }
    
    /**
     * add Numeric search values for field average
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void average(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(average, values, operators);
        average.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field highest, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void highest(Double[] values, byte[] operators) {
        addNumbervalues(highest, values, operators);
    }
    
    /**
     * add Numeric search values for field highest
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void highest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(highest, values, operators);
        highest.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field lowest, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void lowest(Double[] values, byte[] operators) {
        addNumbervalues(lowest, values, operators);
    }
    
    /**
     * add Numeric search values for field lowest
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void lowest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lowest, values, operators);
        lowest.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field order_count, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void order_count(Double[] values, byte[] operators) {
        addNumbervalues(order_count, values, operators);
    }
    
    /**
     * add Numeric search values for field order_count
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void order_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(order_count, values, operators);
        order_count.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch market_group IMarket_groupsearch
     * @param market_groupsearch: IMarket_groupsearch
     */
    public void market_group(IMarket_groupsearch market_groupsearch) {
        market_groupsearcher.setTablesearch(market_groupsearch);
    }
    
    /**
     * get foreign key subsearch market_group IMarket_groupsearch
     * @return Tablesearch for Evetype
     */
    public IMarket_groupsearch getMarket_groupsearch() {
        if(market_groupsearcher.used()) {
            return (IMarket_groupsearch)market_groupsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if market_groupsearcher is not used
     * @return inner join statement
     */
    public String getMarket_groupInnerjoin() {
        return market_groupsearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch typegroup ITypegroupsearch
     * @param typegroupsearch: ITypegroupsearch
     */
    public void typegroup(ITypegroupsearch typegroupsearch) {
        typegroupsearcher.setTablesearch(typegroupsearch);
    }
    
    /**
     * get foreign key subsearch typegroup ITypegroupsearch
     * @return Tablesearch for Evetype
     */
    public ITypegroupsearch getTypegroupsearch() {
        if(typegroupsearcher.used()) {
            return (ITypegroupsearch)typegroupsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if typegroupsearcher is not used
     * @return inner join statement
     */
    public String getTypegroupInnerjoin() {
        return typegroupsearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch graphic IGraphicsearch
     * @param graphicsearch: IGraphicsearch
     */
    public void graphic(IGraphicsearch graphicsearch) {
        graphicsearcher.setTablesearch(graphicsearch);
    }
    
    /**
     * get foreign key subsearch graphic IGraphicsearch
     * @return Tablesearch for Evetype
     */
    public IGraphicsearch getGraphicsearch() {
        if(graphicsearcher.used()) {
            return (IGraphicsearch)graphicsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if graphicsearcher is not used
     * @return inner join statement
     */
    public String getGraphicInnerjoin() {
        return graphicsearcher.getInnerjoin();
    }

    /**
     * set external key - foreign key subsearch IWishlistsearch
     * @param wishlistsearch: IWishlistsearch
     */
    public void wishlist(IWishlistsearch wishlistsearch) {
        wishlistsearcher.setTablesearch(wishlistsearch);
    }
    
    /**
     * get external key - foreign key subsearch IWishlistsearch
     * @return Tablesearch for IWishlistsearch
     */
    public IWishlistsearch getWishlistsearch() {
        if(wishlistsearcher.used()) {
            return (IWishlistsearch)wishlistsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IMaterialinputsearch
     * @param materialinputsearch: IMaterialinputsearch
     */
    public void materialinput(IMaterialinputsearch materialinputsearch) {
        materialinputsearcher.setTablesearch(materialinputsearch);
    }
    
    /**
     * get external key - foreign key subsearch IMaterialinputsearch
     * @return Tablesearch for IMaterialinputsearch
     */
    public IMaterialinputsearch getMaterialinputsearch() {
        if(materialinputsearcher.used()) {
            return (IMaterialinputsearch)materialinputsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IBpmaterialsearch
     * @param bpmaterialsearch: IBpmaterialsearch
     */
    public void bpmaterialBp(IBpmaterialsearch bpmaterialsearch) {
        bpmaterialBpsearcher.setTablesearch(bpmaterialsearch);
    }
    
    /**
     * get external key - foreign key subsearch IBpmaterialsearch
     * @return Tablesearch for IBpmaterialsearch
     */
    public IBpmaterialsearch getBpmaterialbpsearch() {
        if(bpmaterialBpsearcher.used()) {
            return (IBpmaterialsearch)bpmaterialBpsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IBpmaterialsearch
     * @param bpmaterialsearch: IBpmaterialsearch
     */
    public void bpmaterialMaterial(IBpmaterialsearch bpmaterialsearch) {
        bpmaterialMaterialsearcher.setTablesearch(bpmaterialsearch);
    }
    
    /**
     * get external key - foreign key subsearch IBpmaterialsearch
     * @return Tablesearch for IBpmaterialsearch
     */
    public IBpmaterialsearch getBpmaterialmaterialsearch() {
        if(bpmaterialMaterialsearcher.used()) {
            return (IBpmaterialsearch)bpmaterialMaterialsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IOrder_history_monthsearch
     * @param order_history_monthsearch: IOrder_history_monthsearch
     */
    public void order_history_month(IOrder_history_monthsearch order_history_monthsearch) {
        order_history_monthsearcher.setTablesearch(order_history_monthsearch);
    }
    
    /**
     * get external key - foreign key subsearch IOrder_history_monthsearch
     * @return Tablesearch for IOrder_history_monthsearch
     */
    public IOrder_history_monthsearch getOrder_history_monthsearch() {
        if(order_history_monthsearcher.used()) {
            return (IOrder_history_monthsearch)order_history_monthsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch region tablesearch
     * @param regionsearch: IRegionsearch
     */
    public void relregion1(IRegionsearch regionsearch) {
        relregion1searcher.setTablesearch(regionsearch);
    }
    
    /**
     * get external key - relational subsearch IRegionsearch
     * @return Tablesearch for IRegionsearch
     */
    public IRegionsearch getRelRegion1search() {
        if(relregion1searcher.used()) {
            return (IRegionsearch)relregion1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IStocksearch
     * @param stocksearch: IStocksearch
     */
    public void stock(IStocksearch stocksearch) {
        stocksearcher.setTablesearch(stocksearch);
    }
    
    /**
     * get external key - foreign key subsearch IStocksearch
     * @return Tablesearch for IStocksearch
     */
    public IStocksearch getStocksearch() {
        if(stocksearcher.used()) {
            return (IStocksearch)stocksearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IOrder_historysearch
     * @param order_historysearch: IOrder_historysearch
     */
    public void order_history(IOrder_historysearch order_historysearch) {
        order_historysearcher.setTablesearch(order_historysearch);
    }
    
    /**
     * get external key - foreign key subsearch IOrder_historysearch
     * @return Tablesearch for IOrder_historysearch
     */
    public IOrder_historysearch getOrder_historysearch() {
        if(order_historysearcher.used()) {
            return (IOrder_historysearch)order_historysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch region tablesearch
     * @param regionsearch: IRegionsearch
     */
    public void relregion2(IRegionsearch regionsearch) {
        relregion2searcher.setTablesearch(regionsearch);
    }
    
    /**
     * get external key - relational subsearch IRegionsearch
     * @return Tablesearch for IRegionsearch
     */
    public IRegionsearch getRelRegion2search() {
        if(relregion2searcher.used()) {
            return (IRegionsearch)relregion2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IShipfitmodulesearch
     * @param shipfitmodulesearch: IShipfitmodulesearch
     */
    public void shipfitmodule(IShipfitmodulesearch shipfitmodulesearch) {
        shipfitmodulesearcher.setTablesearch(shipfitmodulesearch);
    }
    
    /**
     * get external key - foreign key subsearch IShipfitmodulesearch
     * @return Tablesearch for IShipfitmodulesearch
     */
    public IShipfitmodulesearch getShipfitmodulesearch() {
        if(shipfitmodulesearcher.used()) {
            return (IShipfitmodulesearch)shipfitmodulesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch shipfit tablesearch
     * @param shipfitsearch: IShipfitsearch
     */
    public void relshipfit1(IShipfitsearch shipfitsearch) {
        relshipfit1searcher.setTablesearch(shipfitsearch);
    }
    
    /**
     * get external key - relational subsearch IShipfitsearch
     * @return Tablesearch for IShipfitsearch
     */
    public IShipfitsearch getRelShipfit1search() {
        if(relshipfit1searcher.used()) {
            return (IShipfitsearch)relshipfit1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IShipfitordersearch
     * @param shipfitordersearch: IShipfitordersearch
     */
    public void shipfitorder(IShipfitordersearch shipfitordersearch) {
        shipfitordersearcher.setTablesearch(shipfitordersearch);
    }
    
    /**
     * get external key - foreign key subsearch IShipfitordersearch
     * @return Tablesearch for IShipfitordersearch
     */
    public IShipfitordersearch getShipfitordersearch() {
        if(shipfitordersearcher.used()) {
            return (IShipfitordersearch)shipfitordersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch shipfit tablesearch
     * @param shipfitsearch: IShipfitsearch
     */
    public void relshipfit2(IShipfitsearch shipfitsearch) {
        relshipfit2searcher.setTablesearch(shipfitsearch);
    }
    
    /**
     * get external key - relational subsearch IShipfitsearch
     * @return Tablesearch for IShipfitsearch
     */
    public IShipfitsearch getRelShipfit2search() {
        if(relshipfit2searcher.used()) {
            return (IShipfitsearch)relshipfit2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch ITradecombinedsearch
     * @param tradecombinedsearch: ITradecombinedsearch
     */
    public void tradecombined(ITradecombinedsearch tradecombinedsearch) {
        tradecombinedsearcher.setTablesearch(tradecombinedsearch);
    }
    
    /**
     * get external key - foreign key subsearch ITradecombinedsearch
     * @return Tablesearch for ITradecombinedsearch
     */
    public ITradecombinedsearch getTradecombinedsearch() {
        if(tradecombinedsearcher.used()) {
            return (ITradecombinedsearch)tradecombinedsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void relsystem1(ISystemsearch systemsearch) {
        relsystem1searcher.setTablesearch(systemsearch);
    }
    
    /**
     * get external key - relational subsearch ISystemsearch
     * @return Tablesearch for ISystemsearch
     */
    public ISystemsearch getRelSystem1search() {
        if(relsystem1searcher.used()) {
            return (ISystemsearch)relsystem1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void relsystem2(ISystemsearch systemsearch) {
        relsystem2searcher.setTablesearch(systemsearch);
    }
    
    /**
     * get external key - relational subsearch ISystemsearch
     * @return Tablesearch for ISystemsearch
     */
    public ISystemsearch getRelSystem2search() {
        if(relsystem2searcher.used()) {
            return (ISystemsearch)relsystem2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
