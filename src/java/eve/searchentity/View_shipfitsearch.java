/*
 * View_shipfitsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_shipfitsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_shipfit;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_shipfit table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_shipfitsearch extends Tablesearch implements IView_shipfitsearch {

    Stringsearch shiptype = new Stringsearch("view_shipfit.shiptype");
    Numbersearch packaged_volume = new Numbersearch("view_shipfit.packaged_volume");
    Stringsearch username = new Stringsearch("view_shipfit.username");
    Stringsearch shipname = new Stringsearch("view_shipfit.shipname");
    Numbersearch evetype = new Numbersearch("view_shipfit.evetype");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_shipfit.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_shipfitsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_shipfitsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(shiptype);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(username);
        addFieldsearcher(shipname);
        addFieldsearcher(evetype);
    }

    /**
     * add String search values for field shiptype, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void shiptype(String[] values) {
        addStringvalues(shiptype, values);
    }
    
    /**
     * add String search values for field shiptype
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void shiptype(String[] values, byte compare, byte andor) {
        addStringvalues(shiptype, values);
        shiptype.setCompareoperator(compare);
        shiptype.setAndoroperator(andor);
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
    
}
