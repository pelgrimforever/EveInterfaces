/*
 * Constellationsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 8.4.2021 13:20
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IConstellationsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eConstellation;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Constellation table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Constellationsearch extends Tablesearch implements IConstellationsearch {

    Numbersearch id = new Numbersearch("constellation.id");
    Stringsearch name = new Stringsearch("constellation.name");
    Foreignkeysearch regionsearcher = new Foreignkeysearch("region", IConstellation.regionPKfields, IConstellation.regionFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Constellationsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Constellationsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addKeysearcher(regionsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param constellationPK: Constellation primery key
     */
    public void addPrimarykey(IConstellationPK constellationPK) {
        super.addPrimarykey(constellationPK);
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
     * set subsearch region tablesearch
     * @param regionsearch: IRegionsearch
     */
    public void region(IRegionsearch regionsearch) {
        regionsearcher.setTablesearch(regionsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Constellation
     */
    public IRegionsearch getRegionsearch() {
        if(regionsearcher.used()) {
            return (IRegionsearch)regionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if regionsearcher is not used
     * @return inner join statement
     */
    public String getRegionInnerjoin() {
        return regionsearcher.getInnerjoin();
    }

}
