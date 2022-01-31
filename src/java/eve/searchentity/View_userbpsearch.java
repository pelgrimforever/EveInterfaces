/*
 * View_userbpsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 29.0.2022 18:3
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_userbpsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_userbp;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_userbp table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_userbpsearch extends Tablesearch implements IView_userbpsearch {

    Stringsearch blueprintname = new Stringsearch("view_userbp.blueprintname");
    Stringsearch typegroupname = new Stringsearch("view_userbp.typegroupname");
    Stringsearch username = new Stringsearch("view_userbp.username");
    Numbersearch bp = new Numbersearch("view_userbp.bp");
    Numbersearch serialnumber = new Numbersearch("view_userbp.serialnumber");
    Booleansearch original = new Booleansearch("view_userbp.original");
    Numbersearch materialefficiency = new Numbersearch("view_userbp.materialefficiency");
    Numbersearch amountproduced = new Numbersearch("view_userbp.amountproduced");
    Numbersearch totalamount = new Numbersearch("view_userbp.totalamount");
    Numbersearch bpprice = new Numbersearch("view_userbp.bpprice");
    Numbersearch researchcost = new Numbersearch("view_userbp.researchcost");
    Numbersearch stationfee = new Numbersearch("view_userbp.stationfee");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_userbp.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_userbpsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_userbpsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(blueprintname);
        addFieldsearcher(typegroupname);
        addFieldsearcher(username);
        addFieldsearcher(bp);
        addFieldsearcher(serialnumber);
        addFieldsearcher(original);
        addFieldsearcher(materialefficiency);
        addFieldsearcher(amountproduced);
        addFieldsearcher(totalamount);
        addFieldsearcher(bpprice);
        addFieldsearcher(researchcost);
        addFieldsearcher(stationfee);
    }

    /**
     * add String search values for field blueprintname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void blueprintname(String[] values) {
        addStringvalues(blueprintname, values);
    }
    
    /**
     * add String search values for field blueprintname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void blueprintname(String[] values, byte compare, byte andor) {
        addStringvalues(blueprintname, values);
        blueprintname.setCompareoperator(compare);
        blueprintname.setAndoroperator(andor);
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
     * add Boolean search values for field original
     * @param value: true or false
     */
    public void original(Boolean value) {
        addBooleanvalue(original, value);
    }
    
    /**
     * add Numeric search values for field materialefficiency, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void materialefficiency(Double[] values, byte[] operators) {
        addNumbervalues(materialefficiency, values, operators);
    }
    
    /**
     * add Numeric search values for field materialefficiency
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void materialefficiency(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(materialefficiency, values, operators);
        materialefficiency.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field amountproduced, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void amountproduced(Double[] values, byte[] operators) {
        addNumbervalues(amountproduced, values, operators);
    }
    
    /**
     * add Numeric search values for field amountproduced
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void amountproduced(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountproduced, values, operators);
        amountproduced.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field totalamount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void totalamount(Double[] values, byte[] operators) {
        addNumbervalues(totalamount, values, operators);
    }
    
    /**
     * add Numeric search values for field totalamount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void totalamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalamount, values, operators);
        totalamount.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field bpprice, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void bpprice(Double[] values, byte[] operators) {
        addNumbervalues(bpprice, values, operators);
    }
    
    /**
     * add Numeric search values for field bpprice
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void bpprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(bpprice, values, operators);
        bpprice.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field researchcost, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void researchcost(Double[] values, byte[] operators) {
        addNumbervalues(researchcost, values, operators);
    }
    
    /**
     * add Numeric search values for field researchcost
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void researchcost(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(researchcost, values, operators);
        researchcost.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field stationfee, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void stationfee(Double[] values, byte[] operators) {
        addNumbervalues(stationfee, values, operators);
    }
    
    /**
     * add Numeric search values for field stationfee
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void stationfee(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(stationfee, values, operators);
        stationfee.setAndoroperator(andor);
    }
    
}
