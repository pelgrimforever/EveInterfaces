/*
 * IView_tradecombinedsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.11.2021 14:30
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_tradecombined table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_tradecombinedsearch extends Tablesearcher {

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
	 * add Numeric search values for field orders, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void orders(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field orders
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void orders(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field totalamount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void totalamount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field totalamount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void totalamount(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buy_order_total, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_order_total(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_order_total
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_order_total(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_order_total, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_order_total(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_order_total
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_order_total(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field totalprofit, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void totalprofit(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field totalprofit
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void totalprofit(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field trade_jumpslowsec, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void trade_jumpslowsec(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field trade_jumpslowsec
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void trade_jumpslowsec(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field trade_jumpsnullsec, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void trade_jumpsnullsec(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field trade_jumpsnullsec
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void trade_jumpsnullsec(Double[] values, byte[] operators, byte andor);
	
}
