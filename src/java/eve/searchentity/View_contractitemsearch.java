/*
 * View_contractitemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_contractitemsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_contractitem;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_contractitem table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_contractitemsearch extends Tablesearch implements IView_contractitemsearch {

    Numbersearch id = new Numbersearch("view_contractitem.id");
    Numbersearch contract = new Numbersearch("view_contractitem.contract");
    Booleansearch blueprint_copy = new Booleansearch("view_contractitem.blueprint_copy");
    Booleansearch included = new Booleansearch("view_contractitem.included");
    Numbersearch quantity = new Numbersearch("view_contractitem.quantity");
    Numbersearch evetype = new Numbersearch("view_contractitem.evetype");
    Numbersearch material_efficiency = new Numbersearch("view_contractitem.material_efficiency");
    Numbersearch runs = new Numbersearch("view_contractitem.runs");
    Numbersearch time_efficiency = new Numbersearch("view_contractitem.time_efficiency");
    Numbersearch packaged_volume = new Numbersearch("view_contractitem.packaged_volume");
    Stringsearch typename = new Stringsearch("view_contractitem.typename");
    Numbersearch typegroupid = new Numbersearch("view_contractitem.typegroupid");
    Stringsearch groupname = new Stringsearch("view_contractitem.groupname");
    Numbersearch categoryid = new Numbersearch("view_contractitem.categoryid");
    Stringsearch categoryname = new Stringsearch("view_contractitem.categoryname");
    Numbersearch avg_buyorder = new Numbersearch("view_contractitem.avg_buyorder");
    Numbersearch min_buyorder = new Numbersearch("view_contractitem.min_buyorder");
    Numbersearch max_buyorder = new Numbersearch("view_contractitem.max_buyorder");
    Numbersearch avg_sellorder = new Numbersearch("view_contractitem.avg_sellorder");
    Numbersearch min_selorder = new Numbersearch("view_contractitem.min_selorder");
    Numbersearch max_selorder = new Numbersearch("view_contractitem.max_selorder");
    Numbersearch average = new Numbersearch("view_contractitem.average");
    Numbersearch highest = new Numbersearch("view_contractitem.highest");
    Numbersearch lowest = new Numbersearch("view_contractitem.lowest");
    Numbersearch order_count = new Numbersearch("view_contractitem.order_count");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_contractitem.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_contractitemsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_contractitemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(contract);
        addFieldsearcher(blueprint_copy);
        addFieldsearcher(included);
        addFieldsearcher(quantity);
        addFieldsearcher(evetype);
        addFieldsearcher(material_efficiency);
        addFieldsearcher(runs);
        addFieldsearcher(time_efficiency);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(typename);
        addFieldsearcher(typegroupid);
        addFieldsearcher(groupname);
        addFieldsearcher(categoryid);
        addFieldsearcher(categoryname);
        addFieldsearcher(avg_buyorder);
        addFieldsearcher(min_buyorder);
        addFieldsearcher(max_buyorder);
        addFieldsearcher(avg_sellorder);
        addFieldsearcher(min_selorder);
        addFieldsearcher(max_selorder);
        addFieldsearcher(average);
        addFieldsearcher(highest);
        addFieldsearcher(lowest);
        addFieldsearcher(order_count);
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
     * add Numeric search values for field contract, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void contract(Double[] values, byte[] operators) {
        addNumbervalues(contract, values, operators);
    }
    
    /**
     * add Numeric search values for field contract
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void contract(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(contract, values, operators);
        contract.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field blueprint_copy
     * @param value: true or false
     */
    public void blueprint_copy(Boolean value) {
        addBooleanvalue(blueprint_copy, value);
    }
    
    /**
     * add Boolean search values for field included
     * @param value: true or false
     */
    public void included(Boolean value) {
        addBooleanvalue(included, value);
    }
    
    /**
     * add Numeric search values for field quantity, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void quantity(Double[] values, byte[] operators) {
        addNumbervalues(quantity, values, operators);
    }
    
    /**
     * add Numeric search values for field quantity
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void quantity(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(quantity, values, operators);
        quantity.setAndoroperator(andor);
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
     * add Numeric search values for field material_efficiency, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void material_efficiency(Double[] values, byte[] operators) {
        addNumbervalues(material_efficiency, values, operators);
    }
    
    /**
     * add Numeric search values for field material_efficiency
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void material_efficiency(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(material_efficiency, values, operators);
        material_efficiency.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field runs, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void runs(Double[] values, byte[] operators) {
        addNumbervalues(runs, values, operators);
    }
    
    /**
     * add Numeric search values for field runs
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void runs(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(runs, values, operators);
        runs.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field time_efficiency, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void time_efficiency(Double[] values, byte[] operators) {
        addNumbervalues(time_efficiency, values, operators);
    }
    
    /**
     * add Numeric search values for field time_efficiency
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void time_efficiency(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(time_efficiency, values, operators);
        time_efficiency.setAndoroperator(andor);
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
     * add String search values for field typename, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void typename(String[] values) {
        addStringvalues(typename, values);
    }
    
    /**
     * add String search values for field typename
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void typename(String[] values, byte compare, byte andor) {
        addStringvalues(typename, values);
        typename.setCompareoperator(compare);
        typename.setAndoroperator(andor);
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
     * add String search values for field groupname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void groupname(String[] values) {
        addStringvalues(groupname, values);
    }
    
    /**
     * add String search values for field groupname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void groupname(String[] values, byte compare, byte andor) {
        addStringvalues(groupname, values);
        groupname.setCompareoperator(compare);
        groupname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field categoryid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void categoryid(Double[] values, byte[] operators) {
        addNumbervalues(categoryid, values, operators);
    }
    
    /**
     * add Numeric search values for field categoryid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void categoryid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(categoryid, values, operators);
        categoryid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field categoryname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void categoryname(String[] values) {
        addStringvalues(categoryname, values);
    }
    
    /**
     * add String search values for field categoryname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void categoryname(String[] values, byte compare, byte andor) {
        addStringvalues(categoryname, values);
        categoryname.setCompareoperator(compare);
        categoryname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field avg_buyorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void avg_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_buyorder, values, operators);
    }
    
    /**
     * add Numeric search values for field avg_buyorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void avg_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_buyorder, values, operators);
        avg_buyorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field min_buyorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void min_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(min_buyorder, values, operators);
    }
    
    /**
     * add Numeric search values for field min_buyorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void min_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_buyorder, values, operators);
        min_buyorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field max_buyorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void max_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(max_buyorder, values, operators);
    }
    
    /**
     * add Numeric search values for field max_buyorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void max_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_buyorder, values, operators);
        max_buyorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field avg_sellorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void avg_sellorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_sellorder, values, operators);
    }
    
    /**
     * add Numeric search values for field avg_sellorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void avg_sellorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_sellorder, values, operators);
        avg_sellorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field min_selorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void min_selorder(Double[] values, byte[] operators) {
        addNumbervalues(min_selorder, values, operators);
    }
    
    /**
     * add Numeric search values for field min_selorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void min_selorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_selorder, values, operators);
        min_selorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field max_selorder, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void max_selorder(Double[] values, byte[] operators) {
        addNumbervalues(max_selorder, values, operators);
    }
    
    /**
     * add Numeric search values for field max_selorder
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void max_selorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_selorder, values, operators);
        max_selorder.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field average, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void average(Double[] values, byte[] operators) {
        addNumbervalues(average, values, operators);
    }
    
    /**
     * add Numeric search values for field average
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void average(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(average, values, operators);
        average.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field highest, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void highest(Double[] values, byte[] operators) {
        addNumbervalues(highest, values, operators);
    }
    
    /**
     * add Numeric search values for field highest
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void highest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(highest, values, operators);
        highest.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field lowest, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void lowest(Double[] values, byte[] operators) {
        addNumbervalues(lowest, values, operators);
    }
    
    /**
     * add Numeric search values for field lowest
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void lowest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lowest, values, operators);
        lowest.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field order_count, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void order_count(Double[] values, byte[] operators) {
        addNumbervalues(order_count, values, operators);
    }
    
    /**
     * add Numeric search values for field order_count
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void order_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(order_count, values, operators);
        order_count.setAndoroperator(andor);
    }
    
}
