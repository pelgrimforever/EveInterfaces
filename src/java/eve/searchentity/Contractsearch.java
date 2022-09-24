/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

    public String getTable() {
        return Contract.table;
    }

    public Contractsearch() {
        setFieldsearchers();
    }

    public Contractsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void addPrimarykey(IContractPK contractPK) {
        super.addPrimarykey(contractPK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void collateral(Double[] values, byte[] operators) {
        addNumbervalues(collateral, values, operators);
    }
    
    public void collateral(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(collateral, values, operators);
        collateral.setAndoroperator(andor);
    }
    
    public void date_expired(Timestamp[] values, byte[] operators) {
        addTimevalues(date_expired, values, operators);
    }
    
    public void date_expired(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_expired, values, operators);
        date_expired.setAndoroperator(andor);
    }
    
    public void date_issued(Timestamp[] values, byte[] operators) {
        addTimevalues(date_issued, values, operators);
    }
    
    public void date_issued(Timestamp[] values, byte[] operators, byte andor) {
        addTimevalues(date_issued, values, operators);
        date_issued.setAndoroperator(andor);
    }
    
    public void days_to_complete(Double[] values, byte[] operators) {
        addNumbervalues(days_to_complete, values, operators);
    }
    
    public void days_to_complete(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(days_to_complete, values, operators);
        days_to_complete.setAndoroperator(andor);
    }
    
    public void end_location_id(Double[] values, byte[] operators) {
        addNumbervalues(end_location_id, values, operators);
    }
    
    public void end_location_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(end_location_id, values, operators);
        end_location_id.setAndoroperator(andor);
    }
    
    public void for_corporation(Boolean value) {
        addBooleanvalue(for_corporation, value);
    }
    
    public void price(Double[] values, byte[] operators) {
        addNumbervalues(price, values, operators);
    }
    
    public void price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(price, values, operators);
        price.setAndoroperator(andor);
    }
    
    public void reward(Double[] values, byte[] operators) {
        addNumbervalues(reward, values, operators);
    }
    
    public void reward(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(reward, values, operators);
        reward.setAndoroperator(andor);
    }
    
    public void start_location_id(Double[] values, byte[] operators) {
        addNumbervalues(start_location_id, values, operators);
    }
    
    public void start_location_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(start_location_id, values, operators);
        start_location_id.setAndoroperator(andor);
    }
    
    public void title(String[] values) {
        addStringvalues(title, values);
    }
    
    public void title(String[] values, byte compare, byte andor) {
        addStringvalues(title, values);
        title.setCompareoperator(compare);
        title.setAndoroperator(andor);
    }
    
    public void type(String[] values) {
        addStringvalues(type, values);
    }
    
    public void type(String[] values, byte compare, byte andor) {
        addStringvalues(type, values);
        type.setCompareoperator(compare);
        type.setAndoroperator(andor);
    }
    
    public void volume(Double[] values, byte[] operators) {
        addNumbervalues(volume, values, operators);
    }
    
    public void volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume, values, operators);
        volume.setAndoroperator(andor);
    }
    
    public void page(Double[] values, byte[] operators) {
        addNumbervalues(page, values, operators);
    }
    
    public void page(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(page, values, operators);
        page.setAndoroperator(andor);
    }
    
    public void active(Boolean value) {
        addBooleanvalue(active, value);
    }
    
}
