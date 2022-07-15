/*
 * Frontendpage_authsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IFrontendpage_authsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Frontendpage_auth;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Frontendpage_auth table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Frontendpage_authsearch extends Tablesearch implements IFrontendpage_authsearch {

//foreign keys
    Foreignkeysearch frontendpagesearcher = new Foreignkeysearch("frontendpage", IFrontendpage_auth.frontendpagePKfields, IFrontendpage_auth.frontendpageFKfields);
    Foreignkeysearch eveusersearcher = new Foreignkeysearch("eveuser", IFrontendpage_auth.eveuserPKfields, IFrontendpage_auth.eveuserFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Frontendpage_auth.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Frontendpage_authsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Frontendpage_authsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addKeysearcher(frontendpagesearcher);
        addKeysearcher(eveusersearcher);
    }

    /**
     * add a primary key instance to search for
     * @param frontendpage_authPK: Frontendpage_auth primery key
     */
    public void addPrimarykey(IFrontendpage_authPK frontendpage_authPK) {
        super.addPrimarykey(frontendpage_authPK);
    }

    /**
     * set foreign key subsearch frontendpage IFrontendpagesearch
     * @param frontendpagesearch: IFrontendpagesearch
     */
    public void frontendpage(IFrontendpagesearch frontendpagesearch) {
        frontendpagesearcher.setTablesearch(frontendpagesearch);
    }
    
    /**
     * get foreign key subsearch frontendpage IFrontendpagesearch
     * @return Tablesearch for Frontendpage_auth
     */
    public IFrontendpagesearch getFrontendpagesearch() {
        if(frontendpagesearcher.used()) {
            return (IFrontendpagesearch)frontendpagesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if frontendpagesearcher is not used
     * @return inner join statement
     */
    public String getFrontendpageInnerjoin() {
        return frontendpagesearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch eveuser IEveusersearch
     * @param eveusersearch: IEveusersearch
     */
    public void eveuser(IEveusersearch eveusersearch) {
        eveusersearcher.setTablesearch(eveusersearch);
    }
    
    /**
     * get foreign key subsearch eveuser IEveusersearch
     * @return Tablesearch for Frontendpage_auth
     */
    public IEveusersearch getEveusersearch() {
        if(eveusersearcher.used()) {
            return (IEveusersearch)eveusersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if eveusersearcher is not used
     * @return inner join statement
     */
    public String getEveuserInnerjoin() {
        return eveusersearcher.getInnerjoin();
    }

}
