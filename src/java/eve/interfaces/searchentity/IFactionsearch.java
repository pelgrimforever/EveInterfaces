/*
 * IFactionsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.11.2021 14:51
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
 * Search Interface for Faction table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IFactionsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param factionPK: Faction primery key
     */
    public void addPrimarykey(IFactionPK factionPK);

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
	 * add String search values for field description, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void description(String[] values);
	
	/**
	 * add String search values for field description
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void description(String[] values, byte compare, byte andor);
	
	/**
	 * add Boolean search values for field is_unique
	 * @param value: true or false
	 */
	public void is_unique(Boolean value);
	
	/**
	 * add Numeric search values for field size_factor, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void size_factor(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field size_factor
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void size_factor(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field station_count, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void station_count(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field station_count
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void station_count(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field station_system_count, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void station_system_count(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field station_system_count
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void station_system_count(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field corporation, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void corporation(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field corporation
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void corporation(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field militia_corporation, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void militia_corporation(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field militia_corporation
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void militia_corporation(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch system tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void system(ISystemsearch systemsearch);
	
}
