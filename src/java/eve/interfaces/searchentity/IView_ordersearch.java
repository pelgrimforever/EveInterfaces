/*
 * IView_ordersearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.11.2021 14:51
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_order table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_ordersearch extends Tablesearcher {

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
	 * add Boolean search values for field isopen
	 * @param value: true or false
	 */
	public void isopen(Boolean value);
	
	/**
	 * add Numeric search values for field system, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void system(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field system
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void system(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field page, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void page(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field page
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void page(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field stationid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void stationid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field stationid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void stationid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field stationname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void stationname(String[] values);
	
	/**
	 * add String search values for field stationname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void stationname(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field locationid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void locationid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field locationid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void locationid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field locationname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void locationname(String[] values);
	
	/**
	 * add String search values for field locationname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void locationname(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field systemname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void systemname(String[] values);
	
	/**
	 * add String search values for field systemname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void systemname(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field security_status, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void security_status(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field security_status
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void security_status(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field constellation, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void constellation(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field constellation
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void constellation(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field constellationname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void constellationname(String[] values);
	
	/**
	 * add String search values for field constellationname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void constellationname(String[] values, byte compare, byte andor);
	
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
	
}
