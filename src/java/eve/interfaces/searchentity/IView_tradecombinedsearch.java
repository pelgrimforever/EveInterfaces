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

public interface IView_tradecombinedsearch extends Tablesearcher {

	public void sell_regionid(Double[] values, byte[] operators);
	
	public void sell_regionid(Double[] values, byte[] operators, byte andor);
	
	public void sell_regionname(String[] values);
	
	public void sell_regionname(String[] values, byte compare, byte andor);
	
	public void sell_systemid(Double[] values, byte[] operators);
	
	public void sell_systemid(Double[] values, byte[] operators, byte andor);
	
	public void sell_systemname(String[] values);
	
	public void sell_systemname(String[] values, byte compare, byte andor);
	
	public void evetype_id(Double[] values, byte[] operators);
	
	public void evetype_id(Double[] values, byte[] operators, byte andor);
	
	public void evetype_name(String[] values);
	
	public void evetype_name(String[] values, byte compare, byte andor);
	
	public void packaged_volume(Double[] values, byte[] operators);
	
	public void packaged_volume(Double[] values, byte[] operators, byte andor);
	
	public void orders(Double[] values, byte[] operators);
	
	public void orders(Double[] values, byte[] operators, byte andor);
	
	public void totalamount(Double[] values, byte[] operators);
	
	public void totalamount(Double[] values, byte[] operators, byte andor);
	
	public void buy_order_total(Double[] values, byte[] operators);
	
	public void buy_order_total(Double[] values, byte[] operators, byte andor);
	
	public void sell_order_total(Double[] values, byte[] operators);
	
	public void sell_order_total(Double[] values, byte[] operators, byte andor);
	
	public void totalprofit(Double[] values, byte[] operators);
	
	public void totalprofit(Double[] values, byte[] operators, byte andor);
	
	public void buy_systemid(Double[] values, byte[] operators);
	
	public void buy_systemid(Double[] values, byte[] operators, byte andor);
	
	public void buy_systemname(String[] values);
	
	public void buy_systemname(String[] values, byte compare, byte andor);
	
	public void trade_jumps(Double[] values, byte[] operators);
	
	public void trade_jumps(Double[] values, byte[] operators, byte andor);
	
	public void trade_jumpslowsec(Double[] values, byte[] operators);
	
	public void trade_jumpslowsec(Double[] values, byte[] operators, byte andor);
	
	public void trade_jumpsnullsec(Double[] values, byte[] operators);
	
	public void trade_jumpsnullsec(Double[] values, byte[] operators, byte andor);
	
}
