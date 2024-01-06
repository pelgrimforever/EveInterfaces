/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.ILocationsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Location;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Locationsearch extends Tablesearch implements ILocationsearch {

    Numbersearch id = new Numbersearch("location.id");
    Stringsearch name = new Stringsearch("location.name");
    Booleansearch visited = new Booleansearch("location.visited");
    Booleansearch access = new Booleansearch("location.access");
//foreign keys
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", ILocation.systemPKfields, ILocation.systemFKfields);
//external foreign keys

    public String getTable() {
        return Location.table;
    }

    public Locationsearch() {
        setFieldsearchers();
    }

    public Locationsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(visited);
        addFieldsearcher(access);
        addKeysearcher(systemsearcher);
    }

    public void addPrimarykey(ILocationPK locationPK) {
        super.addPrimarykey(locationPK);
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
    
    public void visited(Boolean value) {
        addBooleanvalue(visited, value);
    }
    
    public void access(Boolean value) {
        addBooleanvalue(access, value);
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
