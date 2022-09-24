/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_bpmaterialsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_bpmaterial;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_bpmaterialsearch extends Tablesearch implements IView_bpmaterialsearch {

    Numbersearch bp = new Numbersearch("view_bpmaterial.bp");
    Numbersearch material = new Numbersearch("view_bpmaterial.material");
    Numbersearch amount = new Numbersearch("view_bpmaterial.amount");
    Numbersearch category = new Numbersearch("view_bpmaterial.category");
    Numbersearch typegroupid = new Numbersearch("view_bpmaterial.typegroupid");
    Stringsearch typegroupname = new Stringsearch("view_bpmaterial.typegroupname");
    Stringsearch name = new Stringsearch("view_bpmaterial.name");
    Numbersearch average = new Numbersearch("view_bpmaterial.average");

    public String getTable() {
        return View_bpmaterial.table;
    }

    public View_bpmaterialsearch() {
        setFieldsearchers();
    }

    public View_bpmaterialsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(bp);
        addFieldsearcher(material);
        addFieldsearcher(amount);
        addFieldsearcher(category);
        addFieldsearcher(typegroupid);
        addFieldsearcher(typegroupname);
        addFieldsearcher(name);
        addFieldsearcher(average);
    }

    public void bp(Double[] values, byte[] operators) {
        addNumbervalues(bp, values, operators);
    }
    
    public void bp(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(bp, values, operators);
        bp.setAndoroperator(andor);
    }
    
    public void material(Double[] values, byte[] operators) {
        addNumbervalues(material, values, operators);
    }
    
    public void material(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(material, values, operators);
        material.setAndoroperator(andor);
    }
    
    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
    }
    
    public void category(Double[] values, byte[] operators) {
        addNumbervalues(category, values, operators);
    }
    
    public void category(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(category, values, operators);
        category.setAndoroperator(andor);
    }
    
    public void typegroupid(Double[] values, byte[] operators) {
        addNumbervalues(typegroupid, values, operators);
    }
    
    public void typegroupid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(typegroupid, values, operators);
        typegroupid.setAndoroperator(andor);
    }
    
    public void typegroupname(String[] values) {
        addStringvalues(typegroupname, values);
    }
    
    public void typegroupname(String[] values, byte compare, byte andor) {
        addStringvalues(typegroupname, values);
        typegroupname.setCompareoperator(compare);
        typegroupname.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void average(Double[] values, byte[] operators) {
        addNumbervalues(average, values, operators);
    }
    
    public void average(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(average, values, operators);
        average.setAndoroperator(andor);
    }
    
}
