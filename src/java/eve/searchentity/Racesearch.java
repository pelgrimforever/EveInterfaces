/*
 * Racesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 8.4.2021 13:20
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IRacesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eRace;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Race table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Racesearch extends Tablesearch implements IRacesearch {

    Numbersearch id = new Numbersearch("race.id");
    Stringsearch name = new Stringsearch("race.name");
    Stringsearch description = new Stringsearch("race.description");
    Numbersearch alliance = new Numbersearch("race.alliance");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Racesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Racesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(description);
        addFieldsearcher(alliance);
    }

    /**
     * add a primary key instance to search for
     * @param racePK: Race primery key
     */
    public void addPrimarykey(IRacePK racePK) {
        super.addPrimarykey(racePK);
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
     * add String search values for field name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    /**
     * add String search values for field name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field description, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    /**
     * add String search values for field description
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field alliance, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void alliance(Double[] values, byte[] operators) {
        addNumbervalues(alliance, values, operators);
    }
    
    /**
     * add Numeric search values for field alliance
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void alliance(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(alliance, values, operators);
        alliance.setAndoroperator(andor);
    }
    
}
