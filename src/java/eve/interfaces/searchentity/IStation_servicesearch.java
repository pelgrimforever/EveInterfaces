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

public interface IStation_servicesearch extends Tablesearcher {

    public void addPrimarykey(IStation_servicePK station_servicePK);

	public void service(String[] values);
	
	public void service(String[] values, byte compare, byte andor);
	
	public void station(IStationsearch stationsearch);
	
}
