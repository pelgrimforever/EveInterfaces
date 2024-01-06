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

public interface IView_contractitemsearch extends Tablesearcher {

	public void id(Double[] values, byte[] operators);
	
	public void id(Double[] values, byte[] operators, byte andor);
	
	public void contract(Double[] values, byte[] operators);
	
	public void contract(Double[] values, byte[] operators, byte andor);
	
	public void blueprint_copy(Boolean value);
	
	public void included(Boolean value);
	
	public void quantity(Double[] values, byte[] operators);
	
	public void quantity(Double[] values, byte[] operators, byte andor);
	
	public void evetype(Double[] values, byte[] operators);
	
	public void evetype(Double[] values, byte[] operators, byte andor);
	
	public void material_efficiency(Double[] values, byte[] operators);
	
	public void material_efficiency(Double[] values, byte[] operators, byte andor);
	
	public void runs(Double[] values, byte[] operators);
	
	public void runs(Double[] values, byte[] operators, byte andor);
	
	public void time_efficiency(Double[] values, byte[] operators);
	
	public void time_efficiency(Double[] values, byte[] operators, byte andor);
	
	public void packaged_volume(Double[] values, byte[] operators);
	
	public void packaged_volume(Double[] values, byte[] operators, byte andor);
	
	public void typename(String[] values);
	
	public void typename(String[] values, byte compare, byte andor);
	
	public void typegroupid(Double[] values, byte[] operators);
	
	public void typegroupid(Double[] values, byte[] operators, byte andor);
	
	public void groupname(String[] values);
	
	public void groupname(String[] values, byte compare, byte andor);
	
	public void categoryid(Double[] values, byte[] operators);
	
	public void categoryid(Double[] values, byte[] operators, byte andor);
	
	public void categoryname(String[] values);
	
	public void categoryname(String[] values, byte compare, byte andor);
	
	public void avg_buyorder(Double[] values, byte[] operators);
	
	public void avg_buyorder(Double[] values, byte[] operators, byte andor);
	
	public void min_buyorder(Double[] values, byte[] operators);
	
	public void min_buyorder(Double[] values, byte[] operators, byte andor);
	
	public void max_buyorder(Double[] values, byte[] operators);
	
	public void max_buyorder(Double[] values, byte[] operators, byte andor);
	
	public void avg_sellorder(Double[] values, byte[] operators);
	
	public void avg_sellorder(Double[] values, byte[] operators, byte andor);
	
	public void min_selorder(Double[] values, byte[] operators);
	
	public void min_selorder(Double[] values, byte[] operators, byte andor);
	
	public void max_selorder(Double[] values, byte[] operators);
	
	public void max_selorder(Double[] values, byte[] operators, byte andor);
	
	public void average(Double[] values, byte[] operators);
	
	public void average(Double[] values, byte[] operators, byte andor);
	
	public void highest(Double[] values, byte[] operators);
	
	public void highest(Double[] values, byte[] operators, byte andor);
	
	public void lowest(Double[] values, byte[] operators);
	
	public void lowest(Double[] values, byte[] operators, byte andor);
	
	public void order_count(Double[] values, byte[] operators);
	
	public void order_count(Double[] values, byte[] operators, byte andor);
	
}
