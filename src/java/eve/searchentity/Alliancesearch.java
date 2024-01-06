/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

public class Alliancesearch extends Tablesearch implements IAlliancesearch {

    Numbersearch id = new Numbersearch("alliance.id");
    Stringsearch name = new Stringsearch("alliance.name");
    Numbersearch creator = new Numbersearch("alliance.creator");
    Timesearch date_founded = new Timesearch("alliance.date_founded");
    Stringsearch ticker = new Stringsearch("alliance.ticker");
    Numbersearch faction_id = new Numbersearch("alliance.faction_id");
//foreign keys
    Foreignkeysearch corporationCreator_corporationsearcher = new Foreignkeysearch("corporation", IAlliance.corporationCreator_corporationPKfields, IAlliance.corporationCreator_corporationFKfields);
    Foreignkeysearch corporationExecutor_corporationsearcher = new Foreignkeysearch("corporation", IAlliance.corporationExecutor_corporationPKfields, IAlliance.corporationExecutor_corporationFKfields);
//external foreign keys

    public String getTable() {
        return Alliance.table;
    }

    public Alliancesearch() {
        setFieldsearchers();
    }

    public Alliancesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void addPrimarykey(IAlliancePK alliancePK) {
        super.addPrimarykey(alliancePK);
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
    
    public void creator(Double[] values, byte[] operators) {
        addNumbervalues(creator, values, operators);
    }
    
    public void creator(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(creator, values, operators);
        creator.setAndoroperator(andor);
    }
    
    public void date_founded(Timestamp[] values, byte[] operators) {
        addTimevalues(date_founded, values, operators);
    }
    
    public void date_founded(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_founded, values, operators);
        date_founded.setAndoroperator(andor);
    }
    
    public void ticker(String[] values) {
        addStringvalues(ticker, values);
    }
    
    public void ticker(String[] values, byte compare, byte andor) {
        addStringvalues(ticker, values);
        ticker.setCompareoperator(compare);
        ticker.setAndoroperator(andor);
    }
    
    public void faction_id(Double[] values, byte[] operators) {
        addNumbervalues(faction_id, values, operators);
    }
    
    public void faction_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(faction_id, values, operators);
        faction_id.setAndoroperator(andor);
    }
    
    public void corporationCreator_corporation(ICorporationsearch corporationsearch) {
        corporationCreator_corporationsearcher.setTablesearch(corporationsearch);
    }
    
    public ICorporationsearch getCorporationcreator_corporationsearch() {
        if(corporationCreator_corporationsearcher.used()) {
            return (ICorporationsearch)corporationCreator_corporationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getCorporationcreator_corporationInnerjoin() {
        return corporationCreator_corporationsearcher.getInnerjoin();
    }

    public void corporationExecutor_corporation(ICorporationsearch corporationsearch) {
        corporationExecutor_corporationsearcher.setTablesearch(corporationsearch);
    }
    
    public ICorporationsearch getCorporationexecutor_corporationsearch() {
        if(corporationExecutor_corporationsearcher.used()) {
            return (ICorporationsearch)corporationExecutor_corporationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getCorporationexecutor_corporationInnerjoin() {
        return corporationExecutor_corporationsearcher.getInnerjoin();
    }

}
