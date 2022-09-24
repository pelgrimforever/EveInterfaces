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
import eve.interfaces.searchentity.*;

public interface IView_evetypessearch extends Tablesearcher {

	public void category(Double[] values, byte[] operators);
	
	public void category(Double[] values, byte[] operators, byte andor);
	
	public void typegroupid(Double[] values, byte[] operators);
	
	public void typegroupid(Double[] values, byte[] operators, byte andor);
	
	public void typegroupname(String[] values);
	
	public void typegroupname(String[] values, byte compare, byte andor);
	
	public void id(Double[] values, byte[] operators);
	
	public void id(Double[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void configuredbp(Boolean value);
	
}
