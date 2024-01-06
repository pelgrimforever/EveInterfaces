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

public interface IView_shipfitmodulesearch extends Tablesearcher {

	public void modulename(String[] values);
	
	public void modulename(String[] values, byte compare, byte andor);
	
	public void packaged_volume(Double[] values, byte[] operators);
	
	public void packaged_volume(Double[] values, byte[] operators, byte andor);
	
	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void shipname(String[] values);
	
	public void shipname(String[] values, byte compare, byte andor);
	
	public void moduletype(Double[] values, byte[] operators);
	
	public void moduletype(Double[] values, byte[] operators, byte andor);
	
	public void amount(Double[] values, byte[] operators);
	
	public void amount(Double[] values, byte[] operators, byte andor);
	
}
