/*
 * ITmp_system_jumpssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.5.2021 13:35
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
 * Search Interface for Tmp_system_jumps table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ITmp_system_jumpssearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param tmp_system_jumpsPK: Tmp_system_jumps primery key
     */
    public void addPrimarykey(ITmp_system_jumpsPK tmp_system_jumpsPK);

	/**
	 * add Numeric search values for field system, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void system(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field system
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void system(long[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field jump, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jump(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jump
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jump(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field maxjumps, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void maxjumps(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field maxjumps
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void maxjumps(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field previoussystem, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void previoussystem(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field previoussystem
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void previoussystem(Double[] values, byte[] operators, byte andor);
	
}
