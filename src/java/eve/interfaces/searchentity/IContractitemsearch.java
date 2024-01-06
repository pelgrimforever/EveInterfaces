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

public interface IContractitemsearch extends Tablesearcher {

    public void addPrimarykey(IContractitemPK contractitemPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void blueprint_copy(Boolean value);
	
	public void included(Boolean value);
	
	public void quantity(Double[] values, byte[] operators);
	
	public void quantity(Double[] values, byte[] operators, byte andor);
	
	public void material_efficiency(Double[] values, byte[] operators);
	
	public void material_efficiency(Double[] values, byte[] operators, byte andor);
	
	public void runs(Double[] values, byte[] operators);
	
	public void runs(Double[] values, byte[] operators, byte andor);
	
	public void time_efficiency(Double[] values, byte[] operators);
	
	public void time_efficiency(Double[] values, byte[] operators, byte andor);
	
	public void evetype(IEvetypesearch evetypesearch);
	
	public void contract(IContractsearch contractsearch);
	
}
