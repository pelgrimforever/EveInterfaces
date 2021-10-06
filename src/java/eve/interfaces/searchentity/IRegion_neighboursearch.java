/*
 * IRegion_neighboursearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 6.9.2021 16:29
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
 * Search Interface for Region_neighbour table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IRegion_neighboursearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param region_neighbourPK: Region_neighbour primery key
     */
    public void addPrimarykey(IRegion_neighbourPK region_neighbourPK);

	/**
	* set subsearch regionRegion tablesearch
	* @param regionsearch: IRegionsearch
	*/
	public void regionRegion(IRegionsearch regionsearch);
	
	/**
	* set subsearch regionNeighbour tablesearch
	* @param regionsearch: IRegionsearch
	*/
	public void regionNeighbour(IRegionsearch regionsearch);
	
}
