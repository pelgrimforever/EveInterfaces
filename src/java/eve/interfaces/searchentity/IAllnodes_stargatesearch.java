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

public interface IAllnodes_stargatesearch extends Tablesearcher {

    public void addPrimarykey(IAllnodes_stargatePK allnodes_stargatePK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void to_stargate(Double[] values, byte[] operators);
	
	public void to_stargate(Double[] values, byte[] operators, byte andor);
	
	public void system(Double[] values, byte[] operators);
	
	public void system(Double[] values, byte[] operators, byte andor);
	
	public void to_system(Double[] values, byte[] operators);
	
	public void to_system(Double[] values, byte[] operators, byte andor);
	
	public void deadend(Boolean value);
	
}
