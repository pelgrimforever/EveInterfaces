/*
 * Frontendpagesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.1.2022 20:53
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IFrontendpagesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Frontendpage;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Frontendpage table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Frontendpagesearch extends Tablesearch implements IFrontendpagesearch {

    Stringsearch name = new Stringsearch("frontendpage.name");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch frontendpage_authsearcher = new Primarykeysearch("frontendpage_auth", IFrontendpage_auth.frontendpagePKfields, IFrontendpage_auth.frontendpageFKfields);
    //relational key
    Relationalkeysearch releveusersearcher = new Relationalkeysearch("frontendpage_auth", IFrontendpage_auth.frontendpagePKfields, IFrontendpage_auth.frontendpageFKfields, "eveuser", IFrontendpage_auth.eveuserPKfields, IFrontendpage_auth.eveuserFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Frontendpage.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Frontendpagesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Frontendpagesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(name);
        addKeysearcher(frontendpage_authsearcher);
        addKeysearcher(releveusersearcher);
    }

    /**
     * add a primary key instance to search for
     * @param frontendpagePK: Frontendpage primery key
     */
    public void addPrimarykey(IFrontendpagePK frontendpagePK) {
        super.addPrimarykey(frontendpagePK);
    }

    /**
     * add String search values for field name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    /**
     * add String search values for field name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    /**
     * set external key - foreign key subsearch IFrontendpage_authsearch
     * @param frontendpage_authsearch: IFrontendpage_authsearch
     */
    public void frontendpage_auth(IFrontendpage_authsearch frontendpage_authsearch) {
        frontendpage_authsearcher.setTablesearch(frontendpage_authsearch);
    }
    
    /**
     * get external key - foreign key subsearch IFrontendpage_authsearch
     * @return Tablesearch for IFrontendpage_authsearch
     */
    public IFrontendpage_authsearch getFrontendpage_authsearch() {
        if(frontendpage_authsearcher.used()) {
            return (IFrontendpage_authsearch)frontendpage_authsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch eveuser tablesearch
     * @param eveusersearch: IEveusersearch
     */
    public void releveuser(IEveusersearch eveusersearch) {
        releveusersearcher.setTablesearch(eveusersearch);
    }
    
    /**
     * get external key - relational subsearch IEveusersearch
     * @return Tablesearch for IEveusersearch
     */
    public IEveusersearch getRelEveusersearch() {
        if(releveusersearcher.used()) {
            return (IEveusersearch)releveusersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
