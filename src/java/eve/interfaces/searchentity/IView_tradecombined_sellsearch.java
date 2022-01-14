/*
 * IView_tradecombined_sellsearch.java
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
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_tradecombined_sell table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_tradecombined_sellsearch extends Tablesearcher {

	/**
	 * add Numeric search values for field sell_system, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_system(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_system
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_system(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_system, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_system(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_system
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_system(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field orderamount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void orderamount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field orderamount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void orderamount(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_order_value, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_order_value(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_order_value
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_order_value(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_order_value, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_order_value(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_order_value
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_order_value(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field profit, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void profit(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field profit
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void profit(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_locationid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_locationid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_locationid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_locationid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field sell_stationname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void sell_stationname(String[] values);
	
	/**
	 * add String search values for field sell_stationname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void sell_stationname(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field evetype_id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void evetype_id(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field evetype_id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void evetype_id(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field evetype_name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void evetype_name(String[] values);
	
	/**
	 * add String search values for field evetype_name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void evetype_name(String[] values, byte compare, byte andor);
	
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
	 * add Numeric search values for field sell_id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_id(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_id(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_volume_total, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_volume_total(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_volume_total
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_volume_total(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_volume_remain, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_volume_remain(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_volume_remain
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_volume_remain(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_min_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_min_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_min_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_min_volume(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_updated, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_updated(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_updated
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_updated(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_id(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_id(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_price, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_price(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_price
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_price(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_volume_total, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_volume_total(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_volume_total
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_volume_total(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_volume_remain, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_volume_remain(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_volume_remain
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_volume_remain(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_min_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_min_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_min_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_min_volume(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_updated, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_updated(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_updated
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_updated(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_price, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_price(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_price
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_price(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_locationid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_locationid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_locationid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_locationid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field buy_stationname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void buy_stationname(String[] values);
	
	/**
	 * add String search values for field buy_stationname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void buy_stationname(String[] values, byte compare, byte andor);
	
}
