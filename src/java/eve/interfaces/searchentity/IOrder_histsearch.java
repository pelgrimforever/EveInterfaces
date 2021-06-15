/*
 * IOrder_histsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.5.2021 13:35
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
 * Search Interface for Order_hist table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IOrder_histsearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param order_histPK: Order_hist primery key
     */
    public void addPrimarykey(IOrder_histPK order_histPK);

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
	 * add Boolean search values for field isopen
	 * @param value: true or false
	 */
	public void isopen(Boolean value);
	
	/**
	 * add Numeric search values for field volume_total, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void volume_total(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field volume_total
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void volume_total(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field volume_remain, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void volume_remain(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field volume_remain
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void volume_remain(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field range, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void range(String[] values);
	
	/**
	 * add String search values for field range
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void range(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field range_number, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void range_number(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field range_number
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void range_number(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field price, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void price(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field price
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void price(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field min_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void min_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field min_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void min_volume(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field location, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void location(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field location
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void location(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field is_buy_order
	 * @param value: true or false
	 */
	public void is_buy_order(Boolean value);
	
	/**
	 * add Timestamp search values for field issued, default OR operator is used
	 * @param values: Array of timestamp search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void issued(Timestamp[] values, byte[] operators);
	
	/**
	 * add Timestamp search values for field issued
	 * @param values: Array of timestamp search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void issued(Timestamp[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field duration, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void duration(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field duration
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void duration(Double[] values, byte[] operators, byte andor);
	
	/**
	* set subsearch evetype tablesearch
	* @param evetypesearch: IEvetypesearch
	*/
	public void evetype(IEvetypesearch evetypesearch);
	
	/**
	* set subsearch system tablesearch
	* @param systemsearch: ISystemsearch
	*/
	public void system(ISystemsearch systemsearch);
	
}
