/*
 * IShipfitmodulesearch.java
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
 * Search Interface for Shipfitmodule table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IShipfitmodulesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param shipfitmodulePK: Shipfitmodule primery key
     */
    public void addPrimarykey(IShipfitmodulePK shipfitmodulePK);

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
	 * set subsearch evetype tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetype(IEvetypesearch evetypesearch);
	
	/**
   * foreign key
	 * set subsearch shipfit tablesearch
	 * @param shipfitsearch: IShipfitsearch
	 */
	public void shipfit(IShipfitsearch shipfitsearch);
	
}
