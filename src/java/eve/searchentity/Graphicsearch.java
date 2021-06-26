/*
 * Graphicsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IGraphicsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eGraphic;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Graphic table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Graphicsearch extends Tablesearch implements IGraphicsearch {

    Numbersearch id = new Numbersearch("graphic.id");
    Stringsearch collision_file = new Stringsearch("graphic.collision_file");
    Stringsearch graphic_file = new Stringsearch("graphic.graphic_file");
    Stringsearch icon_folder = new Stringsearch("graphic.icon_folder");
    Stringsearch sof_dna = new Stringsearch("graphic.sof_dna");
    Stringsearch sof_fation_name = new Stringsearch("graphic.sof_fation_name");
    Stringsearch sof_hull_name = new Stringsearch("graphic.sof_hull_name");
    Stringsearch sof_race_name = new Stringsearch("graphic.sof_race_name");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Graphicsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Graphicsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(collision_file);
        addFieldsearcher(graphic_file);
        addFieldsearcher(icon_folder);
        addFieldsearcher(sof_dna);
        addFieldsearcher(sof_fation_name);
        addFieldsearcher(sof_hull_name);
        addFieldsearcher(sof_race_name);
    }

    /**
     * add a primary key instance to search for
     * @param graphicPK: Graphic primery key
     */
    public void addPrimarykey(IGraphicPK graphicPK) {
        super.addPrimarykey(graphicPK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field collision_file, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void collision_file(String[] values) {
        addStringvalues(collision_file, values);
    }
    
    /**
     * add String search values for field collision_file
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void collision_file(String[] values, byte compare, byte andor) {
        addStringvalues(collision_file, values);
        collision_file.setCompareoperator(compare);
        collision_file.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field graphic_file, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void graphic_file(String[] values) {
        addStringvalues(graphic_file, values);
    }
    
    /**
     * add String search values for field graphic_file
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void graphic_file(String[] values, byte compare, byte andor) {
        addStringvalues(graphic_file, values);
        graphic_file.setCompareoperator(compare);
        graphic_file.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field icon_folder, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void icon_folder(String[] values) {
        addStringvalues(icon_folder, values);
    }
    
    /**
     * add String search values for field icon_folder
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void icon_folder(String[] values, byte compare, byte andor) {
        addStringvalues(icon_folder, values);
        icon_folder.setCompareoperator(compare);
        icon_folder.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field sof_dna, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void sof_dna(String[] values) {
        addStringvalues(sof_dna, values);
    }
    
    /**
     * add String search values for field sof_dna
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void sof_dna(String[] values, byte compare, byte andor) {
        addStringvalues(sof_dna, values);
        sof_dna.setCompareoperator(compare);
        sof_dna.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field sof_fation_name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void sof_fation_name(String[] values) {
        addStringvalues(sof_fation_name, values);
    }
    
    /**
     * add String search values for field sof_fation_name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void sof_fation_name(String[] values, byte compare, byte andor) {
        addStringvalues(sof_fation_name, values);
        sof_fation_name.setCompareoperator(compare);
        sof_fation_name.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field sof_hull_name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void sof_hull_name(String[] values) {
        addStringvalues(sof_hull_name, values);
    }
    
    /**
     * add String search values for field sof_hull_name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void sof_hull_name(String[] values, byte compare, byte andor) {
        addStringvalues(sof_hull_name, values);
        sof_hull_name.setCompareoperator(compare);
        sof_hull_name.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field sof_race_name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void sof_race_name(String[] values) {
        addStringvalues(sof_race_name, values);
    }
    
    /**
     * add String search values for field sof_race_name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void sof_race_name(String[] values, byte compare, byte andor) {
        addStringvalues(sof_race_name, values);
        sof_race_name.setCompareoperator(compare);
        sof_race_name.setAndoroperator(andor);
    }
    
}
