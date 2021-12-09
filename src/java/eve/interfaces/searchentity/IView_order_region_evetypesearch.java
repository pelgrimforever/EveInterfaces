/*
 * IView_order_region_evetypesearch.java
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
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_order_region_evetype table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_order_region_evetypesearch extends Tablesearcher {

	/**
	 * add Numeric search values for field region, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void region(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field region
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void region(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field evetype, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void evetype(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field evetype
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void evetype(Double[] values, byte[] operators, byte andor);
	
}
