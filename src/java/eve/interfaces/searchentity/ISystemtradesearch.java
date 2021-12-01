/*
 * ISystemtradesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.10.2021 10:3
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
 * Search Interface for Systemtrade table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISystemtradesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param systemtradePK: Systemtrade primery key
     */
    public void addPrimarykey(ISystemtradePK systemtradePK);

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
	 * add Numeric search values for field total_cargo_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void total_cargo_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field total_cargo_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void total_cargo_volume(Double[] values, byte[] operators, byte andor);
	
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
   * foreign key
	 * set subsearch systemSell_system tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void systemSell_system(ISystemsearch systemsearch);
	
	/**
   * foreign key
	 * set subsearch systemBuy_system tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void systemBuy_system(ISystemsearch systemsearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch systemtrade_order tablesearch
     * @param systemtrade_ordersearch: ISystemtrade_ordersearch
     */
    public void systemtrade_order(ISystemtrade_ordersearch systemtrade_ordersearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch orders tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void relorders1(IOrderssearch orderssearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch orders tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void relorders2(IOrderssearch orderssearch);
    
}
