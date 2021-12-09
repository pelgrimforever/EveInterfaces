/*
 * IStationsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.11.2021 14:30
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
 * Search Interface for Station table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IStationsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param stationPK: Station primery key
     */
    public void addPrimarykey(IStationPK stationPK);

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
	 * add Numeric search values for field office_rental_cost, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void office_rental_cost(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field office_rental_cost
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void office_rental_cost(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field reprocessing_efficiency, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void reprocessing_efficiency(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field reprocessing_efficiency
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void reprocessing_efficiency(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field reprocessing_stations_take, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void reprocessing_stations_take(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field reprocessing_stations_take
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void reprocessing_stations_take(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field max_dockable_ship_volume, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void max_dockable_ship_volume(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field max_dockable_ship_volume
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void max_dockable_ship_volume(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field owner, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void owner(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field owner
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void owner(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Date search values for field downloaddate, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void downloaddate(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field downloaddate
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void downloaddate(Date[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch race tablesearch
	 * @param racesearch: IRacesearch
	 */
	public void race(IRacesearch racesearch);
	
	/**
   * foreign key
	 * set subsearch evetype tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetype(IEvetypesearch evetypesearch);
	
	/**
   * foreign key
	 * set subsearch system tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void system(ISystemsearch systemsearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch station_service tablesearch
     * @param station_servicesearch: IStation_servicesearch
     */
    public void station_service(IStation_servicesearch station_servicesearch);
    
}
