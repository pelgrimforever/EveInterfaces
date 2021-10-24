/*
 * IRoutesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:40
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
 * Search Interface for Route table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IRoutesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param routePK: Route primery key
     */
    public void addPrimarykey(IRoutePK routePK);

	/**
	 * add String search values for field jsonroutes, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void jsonroutes(String[] values);
	
	/**
	 * add String search values for field jsonroutes
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void jsonroutes(String[] values, byte compare, byte andor);
	
	/**
	* set subsearch routetype tablesearch
	* @param routetypesearch: IRoutetypesearch
	*/
	public void routetype(IRoutetypesearch routetypesearch);
	
	/**
	* set subsearch system tablesearch
	* @param systemsearch: ISystemsearch
	*/
	public void system(ISystemsearch systemsearch);
	
}
