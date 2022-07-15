/*
 * IFrontendpagesearch.java
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
 * Search Interface for Frontendpage table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IFrontendpagesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param frontendpagePK: Frontendpage primery key
     */
    public void addPrimarykey(IFrontendpagePK frontendpagePK);

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
     * external foreign key - foreign key
     * set subsearch frontendpage_auth tablesearch
     * @param frontendpage_authsearch: IFrontendpage_authsearch
     */
    public void frontendpage_auth(IFrontendpage_authsearch frontendpage_authsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch eveuser tablesearch
     * @param eveusersearch: IEveusersearch
     */
    public void releveuser(IEveusersearch eveusersearch);
    
}
