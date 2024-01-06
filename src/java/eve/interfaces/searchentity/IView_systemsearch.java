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

public interface IView_systemsearch extends Tablesearcher {

	public void jumpssafe(Double[] values, byte[] operators);
	
	public void jumpssafe(Double[] values, byte[] operators, byte andor);
	
	public void jumpssafelowsec(Double[] values, byte[] operators);
	
	public void jumpssafelowsec(Double[] values, byte[] operators, byte andor);
	
	public void jumpssafenullsec(Double[] values, byte[] operators);
	
	public void jumpssafenullsec(Double[] values, byte[] operators, byte andor);
	
	public void regionname(String[] values);
	
	public void regionname(String[] values, byte compare, byte andor);
	
	public void system_start(Double[] values, byte[] operators);
	
	public void system_start(Double[] values, byte[] operators, byte andor);
	
	public void system_end(Double[] values, byte[] operators);
	
	public void system_end(Double[] values, byte[] operators, byte andor);
	
	public void id(Double[] values, byte[] operators);
	
	public void id(Double[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void constellation(Double[] values, byte[] operators);
	
	public void constellation(Double[] values, byte[] operators, byte andor);
	
	public void security_class(String[] values);
	
	public void security_class(String[] values, byte compare, byte andor);
	
	public void security_status(Double[] values, byte[] operators);
	
	public void security_status(Double[] values, byte[] operators, byte andor);
	
	public void star_id(Double[] values, byte[] operators);
	
	public void star_id(Double[] values, byte[] operators, byte andor);
	
	public void noaccess(Boolean value);
	
	public void isconstellationborder(Boolean value);
	
	public void isregionborder(Boolean value);
	
	public void security_island(Double[] values, byte[] operators);
	
	public void security_island(Double[] values, byte[] operators, byte andor);
	
	public void downloaddate(Date[] values, byte[] operators);
	
	public void downloaddate(Date[] values, byte[] operators, byte andor);
	
}
