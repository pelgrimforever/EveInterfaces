/*
 * ISettingssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2021 15:16
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
 * Search Interface for Settings table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISettingssearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param settingsPK: Settings primery key
     */
    public void addPrimarykey(ISettingsPK settingsPK);

	/**
	 * add String search values for field name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void name(String[] values);
	
	/**
	 * add String search values for field name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void name(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field value, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void value(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field value
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void value(Double[] values, byte[] operators, byte andor);
	
    /**
     * set subsearch usersettings tablesearch
     * @param usersettingssearch: IUsersettingssearch
     */
    public void usersettings(IUsersettingssearch usersettingssearch);
    
}
