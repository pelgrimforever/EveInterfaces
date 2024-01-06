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

public interface IView_userbpmaterialsearch extends Tablesearcher {

	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void serialnumber(Double[] values, byte[] operators);
	
	public void serialnumber(Double[] values, byte[] operators, byte andor);
	
	public void bp(Double[] values, byte[] operators);
	
	public void bp(Double[] values, byte[] operators, byte andor);
	
	public void material(Double[] values, byte[] operators);
	
	public void material(Double[] values, byte[] operators, byte andor);
	
	public void amount(Double[] values, byte[] operators);
	
	public void amount(Double[] values, byte[] operators, byte andor);
	
	public void category(Double[] values, byte[] operators);
	
	public void category(Double[] values, byte[] operators, byte andor);
	
	public void typegroupid(Double[] values, byte[] operators);
	
	public void typegroupid(Double[] values, byte[] operators, byte andor);
	
	public void typegroupname(String[] values);
	
	public void typegroupname(String[] values, byte compare, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void marketaverage(Double[] values, byte[] operators);
	
	public void marketaverage(Double[] values, byte[] operators, byte andor);
	
	public void materialinputaverage(Double[] values, byte[] operators);
	
	public void materialinputaverage(Double[] values, byte[] operators, byte andor);
	
}
