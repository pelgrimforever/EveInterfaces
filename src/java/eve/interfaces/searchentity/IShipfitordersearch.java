/*
 * IShipfitordersearch.java
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
 * Search Interface for Shipfitorder table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IShipfitordersearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param shipfitorderPK: Shipfitorder primery key
     */
    public void addPrimarykey(IShipfitorderPK shipfitorderPK);

	/**
	 * add Numeric search values for field amountwanted, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void amountwanted(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field amountwanted
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void amountwanted(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field amountinstock, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void amountinstock(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field amountinstock
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void amountinstock(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch shipfit tablesearch
	 * @param shipfitsearch: IShipfitsearch
	 */
	public void shipfit(IShipfitsearch shipfitsearch);
	
	/**
   * foreign key
	 * set subsearch evetype tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetype(IEvetypesearch evetypesearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch shipfitorderselected tablesearch
     * @param shipfitorderselectedsearch: IShipfitorderselectedsearch
     */
    public void shipfitorderselected(IShipfitorderselectedsearch shipfitorderselectedsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch orders tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void relorders(IOrderssearch orderssearch);
    
}
