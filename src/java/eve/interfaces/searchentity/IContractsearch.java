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

public interface IContractsearch extends Tablesearcher {

    public void addPrimarykey(IContractPK contractPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void collateral(Double[] values, byte[] operators);
	
	public void collateral(Double[] values, byte[] operators, byte andor);
	
	public void date_expired(Timestamp[] values, byte[] operators);
	
	public void date_expired(Timestamp[] values, byte[] operators, byte andor);
	
	public void date_issued(Timestamp[] values, byte[] operators);
	
	public void date_issued(Timestamp[] values, byte[] operators, byte andor);
	
	public void days_to_complete(Double[] values, byte[] operators);
	
	public void days_to_complete(Double[] values, byte[] operators, byte andor);
	
	public void end_location_id(Double[] values, byte[] operators);
	
	public void end_location_id(Double[] values, byte[] operators, byte andor);
	
	public void for_corporation(Boolean value);
	
	public void price(Double[] values, byte[] operators);
	
	public void price(Double[] values, byte[] operators, byte andor);
	
	public void reward(Double[] values, byte[] operators);
	
	public void reward(Double[] values, byte[] operators, byte andor);
	
	public void start_location_id(Double[] values, byte[] operators);
	
	public void start_location_id(Double[] values, byte[] operators, byte andor);
	
	public void title(String[] values);
	
	public void title(String[] values, byte compare, byte andor);
	
	public void type(String[] values);
	
	public void type(String[] values, byte compare, byte andor);
	
	public void volume(Double[] values, byte[] operators);
	
	public void volume(Double[] values, byte[] operators, byte andor);
	
	public void page(Double[] values, byte[] operators);
	
	public void page(Double[] values, byte[] operators, byte andor);
	
	public void active(Boolean value);
	
}
