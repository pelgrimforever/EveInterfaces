/*
 * IView_systemtrade_ordersearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_systemtrade_order table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_systemtrade_ordersearch extends Tablesearcher {

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
	 * add Numeric search values for field sell_order, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_order(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_order
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_order(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_order, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_order(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_order
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_order(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field amount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void amount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field amount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void amount(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sellprice, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sellprice(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sellprice
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sellprice(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buyprice, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buyprice(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buyprice
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buyprice(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field cargovolume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void cargovolume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field cargovolume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void cargovolume(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field evetype, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void evetype(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field evetype
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void evetype(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field evetypename, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void evetypename(String[] values);
	
	/**
	 * add String search values for field evetypename
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void evetypename(String[] values, byte compare, byte andor);
	
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
	 * add Numeric search values for field sell_station, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_station(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_station
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_station(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field buy_station, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_station(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_station
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_station(Double[] values, byte[] operators, byte andor);
	
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
