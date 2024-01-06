/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IRacesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Race;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Racesearch extends Tablesearch implements IRacesearch {

    Numbersearch id = new Numbersearch("race.id");
    Stringsearch name = new Stringsearch("race.name");
    Stringsearch description = new Stringsearch("race.description");
//foreign keys
    Foreignkeysearch factionsearcher = new Foreignkeysearch("faction", IRace.factionPKfields, IRace.factionFKfields);
//external foreign keys

    public String getTable() {
        return Race.table;
    }

    public Racesearch() {
        setFieldsearchers();
    }

    public Racesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(description);
        addKeysearcher(factionsearcher);
    }

    public void addPrimarykey(IRacePK racePK) {
        super.addPrimarykey(racePK);
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

}
