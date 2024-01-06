/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISecurity_islandsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Security_island;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Security_islandsearch extends Tablesearch implements ISecurity_islandsearch {

    Numbersearch id = new Numbersearch("security_island.id");
    Stringsearch name = new Stringsearch("security_island.name");
    Numbersearch security_status = new Numbersearch("security_island.security_status");
//foreign keys
//external foreign keys

    public String getTable() {
        return Security_island.table;
    }

    public Security_islandsearch() {
        setFieldsearchers();
    }

    public Security_islandsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(security_status);
    }

    public void addPrimarykey(ISecurity_islandPK security_islandPK) {
        super.addPrimarykey(security_islandPK);
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
    
    public void security_status(Double[] values, byte[] operators) {
        addNumbervalues(security_status, values, operators);
    }
    
    public void security_status(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(security_status, values, operators);
        security_status.setAndoroperator(andor);
    }
    
}
