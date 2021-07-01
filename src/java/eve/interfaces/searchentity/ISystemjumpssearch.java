/*
 * ISystemjumpssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.ITablesearch;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for Systemjumps table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISystemjumpssearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param systemjumpsPK: Systemjumps primery key
     */
    public void addPrimarykey(ISystemjumpsPK systemjumpsPK);

	/**
	 * add Numeric search values for field jumps, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumps(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumps
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumps(Double[] values, byte[] operators, byte andor);
	
	/**
	* set subsearch systemSystem_end tablesearch
	* @param systemsearch: ISystemsearch
	*/
	public void systemSystem_end(ISystemsearch systemsearch);
	
	/**
	* set subsearch systemSystem_start tablesearch
	* @param systemsearch: ISystemsearch
	*/
	public void systemSystem_start(ISystemsearch systemsearch);
	
}
