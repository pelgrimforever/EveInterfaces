/*
 * IAllnodes_systemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.11.2021 15:45
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
 * Search Interface for Allnodes_system table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IAllnodes_systemsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param allnodes_systemPK: Allnodes_system primery key
     */
    public void addPrimarykey(IAllnodes_systemPK allnodes_systemPK);

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
	 * add Boolean search values for field deadend
	 * @param value: true or false
	 */
	public void deadend(Boolean value);
	
}
