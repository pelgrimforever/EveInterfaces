/*
 * IJson_orderssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.5.2021 13:35
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
 * Search Interface for Json_orders table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IJson_orderssearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param json_ordersPK: Json_orders primery key
     */
    public void addPrimarykey(IJson_ordersPK json_ordersPK);

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
	 * add String search values for field json, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void json(String[] values);
	
	/**
	 * add String search values for field json
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void json(String[] values, byte compare, byte andor);
	
}
