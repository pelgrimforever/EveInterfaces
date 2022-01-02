/*
 * IView_systemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.11.2021 19:35
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_system table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_systemsearch extends Tablesearcher {

	/**
	 * add Numeric search values for field jumpssafe, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumpssafe(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumpssafe
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumpssafe(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field jumpssafelowsec, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumpssafelowsec(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumpssafelowsec
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumpssafelowsec(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field jumpssafenullsec, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumpssafenullsec(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumpssafenullsec
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumpssafenullsec(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field system_start, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void system_start(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field system_start
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void system_start(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field system_end, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void system_end(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field system_end
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void system_end(Double[] values, byte[] operators, byte andor);
	
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
	 * add String search values for field security_class, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void security_class(String[] values);
	
	/**
	 * add String search values for field security_class
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void security_class(String[] values, byte compare, byte andor);
	
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
	 * add Numeric search values for field star_id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void star_id(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field star_id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void star_id(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field noaccess
	 * @param value: true or false
	 */
	public void noaccess(Boolean value);
	
	/**
	 * add Boolean search values for field isconstellationborder
	 * @param value: true or false
	 */
	public void isconstellationborder(Boolean value);
	
	/**
	 * add Boolean search values for field isregionborder
	 * @param value: true or false
	 */
	public void isregionborder(Boolean value);
	
	/**
	 * add Numeric search values for field security_island, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void security_island(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field security_island
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void security_island(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Date search values for field downloaddate, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void downloaddate(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field downloaddate
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void downloaddate(Date[] values, byte[] operators, byte andor);
	
}
