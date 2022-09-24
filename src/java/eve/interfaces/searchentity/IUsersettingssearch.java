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

public interface IUsersettingssearch extends Tablesearcher {

    public void addPrimarykey(IUsersettingsPK usersettingsPK);

	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void value(String[] values);
	
	public void value(String[] values, byte compare, byte andor);
	
	public void settings(ISettingssearch settingssearch);
	
}
