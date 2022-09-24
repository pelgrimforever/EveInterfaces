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
import eve.interfaces.logicentity.IBpmaterial;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eBpmaterial extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected BpmaterialPK bpmaterialPK;
    private long amount;
	  
    public static final String table = "bpmaterial";
	  
    public String getFieldname(short fieldconstant) {
        return IBpmaterial.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IBpmaterial.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eBpmaterial.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eBpmaterial.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eBpmaterial() {
    }

    public eBpmaterial(long bp, long material) {
        this.bpmaterialPK = new BpmaterialPK(bp, material);
    }
  
    public eBpmaterial(BpmaterialPK bpmaterialPK) {
        this.bpmaterialPK = bpmaterialPK;
    }

    public boolean isEmpty() {
        return this.bpmaterialPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.bpmaterialPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.bpmaterialPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IBpmaterial.AMOUNT, amount);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public BpmaterialPK getPrimaryKey() {
        return this.bpmaterialPK;
    }

    public long getAmount() {
        return this.amount;
    }

    public void initAmount(long amount) {
        this.amount = amount;
    }

    public void setAmount(long amount) {
        updates.put(IBpmaterial.AMOUNT, amount);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
