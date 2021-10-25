/*
 * IStocktradesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2021 15:16
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
 * Search Interface for Stocktrade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IStocktradesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param stocktradePK: Stocktrade primery key
     */
    public void addPrimarykey(IStocktradePK stocktradePK);

	/**
	 * add Numeric search values for field orderid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void orderid(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field orderid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void orderid(long[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sellamount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sellamount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sellamount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sellamount(Double[] values, byte[] operators, byte andor);
	
	/**
	* set subsearch stock tablesearch
	* @param stocksearch: IStocksearch
	*/
	public void stock(IStocksearch stocksearch);
	
}
