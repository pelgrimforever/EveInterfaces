/*
 * View_shipfitordersearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_shipfitordersearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_shipfitorder;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_shipfitorder table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_shipfitordersearch extends Tablesearch implements IView_shipfitordersearch {

    Stringsearch evetypename = new Stringsearch("view_shipfitorder.evetypename");
    Numbersearch packaged_volume = new Numbersearch("view_shipfitorder.packaged_volume");
    Stringsearch username = new Stringsearch("view_shipfitorder.username");
    Stringsearch shipname = new Stringsearch("view_shipfitorder.shipname");
    Numbersearch evetype = new Numbersearch("view_shipfitorder.evetype");
    Numbersearch amountwanted = new Numbersearch("view_shipfitorder.amountwanted");
    Numbersearch amountinstock = new Numbersearch("view_shipfitorder.amountinstock");
    Numbersearch amountplanned = new Numbersearch("view_shipfitorder.amountplanned");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_shipfitorder.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_shipfitordersearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_shipfitordersearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(evetypename);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(username);
        addFieldsearcher(shipname);
        addFieldsearcher(evetype);
        addFieldsearcher(amountwanted);
        addFieldsearcher(amountinstock);
        addFieldsearcher(amountplanned);
    }

    /**
     * add String search values for field evetypename, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void evetypename(String[] values) {
        addStringvalues(evetypename, values);
    }
    
    /**
     * add String search values for field evetypename
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void evetypename(String[] values, byte compare, byte andor) {
        addStringvalues(evetypename, values);
        evetypename.setCompareoperator(compare);
        evetypename.setAndoroperator(andor);
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
     * add Numeric search values for field evetype, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    /**
     * add Numeric search values for field evetype
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field amountwanted, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void amountwanted(Double[] values, byte[] operators) {
        addNumbervalues(amountwanted, values, operators);
    }
    
    /**
     * add Numeric search values for field amountwanted
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void amountwanted(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountwanted, values, operators);
        amountwanted.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field amountinstock, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void amountinstock(Double[] values, byte[] operators) {
        addNumbervalues(amountinstock, values, operators);
    }
    
    /**
     * add Numeric search values for field amountinstock
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void amountinstock(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountinstock, values, operators);
        amountinstock.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field amountplanned, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void amountplanned(Double[] values, byte[] operators) {
        addNumbervalues(amountplanned, values, operators);
    }
    
    /**
     * add Numeric search values for field amountplanned
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void amountplanned(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountplanned, values, operators);
        amountplanned.setAndoroperator(andor);
    }
    
}
