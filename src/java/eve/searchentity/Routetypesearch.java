/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IRoutetypesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Routetype;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Routetypesearch extends Tablesearch implements IRoutetypesearch {

    Numbersearch id = new Numbersearch("routetype.id");
    Stringsearch name = new Stringsearch("routetype.name");
//foreign keys
    Foreignkeysearch security_islandsearcher = new Foreignkeysearch("security_island", IRoutetype.security_islandPKfields, IRoutetype.security_islandFKfields);
//external foreign keys

    public String getTable() {
        return Routetype.table;
    }

    public Routetypesearch() {
        setFieldsearchers();
    }

    public Routetypesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addKeysearcher(security_islandsearcher);
    }

    public void addPrimarykey(IRoutetypePK routetypePK) {
        super.addPrimarykey(routetypePK);
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
    
    public void security_island(ISecurity_islandsearch security_islandsearch) {
        security_islandsearcher.setTablesearch(security_islandsearch);
    }
    
    public ISecurity_islandsearch getSecurity_islandsearch() {
        if(security_islandsearcher.used()) {
            return (ISecurity_islandsearch)security_islandsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSecurity_islandInnerjoin() {
        return security_islandsearcher.getInnerjoin();
    }

}
