/*
 * ISyssettingssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.5.2022 11:11
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
 * Search Interface for Syssettings table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISyssettingssearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param syssettingsPK: Syssettings primery key
     */
    public void addPrimarykey(ISyssettingsPK syssettingsPK);

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
	
}
