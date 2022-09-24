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

public interface IView_contractswithprofitsearch extends Tablesearcher {

	public void id(Double[] values, byte[] operators);
	
	public void id(Double[] values, byte[] operators, byte andor);
	
	public void date_expired(Timestamp[] values, byte[] operators);
	
	public void date_expired(Timestamp[] values, byte[] operators, byte andor);
	
	public void date_issued(Timestamp[] values, byte[] operators);
	
	public void date_issued(Timestamp[] values, byte[] operators, byte andor);
	
	public void days_to_complete(Double[] values, byte[] operators);
	
	public void days_to_complete(Double[] values, byte[] operators, byte andor);
	
	public void end_location_id(Double[] values, byte[] operators);
	
	public void end_location_id(Double[] values, byte[] operators, byte andor);
	
	public void price(Double[] values, byte[] operators);
	
	public void price(Double[] values, byte[] operators, byte andor);
	
	public void reward(Double[] values, byte[] operators);
	
	public void reward(Double[] values, byte[] operators, byte andor);
	
	public void start_location_id(Double[] values, byte[] operators);
	
	public void start_location_id(Double[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void systemname(String[] values);
	
	public void systemname(String[] values, byte compare, byte andor);
	
	public void regionname(String[] values);
	
	public void regionname(String[] values, byte compare, byte andor);
	
	public void title(String[] values);
	
	public void title(String[] values, byte compare, byte andor);
	
	public void volume(Double[] values, byte[] operators);
	
	public void volume(Double[] values, byte[] operators, byte andor);
	
	public void sellprice(Double[] values, byte[] operators);
	
	public void sellprice(Double[] values, byte[] operators, byte andor);
	
	public void buyprice(Double[] values, byte[] operators);
	
	public void buyprice(Double[] values, byte[] operators, byte andor);
	
}
