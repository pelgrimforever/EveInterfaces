/*
 * IUserbpsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.5.2022 11:11
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
 * Search Interface for Userbp table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IUserbpsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param userbpPK: Userbp primery key
     */
    public void addPrimarykey(IUserbpPK userbpPK);

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
	 * add Numeric search values for field serialnumber, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void serialnumber(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field serialnumber
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void serialnumber(long[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field original
	 * @param value: true or false
	 */
	public void original(Boolean value);
	
	/**
	 * add Numeric search values for field materialefficiency, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void materialefficiency(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field materialefficiency
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void materialefficiency(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field amountproduced, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void amountproduced(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field amountproduced
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void amountproduced(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field totalamount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void totalamount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field totalamount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void totalamount(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field bpprice, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void bpprice(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field bpprice
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void bpprice(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field researchcost, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void researchcost(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field researchcost
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void researchcost(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field stationfee, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void stationfee(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field stationfee
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void stationfee(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch evetype tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetype(IEvetypesearch evetypesearch);
	
}
