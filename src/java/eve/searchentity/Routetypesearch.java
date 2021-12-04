/*
 * Routetypesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.11.2021 14:51
 *
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

/**
 * Search class for Routetype table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Routetypesearch extends Tablesearch implements IRoutetypesearch {

    Numbersearch id = new Numbersearch("routetype.id");
    Stringsearch name = new Stringsearch("routetype.name");
//foreign keys
    Foreignkeysearch security_islandsearcher = new Foreignkeysearch("security_island", IRoutetype.security_islandPKfields, IRoutetype.security_islandFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch routesearcher = new Primarykeysearch("route", IRoute.routetypePKfields, IRoute.routetypeFKfields);
    //relational key
    Relationalkeysearch relsystemsearcher = new Relationalkeysearch("route", IRoute.routetypePKfields, IRoute.routetypeFKfields, "system", IRoute.systemPKfields, IRoute.systemFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Routetype.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Routetypesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Routetypesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addKeysearcher(security_islandsearcher);
        addKeysearcher(routesearcher);
        addKeysearcher(relsystemsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param routetypePK: Routetype primery key
     */
    public void addPrimarykey(IRoutetypePK routetypePK) {
        super.addPrimarykey(routetypePK);
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
     * set foreign key subsearch security_island ISecurity_islandsearch
     * @param security_islandsearch: ISecurity_islandsearch
     */
    public void security_island(ISecurity_islandsearch security_islandsearch) {
        security_islandsearcher.setTablesearch(security_islandsearch);
    }
    
    /**
     * get foreign key subsearch security_island ISecurity_islandsearch
     * @return Tablesearch for Routetype
     */
    public ISecurity_islandsearch getSecurity_islandsearch() {
        if(security_islandsearcher.used()) {
            return (ISecurity_islandsearch)security_islandsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if security_islandsearcher is not used
     * @return inner join statement
     */
    public String getSecurity_islandInnerjoin() {
        return security_islandsearcher.getInnerjoin();
    }

    /**
     * set external key - foreign key subsearch IRoutesearch
     * @param routesearch: IRoutesearch
     */
    public void route(IRoutesearch routesearch) {
        routesearcher.setTablesearch(routesearch);
    }
    
    /**
     * get external key - foreign key subsearch IRoutesearch
     * @return Tablesearch for IRoutesearch
     */
    public IRoutesearch getRoutesearch() {
        if(routesearcher.used()) {
            return (IRoutesearch)routesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void relsystem(ISystemsearch systemsearch) {
        relsystemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * get external key - relational subsearch ISystemsearch
     * @return Tablesearch for ISystemsearch
     */
    public ISystemsearch getRelSystemsearch() {
        if(relsystemsearcher.used()) {
            return (ISystemsearch)relsystemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
