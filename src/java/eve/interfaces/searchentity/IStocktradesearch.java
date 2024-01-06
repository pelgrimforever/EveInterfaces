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

public interface IStocktradesearch extends Tablesearcher {

    public void addPrimarykey(IStocktradePK stocktradePK);

	public void orderid(long[] values, byte[] operators);
	
	public void orderid(long[] values, byte[] operators, byte andor);
	
	public void sellamount(Double[] values, byte[] operators);
	
	public void sellamount(Double[] values, byte[] operators, byte andor);
	
	public void stock(IStocksearch stocksearch);
	
}
