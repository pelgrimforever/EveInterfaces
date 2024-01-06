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

public interface IRegionsearch extends Tablesearcher {

    public void addPrimarykey(IRegionPK regionPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void noaccess(Boolean value);
	
	public void orderpages(Double[] values, byte[] operators);
	
	public void orderpages(Double[] values, byte[] operators, byte andor);
	
	public void ordererrors(Double[] values, byte[] operators);
	
	public void ordererrors(Double[] values, byte[] operators, byte andor);
	
	public void contractpages(Double[] values, byte[] operators);
	
	public void contractpages(Double[] values, byte[] operators, byte andor);
	
	public void contracterrors(Double[] values, byte[] operators);
	
	public void contracterrors(Double[] values, byte[] operators, byte andor);
	
    public void order_history_month(IOrder_history_monthsearch order_history_monthsearch);
    
    public void relevetype1(IEvetypesearch evetypesearch);
    
    public void order_history(IOrder_historysearch order_historysearch);
    
    public void relevetype2(IEvetypesearch evetypesearch);
    
    public void region_neighbourRegion(IRegion_neighboursearch region_neighboursearch);
    
    public void region_neighbourNeighbour(IRegion_neighboursearch region_neighboursearch);
    
}
