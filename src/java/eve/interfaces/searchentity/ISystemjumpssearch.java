/*
 * ISystemjumpssearch.java
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
 * Search Interface for Systemjumps table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISystemjumpssearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param systemjumpsPK: Systemjumps primery key
     */
    public void addPrimarykey(ISystemjumpsPK systemjumpsPK);

	/**
	 * add Numeric search values for field jumps, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumps(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumps
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumps(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field jumpslowsec, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumpslowsec(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumpslowsec
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumpslowsec(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field jumpsnullsec, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumpsnullsec(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumpsnullsec
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumpsnullsec(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field jumpssafe, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumpssafe(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumpssafe
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumpssafe(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field jumpssafelowsec, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumpssafelowsec(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumpssafelowsec
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumpssafelowsec(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field jumpssafenullsec, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void jumpssafenullsec(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field jumpssafenullsec
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void jumpssafenullsec(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch systemSystem_end tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void systemSystem_end(ISystemsearch systemsearch);
	
	/**
   * foreign key
	 * set subsearch systemSystem_start tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void systemSystem_start(ISystemsearch systemsearch);
	
}
