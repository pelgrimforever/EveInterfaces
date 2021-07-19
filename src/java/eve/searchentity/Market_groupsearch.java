/*
 * Market_groupsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IMarket_groupsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eMarket_group;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Market_group table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Market_groupsearch extends Tablesearch implements IMarket_groupsearch {

    Numbersearch id = new Numbersearch("market_group.id");
    Stringsearch name = new Stringsearch("market_group.name");
    Stringsearch description = new Stringsearch("market_group.description");
    Foreignkeysearch market_groupParent_idsearcher = new Foreignkeysearch("market_group", IMarket_group.market_groupParent_idPKfields, IMarket_group.market_groupParent_idFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Market_groupsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Market_groupsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(description);
        addKeysearcher(market_groupParent_idsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param market_groupPK: Market_group primery key
     */
    public void addPrimarykey(IMarket_groupPK market_groupPK) {
        super.addPrimarykey(market_groupPK);
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
     * add String search values for field description, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    /**
     * add String search values for field description
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    /**
     * set subsearch market_groupParent_id tablesearch
     * @param market_groupsearch: IMarket_groupsearch
     */
    public void market_groupParent_id(IMarket_groupsearch market_groupsearch) {
        market_groupParent_idsearcher.setTablesearch(market_groupsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Market_group
     */
    public IMarket_groupsearch getMarket_groupparent_idsearch() {
        if(market_groupParent_idsearcher.used()) {
            return (IMarket_groupsearch)market_groupParent_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if market_groupParent_idsearcher is not used
     * @return inner join statement
     */
    public String getMarket_groupparent_idInnerjoin() {
        return market_groupParent_idsearcher.getInnerjoin();
    }

}
