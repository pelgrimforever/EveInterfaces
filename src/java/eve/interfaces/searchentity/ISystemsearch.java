/*
 * ISystemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
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
 * Search Interface for System table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISystemsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param systemPK: System primery key
     */
    public void addPrimarykey(ISystemPK systemPK);

	/**
	 * add Numeric search values for field id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void id(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void id(long[] values, byte[] operators, byte andor);
	
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
	 * add String search values for field security_class, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void security_class(String[] values);
	
	/**
	 * add String search values for field security_class
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void security_class(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field security_status, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void security_status(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field security_status
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void security_status(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field star_id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void star_id(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field star_id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void star_id(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field noaccess
	 * @param value: true or false
	 */
	public void noaccess(Boolean value);
	
	/**
	 * add Boolean search values for field isconstellationborder
	 * @param value: true or false
	 */
	public void isconstellationborder(Boolean value);
	
	/**
	 * add Boolean search values for field isregionborder
	 * @param value: true or false
	 */
	public void isregionborder(Boolean value);
	
	/**
	 * add Date search values for field downloaddate, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void downloaddate(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field downloaddate
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void downloaddate(Date[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch security_island tablesearch
	 * @param security_islandsearch: ISecurity_islandsearch
	 */
	public void security_island(ISecurity_islandsearch security_islandsearch);
	
	/**
   * foreign key
	 * set subsearch constellation tablesearch
	 * @param constellationsearch: IConstellationsearch
	 */
	public void constellation(IConstellationsearch constellationsearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch systemjumps tablesearch
     * @param systemjumpssearch: ISystemjumpssearch
     */
    public void systemjumpsSystem_end(ISystemjumpssearch systemjumpssearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch systemjumps tablesearch
     * @param systemjumpssearch: ISystemjumpssearch
     */
    public void systemjumpsSystem_start(ISystemjumpssearch systemjumpssearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch tradecombined tablesearch
     * @param tradecombinedsearch: ITradecombinedsearch
     */
    public void tradecombinedBuy_system(ITradecombinedsearch tradecombinedsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void relevetype1(IEvetypesearch evetypesearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch tradecombined tablesearch
     * @param tradecombinedsearch: ITradecombinedsearch
     */
    public void tradecombinedSell_system(ITradecombinedsearch tradecombinedsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void relevetype2(IEvetypesearch evetypesearch);
    
}
