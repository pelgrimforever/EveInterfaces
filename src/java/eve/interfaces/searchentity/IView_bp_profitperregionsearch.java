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

public interface IView_bp_profitperregionsearch extends Tablesearcher {

	public void categoryid(Double[] values, byte[] operators);
	
	public void categoryid(Double[] values, byte[] operators, byte andor);
	
	public void categoryname(String[] values);
	
	public void categoryname(String[] values, byte compare, byte andor);
	
	public void typegroupid(Double[] values, byte[] operators);
	
	public void typegroupid(Double[] values, byte[] operators, byte andor);
	
	public void typegroupname(String[] values);
	
	public void typegroupname(String[] values, byte compare, byte andor);
	
	public void id(Double[] values, byte[] operators);
	
	public void id(Double[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void estimatedproductioncost(Double[] values, byte[] operators);
	
	public void estimatedproductioncost(Double[] values, byte[] operators, byte andor);
	
	public void region(Double[] values, byte[] operators);
	
	public void region(Double[] values, byte[] operators, byte andor);
	
	public void regionname(String[] values);
	
	public void regionname(String[] values, byte compare, byte andor);
	
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
	
	public void percprofit(Double[] values, byte[] operators);
	
	public void percprofit(Double[] values, byte[] operators, byte andor);
	
}
