/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IFactionsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Faction;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

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
//foreign keys
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", IFaction.systemPKfields, IFaction.systemFKfields);
//external foreign keys

    public String getTable() {
        return Faction.table;
    }

    public Factionsearch() {
        setFieldsearchers();
    }

    public Factionsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void addPrimarykey(IFactionPK factionPK) {
        super.addPrimarykey(factionPK);
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
    
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    public void is_unique(Boolean value) {
        addBooleanvalue(is_unique, value);
    }
    
    public void size_factor(Double[] values, byte[] operators) {
        addNumbervalues(size_factor, values, operators);
    }
    
    public void size_factor(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(size_factor, values, operators);
        size_factor.setAndoroperator(andor);
    }
    
    public void station_count(Double[] values, byte[] operators) {
        addNumbervalues(station_count, values, operators);
    }
    
    public void station_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(station_count, values, operators);
        station_count.setAndoroperator(andor);
    }
    
    public void station_system_count(Double[] values, byte[] operators) {
        addNumbervalues(station_system_count, values, operators);
    }
    
    public void station_system_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(station_system_count, values, operators);
        station_system_count.setAndoroperator(andor);
    }
    
    public void corporation(Double[] values, byte[] operators) {
        addNumbervalues(corporation, values, operators);
    }
    
    public void corporation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(corporation, values, operators);
        corporation.setAndoroperator(andor);
    }
    
    public void militia_corporation(Double[] values, byte[] operators) {
        addNumbervalues(militia_corporation, values, operators);
    }
    
    public void militia_corporation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(militia_corporation, values, operators);
        militia_corporation.setAndoroperator(andor);
    }
    
    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getSystemsearch() {
        if(systemsearcher.used()) {
            return (ISystemsearch)systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSystemInnerjoin() {
        return systemsearcher.getInnerjoin();
    }

}
