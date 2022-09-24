/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.ICategorysearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Category;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Categorysearch extends Tablesearch implements ICategorysearch {

    Numbersearch id = new Numbersearch("category.id");
    Stringsearch name = new Stringsearch("category.name");
    Booleansearch published = new Booleansearch("category.published");
//foreign keys
//external foreign keys

    public String getTable() {
        return Category.table;
    }

    public Categorysearch() {
        setFieldsearchers();
    }

    public Categorysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(published);
    }

    public void addPrimarykey(ICategoryPK categoryPK) {
        super.addPrimarykey(categoryPK);
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
    
}
