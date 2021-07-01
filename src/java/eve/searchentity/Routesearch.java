/*
 * Routesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IRoutesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eRoute;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Route table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Routesearch extends Tablesearch implements IRoutesearch {

    Stringsearch jsonroutes = new Stringsearch("route.jsonroutes");
    Foreignkeysearch routetypesearcher = new Foreignkeysearch("routetype", IRoute.routetypePKfields, IRoute.routetypeFKfields);
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", IRoute.systemPKfields, IRoute.systemFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Routesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Routesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(jsonroutes);
        addKeysearcher(routetypesearcher);
        addKeysearcher(systemsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param routePK: Route primery key
     */
    public void addPrimarykey(IRoutePK routePK) {
        super.addPrimarykey(routePK);
    }

    /**
     * add String search values for field jsonroutes, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void jsonroutes(String[] values) {
        addStringvalues(jsonroutes, values);
    }
    
    /**
     * add String search values for field jsonroutes
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void jsonroutes(String[] values, byte compare, byte andor) {
        addStringvalues(jsonroutes, values);
        jsonroutes.setCompareoperator(compare);
        jsonroutes.setAndoroperator(andor);
    }
    
    /**
     * set subsearch routetype tablesearch
     * @param routetypesearch: IRoutetypesearch
     */
    public void routetype(IRoutetypesearch routetypesearch) {
        routetypesearcher.setTablesearch(routetypesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Route
     */
    public IRoutetypesearch getRoutetypesearch() {
        if(routetypesearcher.used()) {
            return (IRoutetypesearch)routetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if routetypesearcher is not used
     * @return inner join statement
     */
    public String getRoutetypeInnerjoin() {
        return routetypesearcher.getInnerjoin();
    }

    /**
     * set subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Route
     */
    public ISystemsearch getSystemsearch() {
        if(systemsearcher.used()) {
            return (ISystemsearch)systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemsearcher is not used
     * @return inner join statement
     */
    public String getSystemInnerjoin() {
        return systemsearcher.getInnerjoin();
    }

}
