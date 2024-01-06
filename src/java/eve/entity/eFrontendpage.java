/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
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
import eve.interfaces.logicentity.IFrontendpage;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eFrontendpage extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected FrontendpagePK frontendpagePK;
	  
    public static final String table = "frontendpage";
	  
    public String getFieldname(short fieldconstant) {
        return IFrontendpage.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFrontendpage.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eFrontendpage.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eFrontendpage.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eFrontendpage() {
    }

    public eFrontendpage(java.lang.String name) {
        this.frontendpagePK = new FrontendpagePK(name);
    }
  
    public eFrontendpage(FrontendpagePK frontendpagePK) {
        this.frontendpagePK = frontendpagePK;
    }

    public boolean isEmpty() {
        return this.frontendpagePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.frontendpagePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.frontendpagePK.getPrimarykeyvalues();	  
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
    public FrontendpagePK getPrimaryKey() {
        return this.frontendpagePK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
