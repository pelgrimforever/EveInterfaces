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

public interface IShipfitorderselectedsearch extends Tablesearcher {

    public void addPrimarykey(IShipfitorderselectedPK shipfitorderselectedPK);

	public void amount(Double[] values, byte[] operators);
	
	public void amount(Double[] values, byte[] operators, byte andor);
	
	public void orders(IOrderssearch orderssearch);
	
	public void shipfitorder(IShipfitordersearch shipfitordersearch);
	
}
