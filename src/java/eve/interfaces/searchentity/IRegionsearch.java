/*
 * IRegionsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
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
 * Search Interface for Region table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IRegionsearch extends Tablesearcher {

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
	 * add Numeric search values for field contractpages, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void contractpages(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field contractpages
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void contractpages(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field contracterrors, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void contracterrors(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field contracterrors
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void contracterrors(Double[] values, byte[] operators, byte andor);
	
    /**
     * external foreign key - foreign key
     * set subsearch order_history_month tablesearch
     * @param order_history_monthsearch: IOrder_history_monthsearch
     */
    public void order_history_month(IOrder_history_monthsearch order_history_monthsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void relevetype1(IEvetypesearch evetypesearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch order_history tablesearch
     * @param order_historysearch: IOrder_historysearch
     */
    public void order_history(IOrder_historysearch order_historysearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void relevetype2(IEvetypesearch evetypesearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch region_neighbour tablesearch
     * @param region_neighboursearch: IRegion_neighboursearch
     */
    public void region_neighbourRegion(IRegion_neighboursearch region_neighboursearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch region_neighbour tablesearch
     * @param region_neighboursearch: IRegion_neighboursearch
     */
    public void region_neighbourNeighbour(IRegion_neighboursearch region_neighboursearch);
    
}
