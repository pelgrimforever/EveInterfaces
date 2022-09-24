/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

    public String getTable() {
        return View_contractitem.table;
    }

    public View_contractitemsearch() {
        setFieldsearchers();
    }

    public View_contractitemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void id(Double[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void contract(Double[] values, byte[] operators) {
        addNumbervalues(contract, values, operators);
    }
    
    public void contract(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(contract, values, operators);
        contract.setAndoroperator(andor);
    }
    
    public void blueprint_copy(Boolean value) {
        addBooleanvalue(blueprint_copy, value);
    }
    
    public void included(Boolean value) {
        addBooleanvalue(included, value);
    }
    
    public void quantity(Double[] values, byte[] operators) {
        addNumbervalues(quantity, values, operators);
    }
    
    public void quantity(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(quantity, values, operators);
        quantity.setAndoroperator(andor);
    }
    
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
    public void material_efficiency(Double[] values, byte[] operators) {
        addNumbervalues(material_efficiency, values, operators);
    }
    
    public void material_efficiency(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(material_efficiency, values, operators);
        material_efficiency.setAndoroperator(andor);
    }
    
    public void runs(Double[] values, byte[] operators) {
        addNumbervalues(runs, values, operators);
    }
    
    public void runs(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(runs, values, operators);
        runs.setAndoroperator(andor);
    }
    
    public void time_efficiency(Double[] values, byte[] operators) {
        addNumbervalues(time_efficiency, values, operators);
    }
    
    public void time_efficiency(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(time_efficiency, values, operators);
        time_efficiency.setAndoroperator(andor);
    }
    
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
    }
    
    public void typename(String[] values) {
        addStringvalues(typename, values);
    }
    
    public void typename(String[] values, byte compare, byte andor) {
        addStringvalues(typename, values);
        typename.setCompareoperator(compare);
        typename.setAndoroperator(andor);
    }
    
    public void typegroupid(Double[] values, byte[] operators) {
        addNumbervalues(typegroupid, values, operators);
    }
    
    public void typegroupid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(typegroupid, values, operators);
        typegroupid.setAndoroperator(andor);
    }
    
    public void groupname(String[] values) {
        addStringvalues(groupname, values);
    }
    
    public void groupname(String[] values, byte compare, byte andor) {
        addStringvalues(groupname, values);
        groupname.setCompareoperator(compare);
        groupname.setAndoroperator(andor);
    }
    
    public void categoryid(Double[] values, byte[] operators) {
        addNumbervalues(categoryid, values, operators);
    }
    
    public void categoryid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(categoryid, values, operators);
        categoryid.setAndoroperator(andor);
    }
    
    public void categoryname(String[] values) {
        addStringvalues(categoryname, values);
    }
    
    public void categoryname(String[] values, byte compare, byte andor) {
        addStringvalues(categoryname, values);
        categoryname.setCompareoperator(compare);
        categoryname.setAndoroperator(andor);
    }
    
    public void avg_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_buyorder, values, operators);
    }
    
    public void avg_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_buyorder, values, operators);
        avg_buyorder.setAndoroperator(andor);
    }
    
    public void min_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(min_buyorder, values, operators);
    }
    
    public void min_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_buyorder, values, operators);
        min_buyorder.setAndoroperator(andor);
    }
    
    public void max_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(max_buyorder, values, operators);
    }
    
    public void max_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_buyorder, values, operators);
        max_buyorder.setAndoroperator(andor);
    }
    
    public void avg_sellorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_sellorder, values, operators);
    }
    
    public void avg_sellorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_sellorder, values, operators);
        avg_sellorder.setAndoroperator(andor);
    }
    
    public void min_selorder(Double[] values, byte[] operators) {
        addNumbervalues(min_selorder, values, operators);
    }
    
    public void min_selorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_selorder, values, operators);
        min_selorder.setAndoroperator(andor);
    }
    
    public void max_selorder(Double[] values, byte[] operators) {
        addNumbervalues(max_selorder, values, operators);
    }
    
    public void max_selorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_selorder, values, operators);
        max_selorder.setAndoroperator(andor);
    }
    
    public void average(Double[] values, byte[] operators) {
        addNumbervalues(average, values, operators);
    }
    
    public void average(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(average, values, operators);
        average.setAndoroperator(andor);
    }
    
    public void highest(Double[] values, byte[] operators) {
        addNumbervalues(highest, values, operators);
    }
    
    public void highest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(highest, values, operators);
        highest.setAndoroperator(andor);
    }
    
    public void lowest(Double[] values, byte[] operators) {
        addNumbervalues(lowest, values, operators);
    }
    
    public void lowest(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lowest, values, operators);
        lowest.setAndoroperator(andor);
    }
    
    public void order_count(Double[] values, byte[] operators) {
        addNumbervalues(order_count, values, operators);
    }
    
    public void order_count(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(order_count, values, operators);
        order_count.setAndoroperator(andor);
    }
    
}
