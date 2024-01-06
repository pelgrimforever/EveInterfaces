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

public interface IView_shipfitordersearch extends Tablesearcher {

	public void evetypename(String[] values);
	
	public void evetypename(String[] values, byte compare, byte andor);
	
	public void packaged_volume(Double[] values, byte[] operators);
	
	public void packaged_volume(Double[] values, byte[] operators, byte andor);
	
	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void shipname(String[] values);
	
	public void shipname(String[] values, byte compare, byte andor);
	
	public void evetype(Double[] values, byte[] operators);
	
	public void evetype(Double[] values, byte[] operators, byte andor);
	
	public void amountwanted(Double[] values, byte[] operators);
	
	public void amountwanted(Double[] values, byte[] operators, byte andor);
	
	public void amountinstock(Double[] values, byte[] operators);
	
	public void amountinstock(Double[] values, byte[] operators, byte andor);
	
	public void amountplanned(Double[] values, byte[] operators);
	
	public void amountplanned(Double[] values, byte[] operators, byte andor);
	
}
