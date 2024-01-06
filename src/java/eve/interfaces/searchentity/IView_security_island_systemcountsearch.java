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

public interface IView_security_island_systemcountsearch extends Tablesearcher {

	public void id(Double[] values, byte[] operators);
	
	public void id(Double[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void systems(Double[] values, byte[] operators);
	
	public void systems(Double[] values, byte[] operators, byte andor);
	
}
