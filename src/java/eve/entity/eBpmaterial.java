/*
 * eBpmaterial.java
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
import eve.interfaces.logicentity.IBpmaterial;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Bpmaterial
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Bpmaterial Entity
 * 
 * @author Franky Laseure
 */
public class eBpmaterial extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected BpmaterialPK bpmaterialPK;
    private long amount;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "bpmaterial";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IBpmaterial.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IBpmaterial.fieldtypes[fieldconstant-1];
    }
        
    public eBpmaterial() {
    }

    public eBpmaterial(long bp, long material) {
        this.bpmaterialPK = new BpmaterialPK(bp, material);
    }
  
    public eBpmaterial(BpmaterialPK bpmaterialPK) {
        this.bpmaterialPK = bpmaterialPK;
    }

    @Override
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
  
    /**
     * @return BpmaterialPK
     */
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
