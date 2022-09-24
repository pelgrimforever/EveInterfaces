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

public interface IShipfitordersearch extends Tablesearcher {

    public void addPrimarykey(IShipfitorderPK shipfitorderPK);

	public void amountwanted(Double[] values, byte[] operators);
	
	public void amountwanted(Double[] values, byte[] operators, byte andor);
	
	public void amountinstock(Double[] values, byte[] operators);
	
	public void amountinstock(Double[] values, byte[] operators, byte andor);
	
	public void shipfit(IShipfitsearch shipfitsearch);
	
	public void evetype(IEvetypesearch evetypesearch);
	
    public void shipfitorderselected(IShipfitorderselectedsearch shipfitorderselectedsearch);
    
    public void relorders(IOrderssearch orderssearch);
    
}
