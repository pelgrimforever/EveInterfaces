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
import eve.interfaces.logicentity.IEveuser;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eEveuser extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected EveuserPK eveuserPK;
    private java.sql.Date createdat;
    private boolean admin;
	  
    public static final String table = "eveuser";
	  
    public String getFieldname(short fieldconstant) {
        return IEveuser.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IEveuser.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eEveuser.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eEveuser.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eEveuser() {
    }

    public eEveuser(java.lang.String username) {
        this.eveuserPK = new EveuserPK(username);
    }
  
    public eEveuser(EveuserPK eveuserPK) {
        this.eveuserPK = eveuserPK;
    }

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
