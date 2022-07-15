/*
 * eAllnodes_system.java
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
import eve.interfaces.logicentity.IAllnodes_system;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Allnodes_system
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Allnodes_system Entity
 * 
 * @author Franky Laseure
 */
public class eAllnodes_system extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Allnodes_systemPK allnodes_systemPK;
    private boolean deadend;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "allnodes_system";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IAllnodes_system.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IAllnodes_system.fieldtypes[fieldconstant-1];
    }
        
    public eAllnodes_system() {
    }

    public eAllnodes_system(long id) {
        this.allnodes_systemPK = new Allnodes_systemPK(id);
    }
  
    public eAllnodes_system(Allnodes_systemPK allnodes_systemPK) {
        this.allnodes_systemPK = allnodes_systemPK;
    }

    @Override
    public boolean isEmpty() {
        return this.allnodes_systemPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.allnodes_systemPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.allnodes_systemPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IAllnodes_system.DEADEND, deadend);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Allnodes_systemPK
     */
    @Override
    public Allnodes_systemPK getPrimaryKey() {
        return this.allnodes_systemPK;
    }

    public boolean getDeadend() {
        return this.deadend;
    }

    public void initDeadend(boolean deadend) {
        this.deadend = deadend;
    }

    public void setDeadend(boolean deadend) {
        updates.put(IAllnodes_system.DEADEND, deadend);
        this.deadend = deadend;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
