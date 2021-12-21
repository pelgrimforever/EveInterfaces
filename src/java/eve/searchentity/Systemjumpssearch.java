/*
 * Systemjumpssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.11.2021 15:45
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISystemjumpssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Systemjumps;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Systemjumps table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Systemjumpssearch extends Tablesearch implements ISystemjumpssearch {

    Numbersearch jumps = new Numbersearch("systemjumps.jumps");
    Numbersearch jumpslowsec = new Numbersearch("systemjumps.jumpslowsec");
    Numbersearch jumpsnullsec = new Numbersearch("systemjumps.jumpsnullsec");
    Numbersearch jumpssafe = new Numbersearch("systemjumps.jumpssafe");
    Numbersearch jumpssafelowsec = new Numbersearch("systemjumps.jumpssafelowsec");
    Numbersearch jumpssafenullsec = new Numbersearch("systemjumps.jumpssafenullsec");
//foreign keys
    Foreignkeysearch systemSystem_endsearcher = new Foreignkeysearch("system", ISystemjumps.systemSystem_endPKfields, ISystemjumps.systemSystem_endFKfields);
    Foreignkeysearch systemSystem_startsearcher = new Foreignkeysearch("system", ISystemjumps.systemSystem_startPKfields, ISystemjumps.systemSystem_startFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Systemjumps.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Systemjumpssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Systemjumpssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(jumps);
        addFieldsearcher(jumpslowsec);
        addFieldsearcher(jumpsnullsec);
        addFieldsearcher(jumpssafe);
        addFieldsearcher(jumpssafelowsec);
        addFieldsearcher(jumpssafenullsec);
        addKeysearcher(systemSystem_endsearcher);
        addKeysearcher(systemSystem_startsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param systemjumpsPK: Systemjumps primery key
     */
    public void addPrimarykey(ISystemjumpsPK systemjumpsPK) {
        super.addPrimarykey(systemjumpsPK);
    }

    /**
     * add Numeric search values for field jumps, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumps(Double[] values, byte[] operators) {
        addNumbervalues(jumps, values, operators);
    }
    
    /**
     * add Numeric search values for field jumps
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumps, values, operators);
        jumps.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpslowsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpslowsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpslowsec, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpslowsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpslowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpslowsec, values, operators);
        jumpslowsec.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpsnullsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpsnullsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpsnullsec, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpsnullsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpsnullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpsnullsec, values, operators);
        jumpsnullsec.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpssafe, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpssafe(Double[] values, byte[] operators) {
        addNumbervalues(jumpssafe, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpssafe
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpssafe(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpssafe, values, operators);
        jumpssafe.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpssafelowsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpssafelowsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpssafelowsec, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpssafelowsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpssafelowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpssafelowsec, values, operators);
        jumpssafelowsec.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpssafenullsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpssafenullsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpssafenullsec, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpssafenullsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpssafenullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpssafenullsec, values, operators);
        jumpssafenullsec.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch systemSystem_end ISystemsearch
     * @param systemsearch: ISystemsearch
     */
    public void systemSystem_end(ISystemsearch systemsearch) {
        systemSystem_endsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * get foreign key subsearch systemSystem_end ISystemsearch
     * @return Tablesearch for Systemjumps
     */
    public ISystemsearch getSystemsystem_endsearch() {
        if(systemSystem_endsearcher.used()) {
            return (ISystemsearch)systemSystem_endsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemSystem_endsearcher is not used
     * @return inner join statement
     */
    public String getSystemsystem_endInnerjoin() {
        return systemSystem_endsearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch systemSystem_start ISystemsearch
     * @param systemsearch: ISystemsearch
     */
    public void systemSystem_start(ISystemsearch systemsearch) {
        systemSystem_startsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * get foreign key subsearch systemSystem_start ISystemsearch
     * @return Tablesearch for Systemjumps
     */
    public ISystemsearch getSystemsystem_startsearch() {
        if(systemSystem_startsearcher.used()) {
            return (ISystemsearch)systemSystem_startsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemSystem_startsearcher is not used
     * @return inner join statement
     */
    public String getSystemsystem_startInnerjoin() {
        return systemSystem_startsearcher.getInnerjoin();
    }

}
