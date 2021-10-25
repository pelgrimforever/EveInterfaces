/*
 * IView_combinedtradesearch.java
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
 * Search Interface for View_combinedtrade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_combinedtradesearch extends Tablesearcher {

	/**
	 * add String search values for field sellregion, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void sellregion(String[] values);
	
	/**
	 * add String search values for field sellregion
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void sellregion(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field buyregion, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void buyregion(String[] values);
	
	/**
	 * add String search values for field buyregion
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void buyregion(String[] values, byte compare, byte andor);
	
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
	 * add String search values for field sellsystem, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void sellsystem(String[] values);
	
	/**
	 * add String search values for field sellsystem
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void sellsystem(String[] values, byte compare, byte andor);
	
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
	 * add String search values for field buysystem, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void buysystem(String[] values);
	
	/**
	 * add String search values for field buysystem
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void buysystem(String[] values, byte compare, byte andor);
	
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
	
	/**
	 * add Numeric search values for field runs, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void runs(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field runs
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void runs(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field ordercount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void ordercount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field ordercount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void ordercount(Double[] values, byte[] operators, byte andor);
	
}
