/*
 * View_userbpmaterialsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.1.2022 21:46
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_userbpmaterialsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_userbpmaterial;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_userbpmaterial table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_userbpmaterialsearch extends Tablesearch implements IView_userbpmaterialsearch {

    Stringsearch username = new Stringsearch("view_userbpmaterial.username");
    Numbersearch serialnumber = new Numbersearch("view_userbpmaterial.serialnumber");
    Numbersearch bp = new Numbersearch("view_userbpmaterial.bp");
    Numbersearch material = new Numbersearch("view_userbpmaterial.material");
    Numbersearch amount = new Numbersearch("view_userbpmaterial.amount");
    Numbersearch category = new Numbersearch("view_userbpmaterial.category");
    Numbersearch typegroupid = new Numbersearch("view_userbpmaterial.typegroupid");
    Stringsearch typegroupname = new Stringsearch("view_userbpmaterial.typegroupname");
    Stringsearch name = new Stringsearch("view_userbpmaterial.name");
    Numbersearch marketaverage = new Numbersearch("view_userbpmaterial.marketaverage");
    Numbersearch materialinputaverage = new Numbersearch("view_userbpmaterial.materialinputaverage");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_userbpmaterial.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_userbpmaterialsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_userbpmaterialsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(serialnumber);
        addFieldsearcher(bp);
        addFieldsearcher(material);
        addFieldsearcher(amount);
        addFieldsearcher(category);
        addFieldsearcher(typegroupid);
        addFieldsearcher(typegroupname);
        addFieldsearcher(name);
        addFieldsearcher(marketaverage);
        addFieldsearcher(materialinputaverage);
    }

    /**
     * add String search values for field username, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    /**
     * add String search values for field username
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field serialnumber, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void serialnumber(Double[] values, byte[] operators) {
        addNumbervalues(serialnumber, values, operators);
    }
    
    /**
     * add Numeric search values for field serialnumber
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void serialnumber(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(serialnumber, values, operators);
        serialnumber.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field bp, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void bp(Double[] values, byte[] operators) {
        addNumbervalues(bp, values, operators);
    }
    
    /**
     * add Numeric search values for field bp
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void bp(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(bp, values, operators);
        bp.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field material, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void material(Double[] values, byte[] operators) {
        addNumbervalues(material, values, operators);
    }
    
    /**
     * add Numeric search values for field material
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void material(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(material, values, operators);
        material.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field amount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    /**
     * add Numeric search values for field amount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field category, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void category(Double[] values, byte[] operators) {
        addNumbervalues(category, values, operators);
    }
    
    /**
     * add Numeric search values for field category
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void category(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(category, values, operators);
        category.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field typegroupid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void typegroupid(Double[] values, byte[] operators) {
        addNumbervalues(typegroupid, values, operators);
    }
    
    /**
     * add Numeric search values for field typegroupid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void typegroupid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(typegroupid, values, operators);
        typegroupid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field typegroupname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void typegroupname(String[] values) {
        addStringvalues(typegroupname, values);
    }
    
    /**
     * add String search values for field typegroupname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void typegroupname(String[] values, byte compare, byte andor) {
        addStringvalues(typegroupname, values);
        typegroupname.setCompareoperator(compare);
        typegroupname.setAndoroperator(andor);
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
     * add Numeric search values for field marketaverage, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void marketaverage(Double[] values, byte[] operators) {
        addNumbervalues(marketaverage, values, operators);
    }
    
    /**
     * add Numeric search values for field marketaverage
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void marketaverage(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(marketaverage, values, operators);
        marketaverage.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field materialinputaverage, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void materialinputaverage(Double[] values, byte[] operators) {
        addNumbervalues(materialinputaverage, values, operators);
    }
    
    /**
     * add Numeric search values for field materialinputaverage
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void materialinputaverage(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(materialinputaverage, values, operators);
        materialinputaverage.setAndoroperator(andor);
    }
    
}
