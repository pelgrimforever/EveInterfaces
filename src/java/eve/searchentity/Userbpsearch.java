/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IUserbpsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Userbp;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Userbpsearch extends Tablesearch implements IUserbpsearch {

    Stringsearch username = new Stringsearch("userbp.username");
    Numbersearch serialnumber = new Numbersearch("userbp.serialnumber");
    Booleansearch original = new Booleansearch("userbp.original");
    Numbersearch materialefficiency = new Numbersearch("userbp.materialefficiency");
    Numbersearch amountproduced = new Numbersearch("userbp.amountproduced");
    Numbersearch totalamount = new Numbersearch("userbp.totalamount");
    Numbersearch bpprice = new Numbersearch("userbp.bpprice");
    Numbersearch researchcost = new Numbersearch("userbp.researchcost");
    Numbersearch stationfee = new Numbersearch("userbp.stationfee");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IUserbp.evetypePKfields, IUserbp.evetypeFKfields);
//external foreign keys

    public String getTable() {
        return Userbp.table;
    }

    public Userbpsearch() {
        setFieldsearchers();
    }

    public Userbpsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(serialnumber);
        addFieldsearcher(original);
        addFieldsearcher(materialefficiency);
        addFieldsearcher(amountproduced);
        addFieldsearcher(totalamount);
        addFieldsearcher(bpprice);
        addFieldsearcher(researchcost);
        addFieldsearcher(stationfee);
        addKeysearcher(evetypesearcher);
    }

    public void addPrimarykey(IUserbpPK userbpPK) {
        super.addPrimarykey(userbpPK);
    }

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void serialnumber(long[] values, byte[] operators) {
        addNumbervalues(serialnumber, values, operators);
    }
    
    public void serialnumber(long[] values, byte[] operators, byte andor) {
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
    
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

}
