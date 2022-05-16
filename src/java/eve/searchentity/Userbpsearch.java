/*
 * Userbpsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
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

/**
 * Search class for Userbp table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
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

    /**
     * @return tablename
     */
    public String getTable() {
        return Userbp.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Userbpsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Userbpsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
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

    /**
     * add a primary key instance to search for
     * @param userbpPK: Userbp primery key
     */
    public void addPrimarykey(IUserbpPK userbpPK) {
        super.addPrimarykey(userbpPK);
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
     * add Numeric search values for field serialnumber, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void serialnumber(long[] values, byte[] operators) {
        addNumbervalues(serialnumber, values, operators);
    }
    
    /**
     * add Numeric search values for field serialnumber
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void serialnumber(long[] values, byte[] operators, byte andor) {
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
    
    /**
     * set foreign key subsearch evetype IEvetypesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get foreign key subsearch evetype IEvetypesearch
     * @return Tablesearch for Userbp
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
