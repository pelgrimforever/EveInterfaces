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

public interface IConstellationsearch extends Tablesearcher {

    public void addPrimarykey(IConstellationPK constellationPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void noaccess(Boolean value);
	
	public void region(IRegionsearch regionsearch);
	
    public void constellation_neighbourNeighbour(IConstellation_neighboursearch constellation_neighboursearch);
    
    public void constellation_neighbourConstellation(IConstellation_neighboursearch constellation_neighboursearch);
    
}
