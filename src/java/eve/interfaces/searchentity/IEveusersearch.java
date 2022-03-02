/*
 * IEveusersearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.1.2022 20:53
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
 * Search Interface for Eveuser table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IEveusersearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param eveuserPK: Eveuser primery key
     */
    public void addPrimarykey(IEveuserPK eveuserPK);

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
	 * add Date search values for field createdat, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void createdat(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field createdat
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void createdat(Date[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field admin
	 * @param value: true or false
	 */
	public void admin(Boolean value);
	
    /**
     * external foreign key - foreign key
     * set subsearch frontendpage_auth tablesearch
     * @param frontendpage_authsearch: IFrontendpage_authsearch
     */
    public void frontendpage_auth(IFrontendpage_authsearch frontendpage_authsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch frontendpage tablesearch
     * @param frontendpagesearch: IFrontendpagesearch
     */
    public void relfrontendpage(IFrontendpagesearch frontendpagesearch);
    
}
