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

public interface ITradecombined_sellsearch extends Tablesearcher {

    public void addPrimarykey(ITradecombined_sellPK tradecombined_sellPK);

	public void amount(Double[] values, byte[] operators);
	
	public void amount(Double[] values, byte[] operators, byte andor);
	
	public void buy_order_value(Double[] values, byte[] operators);
	
	public void buy_order_value(Double[] values, byte[] operators, byte andor);
	
	public void sell_order_value(Double[] values, byte[] operators);
	
	public void sell_order_value(Double[] values, byte[] operators, byte andor);
	
	public void profit(Double[] values, byte[] operators);
	
	public void profit(Double[] values, byte[] operators, byte andor);
	
	public void ordersBuy_order_id(IOrderssearch orderssearch);
	
	public void ordersSell_order_id(IOrderssearch orderssearch);
	
	public void tradecombined(ITradecombinedsearch tradecombinedsearch);
	
}
