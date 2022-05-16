/*
 * IView_userbpsearch.java
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
import eve.interfaces.searchentity.*;

/**
 * Search Interface for View_userbp table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_userbpsearch extends Tablesearcher {

	/**
	 * add String search values for field blueprintname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void blueprintname(String[] values);
	
	/**
	 * add String search values for field blueprintname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void blueprintname(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field typegroupname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void typegroupname(String[] values);
	
	/**
	 * add String search values for field typegroupname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void typegroupname(String[] values, byte compare, byte andor);
	
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
	 * add Numeric search values for field bp, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void bp(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field bp
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void bp(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field serialnumber, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void serialnumber(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field serialnumber
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void serialnumber(Double[] values, byte[] operators, byte andor);
	
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
	
}
