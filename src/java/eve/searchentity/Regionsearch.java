/*
 * Regionsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IRegionsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eRegion;
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
    Primarykeysearch order_historysearcher = new Primarykeysearch("order_history", IOrder_history.regionPKfields, IOrder_history.regionFKfields);
    Relationalkeysearch evetypesearcher = new Relationalkeysearch("order_history", IOrder_history.regionPKfields, IOrder_history.regionFKfields, "evetype", IOrder_history.evetypePKfields, IOrder_history.evetypeFKfields);
    Primarykeysearch region_neighbourRegionsearcher = new Primarykeysearch("region_neighbour", IRegion_neighbour.regionRegionPKfields, IRegion_neighbour.regionRegionFKfields);
    Primarykeysearch region_neighbourNeighboursearcher = new Primarykeysearch("region_neighbour", IRegion_neighbour.regionNeighbourPKfields, IRegion_neighbour.regionNeighbourFKfields);

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
        addKeysearcher(order_historysearcher);
        addKeysearcher(evetypesearcher);
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
     * set subsearch order_history tablesearch
     * @param order_historysearch: IOrder_historysearch
     */
    public void order_history(IOrder_historysearch order_historysearch) {
        order_historysearcher.setTablesearch(order_historysearch);
    }
    
    /**
     * 
     * @return Tablesearch for Region
     */
    public IOrder_historysearch getOrder_historysearch() {
        if(order_historysearcher.used()) {
            return (IOrder_historysearch)order_historysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Region
     */
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch region_neighbour tablesearch
     * @param region_neighboursearch: IRegion_neighboursearch
     */
    public void region_neighbourRegion(IRegion_neighboursearch region_neighboursearch) {
        region_neighbourRegionsearcher.setTablesearch(region_neighboursearch);
    }
    
    /**
     * 
     * @return Tablesearch for Region
     */
    public IRegion_neighboursearch getRegion_neighbourregionsearch() {
        if(region_neighbourRegionsearcher.used()) {
            return (IRegion_neighboursearch)region_neighbourRegionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch region_neighbour tablesearch
     * @param region_neighboursearch: IRegion_neighboursearch
     */
    public void region_neighbourNeighbour(IRegion_neighboursearch region_neighboursearch) {
        region_neighbourNeighboursearcher.setTablesearch(region_neighboursearch);
    }
    
    /**
     * 
     * @return Tablesearch for Region
     */
    public IRegion_neighboursearch getRegion_neighbourneighboursearch() {
        if(region_neighbourNeighboursearcher.used()) {
            return (IRegion_neighboursearch)region_neighbourNeighboursearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
