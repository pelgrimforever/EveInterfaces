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

public interface IView_tradesearch extends Tablesearcher {

	public void sell_regionid(Double[] values, byte[] operators);
	
	public void sell_regionid(Double[] values, byte[] operators, byte andor);
	
	public void sell_regionname(String[] values);
	
	public void sell_regionname(String[] values, byte compare, byte andor);
	
	public void sell_systemid(Double[] values, byte[] operators);
	
	public void sell_systemid(Double[] values, byte[] operators, byte andor);
	
	public void sell_systemname(String[] values);
	
	public void sell_systemname(String[] values, byte compare, byte andor);
	
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
	
	public void buy_id(Double[] values, byte[] operators);
	
	public void buy_id(Double[] values, byte[] operators, byte andor);
	
	public void sell_volume_remain(Double[] values, byte[] operators);
	
	public void sell_volume_remain(Double[] values, byte[] operators, byte andor);
	
	public void sell_price(Double[] values, byte[] operators);
	
	public void sell_price(Double[] values, byte[] operators, byte andor);
	
	public void buy_price(Double[] values, byte[] operators);
	
	public void buy_price(Double[] values, byte[] operators, byte andor);
	
	public void buy_systemid(Double[] values, byte[] operators);
	
	public void buy_systemid(Double[] values, byte[] operators, byte andor);
	
	public void buy_systemname(String[] values);
	
	public void buy_systemname(String[] values, byte compare, byte andor);
	
	public void buy_locationid(Double[] values, byte[] operators);
	
	public void buy_locationid(Double[] values, byte[] operators, byte andor);
	
	public void buy_stationname(String[] values);
	
	public void buy_stationname(String[] values, byte compare, byte andor);
	
	public void buy_volume_remain(Double[] values, byte[] operators);
	
	public void buy_volume_remain(Double[] values, byte[] operators, byte andor);
	
	public void total_volume(Double[] values, byte[] operators);
	
	public void total_volume(Double[] values, byte[] operators, byte andor);
	
	public void sell_total(Double[] values, byte[] operators);
	
	public void sell_total(Double[] values, byte[] operators, byte andor);
	
	public void buy_total(Double[] values, byte[] operators);
	
	public void buy_total(Double[] values, byte[] operators, byte andor);
	
	public void trade_profit(Double[] values, byte[] operators);
	
	public void trade_profit(Double[] values, byte[] operators, byte andor);
	
	public void trade_jumps(Double[] values, byte[] operators);
	
	public void trade_jumps(Double[] values, byte[] operators, byte andor);
	
	public void trade_jumpslowsec(Double[] values, byte[] operators);
	
	public void trade_jumpslowsec(Double[] values, byte[] operators, byte andor);
	
	public void trade_jumpsnullsec(Double[] values, byte[] operators);
	
	public void trade_jumpsnullsec(Double[] values, byte[] operators, byte andor);
	
	public void trade_profit_per_jump(Double[] values, byte[] operators);
	
	public void trade_profit_per_jump(Double[] values, byte[] operators, byte andor);
	
	public void trade_runs(Double[] values, byte[] operators);
	
	public void trade_runs(Double[] values, byte[] operators, byte andor);
	
	public void trade_total_jumps(Double[] values, byte[] operators);
	
	public void trade_total_jumps(Double[] values, byte[] operators, byte andor);
	
	public void trade_singlerunprofit(Double[] values, byte[] operators);
	
	public void trade_singlerunprofit(Double[] values, byte[] operators, byte andor);
	
	public void trade_maxunits_per_run(Double[] values, byte[] operators);
	
	public void trade_maxunits_per_run(Double[] values, byte[] operators, byte andor);
	
}
