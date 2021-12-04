/*
 * IGraphicsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.11.2021 14:51
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
 * Search Interface for Graphic table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IGraphicsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param graphicPK: Graphic primery key
     */
    public void addPrimarykey(IGraphicPK graphicPK);

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
	 * add String search values for field collision_file, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void collision_file(String[] values);
	
	/**
	 * add String search values for field collision_file
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void collision_file(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field graphic_file, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void graphic_file(String[] values);
	
	/**
	 * add String search values for field graphic_file
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void graphic_file(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field icon_folder, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void icon_folder(String[] values);
	
	/**
	 * add String search values for field icon_folder
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void icon_folder(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field sof_dna, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void sof_dna(String[] values);
	
	/**
	 * add String search values for field sof_dna
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void sof_dna(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field sof_fation_name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void sof_fation_name(String[] values);
	
	/**
	 * add String search values for field sof_fation_name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void sof_fation_name(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field sof_hull_name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void sof_hull_name(String[] values);
	
	/**
	 * add String search values for field sof_hull_name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void sof_hull_name(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field sof_race_name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void sof_race_name(String[] values);
	
	/**
	 * add String search values for field sof_race_name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void sof_race_name(String[] values, byte compare, byte andor);
	
}
