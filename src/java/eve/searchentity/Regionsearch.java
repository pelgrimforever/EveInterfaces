/*
 * Regionsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IRegionsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Region;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Region table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Regionsearch extends Tablesearch implements IRegionsearch {

    Numbersearch id = new Numbersearch("region.id");
    Stringsearch name = new Stringsearch("region.name");
    Booleansearch noaccess = new Booleansearch("region.noaccess");
    Numbersearch orderpages = new Numbersearch("region.orderpages");
    Numbersearch ordererrors = new Numbersearch("region.ordererrors");
    Numbersearch contractpages = new Numbersearch("region.contractpages");
    Numbersearch contracterrors = new Numbersearch("region.contracterrors");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch order_history_monthsearcher = new Primarykeysearch("order_history_month", IOrder_history_month.regionPKfields, IOrder_history_month.regionFKfields);
    //relational key
    Relationalkeysearch relevetype1searcher = new Relationalkeysearch("order_history_month", IOrder_history_month.regionPKfields, IOrder_history_month.regionFKfields, "evetype", IOrder_history_month.evetypePKfields, IOrder_history_month.evetypeFKfields);
    //foreign key
    Primarykeysearch order_historysearcher = new Primarykeysearch("order_history", IOrder_history.regionPKfields, IOrder_history.regionFKfields);
    //relational key
    Relationalkeysearch relevetype2searcher = new Relationalkeysearch("order_history", IOrder_history.regionPKfields, IOrder_history.regionFKfields, "evetype", IOrder_history.evetypePKfields, IOrder_history.evetypeFKfields);
    //foreign key
    Primarykeysearch region_neighbourRegionsearcher = new Primarykeysearch("region_neighbour", IRegion_neighbour.regionRegionPKfields, IRegion_neighbour.regionRegionFKfields);
    //foreign key
    Primarykeysearch region_neighbourNeighboursearcher = new Primarykeysearch("region_neighbour", IRegion_neighbour.regionNeighbourPKfields, IRegion_neighbour.regionNeighbourFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Region.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Regionsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Regionsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(noaccess);
        addFieldsearcher(orderpages);
        addFieldsearcher(ordererrors);
        addFieldsearcher(contractpages);
        addFieldsearcher(contracterrors);
        addKeysearcher(order_history_monthsearcher);
        addKeysearcher(relevetype1searcher);
        addKeysearcher(order_historysearcher);
        addKeysearcher(relevetype2searcher);
        addKeysearcher(region_neighbourRegionsearcher);
        addKeysearcher(region_neighbourNeighboursearcher);
    }

    /**
     * add a primary key instance to search for
     * @param regionPK: Region primery key
     */
    public void addPrimarykey(IRegionPK regionPK) {
        super.addPrimarykey(regionPK);
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
     * add Boolean search values for field noaccess
     * @param value: true or false
     */
    public void noaccess(Boolean value) {
        addBooleanvalue(noaccess, value);
    }
    
    /**
     * add Numeric search values for field orderpages, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void orderpages(Double[] values, byte[] operators) {
        addNumbervalues(orderpages, values, operators);
    }
    
    /**
     * add Numeric search values for field orderpages
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void orderpages(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(orderpages, values, operators);
        orderpages.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field ordererrors, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void ordererrors(Double[] values, byte[] operators) {
        addNumbervalues(ordererrors, values, operators);
    }
    
    /**
     * add Numeric search values for field ordererrors
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void ordererrors(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(ordererrors, values, operators);
        ordererrors.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field contractpages, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void contractpages(Double[] values, byte[] operators) {
        addNumbervalues(contractpages, values, operators);
    }
    
    /**
     * add Numeric search values for field contractpages
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void contractpages(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(contractpages, values, operators);
        contractpages.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field contracterrors, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void contracterrors(Double[] values, byte[] operators) {
        addNumbervalues(contracterrors, values, operators);
    }
    
    /**
     * add Numeric search values for field contracterrors
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void contracterrors(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(contracterrors, values, operators);
        contracterrors.setAndoroperator(andor);
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
     * set external key - relational subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void relevetype1(IEvetypesearch evetypesearch) {
        relevetype1searcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get external key - relational subsearch IEvetypesearch
     * @return Tablesearch for IEvetypesearch
     */
    public IEvetypesearch getRelEvetype1search() {
        if(relevetype1searcher.used()) {
            return (IEvetypesearch)relevetype1searcher.getTablesearches().get(0);
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
     * set external key - relational subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void relevetype2(IEvetypesearch evetypesearch) {
        relevetype2searcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get external key - relational subsearch IEvetypesearch
     * @return Tablesearch for IEvetypesearch
     */
    public IEvetypesearch getRelEvetype2search() {
        if(relevetype2searcher.used()) {
            return (IEvetypesearch)relevetype2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IRegion_neighboursearch
     * @param region_neighboursearch: IRegion_neighboursearch
     */
    public void region_neighbourRegion(IRegion_neighboursearch region_neighboursearch) {
        region_neighbourRegionsearcher.setTablesearch(region_neighboursearch);
    }
    
    /**
     * get external key - foreign key subsearch IRegion_neighboursearch
     * @return Tablesearch for IRegion_neighboursearch
     */
    public IRegion_neighboursearch getRegion_neighbourregionsearch() {
        if(region_neighbourRegionsearcher.used()) {
            return (IRegion_neighboursearch)region_neighbourRegionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IRegion_neighboursearch
     * @param region_neighboursearch: IRegion_neighboursearch
     */
    public void region_neighbourNeighbour(IRegion_neighboursearch region_neighboursearch) {
        region_neighbourNeighboursearcher.setTablesearch(region_neighboursearch);
    }
    
    /**
     * get external key - foreign key subsearch IRegion_neighboursearch
     * @return Tablesearch for IRegion_neighboursearch
     */
    public IRegion_neighboursearch getRegion_neighbourneighboursearch() {
        if(region_neighbourNeighboursearcher.used()) {
            return (IRegion_neighboursearch)region_neighbourNeighboursearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
