/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IFrontendpage_auth;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Frontendpage_authPK implements IFrontendpage_authPK {

    private IFrontendpagePK frontendpagePK = new FrontendpagePK();
    private IEveuserPK eveuserPK = new EveuserPK();
  
    public Frontendpage_authPK() {
    }

    public Frontendpage_authPK(java.lang.String username, java.lang.String frontendpage) {
        this.frontendpagePK = new FrontendpagePK(frontendpage);
        this.eveuserPK = new EveuserPK(username);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"frontendpage_auth.username", eveuserPK.getUsername()}, 
            {"frontendpage_auth.frontendpage", frontendpagePK.getName()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IFrontendpage_auth.USERNAME, eveuserPK.getUsername()}, 
            {IFrontendpage_auth.FRONTENDPAGE, frontendpagePK.getName()}
        };
        return new Entityvalues(keyfields);
    }

    public IFrontendpagePK getFrontendpagePK() {
        return this.frontendpagePK;
    }

    public void setFrontendpagePK(IFrontendpagePK frontendpagePK) {
        this.frontendpagePK = frontendpagePK;
    }

    public IEveuserPK getEveuserPK() {
        return this.eveuserPK;
    }

    public void setEveuserPK(IEveuserPK eveuserPK) {
        this.eveuserPK = eveuserPK;
    }

    public java.lang.String getUsername() {
        return this.eveuserPK.getUsername();
    }

    public void setUsername(java.lang.String username) {
        this.eveuserPK.setUsername(username);
    }

    public java.lang.String getFrontendpage() {
        return this.frontendpagePK.getName();
    }

    public void setFrontendpage(java.lang.String frontendpage) {
        this.frontendpagePK.setName(frontendpage);
    }

    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        if(getFrontendpage()!=null) key += getFrontendpage().length() + "_" + getFrontendpage();
        return key;
    }

    public static Frontendpage_authPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String username = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String frontendpage = keys.substring(0, keylength);
            return new Frontendpage_authPK(username, frontendpage);
        }
    }

    public boolean equals(IFrontendpage_authPK frontendpage_authPK2) {
        boolean isequal = frontendpage_authPK2!=null;
        if(isequal) {
            isequal = isequal && this.frontendpagePK.equals(frontendpage_authPK2.getFrontendpagePK());
            isequal = isequal && this.eveuserPK.equals(frontendpage_authPK2.getEveuserPK());
        }
        return isequal;
    }
}
