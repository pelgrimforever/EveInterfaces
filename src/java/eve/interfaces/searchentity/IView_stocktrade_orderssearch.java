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

public interface IView_stocktrade_orderssearch extends Tablesearcher {

	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void system(Double[] values, byte[] operators);
	
	public void system(Double[] values, byte[] operators, byte andor);
	
	public void locationid(Double[] values, byte[] operators);
	
	public void locationid(Double[] values, byte[] operators, byte andor);
	
	public void stationname(String[] values);
	
	public void stationname(String[] values, byte compare, byte andor);
	
	public void locationname(String[] values);
	
	public void locationname(String[] values, byte compare, byte andor);
	
	public void evetypeid(Double[] values, byte[] operators);
	
	public void evetypeid(Double[] values, byte[] operators, byte andor);
	
	public void evetypename(String[] values);
	
	public void evetypename(String[] values, byte compare, byte andor);
	
	public void packaged_volume(Double[] values, byte[] operators);
	
	public void packaged_volume(Double[] values, byte[] operators, byte andor);
	
	public void min_volume(Double[] values, byte[] operators);
	
	public void min_volume(Double[] values, byte[] operators, byte andor);
	
	public void orderid(Double[] values, byte[] operators);
	
	public void orderid(Double[] values, byte[] operators, byte andor);
	
	public void sellamount(Double[] values, byte[] operators);
	
	public void sellamount(Double[] values, byte[] operators, byte andor);
	
	public void price(Double[] values, byte[] operators);
	
	public void price(Double[] values, byte[] operators, byte andor);
	
	public void totalprice(Double[] values, byte[] operators);
	
	public void totalprice(Double[] values, byte[] operators, byte andor);
	
}
