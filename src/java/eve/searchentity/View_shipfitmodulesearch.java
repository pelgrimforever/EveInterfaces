/*
 * View_shipfitmodulesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_shipfitmodulesearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_shipfitmodule;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_shipfitmodule table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_shipfitmodulesearch extends Tablesearch implements IView_shipfitmodulesearch {

    Stringsearch modulename = new Stringsearch("view_shipfitmodule.modulename");
    Numbersearch packaged_volume = new Numbersearch("view_shipfitmodule.packaged_volume");
    Stringsearch username = new Stringsearch("view_shipfitmodule.username");
    Stringsearch shipname = new Stringsearch("view_shipfitmodule.shipname");
    Numbersearch moduletype = new Numbersearch("view_shipfitmodule.moduletype");
    Numbersearch amount = new Numbersearch("view_shipfitmodule.amount");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_shipfitmodule.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_shipfitmodulesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_shipfitmodulesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(modulename);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(username);
        addFieldsearcher(shipname);
        addFieldsearcher(moduletype);
        addFieldsearcher(amount);
    }

    /**
     * add String search values for field modulename, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void modulename(String[] values) {
        addStringvalues(modulename, values);
    }
    
    /**
     * add String search values for field modulename
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void modulename(String[] values, byte compare, byte andor) {
        addStringvalues(modulename, values);
        modulename.setCompareoperator(compare);
        modulename.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field packaged_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field packaged_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
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
     * add String search values for field shipname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void shipname(String[] values) {
        addStringvalues(shipname, values);
    }
    
    /**
     * add String search values for field shipname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void shipname(String[] values, byte compare, byte andor) {
        addStringvalues(shipname, values);
        shipname.setCompareoperator(compare);
        shipname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field moduletype, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void moduletype(Double[] values, byte[] operators) {
        addNumbervalues(moduletype, values, operators);
    }
    
    /**
     * add Numeric search values for field moduletype
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void moduletype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(moduletype, values, operators);
        moduletype.setAndoroperator(andor);
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
    
}
