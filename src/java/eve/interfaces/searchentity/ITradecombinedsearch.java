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

public interface ITradecombinedsearch extends Tablesearcher {

    public void addPrimarykey(ITradecombinedPK tradecombinedPK);

	public void jumps(Double[] values, byte[] operators);
	
	public void jumps(Double[] values, byte[] operators, byte andor);
	
	public void jumpslowsec(Double[] values, byte[] operators);
	
	public void jumpslowsec(Double[] values, byte[] operators, byte andor);
	
	public void jumpsnullsec(Double[] values, byte[] operators);
	
	public void jumpsnullsec(Double[] values, byte[] operators, byte andor);
	
	public void evetype(IEvetypesearch evetypesearch);
	
	public void systemBuy_system(ISystemsearch systemsearch);
	
	public void systemSell_system(ISystemsearch systemsearch);
	
    public void tradecombined_sell(ITradecombined_sellsearch tradecombined_sellsearch);
    
    public void relorders1(IOrderssearch orderssearch);
    
    public void relorders2(IOrderssearch orderssearch);
    
}
