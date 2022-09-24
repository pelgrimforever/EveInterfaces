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
import eve.interfaces.logicentity.ISystemjumps;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eSystemjumps extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected SystemjumpsPK systemjumpsPK;
    private int jumps;
    private int jumpslowsec;
    private int jumpsnullsec;
    private int jumpssafe;
    private int jumpssafelowsec;
    private int jumpssafenullsec;
	  
    public static final String table = "systemjumps";
	  
    public String getFieldname(short fieldconstant) {
        return ISystemjumps.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISystemjumps.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eSystemjumps.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eSystemjumps.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eSystemjumps() {
    }

    public eSystemjumps(long system_start, long system_end) {
        this.systemjumpsPK = new SystemjumpsPK(system_start, system_end);
    }
  
    public eSystemjumps(SystemjumpsPK systemjumpsPK) {
        this.systemjumpsPK = systemjumpsPK;
    }

    public boolean isEmpty() {
        return this.systemjumpsPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.systemjumpsPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.systemjumpsPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ISystemjumps.JUMPS, jumps);
        updates.put(ISystemjumps.JUMPSLOWSEC, jumpslowsec);
        updates.put(ISystemjumps.JUMPSNULLSEC, jumpsnullsec);
        updates.put(ISystemjumps.JUMPSSAFE, jumpssafe);
        updates.put(ISystemjumps.JUMPSSAFELOWSEC, jumpssafelowsec);
        updates.put(ISystemjumps.JUMPSSAFENULLSEC, jumpssafenullsec);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public SystemjumpsPK getPrimaryKey() {
        return this.systemjumpsPK;
    }

    public int getJumps() {
        return this.jumps;
    }

    public void initJumps(int jumps) {
        this.jumps = jumps;
    }

    public void setJumps(int jumps) {
        updates.put(ISystemjumps.JUMPS, jumps);
        this.jumps = jumps;
    }

    public int getJumpslowsec() {
        return this.jumpslowsec;
    }

    public void initJumpslowsec(int jumpslowsec) {
        this.jumpslowsec = jumpslowsec;
    }

    public void setJumpslowsec(int jumpslowsec) {
        updates.put(ISystemjumps.JUMPSLOWSEC, jumpslowsec);
        this.jumpslowsec = jumpslowsec;
    }

    public int getJumpsnullsec() {
        return this.jumpsnullsec;
    }

    public void initJumpsnullsec(int jumpsnullsec) {
        this.jumpsnullsec = jumpsnullsec;
    }

    public void setJumpsnullsec(int jumpsnullsec) {
        updates.put(ISystemjumps.JUMPSNULLSEC, jumpsnullsec);
        this.jumpsnullsec = jumpsnullsec;
    }

    public int getJumpssafe() {
        return this.jumpssafe;
    }

    public void initJumpssafe(int jumpssafe) {
        this.jumpssafe = jumpssafe;
    }

    public void setJumpssafe(int jumpssafe) {
        updates.put(ISystemjumps.JUMPSSAFE, jumpssafe);
        this.jumpssafe = jumpssafe;
    }

    public int getJumpssafelowsec() {
        return this.jumpssafelowsec;
    }

    public void initJumpssafelowsec(int jumpssafelowsec) {
        this.jumpssafelowsec = jumpssafelowsec;
    }

    public void setJumpssafelowsec(int jumpssafelowsec) {
        updates.put(ISystemjumps.JUMPSSAFELOWSEC, jumpssafelowsec);
        this.jumpssafelowsec = jumpssafelowsec;
    }

    public int getJumpssafenullsec() {
        return this.jumpssafenullsec;
    }

    public void initJumpssafenullsec(int jumpssafenullsec) {
        this.jumpssafenullsec = jumpssafenullsec;
    }

    public void setJumpssafenullsec(int jumpssafenullsec) {
        updates.put(ISystemjumps.JUMPSSAFENULLSEC, jumpssafenullsec);
        this.jumpssafenullsec = jumpssafenullsec;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
