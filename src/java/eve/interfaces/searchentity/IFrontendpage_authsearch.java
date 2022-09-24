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

public interface IFrontendpage_authsearch extends Tablesearcher {

    public void addPrimarykey(IFrontendpage_authPK frontendpage_authPK);

	public void frontendpage(IFrontendpagesearch frontendpagesearch);
	
	public void eveuser(IEveusersearch eveusersearch);
	
}
