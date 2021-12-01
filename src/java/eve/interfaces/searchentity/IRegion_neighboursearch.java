/*
 * IRegion_neighboursearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.10.2021 10:3
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
 * Search Interface for Region_neighbour table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IRegion_neighboursearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param region_neighbourPK: Region_neighbour primery key
     */
    public void addPrimarykey(IRegion_neighbourPK region_neighbourPK);

	/**
   * foreign key
	 * set subsearch regionRegion tablesearch
	 * @param regionsearch: IRegionsearch
	 */
	public void regionRegion(IRegionsearch regionsearch);
	
	/**
   * foreign key
	 * set subsearch regionNeighbour tablesearch
	 * @param regionsearch: IRegionsearch
	 */
	public void regionNeighbour(IRegionsearch regionsearch);
	
}
