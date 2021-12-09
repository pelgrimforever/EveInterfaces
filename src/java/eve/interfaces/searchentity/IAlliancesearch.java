/*
 * IAlliancesearch.java
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
 * Search Interface for Alliance table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IAlliancesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param alliancePK: Alliance primery key
     */
    public void addPrimarykey(IAlliancePK alliancePK);

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
	 * add String search values for field name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void name(String[] values);
	
	/**
	 * add String search values for field name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void name(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field creator, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void creator(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field creator
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void creator(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Timestamp search values for field date_founded, default OR operator is used
	 * @param values: Array of timestamp search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void date_founded(Timestamp[] values, byte[] operators);
	
	/**
	 * add Timestamp search values for field date_founded
	 * @param values: Array of timestamp search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void date_founded(Timestamp[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field ticker, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void ticker(String[] values);
	
	/**
	 * add String search values for field ticker
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void ticker(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field faction_id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void faction_id(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field faction_id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void faction_id(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch corporationCreator_corporation tablesearch
	 * @param corporationsearch: ICorporationsearch
	 */
	public void corporationCreator_corporation(ICorporationsearch corporationsearch);
	
	/**
   * foreign key
	 * set subsearch corporationExecutor_corporation tablesearch
	 * @param corporationsearch: ICorporationsearch
	 */
	public void corporationExecutor_corporation(ICorporationsearch corporationsearch);
	
}
