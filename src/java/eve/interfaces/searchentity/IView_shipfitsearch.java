/*
 * IView_shipfitsearch.java
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
 * Search Interface for View_shipfit table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_shipfitsearch extends Tablesearcher {

	/**
	 * add String search values for field shiptype, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void shiptype(String[] values);
	
	/**
	 * add String search values for field shiptype
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void shiptype(String[] values, byte compare, byte andor);
	
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
	 * add String search values for field shipname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void shipname(String[] values);
	
	/**
	 * add String search values for field shipname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void shipname(String[] values, byte compare, byte andor);
	
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
	
}
