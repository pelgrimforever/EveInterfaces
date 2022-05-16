/*
 * IView_stocktrade_orderssearch.java
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
 * Search Interface for View_stocktrade_orders table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_stocktrade_orderssearch extends Tablesearcher {

	/**
	 * add String search values for field username, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void username(String[] values);
	
	/**
	 * add String search values for field username
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void username(String[] values, byte compare, byte andor);
	
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
	 * add Numeric search values for field evetypeid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void evetypeid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field evetypeid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void evetypeid(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field orderid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void orderid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field orderid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void orderid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sellamount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sellamount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sellamount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sellamount(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field totalprice, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void totalprice(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field totalprice
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void totalprice(Double[] values, byte[] operators, byte andor);
	
}
