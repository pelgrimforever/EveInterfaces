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

public interface IWishlistsearch extends Tablesearcher {

    public void addPrimarykey(IWishlistPK wishlistPK);

	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void maxprice(Double[] values, byte[] operators);
	
	public void maxprice(Double[] values, byte[] operators, byte andor);
	
	public void evetype(IEvetypesearch evetypesearch);
	
}
