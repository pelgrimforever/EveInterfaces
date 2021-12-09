/*
 * ITradecombined_sellsearch.java
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
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for Tradecombined_sell table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ITradecombined_sellsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param tradecombined_sellPK: Tradecombined_sell primery key
     */
    public void addPrimarykey(ITradecombined_sellPK tradecombined_sellPK);

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
	 * add Numeric search values for field buy_order_value, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void buy_order_value(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field buy_order_value
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void buy_order_value(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field sell_order_value, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void sell_order_value(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field sell_order_value
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void sell_order_value(Double[] values, byte[] operators, byte andor);
	
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
   * foreign key
	 * set subsearch ordersBuy_order_id tablesearch
	 * @param orderssearch: IOrderssearch
	 */
	public void ordersBuy_order_id(IOrderssearch orderssearch);
	
	/**
   * foreign key
	 * set subsearch ordersSell_order_id tablesearch
	 * @param orderssearch: IOrderssearch
	 */
	public void ordersSell_order_id(IOrderssearch orderssearch);
	
	/**
   * foreign key
	 * set subsearch tradecombined tablesearch
	 * @param tradecombinedsearch: ITradecombinedsearch
	 */
	public void tradecombined(ITradecombinedsearch tradecombinedsearch);
	
}
