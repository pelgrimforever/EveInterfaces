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

public interface IView_tradeorders_lowsecsearch extends Tablesearcher {

	public void tradevolume(Double[] values, byte[] operators);
	
	public void tradevolume(Double[] values, byte[] operators, byte andor);
	
	public void buy_totalprice(Double[] values, byte[] operators);
	
	public void buy_totalprice(Double[] values, byte[] operators, byte andor);
	
	public void sell_totalprice(Double[] values, byte[] operators);
	
	public void sell_totalprice(Double[] values, byte[] operators, byte andor);
	
	public void cargo_volume(Double[] values, byte[] operators);
	
	public void cargo_volume(Double[] values, byte[] operators, byte andor);
	
	public void sell_id(Double[] values, byte[] operators);
	
	public void sell_id(Double[] values, byte[] operators, byte andor);
	
	public void sell_system(Double[] values, byte[] operators);
	
	public void sell_system(Double[] values, byte[] operators, byte andor);
	
	public void sell_location(Double[] values, byte[] operators);
	
	public void sell_location(Double[] values, byte[] operators, byte andor);
	
	public void sell_evetype(Double[] values, byte[] operators);
	
	public void sell_evetype(Double[] values, byte[] operators, byte andor);
	
	public void sell_packaged_volume(Double[] values, byte[] operators);
	
	public void sell_packaged_volume(Double[] values, byte[] operators, byte andor);
	
	public void sell_volume_remain(Double[] values, byte[] operators);
	
	public void sell_volume_remain(Double[] values, byte[] operators, byte andor);
	
	public void sell_price(Double[] values, byte[] operators);
	
	public void sell_price(Double[] values, byte[] operators, byte andor);
	
	public void security_island(Double[] values, byte[] operators);
	
	public void security_island(Double[] values, byte[] operators, byte andor);
	
	public void buy_id(Double[] values, byte[] operators);
	
	public void buy_id(Double[] values, byte[] operators, byte andor);
	
	public void buy_system(Double[] values, byte[] operators);
	
	public void buy_system(Double[] values, byte[] operators, byte andor);
	
	public void buy_location(Double[] values, byte[] operators);
	
	public void buy_location(Double[] values, byte[] operators, byte andor);
	
	public void buy_volume_remain(Double[] values, byte[] operators);
	
	public void buy_volume_remain(Double[] values, byte[] operators, byte andor);
	
	public void buy_price(Double[] values, byte[] operators);
	
	public void buy_price(Double[] values, byte[] operators, byte andor);
	
	public void jumps(Double[] values, byte[] operators);
	
	public void jumps(Double[] values, byte[] operators, byte andor);
	
	public void jumpslowsec(Double[] values, byte[] operators);
	
	public void jumpslowsec(Double[] values, byte[] operators, byte andor);
	
	public void jumpsnullsec(Double[] values, byte[] operators);
	
	public void jumpsnullsec(Double[] values, byte[] operators, byte andor);
	
}
