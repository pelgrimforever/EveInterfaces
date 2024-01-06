/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

public class Frontendpage_authsearch extends Tablesearch implements IFrontendpage_authsearch {

//foreign keys
    Foreignkeysearch frontendpagesearcher = new Foreignkeysearch("frontendpage", IFrontendpage_auth.frontendpagePKfields, IFrontendpage_auth.frontendpageFKfields);
    Foreignkeysearch eveusersearcher = new Foreignkeysearch("eveuser", IFrontendpage_auth.eveuserPKfields, IFrontendpage_auth.eveuserFKfields);
//external foreign keys

    public String getTable() {
        return Frontendpage_auth.table;
    }

    public Frontendpage_authsearch() {
        setFieldsearchers();
    }

    public Frontendpage_authsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addKeysearcher(frontendpagesearcher);
        addKeysearcher(eveusersearcher);
    }

    public void addPrimarykey(IFrontendpage_authPK frontendpage_authPK) {
        super.addPrimarykey(frontendpage_authPK);
    }

    public void frontendpage(IFrontendpagesearch frontendpagesearch) {
        frontendpagesearcher.setTablesearch(frontendpagesearch);
    }
    
    public IFrontendpagesearch getFrontendpagesearch() {
        if(frontendpagesearcher.used()) {
            return (IFrontendpagesearch)frontendpagesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getFrontendpageInnerjoin() {
        return frontendpagesearcher.getInnerjoin();
    }

    public void eveuser(IEveusersearch eveusersearch) {
        eveusersearcher.setTablesearch(eveusersearch);
    }
    
    public IEveusersearch getEveusersearch() {
        if(eveusersearcher.used()) {
            return (IEveusersearch)eveusersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getEveuserInnerjoin() {
        return eveusersearcher.getInnerjoin();
    }

}
