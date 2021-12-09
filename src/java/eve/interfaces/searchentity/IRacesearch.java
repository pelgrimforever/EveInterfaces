/*
 * IRacesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.11.2021 14:30
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
 * Search Interface for Race table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IRacesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param racePK: Race primery key
     */
    public void addPrimarykey(IRacePK racePK);

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
	 * add String search values for field description, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void description(String[] values);
	
	/**
	 * add String search values for field description
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void description(String[] values, byte compare, byte andor);
	
	/**
   * foreign key
	 * set subsearch faction tablesearch
	 * @param factionsearch: IFactionsearch
	 */
	public void faction(IFactionsearch factionsearch);
	
}
