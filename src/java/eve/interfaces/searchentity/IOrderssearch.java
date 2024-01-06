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

public interface IOrderssearch extends Tablesearcher {

    public void addPrimarykey(IOrdersPK ordersPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void isopen(Boolean value);
	
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
	
	public void evetype(IEvetypesearch evetypesearch);
	
	public void system(ISystemsearch systemsearch);
	
    public void tradecombined_sellBuy_order_id(ITradecombined_sellsearch tradecombined_sellsearch);
    
    public void reltradecombined1(ITradecombinedsearch tradecombinedsearch);
    
    public void tradecombined_sellSell_order_id(ITradecombined_sellsearch tradecombined_sellsearch);
    
    public void reltradecombined2(ITradecombinedsearch tradecombinedsearch);
    
    public void shipfitorderselected(IShipfitorderselectedsearch shipfitorderselectedsearch);
    
    public void relshipfitorder(IShipfitordersearch shipfitordersearch);
    
    public void tradeSell_order_id(ITradesearch tradesearch);
    
    public void tradeBuy_order_id(ITradesearch tradesearch);
    
}
