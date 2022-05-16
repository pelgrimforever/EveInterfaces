/*
 * IContractitemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
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
 * Search Interface for Contractitem table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IContractitemsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param contractitemPK: Contractitem primery key
     */
    public void addPrimarykey(IContractitemPK contractitemPK);

	/**
	 * add Numeric search values for field id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void id(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void id(long[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field blueprint_copy
	 * @param value: true or false
	 */
	public void blueprint_copy(Boolean value);
	
	/**
	 * add Boolean search values for field included
	 * @param value: true or false
	 */
	public void included(Boolean value);
	
	/**
	 * add Numeric search values for field quantity, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void quantity(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field quantity
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void quantity(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field material_efficiency, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void material_efficiency(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field material_efficiency
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void material_efficiency(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field time_efficiency, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void time_efficiency(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field time_efficiency
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void time_efficiency(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch evetype tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetype(IEvetypesearch evetypesearch);
	
	/**
   * foreign key
	 * set subsearch contract tablesearch
	 * @param contractsearch: IContractsearch
	 */
	public void contract(IContractsearch contractsearch);
	
}
