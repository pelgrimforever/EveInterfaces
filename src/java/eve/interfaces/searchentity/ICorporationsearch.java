/*
 * ICorporationsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.11.2021 15:45
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
 * Search Interface for Corporation table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ICorporationsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param corporationPK: Corporation primery key
     */
    public void addPrimarykey(ICorporationPK corporationPK);

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
	 * add Numeric search values for field ceo, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void ceo(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field ceo
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void ceo(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field member_count, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void member_count(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field member_count
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void member_count(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field tax_rate, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void tax_rate(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field tax_rate
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void tax_rate(Double[] values, byte[] operators, byte andor);
	
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
	 * add Numeric search values for field shares, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void shares(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field shares
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void shares(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field url, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void url(String[] values);
	
	/**
	 * add String search values for field url
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void url(String[] values, byte compare, byte andor);
	
	/**
	 * add Boolean search values for field war_eligible
	 * @param value: true or false
	 */
	public void war_eligible(Boolean value);
	
	/**
   * foreign key
	 * set subsearch station tablesearch
	 * @param stationsearch: IStationsearch
	 */
	public void station(IStationsearch stationsearch);
	
	/**
   * foreign key
	 * set subsearch faction tablesearch
	 * @param factionsearch: IFactionsearch
	 */
	public void faction(IFactionsearch factionsearch);
	
	/**
   * foreign key
	 * set subsearch alliance tablesearch
	 * @param alliancesearch: IAlliancesearch
	 */
	public void alliance(IAlliancesearch alliancesearch);
	
}
