/*
 * IOrder_historysearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
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
 * Search Interface for Order_history table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IOrder_historysearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param order_historyPK: Order_history primery key
     */
    public void addPrimarykey(IOrder_historyPK order_historyPK);

	/**
	 * add Date search values for field date, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void date(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field date
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void date(Date[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field average, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void average(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field average
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void average(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field highest, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void highest(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field highest
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void highest(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field lowest, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void lowest(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field lowest
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void lowest(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void volume(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field order_count, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void order_count(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field order_count
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void order_count(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch evetype tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetype(IEvetypesearch evetypesearch);
	
	/**
   * foreign key
	 * set subsearch region tablesearch
	 * @param regionsearch: IRegionsearch
	 */
	public void region(IRegionsearch regionsearch);
	
}
