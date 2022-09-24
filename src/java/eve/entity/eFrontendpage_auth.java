/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity;

import eve.eveDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IFrontendpage_auth;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eFrontendpage_auth extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Frontendpage_authPK frontendpage_authPK;
	  
    public static final String table = "frontendpage_auth";
	  
    public String getFieldname(short fieldconstant) {
        return IFrontendpage_auth.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFrontendpage_auth.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eFrontendpage_auth.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eFrontendpage_auth.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eFrontendpage_auth() {
    }

    public eFrontendpage_auth(java.lang.String username, java.lang.String frontendpage) {
        this.frontendpage_authPK = new Frontendpage_authPK(username, frontendpage);
    }
  
    public eFrontendpage_auth(Frontendpage_authPK frontendpage_authPK) {
        this.frontendpage_authPK = frontendpage_authPK;
    }

    public boolean isEmpty() {
        return this.frontendpage_authPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.frontendpage_authPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.frontendpage_authPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Frontendpage_authPK getPrimaryKey() {
        return this.frontendpage_authPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
