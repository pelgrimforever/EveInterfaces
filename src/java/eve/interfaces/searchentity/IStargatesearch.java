/*
 * IStargatesearch.java
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
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for Stargate table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IStargatesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param stargatePK: Stargate primery key
     */
    public void addPrimarykey(IStargatePK stargatePK);

	/**
	 * add Numeric search values for field id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void id(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void id(long[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field to_stargate, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void to_stargate(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field to_stargate
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void to_stargate(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field x, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void x(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field x
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void x(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field y, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void y(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field y
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void y(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field z, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void z(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field z
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void z(Double[] values, byte[] operators, byte andor);
	
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
	
	/**
   * foreign key
	 * set subsearch systemSystem tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void systemSystem(ISystemsearch systemsearch);
	
	/**
   * foreign key
	 * set subsearch systemTo_system tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void systemTo_system(ISystemsearch systemsearch);
	
}
