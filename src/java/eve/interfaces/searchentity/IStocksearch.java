/*
 * IStocksearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 18.8.2021 11:31
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
 * Search Interface for Stock table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IStocksearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param stockPK: Stock primery key
     */
    public void addPrimarykey(IStockPK stockPK);

	/**
	 * add String search values for field username, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void username(String[] values);
	
	/**
	 * add String search values for field username
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void username(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field amount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void amount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field amount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void amount(Double[] values, byte[] operators, byte andor);
	
	/**
	* set subsearch evetype tablesearch
	* @param evetypesearch: IEvetypesearch
	*/
	public void evetype(IEvetypesearch evetypesearch);
	
    /**
     * set subsearch stocktrade tablesearch
     * @param stocktradesearch: IStocktradesearch
     */
    public void stocktrade(IStocktradesearch stocktradesearch);
    
}
