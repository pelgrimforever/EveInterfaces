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

public interface IBpmaterialsearch extends Tablesearcher {

    public void addPrimarykey(IBpmaterialPK bpmaterialPK);

	public void amount(Double[] values, byte[] operators);
	
	public void amount(Double[] values, byte[] operators, byte andor);
	
	public void evetypeBp(IEvetypesearch evetypesearch);
	
	public void evetypeMaterial(IEvetypesearch evetypesearch);
	
}
