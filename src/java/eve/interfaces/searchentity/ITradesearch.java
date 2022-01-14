/*
 * ITradesearch.java
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
 * Search Interface for Trade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ITradesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param tradePK: Trade primery key
     */
    public void addPrimarykey(ITradePK tradePK);

	/**
	 * add Numeric search values for field total_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void total_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field total_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void total_volume(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field jumps, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumps(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumps
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumps(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field runs, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void runs(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field runs
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void runs(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field total_jumps, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void total_jumps(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field total_jumps
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void total_jumps(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field profit_per_jump, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void profit_per_jump(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field profit_per_jump
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void profit_per_jump(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field singlerun_profit_per_jump, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void singlerun_profit_per_jump(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field singlerun_profit_per_jump
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void singlerun_profit_per_jump(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field maxunits_per_run, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void maxunits_per_run(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field maxunits_per_run
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void maxunits_per_run(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field jumpslowsec, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumpslowsec(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumpslowsec
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumpslowsec(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field jumpsnullsec, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumpsnullsec(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumpsnullsec
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumpsnullsec(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch ordersSell_order_id tablesearch
	 * @param orderssearch: IOrderssearch
	 */
	public void ordersSell_order_id(IOrderssearch orderssearch);
	
	/**
   * foreign key
	 * set subsearch ordersBuy_order_id tablesearch
	 * @param orderssearch: IOrderssearch
	 */
	public void ordersBuy_order_id(IOrderssearch orderssearch);
	
}
