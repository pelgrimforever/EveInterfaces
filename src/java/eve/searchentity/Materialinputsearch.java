/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IMaterialinputsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Materialinput;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Materialinputsearch extends Tablesearch implements IMaterialinputsearch {

    Stringsearch username = new Stringsearch("materialinput.username");
    Timesearch addtimestamp = new Timesearch("materialinput.addtimestamp");
    Numbersearch amount = new Numbersearch("materialinput.amount");
    Numbersearch unitprice = new Numbersearch("materialinput.unitprice");
    Numbersearch usedamount = new Numbersearch("materialinput.usedamount");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IMaterialinput.evetypePKfields, IMaterialinput.evetypeFKfields);
//external foreign keys

    public String getTable() {
        return Materialinput.table;
    }

    public Materialinputsearch() {
        setFieldsearchers();
    }

    public Materialinputsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(addtimestamp);
        addFieldsearcher(amount);
        addFieldsearcher(unitprice);
        addFieldsearcher(usedamount);
        addKeysearcher(evetypesearcher);
    }

    public void addPrimarykey(IMaterialinputPK materialinputPK) {
        super.addPrimarykey(materialinputPK);
    }

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void addtimestamp(Timestamp[] values, byte[] operators) {
        addTimevalues(addtimestamp, values, operators);
    }
    
    public void addtimestamp(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(addtimestamp, values, operators);
        addtimestamp.setAndoroperator(andor);
    }
    
    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
    }
    
    public void unitprice(Double[] values, byte[] operators) {
        addNumbervalues(unitprice, values, operators);
    }
    
    public void unitprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(unitprice, values, operators);
        unitprice.setAndoroperator(andor);
    }
    
    public void usedamount(Double[] values, byte[] operators) {
        addNumbervalues(usedamount, values, operators);
    }
    
    public void usedamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(usedamount, values, operators);
        usedamount.setAndoroperator(andor);
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
