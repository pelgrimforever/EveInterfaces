/*
 * IView_contractitemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_contractitem table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_contractitemsearch extends Tablesearcher {

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
	 * add Numeric search values for field contract, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void contract(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field contract
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void contract(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field blueprint_copy
	 * @param value: true or false
	 */
	public void blueprint_copy(Boolean value);
	
	/**
	 * add Boolean search values for field included
	 * @param value: true or false
	 */
	public void included(Boolean value);
	
	/**
	 * add Numeric search values for field quantity, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void quantity(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field quantity
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void quantity(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field material_efficiency, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void material_efficiency(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field material_efficiency
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void material_efficiency(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field time_efficiency, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void time_efficiency(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field time_efficiency
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void time_efficiency(Double[] values, byte[] operators, byte andor);
	
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
	 * add String search values for field typename, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void typename(String[] values);
	
	/**
	 * add String search values for field typename
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void typename(String[] values, byte compare, byte andor);
	
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
	 * add String search values for field groupname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void groupname(String[] values);
	
	/**
	 * add String search values for field groupname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void groupname(String[] values, byte compare, byte andor);
	
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
	 * add Numeric search values for field avg_buyorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void avg_buyorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field avg_buyorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void avg_buyorder(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field min_buyorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void min_buyorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field min_buyorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void min_buyorder(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field max_buyorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void max_buyorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field max_buyorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void max_buyorder(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field avg_sellorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void avg_sellorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field avg_sellorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void avg_sellorder(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field min_selorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void min_selorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field min_selorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void min_selorder(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field max_selorder, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void max_selorder(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field max_selorder
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void max_selorder(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field order_count, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void order_count(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field order_count
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void order_count(Double[] values, byte[] operators, byte andor);
	
}
