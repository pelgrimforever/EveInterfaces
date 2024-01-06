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
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

public interface IFactionsearch extends Tablesearcher {

    public void addPrimarykey(IFactionPK factionPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void description(String[] values);
	
	public void description(String[] values, byte compare, byte andor);
	
	public void is_unique(Boolean value);
	
	public void size_factor(Double[] values, byte[] operators);
	
	public void size_factor(Double[] values, byte[] operators, byte andor);
	
	public void station_count(Double[] values, byte[] operators);
	
	public void station_count(Double[] values, byte[] operators, byte andor);
	
	public void station_system_count(Double[] values, byte[] operators);
	
	public void station_system_count(Double[] values, byte[] operators, byte andor);
	
	public void corporation(Double[] values, byte[] operators);
	
	public void corporation(Double[] values, byte[] operators, byte andor);
	
	public void militia_corporation(Double[] values, byte[] operators);
	
	public void militia_corporation(Double[] values, byte[] operators, byte andor);
	
	public void system(ISystemsearch systemsearch);
	
}
