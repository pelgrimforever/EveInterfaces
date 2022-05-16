/*
 * Eveusersearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IEveusersearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Eveuser;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Eveuser table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Eveusersearch extends Tablesearch implements IEveusersearch {

    Stringsearch username = new Stringsearch("eveuser.username");
    Datesearch createdat = new Datesearch("eveuser.createdat");
    Booleansearch admin = new Booleansearch("eveuser.admin");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch frontendpage_authsearcher = new Primarykeysearch("frontendpage_auth", IFrontendpage_auth.eveuserPKfields, IFrontendpage_auth.eveuserFKfields);
    //relational key
    Relationalkeysearch relfrontendpagesearcher = new Relationalkeysearch("frontendpage_auth", IFrontendpage_auth.eveuserPKfields, IFrontendpage_auth.eveuserFKfields, "frontendpage", IFrontendpage_auth.frontendpagePKfields, IFrontendpage_auth.frontendpageFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Eveuser.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Eveusersearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Eveusersearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(createdat);
        addFieldsearcher(admin);
        addKeysearcher(frontendpage_authsearcher);
        addKeysearcher(relfrontendpagesearcher);
    }

    /**
     * add a primary key instance to search for
     * @param eveuserPK: Eveuser primery key
     */
    public void addPrimarykey(IEveuserPK eveuserPK) {
        super.addPrimarykey(eveuserPK);
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
     * add Date search values for field createdat, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void createdat(Date[] values, byte[] operators) {
        addDatevalues(createdat, values, operators);
    }
    
    /**
     * add Date search values for field createdat
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void createdat(Date[] values, byte[] operators, byte andor) {
        addDatevalues(createdat, values, operators);
        createdat.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field admin
     * @param value: true or false
     */
    public void admin(Boolean value) {
        addBooleanvalue(admin, value);
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
     * set external key - relational subsearch frontendpage tablesearch
     * @param frontendpagesearch: IFrontendpagesearch
     */
    public void relfrontendpage(IFrontendpagesearch frontendpagesearch) {
        relfrontendpagesearcher.setTablesearch(frontendpagesearch);
    }
    
    /**
     * get external key - relational subsearch IFrontendpagesearch
     * @return Tablesearch for IFrontendpagesearch
     */
    public IFrontendpagesearch getRelFrontendpagesearch() {
        if(relfrontendpagesearcher.used()) {
            return (IFrontendpagesearch)relfrontendpagesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
