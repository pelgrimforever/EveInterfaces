/*
 * Systemjumpssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISystemjumpssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eSystemjumps;
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
    Foreignkeysearch systemSystem_endsearcher = new Foreignkeysearch("system", ISystemjumps.systemSystem_endPKfields, ISystemjumps.systemSystem_endFKfields);
    Foreignkeysearch systemSystem_startsearcher = new Foreignkeysearch("system", ISystemjumps.systemSystem_startPKfields, ISystemjumps.systemSystem_startFKfields);

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
     * set subsearch systemSystem_end tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void systemSystem_end(ISystemsearch systemsearch) {
        systemSystem_endsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
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
     * set subsearch systemSystem_start tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void systemSystem_start(ISystemsearch systemsearch) {
        systemSystem_startsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
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
