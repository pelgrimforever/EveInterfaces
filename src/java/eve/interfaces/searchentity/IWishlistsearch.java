/*
 * IWishlistsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.11.2021 17:35
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
 * Search Interface for Wishlist table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IWishlistsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param wishlistPK: Wishlist primery key
     */
    public void addPrimarykey(IWishlistPK wishlistPK);

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
	 * add Numeric search values for field maxprice, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void maxprice(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field maxprice
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void maxprice(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch evetype tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetype(IEvetypesearch evetypesearch);
	
}
