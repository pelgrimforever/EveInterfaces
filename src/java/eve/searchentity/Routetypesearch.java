/*
 * Routetypesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IRoutetypesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eRoutetype;
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
    Foreignkeysearch security_islandsearcher = new Foreignkeysearch("security_island", IRoutetype.security_islandPKfields, IRoutetype.security_islandFKfields);
    Primarykeysearch routesearcher = new Primarykeysearch("route", IRoute.routetypePKfields, IRoute.routetypeFKfields);
    Relationalkeysearch systemsearcher = new Relationalkeysearch("route", IRoute.routetypePKfields, IRoute.routetypeFKfields, "system", IRoute.systemPKfields, IRoute.systemFKfields);

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
        addKeysearcher(systemsearcher);
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
     * set subsearch security_island tablesearch
     * @param security_islandsearch: ISecurity_islandsearch
     */
    public void security_island(ISecurity_islandsearch security_islandsearch) {
        security_islandsearcher.setTablesearch(security_islandsearch);
    }
    
    /**
     * 
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
     * set subsearch route tablesearch
     * @param routesearch: IRoutesearch
     */
    public void route(IRoutesearch routesearch) {
        routesearcher.setTablesearch(routesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Routetype
     */
    public IRoutesearch getRoutesearch() {
        if(routesearcher.used()) {
            return (IRoutesearch)routesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Routetype
     */
    public ISystemsearch getSystemsearch() {
        if(systemsearcher.used()) {
            return (ISystemsearch)systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
