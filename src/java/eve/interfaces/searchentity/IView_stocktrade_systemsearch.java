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

public interface IView_stocktrade_systemsearch extends Tablesearcher {

	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void id(Double[] values, byte[] operators);
	
	public void id(Double[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void region(String[] values);
	
	public void region(String[] values, byte compare, byte andor);
	
	public void sellprice(Double[] values, byte[] operators);
	
	public void sellprice(Double[] values, byte[] operators, byte andor);
	
	public void totalvolume(Double[] values, byte[] operators);
	
	public void totalvolume(Double[] values, byte[] operators, byte andor);
	
}
