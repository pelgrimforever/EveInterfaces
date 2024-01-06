/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

public interface IStationsearch extends Tablesearcher {

    public void addPrimarykey(IStationPK stationPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void office_rental_cost(Double[] values, byte[] operators);
	
	public void office_rental_cost(Double[] values, byte[] operators, byte andor);
	
	public void reprocessing_efficiency(Double[] values, byte[] operators);
	
	public void reprocessing_efficiency(Double[] values, byte[] operators, byte andor);
	
	public void reprocessing_stations_take(Double[] values, byte[] operators);
	
	public void reprocessing_stations_take(Double[] values, byte[] operators, byte andor);
	
	public void max_dockable_ship_volume(Double[] values, byte[] operators);
	
	public void max_dockable_ship_volume(Double[] values, byte[] operators, byte andor);
	
	public void owner(Double[] values, byte[] operators);
	
	public void owner(Double[] values, byte[] operators, byte andor);
	
	public void downloaddate(Date[] values, byte[] operators);
	
	public void downloaddate(Date[] values, byte[] operators, byte andor);
	
	public void race(IRacesearch racesearch);
	
	public void evetype(IEvetypesearch evetypesearch);
	
	public void system(ISystemsearch systemsearch);
	
    public void station_service(IStation_servicesearch station_servicesearch);
    
}
