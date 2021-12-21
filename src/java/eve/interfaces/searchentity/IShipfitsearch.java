/*
 * IShipfitsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 19.11.2021 16:16
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
 * Search Interface for Shipfit table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IShipfitsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param shipfitPK: Shipfit primery key
     */
    public void addPrimarykey(IShipfitPK shipfitPK);

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
	 * add String search values for field shipname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void shipname(String[] values);
	
	/**
	 * add String search values for field shipname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void shipname(String[] values, byte compare, byte andor);
	
	/**
   * foreign key
	 * set subsearch evetype tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetype(IEvetypesearch evetypesearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch shipfitmodule tablesearch
     * @param shipfitmodulesearch: IShipfitmodulesearch
     */
    public void shipfitmodule(IShipfitmodulesearch shipfitmodulesearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch shipfitorder tablesearch
     * @param shipfitordersearch: IShipfitordersearch
     */
    public void shipfitorder(IShipfitordersearch shipfitordersearch);
    
}
