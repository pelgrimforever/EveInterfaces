/*
 * IRoutetypesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 8.5.2021 19:33
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
 * Search Interface for Routetype table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IRoutetypesearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param routetypePK: Routetype primery key
     */
    public void addPrimarykey(IRoutetypePK routetypePK);

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
	* set subsearch security_island tablesearch
	* @param security_islandsearch: ISecurity_islandsearch
	*/
	public void security_island(ISecurity_islandsearch security_islandsearch);
	
    /**
     * set subsearch route tablesearch
     * @param routesearch: IRoutesearch
     */
    public void route(IRoutesearch routesearch);
    
    /**
     * set relational subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void system(ISystemsearch systemsearch);
    
}
