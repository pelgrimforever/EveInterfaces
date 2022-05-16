/*
 * Materialinputsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
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

/**
 * Search class for Materialinput table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Materialinputsearch extends Tablesearch implements IMaterialinputsearch {

    Stringsearch username = new Stringsearch("materialinput.username");
    Timesearch addtimestamp = new Timesearch("materialinput.addtimestamp");
    Numbersearch amount = new Numbersearch("materialinput.amount");
    Numbersearch unitprice = new Numbersearch("materialinput.unitprice");
    Numbersearch usedamount = new Numbersearch("materialinput.usedamount");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IMaterialinput.evetypePKfields, IMaterialinput.evetypeFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Materialinput.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Materialinputsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Materialinputsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(addtimestamp);
        addFieldsearcher(amount);
        addFieldsearcher(unitprice);
        addFieldsearcher(usedamount);
        addKeysearcher(evetypesearcher);
    }

    /**
     * add a primary key instance to search for
     * @param materialinputPK: Materialinput primery key
     */
    public void addPrimarykey(IMaterialinputPK materialinputPK) {
        super.addPrimarykey(materialinputPK);
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
     * add Timestamp search values for field addtimestamp, default OR operator is used
     * @param values: Array of time search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void addtimestamp(Timestamp[] values, byte[] operators) {
        addTimevalues(addtimestamp, values, operators);
    }
    
    /**
     * add Timestamp search values for field addtimestamp
     * @param values: Array of time search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void addtimestamp(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(addtimestamp, values, operators);
        addtimestamp.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field amount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void amount(Double[] values, byte[] operators) {
        addNumbervalues(amount, values, operators);
    }
    
    /**
     * add Numeric search values for field amount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void amount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(amount, values, operators);
        amount.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field unitprice, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void unitprice(Double[] values, byte[] operators) {
        addNumbervalues(unitprice, values, operators);
    }
    
    /**
     * add Numeric search values for field unitprice
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void unitprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(unitprice, values, operators);
        unitprice.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field usedamount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void usedamount(Double[] values, byte[] operators) {
        addNumbervalues(usedamount, values, operators);
    }
    
    /**
     * add Numeric search values for field usedamount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void usedamount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(usedamount, values, operators);
        usedamount.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch evetype IEvetypesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get foreign key subsearch evetype IEvetypesearch
     * @return Tablesearch for Materialinput
     */
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if evetypesearcher is not used
     * @return inner join statement
     */
    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

}
