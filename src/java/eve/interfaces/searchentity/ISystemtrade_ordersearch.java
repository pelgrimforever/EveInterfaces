/*
 * ISystemtrade_ordersearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 18.6.2021 14:35
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
 * Search Interface for Systemtrade_order table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISystemtrade_ordersearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param systemtrade_orderPK: Systemtrade_order primery key
     */
    public void addPrimarykey(ISystemtrade_orderPK systemtrade_orderPK);

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
	 * add Numeric search values for field sellprice, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sellprice(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sellprice
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sellprice(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field buyprice, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buyprice(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buyprice
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buyprice(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field profit, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void profit(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field profit
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void profit(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field cargovolume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void cargovolume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field cargovolume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void cargovolume(Double[] values, byte[] operators, byte andor);
	
	/**
	* set subsearch ordersBuy_order tablesearch
	* @param orderssearch: IOrderssearch
	*/
	public void ordersBuy_order(IOrderssearch orderssearch);
	
	/**
	* set subsearch ordersSell_order tablesearch
	* @param orderssearch: IOrderssearch
	*/
	public void ordersSell_order(IOrderssearch orderssearch);
	
	/**
	* set subsearch systemtrade tablesearch
	* @param systemtradesearch: ISystemtradesearch
	*/
	public void systemtrade(ISystemtradesearch systemtradesearch);
	
}
