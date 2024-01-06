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

public interface IView_bpmaterialsearch extends Tablesearcher {

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
	
	public void average(Double[] values, byte[] operators);
	
	public void average(Double[] values, byte[] operators, byte andor);
	
}
