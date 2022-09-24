/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

public interface IView_ordersearch extends Tablesearcher {

	public void id(Double[] values, byte[] operators);
	
	public void id(Double[] values, byte[] operators, byte andor);
	
	public void isopen(Boolean value);
	
	public void system(Double[] values, byte[] operators);
	
	public void system(Double[] values, byte[] operators, byte andor);
	
	public void evetype(Double[] values, byte[] operators);
	
	public void evetype(Double[] values, byte[] operators, byte andor);
	
	public void volume_total(Double[] values, byte[] operators);
	
	public void volume_total(Double[] values, byte[] operators, byte andor);
	
	public void volume_remain(Double[] values, byte[] operators);
	
	public void volume_remain(Double[] values, byte[] operators, byte andor);
	
	public void range(String[] values);
	
	public void range(String[] values, byte compare, byte andor);
	
	public void range_number(Double[] values, byte[] operators);
	
	public void range_number(Double[] values, byte[] operators, byte andor);
	
	public void price(Double[] values, byte[] operators);
	
	public void price(Double[] values, byte[] operators, byte andor);
	
	public void min_volume(Double[] values, byte[] operators);
	
	public void min_volume(Double[] values, byte[] operators, byte andor);
	
	public void location(Double[] values, byte[] operators);
	
	public void location(Double[] values, byte[] operators, byte andor);
	
	public void is_buy_order(Boolean value);
	
	public void issued(Timestamp[] values, byte[] operators);
	
	public void issued(Timestamp[] values, byte[] operators, byte andor);
	
	public void duration(Double[] values, byte[] operators);
	
	public void duration(Double[] values, byte[] operators, byte andor);
	
	public void page(Double[] values, byte[] operators);
	
	public void page(Double[] values, byte[] operators, byte andor);
	
	public void stationid(Double[] values, byte[] operators);
	
	public void stationid(Double[] values, byte[] operators, byte andor);
	
	public void stationname(String[] values);
	
	public void stationname(String[] values, byte compare, byte andor);
	
	public void locationid(Double[] values, byte[] operators);
	
	public void locationid(Double[] values, byte[] operators, byte andor);
	
	public void locationname(String[] values);
	
	public void locationname(String[] values, byte compare, byte andor);
	
	public void systemname(String[] values);
	
	public void systemname(String[] values, byte compare, byte andor);
	
	public void security_status(Double[] values, byte[] operators);
	
	public void security_status(Double[] values, byte[] operators, byte andor);
	
	public void constellation(Double[] values, byte[] operators);
	
	public void constellation(Double[] values, byte[] operators, byte andor);
	
	public void constellationname(String[] values);
	
	public void constellationname(String[] values, byte compare, byte andor);
	
	public void region(Double[] values, byte[] operators);
	
	public void region(Double[] values, byte[] operators, byte andor);
	
	public void regionname(String[] values);
	
	public void regionname(String[] values, byte compare, byte andor);
	
	public void evetypename(String[] values);
	
	public void evetypename(String[] values, byte compare, byte andor);
	
	public void packaged_volume(Double[] values, byte[] operators);
	
	public void packaged_volume(Double[] values, byte[] operators, byte andor);
	
	public void avg_buyorder(Double[] values, byte[] operators);
	
	public void avg_buyorder(Double[] values, byte[] operators, byte andor);
	
	public void avg_sellorder(Double[] values, byte[] operators);
	
	public void avg_sellorder(Double[] values, byte[] operators, byte andor);
	
}
