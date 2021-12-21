/*
 * IOrder_history_maxdatesearch.java
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
import eve.interfaces.searchentity.*;

/**
 * Search Interface for Order_history_maxdate table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IOrder_history_maxdatesearch extends Tablesearcher {

	/**
	 * add Date search values for field maxdate, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void maxdate(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field maxdate
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void maxdate(Date[] values, byte[] operators, byte andor);
	
}
