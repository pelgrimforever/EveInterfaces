/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISyssettingssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Syssettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Syssettingssearch extends Tablesearch implements ISyssettingssearch {

    Stringsearch name = new Stringsearch("syssettings.name");
    Stringsearch value = new Stringsearch("syssettings.value");
//foreign keys
//external foreign keys

    public String getTable() {
        return Syssettings.table;
    }

    public Syssettingssearch() {
        setFieldsearchers();
    }

    public Syssettingssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(name);
        addFieldsearcher(value);
    }

    public void addPrimarykey(ISyssettingsPK syssettingsPK) {
        super.addPrimarykey(syssettingsPK);
    }

    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void value(String[] values) {
        addStringvalues(value, values);
    }
    
    public void value(String[] values, byte compare, byte andor) {
        addStringvalues(value, values);
        value.setCompareoperator(compare);
        value.setAndoroperator(andor);
    }
    
}
