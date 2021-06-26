/*
 * Evetypesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IEvetypesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eEvetype;
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
    Foreignkeysearch market_groupsearcher = new Foreignkeysearch("market_group", IEvetype.market_groupPKfields, IEvetype.market_groupFKfields);
    Foreignkeysearch typegroupsearcher = new Foreignkeysearch("typegroup", IEvetype.typegroupPKfields, IEvetype.typegroupFKfields);
    Foreignkeysearch graphicsearcher = new Foreignkeysearch("graphic", IEvetype.graphicPKfields, IEvetype.graphicFKfields);
    Primarykeysearch order_historysearcher = new Primarykeysearch("order_history", IOrder_history.evetypePKfields, IOrder_history.evetypeFKfields);
    Relationalkeysearch regionsearcher = new Relationalkeysearch("order_history", IOrder_history.evetypePKfields, IOrder_history.evetypeFKfields, "region", IOrder_history.regionPKfields, IOrder_history.regionFKfields);

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
        addKeysearcher(market_groupsearcher);
        addKeysearcher(typegroupsearcher);
        addKeysearcher(graphicsearcher);
        addKeysearcher(order_historysearcher);
        addKeysearcher(regionsearcher);
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
     * set subsearch market_group tablesearch
     * @param market_groupsearch: IMarket_groupsearch
     */
    public void market_group(IMarket_groupsearch market_groupsearch) {
        market_groupsearcher.setTablesearch(market_groupsearch);
    }
    
    /**
     * 
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
     * set subsearch typegroup tablesearch
     * @param typegroupsearch: ITypegroupsearch
     */
    public void typegroup(ITypegroupsearch typegroupsearch) {
        typegroupsearcher.setTablesearch(typegroupsearch);
    }
    
    /**
     * 
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
     * set subsearch graphic tablesearch
     * @param graphicsearch: IGraphicsearch
     */
    public void graphic(IGraphicsearch graphicsearch) {
        graphicsearcher.setTablesearch(graphicsearch);
    }
    
    /**
     * 
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
     * set subsearch order_history tablesearch
     * @param order_historysearch: IOrder_historysearch
     */
    public void order_history(IOrder_historysearch order_historysearch) {
        order_historysearcher.setTablesearch(order_historysearch);
    }
    
    /**
     * 
     * @return Tablesearch for Evetype
     */
    public IOrder_historysearch getOrder_historysearch() {
        if(order_historysearcher.used()) {
            return (IOrder_historysearch)order_historysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch region tablesearch
     * @param regionsearch: IRegionsearch
     */
    public void region(IRegionsearch regionsearch) {
        regionsearcher.setTablesearch(regionsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Evetype
     */
    public IRegionsearch getRegionsearch() {
        if(regionsearcher.used()) {
            return (IRegionsearch)regionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
