/*
 * IView_tradeorderssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 8.10.2021 7:21
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_tradeorders table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_tradeorderssearch extends Tablesearcher {

	/**
	 * add Numeric search values for field tradevolume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void tradevolume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field tradevolume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void tradevolume(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_totalprice, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_totalprice(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_totalprice
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_totalprice(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_totalprice, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_totalprice(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_totalprice
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_totalprice(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field cargo_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void cargo_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field cargo_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void cargo_volume(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field sell_location, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_location(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_location
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_location(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_evetype, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_evetype(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_evetype
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_evetype(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_packaged_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_packaged_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_packaged_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_packaged_volume(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field security_island, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void security_island(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field security_island
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void security_island(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field buy_location, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_location(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_location
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_location(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field jumps, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumps(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumps
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumps(Double[] values, byte[] operators, byte andor);
	
}
