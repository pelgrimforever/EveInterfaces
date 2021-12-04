/*
 * IConstellation_neighboursearch.java
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
 * Search Interface for Constellation_neighbour table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IConstellation_neighboursearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param constellation_neighbourPK: Constellation_neighbour primery key
     */
    public void addPrimarykey(IConstellation_neighbourPK constellation_neighbourPK);

	/**
   * foreign key
	 * set subsearch constellationNeighbour tablesearch
	 * @param constellationsearch: IConstellationsearch
	 */
	public void constellationNeighbour(IConstellationsearch constellationsearch);
	
	/**
   * foreign key
	 * set subsearch constellationConstellation tablesearch
	 * @param constellationsearch: IConstellationsearch
	 */
	public void constellationConstellation(IConstellationsearch constellationsearch);
	
}
