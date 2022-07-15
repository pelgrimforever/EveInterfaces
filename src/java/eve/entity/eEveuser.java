/*
 * eEveuser.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:24
 *
 */

package eve.entity;

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

import eve.eveDatabaseproperties;
import eve.entity.pk.*;
import eve.interfaces.logicentity.IEveuser;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Eveuser
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Eveuser Entity
 * 
 * @author Franky Laseure
 */
public class eEveuser extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected EveuserPK eveuserPK;
    private java.sql.Date createdat;
    private boolean admin;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "eveuser";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IEveuser.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IEveuser.fieldtypes[fieldconstant-1];
    }
        
    public eEveuser() {
    }

    public eEveuser(java.lang.String username) {
        this.eveuserPK = new EveuserPK(username);
    }
  
    public eEveuser(EveuserPK eveuserPK) {
        this.eveuserPK = eveuserPK;
    }

    @Override
    public boolean isEmpty() {
        return this.eveuserPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.eveuserPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.eveuserPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IEveuser.CREATEDAT, createdat);
        updates.put(IEveuser.ADMIN, admin);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return EveuserPK
     */
    @Override
    public EveuserPK getPrimaryKey() {
        return this.eveuserPK;
    }

    public java.sql.Date getCreatedat() {
        return this.createdat;
    }

    public void initCreatedat(java.sql.Date createdat) {
        this.createdat = createdat;
    }

    public void setCreatedat(java.sql.Date createdat) {
	if(createdat==null && createdat!=this.createdat || createdat!=null && !createdat.equals(this.createdat)) {
            updates.put(IEveuser.CREATEDAT, createdat);
        }
        this.createdat = createdat;
    }

    public boolean getAdmin() {
        return this.admin;
    }

    public void initAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setAdmin(boolean admin) {
        updates.put(IEveuser.ADMIN, admin);
        this.admin = admin;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
