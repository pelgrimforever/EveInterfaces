/*
 * Bpmaterialsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IBpmaterialsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Bpmaterial;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Bpmaterial table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Bpmaterialsearch extends Tablesearch implements IBpmaterialsearch {

    Numbersearch amount = new Numbersearch("bpmaterial.amount");
//foreign keys
    Foreignkeysearch evetypeBpsearcher = new Foreignkeysearch("evetype", IBpmaterial.evetypeBpPKfields, IBpmaterial.evetypeBpFKfields);
    Foreignkeysearch evetypeMaterialsearcher = new Foreignkeysearch("evetype", IBpmaterial.evetypeMaterialPKfields, IBpmaterial.evetypeMaterialFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Bpmaterial.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Bpmaterialsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Bpmaterialsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(amount);
        addKeysearcher(evetypeBpsearcher);
        addKeysearcher(evetypeMaterialsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param bpmaterialPK: Bpmaterial primery key
     */
    public void addPrimarykey(IBpmaterialPK bpmaterialPK) {
        super.addPrimarykey(bpmaterialPK);
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
     * set foreign key subsearch evetypeBp IEvetypesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetypeBp(IEvetypesearch evetypesearch) {
        evetypeBpsearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get foreign key subsearch evetypeBp IEvetypesearch
     * @return Tablesearch for Bpmaterial
     */
    public IEvetypesearch getEvetypebpsearch() {
        if(evetypeBpsearcher.used()) {
            return (IEvetypesearch)evetypeBpsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if evetypeBpsearcher is not used
     * @return inner join statement
     */
    public String getEvetypebpInnerjoin() {
        return evetypeBpsearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch evetypeMaterial IEvetypesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetypeMaterial(IEvetypesearch evetypesearch) {
        evetypeMaterialsearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get foreign key subsearch evetypeMaterial IEvetypesearch
     * @return Tablesearch for Bpmaterial
     */
    public IEvetypesearch getEvetypematerialsearch() {
        if(evetypeMaterialsearcher.used()) {
            return (IEvetypesearch)evetypeMaterialsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if evetypeMaterialsearcher is not used
     * @return inner join statement
     */
    public String getEvetypematerialInnerjoin() {
        return evetypeMaterialsearcher.getInnerjoin();
    }

}
