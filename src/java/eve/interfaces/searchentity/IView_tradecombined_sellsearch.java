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
import eve.interfaces.searchentity.*;

public interface IView_tradecombined_sellsearch extends Tablesearcher {

	public void sell_system(Double[] values, byte[] operators);
	
	public void sell_system(Double[] values, byte[] operators, byte andor);
	
	public void buy_system(Double[] values, byte[] operators);
	
	public void buy_system(Double[] values, byte[] operators, byte andor);
	
	public void orderamount(Double[] values, byte[] operators);
	
	public void orderamount(Double[] values, byte[] operators, byte andor);
	
	public void buy_order_value(Double[] values, byte[] operators);
	
	public void buy_order_value(Double[] values, byte[] operators, byte andor);
	
	public void sell_order_value(Double[] values, byte[] operators);
	
	public void sell_order_value(Double[] values, byte[] operators, byte andor);
	
	public void profit(Double[] values, byte[] operators);
	
	public void profit(Double[] values, byte[] operators, byte andor);
	
	public void sell_locationid(Double[] values, byte[] operators);
	
	public void sell_locationid(Double[] values, byte[] operators, byte andor);
	
	public void sell_stationname(String[] values);
	
	public void sell_stationname(String[] values, byte compare, byte andor);
	
	public void evetype_id(Double[] values, byte[] operators);
	
	public void evetype_id(Double[] values, byte[] operators, byte andor);
	
	public void evetype_name(String[] values);
	
	public void evetype_name(String[] values, byte compare, byte andor);
	
	public void packaged_volume(Double[] values, byte[] operators);
	
	public void packaged_volume(Double[] values, byte[] operators, byte andor);
	
	public void sell_id(Double[] values, byte[] operators);
	
	public void sell_id(Double[] values, byte[] operators, byte andor);
	
	public void sell_volume_total(Double[] values, byte[] operators);
	
	public void sell_volume_total(Double[] values, byte[] operators, byte andor);
	
	public void sell_volume_remain(Double[] values, byte[] operators);
	
	public void sell_volume_remain(Double[] values, byte[] operators, byte andor);
	
	public void sell_min_volume(Double[] values, byte[] operators);
	
	public void sell_min_volume(Double[] values, byte[] operators, byte andor);
	
	public void sell_updated(Double[] values, byte[] operators);
	
	public void sell_updated(Double[] values, byte[] operators, byte andor);
	
	public void buy_id(Double[] values, byte[] operators);
	
	public void buy_id(Double[] values, byte[] operators, byte andor);
	
	public void sell_price(Double[] values, byte[] operators);
	
	public void sell_price(Double[] values, byte[] operators, byte andor);
	
	public void buy_volume_total(Double[] values, byte[] operators);
	
	public void buy_volume_total(Double[] values, byte[] operators, byte andor);
	
	public void buy_volume_remain(Double[] values, byte[] operators);
	
	public void buy_volume_remain(Double[] values, byte[] operators, byte andor);
	
	public void buy_min_volume(Double[] values, byte[] operators);
	
	public void buy_min_volume(Double[] values, byte[] operators, byte andor);
	
	public void buy_updated(Double[] values, byte[] operators);
	
	public void buy_updated(Double[] values, byte[] operators, byte andor);
	
	public void buy_price(Double[] values, byte[] operators);
	
	public void buy_price(Double[] values, byte[] operators, byte andor);
	
	public void buy_locationid(Double[] values, byte[] operators);
	
	public void buy_locationid(Double[] values, byte[] operators, byte andor);
	
	public void buy_stationname(String[] values);
	
	public void buy_stationname(String[] values, byte compare, byte andor);
	
}
