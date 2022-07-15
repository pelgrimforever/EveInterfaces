/*
 * IView_contractswithprofitsearch.java
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
 * Search Interface for View_contractswithprofit table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_contractswithprofitsearch extends Tablesearcher {

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
	 * add Timestamp search values for field date_expired, default OR operator is used
	 * @param values: Array of timestamp search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void date_expired(Timestamp[] values, byte[] operators);
	
	/**
	 * add Timestamp search values for field date_expired
	 * @param values: Array of timestamp search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void date_expired(Timestamp[] values, byte[] operators, byte andor);
	
	/**
	 * add Timestamp search values for field date_issued, default OR operator is used
	 * @param values: Array of timestamp search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void date_issued(Timestamp[] values, byte[] operators);
	
	/**
	 * add Timestamp search values for field date_issued
	 * @param values: Array of timestamp search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void date_issued(Timestamp[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field days_to_complete, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void days_to_complete(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field days_to_complete
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void days_to_complete(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field end_location_id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void end_location_id(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field end_location_id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void end_location_id(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field reward, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void reward(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field reward
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void reward(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field start_location_id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void start_location_id(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field start_location_id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void start_location_id(Double[] values, byte[] operators, byte andor);
	
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
	 * add String search values for field title, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void title(String[] values);
	
	/**
	 * add String search values for field title
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void title(String[] values, byte compare, byte andor);
	
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
	
}
