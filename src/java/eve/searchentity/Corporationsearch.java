/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.ICorporationsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Corporation;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

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
//foreign keys
    Foreignkeysearch stationsearcher = new Foreignkeysearch("station", ICorporation.stationPKfields, ICorporation.stationFKfields);
    Foreignkeysearch factionsearcher = new Foreignkeysearch("faction", ICorporation.factionPKfields, ICorporation.factionFKfields);
    Foreignkeysearch alliancesearcher = new Foreignkeysearch("alliance", ICorporation.alliancePKfields, ICorporation.allianceFKfields);
//external foreign keys

    public String getTable() {
        return Corporation.table;
    }

    public Corporationsearch() {
        setFieldsearchers();
    }

    public Corporationsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void addPrimarykey(ICorporationPK corporationPK) {
        super.addPrimarykey(corporationPK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void ceo(Double[] values, byte[] operators) {
        addNumbervalues(ceo, values, operators);
    }
    
    public void ceo(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(ceo, values, operators);
        ceo.setAndoroperator(andor);
    }
    
    public void creator(Double[] values, byte[] operators) {
        addNumbervalues(creator, values, operators);
    }
    
    public void creator(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(creator, values, operators);
        creator.setAndoroperator(andor);
    }
    
    public void member_count(Double[] values, byte[] operators) {
        addNumbervalues(member_count, values, operators);
    }
    
    public void member_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(member_count, values, operators);
        member_count.setAndoroperator(andor);
    }
    
    public void tax_rate(Double[] values, byte[] operators) {
        addNumbervalues(tax_rate, values, operators);
    }
    
    public void tax_rate(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(tax_rate, values, operators);
        tax_rate.setAndoroperator(andor);
    }
    
    public void ticker(String[] values) {
        addStringvalues(ticker, values);
    }
    
    public void ticker(String[] values, byte compare, byte andor) {
        addStringvalues(ticker, values);
        ticker.setCompareoperator(compare);
        ticker.setAndoroperator(andor);
    }
    
    public void date_founded(Timestamp[] values, byte[] operators) {
        addTimevalues(date_founded, values, operators);
    }
    
    public void date_founded(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_founded, values, operators);
        date_founded.setAndoroperator(andor);
    }
    
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    public void shares(Double[] values, byte[] operators) {
        addNumbervalues(shares, values, operators);
    }
    
    public void shares(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(shares, values, operators);
        shares.setAndoroperator(andor);
    }
    
    public void url(String[] values) {
        addStringvalues(url, values);
    }
    
    public void url(String[] values, byte compare, byte andor) {
        addStringvalues(url, values);
        url.setCompareoperator(compare);
        url.setAndoroperator(andor);
    }
    
    public void war_eligible(Boolean value) {
        addBooleanvalue(war_eligible, value);
    }
    
    public void station(IStationsearch stationsearch) {
        stationsearcher.setTablesearch(stationsearch);
    }
    
    public IStationsearch getStationsearch() {
        if(stationsearcher.used()) {
            return (IStationsearch)stationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getStationInnerjoin() {
        return stationsearcher.getInnerjoin();
    }

    public void faction(IFactionsearch factionsearch) {
        factionsearcher.setTablesearch(factionsearch);
    }
    
    public IFactionsearch getFactionsearch() {
        if(factionsearcher.used()) {
            return (IFactionsearch)factionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getFactionInnerjoin() {
        return factionsearcher.getInnerjoin();
    }

    public void alliance(IAlliancesearch alliancesearch) {
        alliancesearcher.setTablesearch(alliancesearch);
    }
    
    public IAlliancesearch getAlliancesearch() {
        if(alliancesearcher.used()) {
            return (IAlliancesearch)alliancesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getAllianceInnerjoin() {
        return alliancesearcher.getInnerjoin();
    }

}
