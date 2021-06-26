/*
 * IStation_servicesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.5.2021 16:2
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
 * Search Interface for Station_service table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IStation_servicesearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param station_servicePK: Station_service primery key
     */
    public void addPrimarykey(IStation_servicePK station_servicePK);

	/**
	 * add String search values for field service, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void service(String[] values);
	
	/**
	 * add String search values for field service
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void service(String[] values, byte compare, byte andor);
	
	/**
	* set subsearch station tablesearch
	* @param stationsearch: IStationsearch
	*/
	public void station(IStationsearch stationsearch);
	
}
