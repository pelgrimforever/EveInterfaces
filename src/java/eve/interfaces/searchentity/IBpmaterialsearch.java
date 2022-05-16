/*
 * IBpmaterialsearch.java
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
 * Search Interface for Bpmaterial table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IBpmaterialsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param bpmaterialPK: Bpmaterial primery key
     */
    public void addPrimarykey(IBpmaterialPK bpmaterialPK);

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
	 * set subsearch evetypeBp tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetypeBp(IEvetypesearch evetypesearch);
	
	/**
   * foreign key
	 * set subsearch evetypeMaterial tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetypeMaterial(IEvetypesearch evetypesearch);
	
}
