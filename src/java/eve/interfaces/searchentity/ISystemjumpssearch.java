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

public interface ISystemjumpssearch extends Tablesearcher {

    public void addPrimarykey(ISystemjumpsPK systemjumpsPK);

	public void jumps(Double[] values, byte[] operators);
	
	public void jumps(Double[] values, byte[] operators, byte andor);
	
	public void jumpslowsec(Double[] values, byte[] operators);
	
	public void jumpslowsec(Double[] values, byte[] operators, byte andor);
	
	public void jumpsnullsec(Double[] values, byte[] operators);
	
	public void jumpsnullsec(Double[] values, byte[] operators, byte andor);
	
	public void jumpssafe(Double[] values, byte[] operators);
	
	public void jumpssafe(Double[] values, byte[] operators, byte andor);
	
	public void jumpssafelowsec(Double[] values, byte[] operators);
	
	public void jumpssafelowsec(Double[] values, byte[] operators, byte andor);
	
	public void jumpssafenullsec(Double[] values, byte[] operators);
	
	public void jumpssafenullsec(Double[] values, byte[] operators, byte andor);
	
	public void systemSystem_end(ISystemsearch systemsearch);
	
	public void systemSystem_start(ISystemsearch systemsearch);
	
}
