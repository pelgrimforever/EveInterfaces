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
import eve.interfaces.searchentity.*;

public interface IOrder_history_maxdatesearch extends Tablesearcher {

	public void maxdate(Date[] values, byte[] operators);
	
	public void maxdate(Date[] values, byte[] operators, byte andor);
	
}
