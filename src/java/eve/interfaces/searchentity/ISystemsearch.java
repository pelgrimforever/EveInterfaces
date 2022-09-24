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

public interface ISystemsearch extends Tablesearcher {

    public void addPrimarykey(ISystemPK systemPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void security_class(String[] values);
	
	public void security_class(String[] values, byte compare, byte andor);
	
	public void security_status(Double[] values, byte[] operators);
	
	public void security_status(Double[] values, byte[] operators, byte andor);
	
	public void star_id(Double[] values, byte[] operators);
	
	public void star_id(Double[] values, byte[] operators, byte andor);
	
	public void noaccess(Boolean value);
	
	public void isconstellationborder(Boolean value);
	
	public void isregionborder(Boolean value);
	
	public void downloaddate(Date[] values, byte[] operators);
	
	public void downloaddate(Date[] values, byte[] operators, byte andor);
	
	public void security_island(ISecurity_islandsearch security_islandsearch);
	
	public void constellation(IConstellationsearch constellationsearch);
	
    public void systemjumpsSystem_end(ISystemjumpssearch systemjumpssearch);
    
    public void systemjumpsSystem_start(ISystemjumpssearch systemjumpssearch);
    
    public void tradecombinedBuy_system(ITradecombinedsearch tradecombinedsearch);
    
    public void relevetype1(IEvetypesearch evetypesearch);
    
    public void tradecombinedSell_system(ITradecombinedsearch tradecombinedsearch);
    
    public void relevetype2(IEvetypesearch evetypesearch);
    
}
