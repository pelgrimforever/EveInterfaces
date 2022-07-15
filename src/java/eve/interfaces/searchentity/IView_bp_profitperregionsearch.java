/*
 * IView_bp_profitperregionsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_bp_profitperregion table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_bp_profitperregionsearch extends Tablesearcher {

	/**
	 * add Numeric search values for field categoryid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void categoryid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field categoryid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void categoryid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field categoryname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void categoryname(String[] values);
	
	/**
	 * add String search values for field categoryname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void categoryname(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field typegroupid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void typegroupid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field typegroupid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void typegroupid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field typegroupname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void typegroupname(String[] values);
	
	/**
	 * add String search values for field typegroupname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void typegroupname(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void id(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void id(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field estimatedproductioncost, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void estimatedproductioncost(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field estimatedproductioncost
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void estimatedproductioncost(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field region, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void region(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field region
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void region(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field regionname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void regionname(String[] values);
	
	/**
	 * add String search values for field regionname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void regionname(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field year, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void year(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field year
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void year(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field month, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void month(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field month
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void month(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field average, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void average(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field average
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void average(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field highest, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void highest(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field highest
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void highest(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field lowest, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void lowest(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field lowest
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void lowest(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void volume(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field percprofit, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void percprofit(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field percprofit
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void percprofit(Double[] values, byte[] operators, byte andor);
	
}
