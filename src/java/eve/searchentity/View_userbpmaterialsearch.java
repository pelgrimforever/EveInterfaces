/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

    public String getTable() {
        return View_userbpmaterial.table;
    }

    public View_userbpmaterialsearch() {
        setFieldsearchers();
    }

    public View_userbpmaterialsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void serialnumber(Double[] values, byte[] operators) {
        addNumbervalues(serialnumber, values, operators);
    }
    
    public void serialnumber(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(serialnumber, values, operators);
        serialnumber.setAndoroperator(andor);
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
    
    public void marketaverage(Double[] values, byte[] operators) {
        addNumbervalues(marketaverage, values, operators);
    }
    
    public void marketaverage(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(marketaverage, values, operators);
        marketaverage.setAndoroperator(andor);
    }
    
    public void materialinputaverage(Double[] values, byte[] operators) {
        addNumbervalues(materialinputaverage, values, operators);
    }
    
    public void materialinputaverage(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(materialinputaverage, values, operators);
        materialinputaverage.setAndoroperator(andor);
    }
    
}
