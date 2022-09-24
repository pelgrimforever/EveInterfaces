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

public interface IMaterialinputsearch extends Tablesearcher {

    public void addPrimarykey(IMaterialinputPK materialinputPK);

	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void addtimestamp(Timestamp[] values, byte[] operators);
	
	public void addtimestamp(Timestamp[] values, byte[] operators, byte andor);
	
	public void amount(Double[] values, byte[] operators);
	
	public void amount(Double[] values, byte[] operators, byte andor);
	
	public void unitprice(Double[] values, byte[] operators);
	
	public void unitprice(Double[] values, byte[] operators, byte andor);
	
	public void usedamount(Double[] values, byte[] operators);
	
	public void usedamount(Double[] values, byte[] operators, byte andor);
	
	public void evetype(IEvetypesearch evetypesearch);
	
}
