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

public interface IMarket_groupsearch extends Tablesearcher {

    public void addPrimarykey(IMarket_groupPK market_groupPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void description(String[] values);
	
	public void description(String[] values, byte compare, byte andor);
	
	public void market_groupParent_id(IMarket_groupsearch market_groupsearch);
	
}
