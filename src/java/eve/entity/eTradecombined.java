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
import eve.interfaces.logicentity.ITradecombined;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eTradecombined extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected TradecombinedPK tradecombinedPK;
    private int jumps;
    private int jumpslowsec;
    private int jumpsnullsec;
	  
    public static final String table = "tradecombined";
	  
    public String getFieldname(short fieldconstant) {
        return ITradecombined.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITradecombined.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eTradecombined.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eTradecombined.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eTradecombined() {
    }

    public eTradecombined(long sell_system, long buy_system, long evetype) {
        this.tradecombinedPK = new TradecombinedPK(sell_system, buy_system, evetype);
    }
  
    public eTradecombined(TradecombinedPK tradecombinedPK) {
        this.tradecombinedPK = tradecombinedPK;
    }

    public boolean isEmpty() {
        return this.tradecombinedPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.tradecombinedPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.tradecombinedPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ITradecombined.JUMPS, jumps);
        updates.put(ITradecombined.JUMPSLOWSEC, jumpslowsec);
        updates.put(ITradecombined.JUMPSNULLSEC, jumpsnullsec);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public TradecombinedPK getPrimaryKey() {
        return this.tradecombinedPK;
    }

    public int getJumps() {
        return this.jumps;
    }

    public void initJumps(int jumps) {
        this.jumps = jumps;
    }

    public void setJumps(int jumps) {
        updates.put(ITradecombined.JUMPS, jumps);
        this.jumps = jumps;
    }

    public int getJumpslowsec() {
        return this.jumpslowsec;
    }

    public void initJumpslowsec(int jumpslowsec) {
        this.jumpslowsec = jumpslowsec;
    }

    public void setJumpslowsec(int jumpslowsec) {
        updates.put(ITradecombined.JUMPSLOWSEC, jumpslowsec);
        this.jumpslowsec = jumpslowsec;
    }

    public int getJumpsnullsec() {
        return this.jumpsnullsec;
    }

    public void initJumpsnullsec(int jumpsnullsec) {
        this.jumpsnullsec = jumpsnullsec;
    }

    public void setJumpsnullsec(int jumpsnullsec) {
        updates.put(ITradecombined.JUMPSNULLSEC, jumpsnullsec);
        this.jumpsnullsec = jumpsnullsec;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
