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

public interface IView_evetype_order_history_monthsearch extends Tablesearcher {

	public void evetype(Double[] values, byte[] operators);
	
	public void evetype(Double[] values, byte[] operators, byte andor);
	
	public void year(Double[] values, byte[] operators);
	
	public void year(Double[] values, byte[] operators, byte andor);
	
	public void month(Double[] values, byte[] operators);
	
	public void month(Double[] values, byte[] operators, byte andor);
	
	public void average(Double[] values, byte[] operators);
	
	public void average(Double[] values, byte[] operators, byte andor);
	
	public void highest(Double[] values, byte[] operators);
	
	public void highest(Double[] values, byte[] operators, byte andor);
	
	public void lowest(Double[] values, byte[] operators);
	
	public void lowest(Double[] values, byte[] operators, byte andor);
	
	public void volume(Double[] values, byte[] operators);
	
	public void volume(Double[] values, byte[] operators, byte andor);
	
	public void ordercount(Double[] values, byte[] operators);
	
	public void ordercount(Double[] values, byte[] operators, byte andor);
	
}
