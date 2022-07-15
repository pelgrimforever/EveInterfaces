/*
 * Typegroupsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.5.2022 11:11
 *
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

/**
 * Search class for Typegroup table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Typegroupsearch extends Tablesearch implements ITypegroupsearch {

    Numbersearch id = new Numbersearch("typegroup.id");
    Stringsearch name = new Stringsearch("typegroup.name");
    Booleansearch published = new Booleansearch("typegroup.published");
//foreign keys
    Foreignkeysearch categorysearcher = new Foreignkeysearch("category", ITypegroup.categoryPKfields, ITypegroup.categoryFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Typegroup.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Typegroupsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Typegroupsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(published);
        addKeysearcher(categorysearcher);
    }

    /**
     * add a primary key instance to search for
     * @param typegroupPK: Typegroup primery key
     */
    public void addPrimarykey(ITypegroupPK typegroupPK) {
        super.addPrimarykey(typegroupPK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    /**
     * add String search values for field name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field published
     * @param value: true or false
     */
    public void published(Boolean value) {
        addBooleanvalue(published, value);
    }
    
    /**
     * set foreign key subsearch category ICategorysearch
     * @param categorysearch: ICategorysearch
     */
    public void category(ICategorysearch categorysearch) {
        categorysearcher.setTablesearch(categorysearch);
    }
    
    /**
     * get foreign key subsearch category ICategorysearch
     * @return Tablesearch for Typegroup
     */
    public ICategorysearch getCategorysearch() {
        if(categorysearcher.used()) {
            return (ICategorysearch)categorysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if categorysearcher is not used
     * @return inner join statement
     */
    public String getCategoryInnerjoin() {
        return categorysearcher.getInnerjoin();
    }

}
