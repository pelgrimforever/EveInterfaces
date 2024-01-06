/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

    public String getTable() {
        return View_userbp.table;
    }

    public View_userbpsearch() {
        setFieldsearchers();
    }

    public View_userbpsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void blueprintname(String[] values) {
        addStringvalues(blueprintname, values);
    }
    
    public void blueprintname(String[] values, byte compare, byte andor) {
        addStringvalues(blueprintname, values);
        blueprintname.setCompareoperator(compare);
        blueprintname.setAndoroperator(andor);
    }
    
    public void typegroupname(String[] values) {
        addStringvalues(typegroupname, values);
    }
    
    public void typegroupname(String[] values, byte compare, byte andor) {
        addStringvalues(typegroupname, values);
        typegroupname.setCompareoperator(compare);
        typegroupname.setAndoroperator(andor);
    }
    
    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void bp(Double[] values, byte[] operators) {
        addNumbervalues(bp, values, operators);
    }
    
    public void bp(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(bp, values, operators);
        bp.setAndoroperator(andor);
    }
    
    public void serialnumber(Double[] values, byte[] operators) {
        addNumbervalues(serialnumber, values, operators);
    }
    
    public void serialnumber(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(serialnumber, values, operators);
        serialnumber.setAndoroperator(andor);
    }
    
    public void original(Boolean value) {
        addBooleanvalue(original, value);
    }
    
    public void materialefficiency(Double[] values, byte[] operators) {
        addNumbervalues(materialefficiency, values, operators);
    }
    
    public void materialefficiency(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(materialefficiency, values, operators);
        materialefficiency.setAndoroperator(andor);
    }
    
    public void amountproduced(Double[] values, byte[] operators) {
        addNumbervalues(amountproduced, values, operators);
    }
    
    public void amountproduced(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amountproduced, values, operators);
        amountproduced.setAndoroperator(andor);
    }
    
    public void totalamount(Double[] values, byte[] operators) {
        addNumbervalues(totalamount, values, operators);
    }
    
    public void totalamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(totalamount, values, operators);
        totalamount.setAndoroperator(andor);
    }
    
    public void bpprice(Double[] values, byte[] operators) {
        addNumbervalues(bpprice, values, operators);
    }
    
    public void bpprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(bpprice, values, operators);
        bpprice.setAndoroperator(andor);
    }
    
    public void researchcost(Double[] values, byte[] operators) {
        addNumbervalues(researchcost, values, operators);
    }
    
    public void researchcost(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(researchcost, values, operators);
        researchcost.setAndoroperator(andor);
    }
    
    public void stationfee(Double[] values, byte[] operators) {
        addNumbervalues(stationfee, values, operators);
    }
    
    public void stationfee(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(stationfee, values, operators);
        stationfee.setAndoroperator(andor);
    }
    
}
