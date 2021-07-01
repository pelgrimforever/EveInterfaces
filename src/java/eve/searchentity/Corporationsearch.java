/*
 * Corporationsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ICorporationsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eCorporation;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Corporation table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Corporationsearch extends Tablesearch implements ICorporationsearch {

    Numbersearch id = new Numbersearch("corporation.id");
    Stringsearch name = new Stringsearch("corporation.name");
    Numbersearch ceo = new Numbersearch("corporation.ceo");
    Numbersearch creator = new Numbersearch("corporation.creator");
    Numbersearch member_count = new Numbersearch("corporation.member_count");
    Numbersearch tax_rate = new Numbersearch("corporation.tax_rate");
    Stringsearch ticker = new Stringsearch("corporation.ticker");
    Timesearch date_founded = new Timesearch("corporation.date_founded");
    Stringsearch description = new Stringsearch("corporation.description");
    Numbersearch shares = new Numbersearch("corporation.shares");
    Stringsearch url = new Stringsearch("corporation.url");
    Booleansearch war_eligible = new Booleansearch("corporation.war_eligible");
    Foreignkeysearch stationsearcher = new Foreignkeysearch("station", ICorporation.stationPKfields, ICorporation.stationFKfields);
    Foreignkeysearch factionsearcher = new Foreignkeysearch("faction", ICorporation.factionPKfields, ICorporation.factionFKfields);
    Foreignkeysearch alliancesearcher = new Foreignkeysearch("alliance", ICorporation.alliancePKfields, ICorporation.allianceFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Corporationsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Corporationsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(ceo);
        addFieldsearcher(creator);
        addFieldsearcher(member_count);
        addFieldsearcher(tax_rate);
        addFieldsearcher(ticker);
        addFieldsearcher(date_founded);
        addFieldsearcher(description);
        addFieldsearcher(shares);
        addFieldsearcher(url);
        addFieldsearcher(war_eligible);
        addKeysearcher(stationsearcher);
        addKeysearcher(factionsearcher);
        addKeysearcher(alliancesearcher);
    }

    /**
     * add a primary key instance to search for
     * @param corporationPK: Corporation primery key
     */
    public void addPrimarykey(ICorporationPK corporationPK) {
        super.addPrimarykey(corporationPK);
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
     * add Numeric search values for field ceo, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void ceo(Double[] values, byte[] operators) {
        addNumbervalues(ceo, values, operators);
    }
    
    /**
     * add Numeric search values for field ceo
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void ceo(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(ceo, values, operators);
        ceo.setAndoroperator(andor);
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
     * add Numeric search values for field member_count, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void member_count(Double[] values, byte[] operators) {
        addNumbervalues(member_count, values, operators);
    }
    
    /**
     * add Numeric search values for field member_count
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void member_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(member_count, values, operators);
        member_count.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field tax_rate, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void tax_rate(Double[] values, byte[] operators) {
        addNumbervalues(tax_rate, values, operators);
    }
    
    /**
     * add Numeric search values for field tax_rate
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void tax_rate(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(tax_rate, values, operators);
        tax_rate.setAndoroperator(andor);
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
     * add Numeric search values for field shares, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void shares(Double[] values, byte[] operators) {
        addNumbervalues(shares, values, operators);
    }
    
    /**
     * add Numeric search values for field shares
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void shares(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(shares, values, operators);
        shares.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field url, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void url(String[] values) {
        addStringvalues(url, values);
    }
    
    /**
     * add String search values for field url
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void url(String[] values, byte compare, byte andor) {
        addStringvalues(url, values);
        url.setCompareoperator(compare);
        url.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field war_eligible
     * @param value: true or false
     */
    public void war_eligible(Boolean value) {
        addBooleanvalue(war_eligible, value);
    }
    
    /**
     * set subsearch station tablesearch
     * @param stationsearch: IStationsearch
     */
    public void station(IStationsearch stationsearch) {
        stationsearcher.setTablesearch(stationsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Corporation
     */
    public IStationsearch getStationsearch() {
        if(stationsearcher.used()) {
            return (IStationsearch)stationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if stationsearcher is not used
     * @return inner join statement
     */
    public String getStationInnerjoin() {
        return stationsearcher.getInnerjoin();
    }

    /**
     * set subsearch faction tablesearch
     * @param factionsearch: IFactionsearch
     */
    public void faction(IFactionsearch factionsearch) {
        factionsearcher.setTablesearch(factionsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Corporation
     */
    public IFactionsearch getFactionsearch() {
        if(factionsearcher.used()) {
            return (IFactionsearch)factionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if factionsearcher is not used
     * @return inner join statement
     */
    public String getFactionInnerjoin() {
        return factionsearcher.getInnerjoin();
    }

    /**
     * set subsearch alliance tablesearch
     * @param alliancesearch: IAlliancesearch
     */
    public void alliance(IAlliancesearch alliancesearch) {
        alliancesearcher.setTablesearch(alliancesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Corporation
     */
    public IAlliancesearch getAlliancesearch() {
        if(alliancesearcher.used()) {
            return (IAlliancesearch)alliancesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if alliancesearcher is not used
     * @return inner join statement
     */
    public String getAllianceInnerjoin() {
        return alliancesearcher.getInnerjoin();
    }

}
