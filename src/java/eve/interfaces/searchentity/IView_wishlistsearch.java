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

public interface IView_wishlistsearch extends Tablesearcher {

	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void maxprice(Double[] values, byte[] operators);
	
	public void maxprice(Double[] values, byte[] operators, byte andor);
	
	public void id(Double[] values, byte[] operators);
	
	public void id(Double[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void typegroup(Double[] values, byte[] operators);
	
	public void typegroup(Double[] values, byte[] operators, byte andor);
	
	public void published(Boolean value);
	
	public void description(String[] values);
	
	public void description(String[] values, byte compare, byte andor);
	
	public void capacity(Double[] values, byte[] operators);
	
	public void capacity(Double[] values, byte[] operators, byte andor);
	
	public void graphic(Double[] values, byte[] operators);
	
	public void graphic(Double[] values, byte[] operators, byte andor);
	
	public void icon(Double[] values, byte[] operators);
	
	public void icon(Double[] values, byte[] operators, byte andor);
	
	public void market_group(Double[] values, byte[] operators);
	
	public void market_group(Double[] values, byte[] operators, byte andor);
	
	public void mass(Double[] values, byte[] operators);
	
	public void mass(Double[] values, byte[] operators, byte andor);
	
	public void packaged_volume(Double[] values, byte[] operators);
	
	public void packaged_volume(Double[] values, byte[] operators, byte andor);
	
	public void portion_size(Double[] values, byte[] operators);
	
	public void portion_size(Double[] values, byte[] operators, byte andor);
	
	public void radius(Double[] values, byte[] operators);
	
	public void radius(Double[] values, byte[] operators, byte andor);
	
	public void volume(Double[] values, byte[] operators);
	
	public void volume(Double[] values, byte[] operators, byte andor);
	
	public void avg_buyorder(Double[] values, byte[] operators);
	
	public void avg_buyorder(Double[] values, byte[] operators, byte andor);
	
	public void avg_sellorder(Double[] values, byte[] operators);
	
	public void avg_sellorder(Double[] values, byte[] operators, byte andor);
	
	public void min_buyorder(Double[] values, byte[] operators);
	
	public void min_buyorder(Double[] values, byte[] operators, byte andor);
	
	public void max_buyorder(Double[] values, byte[] operators);
	
	public void max_buyorder(Double[] values, byte[] operators, byte andor);
	
	public void min_selorder(Double[] values, byte[] operators);
	
	public void min_selorder(Double[] values, byte[] operators, byte andor);
	
	public void max_selorder(Double[] values, byte[] operators);
	
	public void max_selorder(Double[] values, byte[] operators, byte andor);
	
}
