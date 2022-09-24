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
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

public interface ITradesearch extends Tablesearcher {

    public void addPrimarykey(ITradePK tradePK);

	public void total_volume(Double[] values, byte[] operators);
	
	public void total_volume(Double[] values, byte[] operators, byte andor);
	
	public void buy_order_value(Double[] values, byte[] operators);
	
	public void buy_order_value(Double[] values, byte[] operators, byte andor);
	
	public void sell_order_value(Double[] values, byte[] operators);
	
	public void sell_order_value(Double[] values, byte[] operators, byte andor);
	
	public void profit(Double[] values, byte[] operators);
	
	public void profit(Double[] values, byte[] operators, byte andor);
	
	public void jumps(Double[] values, byte[] operators);
	
	public void jumps(Double[] values, byte[] operators, byte andor);
	
	public void runs(Double[] values, byte[] operators);
	
	public void runs(Double[] values, byte[] operators, byte andor);
	
	public void total_jumps(Double[] values, byte[] operators);
	
	public void total_jumps(Double[] values, byte[] operators, byte andor);
	
	public void profit_per_jump(Double[] values, byte[] operators);
	
	public void profit_per_jump(Double[] values, byte[] operators, byte andor);
	
	public void singlerun_profit_per_jump(Double[] values, byte[] operators);
	
	public void singlerun_profit_per_jump(Double[] values, byte[] operators, byte andor);
	
	public void maxunits_per_run(Double[] values, byte[] operators);
	
	public void maxunits_per_run(Double[] values, byte[] operators, byte andor);
	
	public void jumpslowsec(Double[] values, byte[] operators);
	
	public void jumpslowsec(Double[] values, byte[] operators, byte andor);
	
	public void jumpsnullsec(Double[] values, byte[] operators);
	
	public void jumpsnullsec(Double[] values, byte[] operators, byte andor);
	
	public void ordersSell_order_id(IOrderssearch orderssearch);
	
	public void ordersBuy_order_id(IOrderssearch orderssearch);
	
}
