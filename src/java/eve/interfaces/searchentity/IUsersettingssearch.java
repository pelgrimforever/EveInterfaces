/*
 * IUsersettingssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

/**
 * Search Interface for Usersettings table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IUsersettingssearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param usersettingsPK: Usersettings primery key
     */
    public void addPrimarykey(IUsersettingsPK usersettingsPK);

	/**
	 * add String search values for field username, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void username(String[] values);
	
	/**
	 * add String search values for field username
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void username(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field value, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void value(String[] values);
	
	/**
	 * add String search values for field value
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void value(String[] values, byte compare, byte andor);
	
	/**
   * foreign key
	 * set subsearch settings tablesearch
	 * @param settingssearch: ISettingssearch
	 */
	public void settings(ISettingssearch settingssearch);
	
}
