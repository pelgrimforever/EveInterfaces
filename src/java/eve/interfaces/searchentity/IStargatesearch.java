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
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

public interface IStargatesearch extends Tablesearcher {

    public void addPrimarykey(IStargatePK stargatePK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void to_stargate(Double[] values, byte[] operators);
	
	public void to_stargate(Double[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void x(Double[] values, byte[] operators);
	
	public void x(Double[] values, byte[] operators, byte andor);
	
	public void y(Double[] values, byte[] operators);
	
	public void y(Double[] values, byte[] operators, byte andor);
	
	public void z(Double[] values, byte[] operators);
	
	public void z(Double[] values, byte[] operators, byte andor);
	
	public void isconstellationborder(Boolean value);
	
	public void isregionborder(Boolean value);
	
	public void downloaddate(Date[] values, byte[] operators);
	
	public void downloaddate(Date[] values, byte[] operators, byte andor);
	
	public void systemSystem(ISystemsearch systemsearch);
	
	public void systemTo_system(ISystemsearch systemsearch);
	
}
