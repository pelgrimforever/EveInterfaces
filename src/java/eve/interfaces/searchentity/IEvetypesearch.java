/*
 * IEvetypesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.11.2021 14:51
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for Evetype table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IEvetypesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param evetypePK: Evetype primery key
     */
    public void addPrimarykey(IEvetypePK evetypePK);

	/**
	 * add Numeric search values for field id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void id(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void id(long[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void name(String[] values);
	
	/**
	 * add String search values for field name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void name(String[] values, byte compare, byte andor);
	
	/**
	 * add Boolean search values for field published
	 * @param value: true or false
	 */
	public void published(Boolean value);
	
	/**
	 * add String search values for field description, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void description(String[] values);
	
	/**
	 * add String search values for field description
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void description(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field capacity, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void capacity(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field capacity
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void capacity(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field icon, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void icon(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field icon
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void icon(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field mass, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void mass(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field mass
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void mass(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field packaged_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void packaged_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field packaged_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void packaged_volume(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field portion_size, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void portion_size(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field portion_size
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void portion_size(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field radius, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void radius(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field radius
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void radius(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void volume(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field avg_buyorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void avg_buyorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field avg_buyorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void avg_buyorder(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field avg_sellorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void avg_sellorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field avg_sellorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void avg_sellorder(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field min_buyorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void min_buyorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field min_buyorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void min_buyorder(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field max_buyorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void max_buyorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field max_buyorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void max_buyorder(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field min_selorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void min_selorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field min_selorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void min_selorder(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field max_selorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void max_selorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field max_selorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void max_selorder(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch market_group tablesearch
	 * @param market_groupsearch: IMarket_groupsearch
	 */
	public void market_group(IMarket_groupsearch market_groupsearch);
	
	/**
   * foreign key
	 * set subsearch typegroup tablesearch
	 * @param typegroupsearch: ITypegroupsearch
	 */
	public void typegroup(ITypegroupsearch typegroupsearch);
	
	/**
   * foreign key
	 * set subsearch graphic tablesearch
	 * @param graphicsearch: IGraphicsearch
	 */
	public void graphic(IGraphicsearch graphicsearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch stock tablesearch
     * @param stocksearch: IStocksearch
     */
    public void stock(IStocksearch stocksearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch order_history tablesearch
     * @param order_historysearch: IOrder_historysearch
     */
    public void order_history(IOrder_historysearch order_historysearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch region tablesearch
     * @param regionsearch: IRegionsearch
     */
    public void relregion(IRegionsearch regionsearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch tradecombined tablesearch
     * @param tradecombinedsearch: ITradecombinedsearch
     */
    public void tradecombined(ITradecombinedsearch tradecombinedsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void relsystem1(ISystemsearch systemsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void relsystem2(ISystemsearch systemsearch);
    
}
