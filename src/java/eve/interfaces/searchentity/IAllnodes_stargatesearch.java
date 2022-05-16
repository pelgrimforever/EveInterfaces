/*
 * IAllnodes_stargatesearch.java
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
 * Search Interface for Allnodes_stargate table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IAllnodes_stargatesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param allnodes_stargatePK: Allnodes_stargate primery key
     */
    public void addPrimarykey(IAllnodes_stargatePK allnodes_stargatePK);

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
	 * add Numeric search values for field to_system, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void to_system(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field to_system
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void to_system(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field deadend
	 * @param value: true or false
	 */
	public void deadend(Boolean value);
	
}
