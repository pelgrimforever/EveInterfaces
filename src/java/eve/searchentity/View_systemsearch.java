/*
 * View_systemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_systemsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_system;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_system table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_systemsearch extends Tablesearch implements IView_systemsearch {

    Numbersearch jumpssafe = new Numbersearch("view_system.jumpssafe");
    Numbersearch jumpssafelowsec = new Numbersearch("view_system.jumpssafelowsec");
    Numbersearch jumpssafenullsec = new Numbersearch("view_system.jumpssafenullsec");
    Stringsearch regionname = new Stringsearch("view_system.regionname");
    Numbersearch system_start = new Numbersearch("view_system.system_start");
    Numbersearch system_end = new Numbersearch("view_system.system_end");
    Numbersearch id = new Numbersearch("view_system.id");
    Stringsearch name = new Stringsearch("view_system.name");
    Numbersearch constellation = new Numbersearch("view_system.constellation");
    Stringsearch security_class = new Stringsearch("view_system.security_class");
    Numbersearch security_status = new Numbersearch("view_system.security_status");
    Numbersearch star_id = new Numbersearch("view_system.star_id");
    Booleansearch noaccess = new Booleansearch("view_system.noaccess");
    Booleansearch isconstellationborder = new Booleansearch("view_system.isconstellationborder");
    Booleansearch isregionborder = new Booleansearch("view_system.isregionborder");
    Numbersearch security_island = new Numbersearch("view_system.security_island");
    Datesearch downloaddate = new Datesearch("view_system.downloaddate");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_system.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_systemsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_systemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(jumpssafe);
        addFieldsearcher(jumpssafelowsec);
        addFieldsearcher(jumpssafenullsec);
        addFieldsearcher(regionname);
        addFieldsearcher(system_start);
        addFieldsearcher(system_end);
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(constellation);
        addFieldsearcher(security_class);
        addFieldsearcher(security_status);
        addFieldsearcher(star_id);
        addFieldsearcher(noaccess);
        addFieldsearcher(isconstellationborder);
        addFieldsearcher(isregionborder);
        addFieldsearcher(security_island);
        addFieldsearcher(downloaddate);
    }

    /**
     * add Numeric search values for field jumpssafe, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpssafe(Double[] values, byte[] operators) {
        addNumbervalues(jumpssafe, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpssafe
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpssafe(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpssafe, values, operators);
        jumpssafe.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpssafelowsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpssafelowsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpssafelowsec, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpssafelowsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpssafelowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpssafelowsec, values, operators);
        jumpssafelowsec.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field jumpssafenullsec, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void jumpssafenullsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpssafenullsec, values, operators);
    }
    
    /**
     * add Numeric search values for field jumpssafenullsec
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void jumpssafenullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpssafenullsec, values, operators);
        jumpssafenullsec.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field regionname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void regionname(String[] values) {
        addStringvalues(regionname, values);
    }
    
    /**
     * add String search values for field regionname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void regionname(String[] values, byte compare, byte andor) {
        addStringvalues(regionname, values);
        regionname.setCompareoperator(compare);
        regionname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field system_start, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void system_start(Double[] values, byte[] operators) {
        addNumbervalues(system_start, values, operators);
    }
    
    /**
     * add Numeric search values for field system_start
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void system_start(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(system_start, values, operators);
        system_start.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field system_end, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void system_end(Double[] values, byte[] operators) {
        addNumbervalues(system_end, values, operators);
    }
    
    /**
     * add Numeric search values for field system_end
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void system_end(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(system_end, values, operators);
        system_end.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(Double[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(Double[] values, byte[] operators, byte andor) {
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
     * add Numeric search values for field constellation, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void constellation(Double[] values, byte[] operators) {
        addNumbervalues(constellation, values, operators);
    }
    
    /**
     * add Numeric search values for field constellation
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void constellation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(constellation, values, operators);
        constellation.setAndoroperator(andor);
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
     * add Numeric search values for field security_island, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void security_island(Double[] values, byte[] operators) {
        addNumbervalues(security_island, values, operators);
    }
    
    /**
     * add Numeric search values for field security_island
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void security_island(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(security_island, values, operators);
        security_island.setAndoroperator(andor);
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
    
}
