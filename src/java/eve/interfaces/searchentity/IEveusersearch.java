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

public interface IEveusersearch extends Tablesearcher {

    public void addPrimarykey(IEveuserPK eveuserPK);

	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void createdat(Date[] values, byte[] operators);
	
	public void createdat(Date[] values, byte[] operators, byte andor);
	
	public void admin(Boolean value);
	
    public void frontendpage_auth(IFrontendpage_authsearch frontendpage_authsearch);
    
    public void relfrontendpage(IFrontendpagesearch frontendpagesearch);
    
}
