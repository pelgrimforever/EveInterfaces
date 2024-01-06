/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.ITypegroupsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Typegroup;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Typegroupsearch extends Tablesearch implements ITypegroupsearch {

    Numbersearch id = new Numbersearch("typegroup.id");
    Stringsearch name = new Stringsearch("typegroup.name");
    Booleansearch published = new Booleansearch("typegroup.published");
//foreign keys
    Foreignkeysearch categorysearcher = new Foreignkeysearch("category", ITypegroup.categoryPKfields, ITypegroup.categoryFKfields);
//external foreign keys

    public String getTable() {
        return Typegroup.table;
    }

    public Typegroupsearch() {
        setFieldsearchers();
    }

    public Typegroupsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(published);
        addKeysearcher(categorysearcher);
    }

    public void addPrimarykey(ITypegroupPK typegroupPK) {
        super.addPrimarykey(typegroupPK);
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
    
    public void published(Boolean value) {
        addBooleanvalue(published, value);
    }
    
    public void category(ICategorysearch categorysearch) {
        categorysearcher.setTablesearch(categorysearch);
    }
    
    public ICategorysearch getCategorysearch() {
        if(categorysearcher.used()) {
            return (ICategorysearch)categorysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getCategoryInnerjoin() {
        return categorysearcher.getInnerjoin();
    }

}
