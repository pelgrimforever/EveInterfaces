/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

    public String getTable() {
        return Eveuser.table;
    }

    public Eveusersearch() {
        setFieldsearchers();
    }

    public Eveusersearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(createdat);
        addFieldsearcher(admin);
        addKeysearcher(frontendpage_authsearcher);
        addKeysearcher(relfrontendpagesearcher);
    }

    public void addPrimarykey(IEveuserPK eveuserPK) {
        super.addPrimarykey(eveuserPK);
    }

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void createdat(Date[] values, byte[] operators) {
        addDatevalues(createdat, values, operators);
    }
    
    public void createdat(Date[] values, byte[] operators, byte andor) {
        addDatevalues(createdat, values, operators);
        createdat.setAndoroperator(andor);
    }
    
    public void admin(Boolean value) {
        addBooleanvalue(admin, value);
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

    public void relfrontendpage(IFrontendpagesearch frontendpagesearch) {
        relfrontendpagesearcher.setTablesearch(frontendpagesearch);
    }
    
    public IFrontendpagesearch getRelFrontendpagesearch() {
        if(relfrontendpagesearcher.used()) {
            return (IFrontendpagesearch)relfrontendpagesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
