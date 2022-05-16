/*
 * Contractsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IContractsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Contract;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Contract table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Contractsearch extends Tablesearch implements IContractsearch {

    Numbersearch id = new Numbersearch("contract.id");
    Numbersearch collateral = new Numbersearch("contract.collateral");
    Timesearch date_expired = new Timesearch("contract.date_expired");
    Timesearch date_issued = new Timesearch("contract.date_issued");
    Numbersearch days_to_complete = new Numbersearch("contract.days_to_complete");
    Numbersearch end_location_id = new Numbersearch("contract.end_location_id");
    Booleansearch for_corporation = new Booleansearch("contract.for_corporation");
    Numbersearch price = new Numbersearch("contract.price");
    Numbersearch reward = new Numbersearch("contract.reward");
    Numbersearch start_location_id = new Numbersearch("contract.start_location_id");
    Stringsearch title = new Stringsearch("contract.title");
    Stringsearch type = new Stringsearch("contract.type");
    Numbersearch volume = new Numbersearch("contract.volume");
    Numbersearch page = new Numbersearch("contract.page");
    Booleansearch active = new Booleansearch("contract.active");
//foreign keys
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Contract.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Contractsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Contractsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(collateral);
        addFieldsearcher(date_expired);
        addFieldsearcher(date_issued);
        addFieldsearcher(days_to_complete);
        addFieldsearcher(end_location_id);
        addFieldsearcher(for_corporation);
        addFieldsearcher(price);
        addFieldsearcher(reward);
        addFieldsearcher(start_location_id);
        addFieldsearcher(title);
        addFieldsearcher(type);
        addFieldsearcher(volume);
        addFieldsearcher(page);
        addFieldsearcher(active);
    }

    /**
     * add a primary key instance to search for
     * @param contractPK: Contract primery key
     */
    public void addPrimarykey(IContractPK contractPK) {
        super.addPrimarykey(contractPK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field collateral, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void collateral(Double[] values, byte[] operators) {
        addNumbervalues(collateral, values, operators);
    }
    
    /**
     * add Numeric search values for field collateral
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void collateral(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(collateral, values, operators);
        collateral.setAndoroperator(andor);
    }
    
    /**
     * add Timestamp search values for field date_expired, default OR operator is used
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void date_expired(Timestamp[] values, byte[] operators) {
        addTimevalues(date_expired, values, operators);
    }
    
    /**
     * add Timestamp search values for field date_expired
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void date_expired(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_expired, values, operators);
        date_expired.setAndoroperator(andor);
    }
    
    /**
     * add Timestamp search values for field date_issued, default OR operator is used
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void date_issued(Timestamp[] values, byte[] operators) {
        addTimevalues(date_issued, values, operators);
    }
    
    /**
     * add Timestamp search values for field date_issued
     * @param values: Array of timestamp search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void date_issued(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_issued, values, operators);
        date_issued.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field days_to_complete, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void days_to_complete(Double[] values, byte[] operators) {
        addNumbervalues(days_to_complete, values, operators);
    }
    
    /**
     * add Numeric search values for field days_to_complete
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void days_to_complete(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(days_to_complete, values, operators);
        days_to_complete.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field end_location_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void end_location_id(Double[] values, byte[] operators) {
        addNumbervalues(end_location_id, values, operators);
    }
    
    /**
     * add Numeric search values for field end_location_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void end_location_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(end_location_id, values, operators);
        end_location_id.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field for_corporation
     * @param value: true or false
     */
    public void for_corporation(Boolean value) {
        addBooleanvalue(for_corporation, value);
    }
    
    /**
     * add Numeric search values for field price, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void price(Double[] values, byte[] operators) {
        addNumbervalues(price, values, operators);
    }
    
    /**
     * add Numeric search values for field price
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(price, values, operators);
        price.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field reward, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void reward(Double[] values, byte[] operators) {
        addNumbervalues(reward, values, operators);
    }
    
    /**
     * add Numeric search values for field reward
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void reward(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(reward, values, operators);
        reward.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field start_location_id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void start_location_id(Double[] values, byte[] operators) {
        addNumbervalues(start_location_id, values, operators);
    }
    
    /**
     * add Numeric search values for field start_location_id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void start_location_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(start_location_id, values, operators);
        start_location_id.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field title, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void title(String[] values) {
        addStringvalues(title, values);
    }
    
    /**
     * add String search values for field title
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void title(String[] values, byte compare, byte andor) {
        addStringvalues(title, values);
        title.setCompareoperator(compare);
        title.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field type, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void type(String[] values) {
        addStringvalues(type, values);
    }
    
    /**
     * add String search values for field type
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void type(String[] values, byte compare, byte andor) {
        addStringvalues(type, values);
        type.setCompareoperator(compare);
        type.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void volume(Double[] values, byte[] operators) {
        addNumbervalues(volume, values, operators);
    }
    
    /**
     * add Numeric search values for field volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume, values, operators);
        volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field page, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void page(Double[] values, byte[] operators) {
        addNumbervalues(page, values, operators);
    }
    
    /**
     * add Numeric search values for field page
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void page(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(page, values, operators);
        page.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field active
     * @param value: true or false
     */
    public void active(Boolean value) {
        addBooleanvalue(active, value);
    }
    
}
