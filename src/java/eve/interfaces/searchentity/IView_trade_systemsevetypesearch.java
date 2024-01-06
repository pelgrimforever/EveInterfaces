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

public interface IView_trade_systemsevetypesearch extends Tablesearcher {

	public void systemsell(Double[] values, byte[] operators);
	
	public void systemsell(Double[] values, byte[] operators, byte andor);
	
	public void systembuy(Double[] values, byte[] operators);
	
	public void systembuy(Double[] values, byte[] operators, byte andor);
	
	public void evetype(Double[] values, byte[] operators);
	
	public void evetype(Double[] values, byte[] operators, byte andor);
	
	public void jumps(Double[] values, byte[] operators);
	
	public void jumps(Double[] values, byte[] operators, byte andor);
	
	public void jumpslowsec(Double[] values, byte[] operators);
	
	public void jumpslowsec(Double[] values, byte[] operators, byte andor);
	
	public void jumpsnullsec(Double[] values, byte[] operators);
	
	public void jumpsnullsec(Double[] values, byte[] operators, byte andor);
	
}
