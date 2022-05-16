/*
 * ISystemactivitysearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.3.2022 17:21
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
 * Search Interface for Systemactivity table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISystemactivitysearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param systemactivityPK: Systemactivity primery key
     */
    public void addPrimarykey(ISystemactivityPK systemactivityPK);

	/**
	 * add Timestamp search values for field timeslot, default OR operator is used
	 * @param values: Array of timestamp search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void timeslot(Timestamp[] values, byte[] operators);
	
	/**
	 * add Timestamp search values for field timeslot
	 * @param values: Array of timestamp search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void timeslot(Timestamp[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field ship_jumps, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void ship_jumps(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field ship_jumps
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void ship_jumps(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field npc_kills, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void npc_kills(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field npc_kills
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void npc_kills(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field ship_kills, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void ship_kills(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field ship_kills
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void ship_kills(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field pod_kills, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void pod_kills(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field pod_kills
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void pod_kills(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch system tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void system(ISystemsearch systemsearch);
	
}
