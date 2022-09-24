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

public interface IEvetypesearch extends Tablesearcher {

    public void addPrimarykey(IEvetypePK evetypePK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void published(Boolean value);
	
	public void description(String[] values);
	
	public void description(String[] values, byte compare, byte andor);
	
	public void capacity(Double[] values, byte[] operators);
	
	public void capacity(Double[] values, byte[] operators, byte andor);
	
	public void icon(Double[] values, byte[] operators);
	
	public void icon(Double[] values, byte[] operators, byte andor);
	
	public void mass(Double[] values, byte[] operators);
	
	public void mass(Double[] values, byte[] operators, byte andor);
	
	public void packaged_volume(Double[] values, byte[] operators);
	
	public void packaged_volume(Double[] values, byte[] operators, byte andor);
	
	public void portion_size(Double[] values, byte[] operators);
	
	public void portion_size(Double[] values, byte[] operators, byte andor);
	
	public void radius(Double[] values, byte[] operators);
	
	public void radius(Double[] values, byte[] operators, byte andor);
	
	public void volume(Double[] values, byte[] operators);
	
	public void volume(Double[] values, byte[] operators, byte andor);
	
	public void avg_buyorder(Double[] values, byte[] operators);
	
	public void avg_buyorder(Double[] values, byte[] operators, byte andor);
	
	public void avg_sellorder(Double[] values, byte[] operators);
	
	public void avg_sellorder(Double[] values, byte[] operators, byte andor);
	
	public void min_buyorder(Double[] values, byte[] operators);
	
	public void min_buyorder(Double[] values, byte[] operators, byte andor);
	
	public void max_buyorder(Double[] values, byte[] operators);
	
	public void max_buyorder(Double[] values, byte[] operators, byte andor);
	
	public void min_selorder(Double[] values, byte[] operators);
	
	public void min_selorder(Double[] values, byte[] operators, byte andor);
	
	public void max_selorder(Double[] values, byte[] operators);
	
	public void max_selorder(Double[] values, byte[] operators, byte andor);
	
	public void average(Double[] values, byte[] operators);
	
	public void average(Double[] values, byte[] operators, byte andor);
	
	public void highest(Double[] values, byte[] operators);
	
	public void highest(Double[] values, byte[] operators, byte andor);
	
	public void lowest(Double[] values, byte[] operators);
	
	public void lowest(Double[] values, byte[] operators, byte andor);
	
	public void order_count(Double[] values, byte[] operators);
	
	public void order_count(Double[] values, byte[] operators, byte andor);
	
	public void configuredbp(Boolean value);
	
	public void estimatedproductioncost(Double[] values, byte[] operators);
	
	public void estimatedproductioncost(Double[] values, byte[] operators, byte andor);
	
	public void market_group(IMarket_groupsearch market_groupsearch);
	
	public void typegroup(ITypegroupsearch typegroupsearch);
	
	public void graphic(IGraphicsearch graphicsearch);
	
    public void wishlist(IWishlistsearch wishlistsearch);
    
    public void materialinput(IMaterialinputsearch materialinputsearch);
    
    public void bpmaterialBp(IBpmaterialsearch bpmaterialsearch);
    
    public void bpmaterialMaterial(IBpmaterialsearch bpmaterialsearch);
    
    public void order_history_month(IOrder_history_monthsearch order_history_monthsearch);
    
    public void relregion1(IRegionsearch regionsearch);
    
    public void stock(IStocksearch stocksearch);
    
    public void order_history(IOrder_historysearch order_historysearch);
    
    public void relregion2(IRegionsearch regionsearch);
    
    public void shipfitmodule(IShipfitmodulesearch shipfitmodulesearch);
    
    public void relshipfit1(IShipfitsearch shipfitsearch);
    
    public void shipfitorder(IShipfitordersearch shipfitordersearch);
    
    public void relshipfit2(IShipfitsearch shipfitsearch);
    
    public void tradecombined(ITradecombinedsearch tradecombinedsearch);
    
    public void relsystem1(ISystemsearch systemsearch);
    
    public void relsystem2(ISystemsearch systemsearch);
    
    public void userbp(IUserbpsearch userbpsearch);
    
}
