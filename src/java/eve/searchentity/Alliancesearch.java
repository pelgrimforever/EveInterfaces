/*
 * Alliancesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 8.10.2021 7:21
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IAlliancesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Alliance;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Alliance table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Alliancesearch extends Tablesearch implements IAlliancesearch {

    Numbersearch id = new Numbersearch("alliance.id");
    Stringsearch name = new Stringsearch("alliance.name");
    Numbersearch creator = new Numbersearch("alliance.creator");
    Timesearch date_founded = new Timesearch("alliance.date_founded");
    Stringsearch ticker = new Stringsearch("alliance.ticker");
    Numbersearch faction_id = new Numbersearch("alliance.faction_id");
    Foreignkeysearch corporationCreator_corporationsearcher = new Foreignkeysearch("corporation", IAlliance.corporationCreator_corporationPKfields, IAlliance.corporationCreator_corporationFKfields);
    Foreignkeysearch corporationExecutor_corporationsearcher = new Foreignkeysearch("corporation", IAlliance.corporationExecutor_corporationPKfields, IAlliance.corporationExecutor_corporationFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Alliance.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Alliancesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Alliancesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(creator);
        addFieldsearcher(date_founded);
        addFieldsearcher(ticker);
        addFieldsearcher(faction_id);
        addKeysearcher(corporationCreator_corporationsearcher);
        addKeysearcher(corporationExecutor_corporationsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param alliancePK: Alliance primery key
     */
    public void addPrimarykey(IAlliancePK alliancePK) {
        super.addPrimarykey(alliancePK);
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
     * add Numeric search values for field creator, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void creator(Double[] values, byte[] operators) {
        addNumbervalues(creator, values, operators);
    }
    
    /**
     * add Numeric search values for field creator
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void creator(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(creator, values, operators);
        creator.setAndoroperator(andor);
    }
    
    /**
     * add Timestamp search values for field date_founded, default OR operator is used
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void date_founded(Timestamp[] values, byte[] operators) {
        addTimevalues(date_founded, values, operators);
    }
    
    /**
     * add Timestamp search values for field date_founded
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void date_founded(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_founded, values, operators);
        date_founded.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field ticker, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void ticker(String[] values) {
        addStringvalues(ticker, values);
    }
    
    /**
     * add String search values for field ticker
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void ticker(String[] values, byte compare, byte andor) {
        addStringvalues(ticker, values);
        ticker.setCompareoperator(compare);
        ticker.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field faction_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void faction_id(Double[] values, byte[] operators) {
        addNumbervalues(faction_id, values, operators);
    }
    
    /**
     * add Numeric search values for field faction_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void faction_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(faction_id, values, operators);
        faction_id.setAndoroperator(andor);
    }
    
    /**
     * set subsearch corporationCreator_corporation tablesearch
     * @param corporationsearch: ICorporationsearch
     */
    public void corporationCreator_corporation(ICorporationsearch corporationsearch) {
        corporationCreator_corporationsearcher.setTablesearch(corporationsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Alliance
     */
    public ICorporationsearch getCorporationcreator_corporationsearch() {
        if(corporationCreator_corporationsearcher.used()) {
            return (ICorporationsearch)corporationCreator_corporationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if corporationCreator_corporationsearcher is not used
     * @return inner join statement
     */
    public String getCorporationcreator_corporationInnerjoin() {
        return corporationCreator_corporationsearcher.getInnerjoin();
    }

    /**
     * set subsearch corporationExecutor_corporation tablesearch
     * @param corporationsearch: ICorporationsearch
     */
    public void corporationExecutor_corporation(ICorporationsearch corporationsearch) {
        corporationExecutor_corporationsearcher.setTablesearch(corporationsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Alliance
     */
    public ICorporationsearch getCorporationexecutor_corporationsearch() {
        if(corporationExecutor_corporationsearcher.used()) {
            return (ICorporationsearch)corporationExecutor_corporationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if corporationExecutor_corporationsearcher is not used
     * @return inner join statement
     */
    public String getCorporationexecutor_corporationInnerjoin() {
        return corporationExecutor_corporationsearcher.getInnerjoin();
    }

}
