/*
 * IRegionsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.ITablesearch;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for Region table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IRegionsearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param regionPK: Region primery key
     */
    public void addPrimarykey(IRegionPK regionPK);

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
	 * add Boolean search values for field noaccess
	 * @param value: true or false
	 */
	public void noaccess(Boolean value);
	
	/**
	 * add Numeric search values for field orderpages, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void orderpages(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field orderpages
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void orderpages(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field ordererrors, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void ordererrors(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field ordererrors
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void ordererrors(Double[] values, byte[] operators, byte andor);
	
    /**
     * set subsearch order_history tablesearch
     * @param order_historysearch: IOrder_historysearch
     */
    public void order_history(IOrder_historysearch order_historysearch);
    
    /**
     * set relational subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetype(IEvetypesearch evetypesearch);
    
    /**
     * set subsearch region_neighbour tablesearch
     * @param region_neighboursearch: IRegion_neighboursearch
     */
    public void region_neighbourRegion(IRegion_neighboursearch region_neighboursearch);
    
    /**
     * set subsearch region_neighbour tablesearch
     * @param region_neighboursearch: IRegion_neighboursearch
     */
    public void region_neighbourNeighbour(IRegion_neighboursearch region_neighboursearch);
    
}
