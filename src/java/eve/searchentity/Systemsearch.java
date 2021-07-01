/*
 * Systemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISystemsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eSystem;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for System table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Systemsearch extends Tablesearch implements ISystemsearch {

    Numbersearch id = new Numbersearch("system.id");
    Stringsearch name = new Stringsearch("system.name");
    Stringsearch security_class = new Stringsearch("system.security_class");
    Numbersearch security_status = new Numbersearch("system.security_status");
    Numbersearch star_id = new Numbersearch("system.star_id");
    Booleansearch noaccess = new Booleansearch("system.noaccess");
    Booleansearch isconstellationborder = new Booleansearch("system.isconstellationborder");
    Booleansearch isregionborder = new Booleansearch("system.isregionborder");
    Foreignkeysearch security_islandsearcher = new Foreignkeysearch("security_island", ISystem.security_islandPKfields, ISystem.security_islandFKfields);
    Foreignkeysearch constellationsearcher = new Foreignkeysearch("constellation", ISystem.constellationPKfields, ISystem.constellationFKfields);
    Primarykeysearch systemjumpsSystem_endsearcher = new Primarykeysearch("systemjumps", ISystemjumps.systemSystem_endPKfields, ISystemjumps.systemSystem_endFKfields);
    Primarykeysearch systemjumpsSystem_startsearcher = new Primarykeysearch("systemjumps", ISystemjumps.systemSystem_startPKfields, ISystemjumps.systemSystem_startFKfields);
    Primarykeysearch routesearcher = new Primarykeysearch("route", IRoute.systemPKfields, IRoute.systemFKfields);
    Relationalkeysearch routetypesearcher = new Relationalkeysearch("route", IRoute.systemPKfields, IRoute.systemFKfields, "routetype", IRoute.routetypePKfields, IRoute.routetypeFKfields);
    Primarykeysearch systemtradeSell_systemsearcher = new Primarykeysearch("systemtrade", ISystemtrade.systemSell_systemPKfields, ISystemtrade.systemSell_systemFKfields);
    Primarykeysearch systemtradeBuy_systemsearcher = new Primarykeysearch("systemtrade", ISystemtrade.systemBuy_systemPKfields, ISystemtrade.systemBuy_systemFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Systemsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Systemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(security_class);
        addFieldsearcher(security_status);
        addFieldsearcher(star_id);
        addFieldsearcher(noaccess);
        addFieldsearcher(isconstellationborder);
        addFieldsearcher(isregionborder);
        addKeysearcher(security_islandsearcher);
        addKeysearcher(constellationsearcher);
        addKeysearcher(systemjumpsSystem_endsearcher);
        addKeysearcher(systemjumpsSystem_startsearcher);
        addKeysearcher(routesearcher);
        addKeysearcher(routetypesearcher);
        addKeysearcher(systemtradeSell_systemsearcher);
        addKeysearcher(systemtradeBuy_systemsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param systemPK: System primery key
     */
    public void addPrimarykey(ISystemPK systemPK) {
        super.addPrimarykey(systemPK);
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
     * add String search values for field security_class, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void security_class(String[] values) {
        addStringvalues(security_class, values);
    }
    
    /**
     * add String search values for field security_class
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void security_class(String[] values, byte compare, byte andor) {
        addStringvalues(security_class, values);
        security_class.setCompareoperator(compare);
        security_class.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field security_status, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void security_status(Double[] values, byte[] operators) {
        addNumbervalues(security_status, values, operators);
    }
    
    /**
     * add Numeric search values for field security_status
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void security_status(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(security_status, values, operators);
        security_status.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field star_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void star_id(Double[] values, byte[] operators) {
        addNumbervalues(star_id, values, operators);
    }
    
    /**
     * add Numeric search values for field star_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void star_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(star_id, values, operators);
        star_id.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field noaccess
     * @param value: true or false
     */
    public void noaccess(Boolean value) {
        addBooleanvalue(noaccess, value);
    }
    
    /**
     * add Boolean search values for field isconstellationborder
     * @param value: true or false
     */
    public void isconstellationborder(Boolean value) {
        addBooleanvalue(isconstellationborder, value);
    }
    
    /**
     * add Boolean search values for field isregionborder
     * @param value: true or false
     */
    public void isregionborder(Boolean value) {
        addBooleanvalue(isregionborder, value);
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
     * @return Tablesearch for System
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
     * set subsearch constellation tablesearch
     * @param constellationsearch: IConstellationsearch
     */
    public void constellation(IConstellationsearch constellationsearch) {
        constellationsearcher.setTablesearch(constellationsearch);
    }
    
    /**
     * 
     * @return Tablesearch for System
     */
    public IConstellationsearch getConstellationsearch() {
        if(constellationsearcher.used()) {
            return (IConstellationsearch)constellationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if constellationsearcher is not used
     * @return inner join statement
     */
    public String getConstellationInnerjoin() {
        return constellationsearcher.getInnerjoin();
    }

    /**
     * set subsearch systemjumps tablesearch
     * @param systemjumpssearch: ISystemjumpssearch
     */
    public void systemjumpsSystem_end(ISystemjumpssearch systemjumpssearch) {
        systemjumpsSystem_endsearcher.setTablesearch(systemjumpssearch);
    }
    
    /**
     * 
     * @return Tablesearch for System
     */
    public ISystemjumpssearch getSystemjumpssystem_endsearch() {
        if(systemjumpsSystem_endsearcher.used()) {
            return (ISystemjumpssearch)systemjumpsSystem_endsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch systemjumps tablesearch
     * @param systemjumpssearch: ISystemjumpssearch
     */
    public void systemjumpsSystem_start(ISystemjumpssearch systemjumpssearch) {
        systemjumpsSystem_startsearcher.setTablesearch(systemjumpssearch);
    }
    
    /**
     * 
     * @return Tablesearch for System
     */
    public ISystemjumpssearch getSystemjumpssystem_startsearch() {
        if(systemjumpsSystem_startsearcher.used()) {
            return (ISystemjumpssearch)systemjumpsSystem_startsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
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
     * @return Tablesearch for System
     */
    public IRoutesearch getRoutesearch() {
        if(routesearcher.used()) {
            return (IRoutesearch)routesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch routetype tablesearch
     * @param routetypesearch: IRoutetypesearch
     */
    public void routetype(IRoutetypesearch routetypesearch) {
        routetypesearcher.setTablesearch(routetypesearch);
    }
    
    /**
     * 
     * @return Tablesearch for System
     */
    public IRoutetypesearch getRoutetypesearch() {
        if(routetypesearcher.used()) {
            return (IRoutetypesearch)routetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch systemtrade tablesearch
     * @param systemtradesearch: ISystemtradesearch
     */
    public void systemtradeSell_system(ISystemtradesearch systemtradesearch) {
        systemtradeSell_systemsearcher.setTablesearch(systemtradesearch);
    }
    
    /**
     * 
     * @return Tablesearch for System
     */
    public ISystemtradesearch getSystemtradesell_systemsearch() {
        if(systemtradeSell_systemsearcher.used()) {
            return (ISystemtradesearch)systemtradeSell_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch systemtrade tablesearch
     * @param systemtradesearch: ISystemtradesearch
     */
    public void systemtradeBuy_system(ISystemtradesearch systemtradesearch) {
        systemtradeBuy_systemsearcher.setTablesearch(systemtradesearch);
    }
    
    /**
     * 
     * @return Tablesearch for System
     */
    public ISystemtradesearch getSystemtradebuy_systemsearch() {
        if(systemtradeBuy_systemsearcher.used()) {
            return (ISystemtradesearch)systemtradeBuy_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
