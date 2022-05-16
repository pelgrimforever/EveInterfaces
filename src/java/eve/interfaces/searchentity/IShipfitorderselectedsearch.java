/*
 * IShipfitorderselectedsearch.java
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
 * Search Interface for Shipfitorderselected table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IShipfitorderselectedsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param shipfitorderselectedPK: Shipfitorderselected primery key
     */
    public void addPrimarykey(IShipfitorderselectedPK shipfitorderselectedPK);

	/**
	 * add Numeric search values for field amount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void amount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field amount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void amount(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch orders tablesearch
	 * @param orderssearch: IOrderssearch
	 */
	public void orders(IOrderssearch orderssearch);
	
	/**
   * foreign key
	 * set subsearch shipfitorder tablesearch
	 * @param shipfitordersearch: IShipfitordersearch
	 */
	public void shipfitorder(IShipfitordersearch shipfitordersearch);
	
}
