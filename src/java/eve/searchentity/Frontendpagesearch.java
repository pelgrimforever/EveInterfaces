/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

public class Frontendpagesearch extends Tablesearch implements IFrontendpagesearch {

    Stringsearch name = new Stringsearch("frontendpage.name");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch frontendpage_authsearcher = new Primarykeysearch("frontendpage_auth", IFrontendpage_auth.frontendpagePKfields, IFrontendpage_auth.frontendpageFKfields);
    //relational key
    Relationalkeysearch releveusersearcher = new Relationalkeysearch("frontendpage_auth", IFrontendpage_auth.frontendpagePKfields, IFrontendpage_auth.frontendpageFKfields, "eveuser", IFrontendpage_auth.eveuserPKfields, IFrontendpage_auth.eveuserFKfields);

    public String getTable() {
        return Frontendpage.table;
    }

    public Frontendpagesearch() {
        setFieldsearchers();
    }

    public Frontendpagesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(name);
        addKeysearcher(frontendpage_authsearcher);
        addKeysearcher(releveusersearcher);
    }

    public void addPrimarykey(IFrontendpagePK frontendpagePK) {
        super.addPrimarykey(frontendpagePK);
    }

    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void frontendpage_auth(IFrontendpage_authsearch frontendpage_authsearch) {
        frontendpage_authsearcher.setTablesearch(frontendpage_authsearch);
    }
    
    public IFrontendpage_authsearch getFrontendpage_authsearch() {
        if(frontendpage_authsearcher.used()) {
            return (IFrontendpage_authsearch)frontendpage_authsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void releveuser(IEveusersearch eveusersearch) {
        releveusersearcher.setTablesearch(eveusersearch);
    }
    
    public IEveusersearch getRelEveusersearch() {
        if(releveusersearcher.used()) {
            return (IEveusersearch)releveusersearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
