/*
 * ITradecombinedsearch.java
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
 * Search Interface for Tradecombined table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ITradecombinedsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param tradecombinedPK: Tradecombined primery key
     */
    public void addPrimarykey(ITradecombinedPK tradecombinedPK);

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
   * foreign key
	 * set subsearch evetype tablesearch
	 * @param evetypesearch: IEvetypesearch
	 */
	public void evetype(IEvetypesearch evetypesearch);
	
	/**
   * foreign key
	 * set subsearch systemBuy_system tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void systemBuy_system(ISystemsearch systemsearch);
	
	/**
   * foreign key
	 * set subsearch systemSell_system tablesearch
	 * @param systemsearch: ISystemsearch
	 */
	public void systemSell_system(ISystemsearch systemsearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch tradecombined_sell tablesearch
     * @param tradecombined_sellsearch: ITradecombined_sellsearch
     */
    public void tradecombined_sell(ITradecombined_sellsearch tradecombined_sellsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch orders tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void relorders1(IOrderssearch orderssearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch orders tablesearch
     * @param orderssearch: IOrderssearch
     */
    public void relorders2(IOrderssearch orderssearch);
    
}
