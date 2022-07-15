/*
 * ILocationsearch.java
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
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for Location table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ILocationsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param locationPK: Location primery key
     */
    public void addPrimarykey(ILocationPK locationPK);

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
	 * add Boolean search values for field visited
	 * @param value: true or false
	 */
	public void visited(Boolean value);
	
	/**
	 * add Boolean search values for field access
	 * @param value: true or false
	 */
	public void access(Boolean value);
	
	/**
   * foreign key
	 * set subsearch system tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void system(ISystemsearch systemsearch);
	
}
