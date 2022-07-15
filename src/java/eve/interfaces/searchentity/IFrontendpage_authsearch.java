/*
 * IFrontendpage_authsearch.java
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
 * Search Interface for Frontendpage_auth table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IFrontendpage_authsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param frontendpage_authPK: Frontendpage_auth primery key
     */
    public void addPrimarykey(IFrontendpage_authPK frontendpage_authPK);

	/**
   * foreign key
	 * set subsearch frontendpage tablesearch
	 * @param frontendpagesearch: IFrontendpagesearch
	 */
	public void frontendpage(IFrontendpagesearch frontendpagesearch);
	
	/**
   * foreign key
	 * set subsearch eveuser tablesearch
	 * @param eveusersearch: IEveusersearch
	 */
	public void eveuser(IEveusersearch eveusersearch);
	
}
