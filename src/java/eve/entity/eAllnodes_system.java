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
import eve.interfaces.logicentity.IAllnodes_system;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eAllnodes_system extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Allnodes_systemPK allnodes_systemPK;
    private boolean deadend;
	  
    public static final String table = "allnodes_system";
	  
    public String getFieldname(short fieldconstant) {
        return IAllnodes_system.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IAllnodes_system.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eAllnodes_system.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eAllnodes_system.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eAllnodes_system() {
    }

    public eAllnodes_system(long id) {
        this.allnodes_systemPK = new Allnodes_systemPK(id);
    }
  
    public eAllnodes_system(Allnodes_systemPK allnodes_systemPK) {
        this.allnodes_systemPK = allnodes_systemPK;
    }

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
