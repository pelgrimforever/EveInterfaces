/*
 * Factionsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IFactionsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eFaction;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Faction table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Factionsearch extends Tablesearch implements IFactionsearch {

    Numbersearch id = new Numbersearch("faction.id");
    Stringsearch name = new Stringsearch("faction.name");
    Stringsearch description = new Stringsearch("faction.description");
    Booleansearch is_unique = new Booleansearch("faction.is_unique");
    Numbersearch size_factor = new Numbersearch("faction.size_factor");
    Numbersearch station_count = new Numbersearch("faction.station_count");
    Numbersearch station_system_count = new Numbersearch("faction.station_system_count");
    Numbersearch corporation = new Numbersearch("faction.corporation");
    Numbersearch militia_corporation = new Numbersearch("faction.militia_corporation");
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", IFaction.systemPKfields, IFaction.systemFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Factionsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Factionsearch(byte andor) {
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
        addFieldsearcher(is_unique);
        addFieldsearcher(size_factor);
        addFieldsearcher(station_count);
        addFieldsearcher(station_system_count);
        addFieldsearcher(corporation);
        addFieldsearcher(militia_corporation);
        addKeysearcher(systemsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param factionPK: Faction primery key
     */
    public void addPrimarykey(IFactionPK factionPK) {
        super.addPrimarykey(factionPK);
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
     * add Boolean search values for field is_unique
     * @param value: true or false
     */
    public void is_unique(Boolean value) {
        addBooleanvalue(is_unique, value);
    }
    
    /**
     * add Numeric search values for field size_factor, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void size_factor(Double[] values, byte[] operators) {
        addNumbervalues(size_factor, values, operators);
    }
    
    /**
     * add Numeric search values for field size_factor
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void size_factor(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(size_factor, values, operators);
        size_factor.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field station_count, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void station_count(Double[] values, byte[] operators) {
        addNumbervalues(station_count, values, operators);
    }
    
    /**
     * add Numeric search values for field station_count
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void station_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(station_count, values, operators);
        station_count.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field station_system_count, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void station_system_count(Double[] values, byte[] operators) {
        addNumbervalues(station_system_count, values, operators);
    }
    
    /**
     * add Numeric search values for field station_system_count
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void station_system_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(station_system_count, values, operators);
        station_system_count.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field corporation, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void corporation(Double[] values, byte[] operators) {
        addNumbervalues(corporation, values, operators);
    }
    
    /**
     * add Numeric search values for field corporation
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void corporation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(corporation, values, operators);
        corporation.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field militia_corporation, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void militia_corporation(Double[] values, byte[] operators) {
        addNumbervalues(militia_corporation, values, operators);
    }
    
    /**
     * add Numeric search values for field militia_corporation
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void militia_corporation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(militia_corporation, values, operators);
        militia_corporation.setAndoroperator(andor);
    }
    
    /**
     * set subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Faction
     */
    public ISystemsearch getSystemsearch() {
        if(systemsearcher.used()) {
            return (ISystemsearch)systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemsearcher is not used
     * @return inner join statement
     */
    public String getSystemInnerjoin() {
        return systemsearcher.getInnerjoin();
    }

}
