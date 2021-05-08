/*
 * Systemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 8.4.2021 13:20
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISystemsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eSystem;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for System table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Systemsearch extends Tablesearch implements ISystemsearch {

    Numbersearch id = new Numbersearch("system.id");
    Stringsearch name = new Stringsearch("system.name");
    Stringsearch security_class = new Stringsearch("system.security_class");
    Numbersearch security_status = new Numbersearch("system.security_status");
    Numbersearch star_id = new Numbersearch("system.star_id");
    Foreignkeysearch constellationsearcher = new Foreignkeysearch("constellation", ISystem.constellationPKfields, ISystem.constellationFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Systemsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Systemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(security_class);
        addFieldsearcher(security_status);
        addFieldsearcher(star_id);
        addKeysearcher(constellationsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param systemPK: System primery key
     */
    public void addPrimarykey(ISystemPK systemPK) {
        super.addPrimarykey(systemPK);
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
     * add String search values for field security_class, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void security_class(String[] values) {
        addStringvalues(security_class, values);
    }
    
    /**
     * add String search values for field security_class
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void security_class(String[] values, byte compare, byte andor) {
        addStringvalues(security_class, values);
        security_class.setCompareoperator(compare);
        security_class.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field security_status, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void security_status(Double[] values, byte[] operators) {
        addNumbervalues(security_status, values, operators);
    }
    
    /**
     * add Numeric search values for field security_status
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void security_status(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(security_status, values, operators);
        security_status.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field star_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void star_id(Double[] values, byte[] operators) {
        addNumbervalues(star_id, values, operators);
    }
    
    /**
     * add Numeric search values for field star_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void star_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(star_id, values, operators);
        star_id.setAndoroperator(andor);
    }
    
    /**
     * set subsearch constellation tablesearch
     * @param constellationsearch: IConstellationsearch
     */
    public void constellation(IConstellationsearch constellationsearch) {
        constellationsearcher.setTablesearch(constellationsearch);
    }
    
    /**
     * 
     * @return Tablesearch for System
     */
    public IConstellationsearch getConstellationsearch() {
        if(constellationsearcher.used()) {
            return (IConstellationsearch)constellationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if constellationsearcher is not used
     * @return inner join statement
     */
    public String getConstellationInnerjoin() {
        return constellationsearcher.getInnerjoin();
    }

}
