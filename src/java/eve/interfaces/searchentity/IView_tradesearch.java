/*
 * IView_tradesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2021 15:16
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_trade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_tradesearch extends Tablesearcher {

	/**
	 * add Numeric search values for field sell_regionid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_regionid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_regionid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_regionid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field sell_regionname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void sell_regionname(String[] values);
	
	/**
	 * add String search values for field sell_regionname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void sell_regionname(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field sell_systemid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_systemid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_systemid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_systemid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field sell_systemname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void sell_systemname(String[] values);
	
	/**
	 * add String search values for field sell_systemname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void sell_systemname(String[] values, byte compare, byte andor);
	
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
	 * add Numeric search values for field buy_systemid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_systemid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_systemid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_systemid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field buy_systemname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void buy_systemname(String[] values);
	
	/**
	 * add String search values for field buy_systemname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void buy_systemname(String[] values, byte compare, byte andor);
	
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
	 * add Numeric search values for field total_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void total_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field total_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void total_volume(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_total, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_total(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_total
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_total(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_total, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_total(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_total
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_total(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field trade_profit, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void trade_profit(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field trade_profit
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void trade_profit(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field trade_jumps, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void trade_jumps(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field trade_jumps
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void trade_jumps(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field trade_profit_per_jump, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void trade_profit_per_jump(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field trade_profit_per_jump
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void trade_profit_per_jump(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field trade_runs, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void trade_runs(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field trade_runs
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void trade_runs(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field trade_total_jumps, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void trade_total_jumps(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field trade_total_jumps
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void trade_total_jumps(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field trade_singlerunprofit, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void trade_singlerunprofit(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field trade_singlerunprofit
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void trade_singlerunprofit(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field trade_maxunits_per_run, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void trade_maxunits_per_run(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field trade_maxunits_per_run
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void trade_maxunits_per_run(Double[] values, byte[] operators, byte andor);
	
}
