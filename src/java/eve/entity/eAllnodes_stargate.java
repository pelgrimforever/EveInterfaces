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
import eve.interfaces.logicentity.IAllnodes_stargate;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eAllnodes_stargate extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Allnodes_stargatePK allnodes_stargatePK;
    private long to_stargate;
    private long system;
    private long to_system;
    private boolean deadend;
	  
    public static final String table = "allnodes_stargate";
	  
    public String getFieldname(short fieldconstant) {
        return IAllnodes_stargate.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IAllnodes_stargate.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eAllnodes_stargate.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eAllnodes_stargate.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eAllnodes_stargate() {
    }

    public eAllnodes_stargate(long id) {
        this.allnodes_stargatePK = new Allnodes_stargatePK(id);
    }
  
    public eAllnodes_stargate(Allnodes_stargatePK allnodes_stargatePK) {
        this.allnodes_stargatePK = allnodes_stargatePK;
    }

    public boolean isEmpty() {
        return this.allnodes_stargatePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.allnodes_stargatePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.allnodes_stargatePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IAllnodes_stargate.TO_STARGATE, to_stargate);
        updates.put(IAllnodes_stargate.SYSTEM, system);
        updates.put(IAllnodes_stargate.TO_SYSTEM, to_system);
        updates.put(IAllnodes_stargate.DEADEND, deadend);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Allnodes_stargatePK getPrimaryKey() {
        return this.allnodes_stargatePK;
    }

    public long getTo_stargate() {
        return this.to_stargate;
    }

    public void initTo_stargate(long to_stargate) {
        this.to_stargate = to_stargate;
    }

    public void setTo_stargate(long to_stargate) {
        updates.put(IAllnodes_stargate.TO_STARGATE, to_stargate);
        this.to_stargate = to_stargate;
    }

    public long getSystem() {
        return this.system;
    }

    public void initSystem(long system) {
        this.system = system;
    }

    public void setSystem(long system) {
        updates.put(IAllnodes_stargate.SYSTEM, system);
        this.system = system;
    }

    public long getTo_system() {
        return this.to_system;
    }

    public void initTo_system(long to_system) {
        this.to_system = to_system;
    }

    public void setTo_system(long to_system) {
        updates.put(IAllnodes_stargate.TO_SYSTEM, to_system);
        this.to_system = to_system;
    }

    public boolean getDeadend() {
        return this.deadend;
    }

    public void initDeadend(boolean deadend) {
        this.deadend = deadend;
    }

    public void setDeadend(boolean deadend) {
        updates.put(IAllnodes_stargate.DEADEND, deadend);
        this.deadend = deadend;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
