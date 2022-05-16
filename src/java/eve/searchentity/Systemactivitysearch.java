/*
 * Systemactivitysearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.3.2022 17:21
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISystemactivitysearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Systemactivity;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Systemactivity table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Systemactivitysearch extends Tablesearch implements ISystemactivitysearch {

    Timesearch timeslot = new Timesearch("systemactivity.timeslot");
    Numbersearch ship_jumps = new Numbersearch("systemactivity.ship_jumps");
    Numbersearch npc_kills = new Numbersearch("systemactivity.npc_kills");
    Numbersearch ship_kills = new Numbersearch("systemactivity.ship_kills");
    Numbersearch pod_kills = new Numbersearch("systemactivity.pod_kills");
//foreign keys
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", ISystemactivity.systemPKfields, ISystemactivity.systemFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Systemactivity.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Systemactivitysearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Systemactivitysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(timeslot);
        addFieldsearcher(ship_jumps);
        addFieldsearcher(npc_kills);
        addFieldsearcher(ship_kills);
        addFieldsearcher(pod_kills);
        addKeysearcher(systemsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param systemactivityPK: Systemactivity primery key
     */
    public void addPrimarykey(ISystemactivityPK systemactivityPK) {
        super.addPrimarykey(systemactivityPK);
    }

    /**
     * add Timestamp search values for field timeslot, default OR operator is used
     * @param values: Array of time search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void timeslot(Timestamp[] values, byte[] operators) {
        addTimevalues(timeslot, values, operators);
    }
    
    /**
     * add Timestamp search values for field timeslot
     * @param values: Array of time search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void timeslot(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(timeslot, values, operators);
        timeslot.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field ship_jumps, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void ship_jumps(Double[] values, byte[] operators) {
        addNumbervalues(ship_jumps, values, operators);
    }
    
    /**
     * add Numeric search values for field ship_jumps
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void ship_jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(ship_jumps, values, operators);
        ship_jumps.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field npc_kills, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void npc_kills(Double[] values, byte[] operators) {
        addNumbervalues(npc_kills, values, operators);
    }
    
    /**
     * add Numeric search values for field npc_kills
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void npc_kills(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(npc_kills, values, operators);
        npc_kills.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field ship_kills, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void ship_kills(Double[] values, byte[] operators) {
        addNumbervalues(ship_kills, values, operators);
    }
    
    /**
     * add Numeric search values for field ship_kills
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void ship_kills(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(ship_kills, values, operators);
        ship_kills.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field pod_kills, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void pod_kills(Double[] values, byte[] operators) {
        addNumbervalues(pod_kills, values, operators);
    }
    
    /**
     * add Numeric search values for field pod_kills
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void pod_kills(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(pod_kills, values, operators);
        pod_kills.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch system ISystemsearch
     * @param systemsearch: ISystemsearch
     */
    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * get foreign key subsearch system ISystemsearch
     * @return Tablesearch for Systemactivity
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
