/*
 * IView_evetypessearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 18.11.2021 18:23
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_evetypes table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_evetypessearch extends Tablesearcher {

	/**
	 * add Numeric search values for field category, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void category(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field category
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void category(Double[] values, byte[] operators, byte andor);
	
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
	
}
