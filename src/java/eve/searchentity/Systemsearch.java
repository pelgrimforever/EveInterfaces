/*
 * Systemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISystemsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.System;
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
    Datesearch downloaddate = new Datesearch("system.downloaddate");
//foreign keys
    Foreignkeysearch security_islandsearcher = new Foreignkeysearch("security_island", ISystem.security_islandPKfields, ISystem.security_islandFKfields);
    Foreignkeysearch constellationsearcher = new Foreignkeysearch("constellation", ISystem.constellationPKfields, ISystem.constellationFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch systemjumpsSystem_endsearcher = new Primarykeysearch("systemjumps", ISystemjumps.systemSystem_endPKfields, ISystemjumps.systemSystem_endFKfields);
    //foreign key
    Primarykeysearch systemjumpsSystem_startsearcher = new Primarykeysearch("systemjumps", ISystemjumps.systemSystem_startPKfields, ISystemjumps.systemSystem_startFKfields);
    //foreign key
    Primarykeysearch tradecombinedBuy_systemsearcher = new Primarykeysearch("tradecombined", ITradecombined.systemBuy_systemPKfields, ITradecombined.systemBuy_systemFKfields);
    //relational key
    Relationalkeysearch relevetype1searcher = new Relationalkeysearch("tradecombined", ITradecombined.systemBuy_systemPKfields, ITradecombined.systemBuy_systemFKfields, "evetype", ITradecombined.evetypePKfields, ITradecombined.evetypeFKfields);
    //foreign key
    Primarykeysearch tradecombinedSell_systemsearcher = new Primarykeysearch("tradecombined", ITradecombined.systemSell_systemPKfields, ITradecombined.systemSell_systemFKfields);
    //relational key
    Relationalkeysearch relevetype2searcher = new Relationalkeysearch("tradecombined", ITradecombined.systemSell_systemPKfields, ITradecombined.systemSell_systemFKfields, "evetype", ITradecombined.evetypePKfields, ITradecombined.evetypeFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return System.table;
    }

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
        addFieldsearcher(downloaddate);
        addKeysearcher(security_islandsearcher);
        addKeysearcher(constellationsearcher);
        addKeysearcher(systemjumpsSystem_endsearcher);
        addKeysearcher(systemjumpsSystem_startsearcher);
        addKeysearcher(tradecombinedBuy_systemsearcher);
        addKeysearcher(relevetype1searcher);
        addKeysearcher(tradecombinedSell_systemsearcher);
        addKeysearcher(relevetype2searcher);
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
     * add Date search values for field downloaddate, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void downloaddate(Date[] values, byte[] operators) {
        addDatevalues(downloaddate, values, operators);
    }
    
    /**
     * add Date search values for field downloaddate
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void downloaddate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(downloaddate, values, operators);
        downloaddate.setAndoroperator(andor);
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
     * set foreign key subsearch constellation IConstellationsearch
     * @param constellationsearch: IConstellationsearch
     */
    public void constellation(IConstellationsearch constellationsearch) {
        constellationsearcher.setTablesearch(constellationsearch);
    }
    
    /**
     * get foreign key subsearch constellation IConstellationsearch
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
     * set external key - foreign key subsearch ISystemjumpssearch
     * @param systemjumpssearch: ISystemjumpssearch
     */
    public void systemjumpsSystem_end(ISystemjumpssearch systemjumpssearch) {
        systemjumpsSystem_endsearcher.setTablesearch(systemjumpssearch);
    }
    
    /**
     * get external key - foreign key subsearch ISystemjumpssearch
     * @return Tablesearch for ISystemjumpssearch
     */
    public ISystemjumpssearch getSystemjumpssystem_endsearch() {
        if(systemjumpsSystem_endsearcher.used()) {
            return (ISystemjumpssearch)systemjumpsSystem_endsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch ISystemjumpssearch
     * @param systemjumpssearch: ISystemjumpssearch
     */
    public void systemjumpsSystem_start(ISystemjumpssearch systemjumpssearch) {
        systemjumpsSystem_startsearcher.setTablesearch(systemjumpssearch);
    }
    
    /**
     * get external key - foreign key subsearch ISystemjumpssearch
     * @return Tablesearch for ISystemjumpssearch
     */
    public ISystemjumpssearch getSystemjumpssystem_startsearch() {
        if(systemjumpsSystem_startsearcher.used()) {
            return (ISystemjumpssearch)systemjumpsSystem_startsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch ITradecombinedsearch
     * @param tradecombinedsearch: ITradecombinedsearch
     */
    public void tradecombinedBuy_system(ITradecombinedsearch tradecombinedsearch) {
        tradecombinedBuy_systemsearcher.setTablesearch(tradecombinedsearch);
    }
    
    /**
     * get external key - foreign key subsearch ITradecombinedsearch
     * @return Tablesearch for ITradecombinedsearch
     */
    public ITradecombinedsearch getTradecombinedbuy_systemsearch() {
        if(tradecombinedBuy_systemsearcher.used()) {
            return (ITradecombinedsearch)tradecombinedBuy_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void relevetype1(IEvetypesearch evetypesearch) {
        relevetype1searcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get external key - relational subsearch IEvetypesearch
     * @return Tablesearch for IEvetypesearch
     */
    public IEvetypesearch getRelEvetype1search() {
        if(relevetype1searcher.used()) {
            return (IEvetypesearch)relevetype1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch ITradecombinedsearch
     * @param tradecombinedsearch: ITradecombinedsearch
     */
    public void tradecombinedSell_system(ITradecombinedsearch tradecombinedsearch) {
        tradecombinedSell_systemsearcher.setTablesearch(tradecombinedsearch);
    }
    
    /**
     * get external key - foreign key subsearch ITradecombinedsearch
     * @return Tablesearch for ITradecombinedsearch
     */
    public ITradecombinedsearch getTradecombinedsell_systemsearch() {
        if(tradecombinedSell_systemsearcher.used()) {
            return (ITradecombinedsearch)tradecombinedSell_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void relevetype2(IEvetypesearch evetypesearch) {
        relevetype2searcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get external key - relational subsearch IEvetypesearch
     * @return Tablesearch for IEvetypesearch
     */
    public IEvetypesearch getRelEvetype2search() {
        if(relevetype2searcher.used()) {
            return (IEvetypesearch)relevetype2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
