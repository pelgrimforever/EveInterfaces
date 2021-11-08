/*
 * IView_systemtradesearch.java
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
 * Search Interface for View_systemtrade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_systemtradesearch extends Tablesearcher {

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
	
	/**
	 * add Numeric search values for field totalsell, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void totalsell(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field totalsell
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void totalsell(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field totalbuy, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void totalbuy(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field totalbuy
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void totalbuy(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field total_cargo_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void total_cargo_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field total_cargo_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void total_cargo_volume(Double[] values, byte[] operators, byte andor);
	
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
	 * add String search values for field regionsellname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void regionsellname(String[] values);
	
	/**
	 * add String search values for field regionsellname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void regionsellname(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field systemsellname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void systemsellname(String[] values);
	
	/**
	 * add String search values for field systemsellname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void systemsellname(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field regionbuyname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void regionbuyname(String[] values);
	
	/**
	 * add String search values for field regionbuyname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void regionbuyname(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field systembuyname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void systembuyname(String[] values);
	
	/**
	 * add String search values for field systembuyname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void systembuyname(String[] values, byte compare, byte andor);
	
}
