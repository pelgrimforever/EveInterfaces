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
import eve.interfaces.logicentity.IMaterialinput;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eMaterialinput extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected MaterialinputPK materialinputPK;
    private long amount;
    private double unitprice;
    private long usedamount;
	  
    public static final String table = "materialinput";
	  
    public String getFieldname(short fieldconstant) {
        return IMaterialinput.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IMaterialinput.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eMaterialinput.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eMaterialinput.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eMaterialinput() {
    }

    public eMaterialinput(java.lang.String username, long evetype, java.sql.Timestamp addtimestamp) {
        this.materialinputPK = new MaterialinputPK(username, evetype, addtimestamp);
    }
  
    public eMaterialinput(MaterialinputPK materialinputPK) {
        this.materialinputPK = materialinputPK;
    }

    public boolean isEmpty() {
        return this.materialinputPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.materialinputPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.materialinputPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IMaterialinput.AMOUNT, amount);
        updates.put(IMaterialinput.UNITPRICE, unitprice);
        updates.put(IMaterialinput.USEDAMOUNT, usedamount);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public MaterialinputPK getPrimaryKey() {
        return this.materialinputPK;
    }

    public long getAmount() {
        return this.amount;
    }

    public void initAmount(long amount) {
        this.amount = amount;
    }

    public void setAmount(long amount) {
        updates.put(IMaterialinput.AMOUNT, amount);
        this.amount = amount;
    }

    public double getUnitprice() {
        return this.unitprice;
    }

    public void initUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public void setUnitprice(double unitprice) {
        updates.put(IMaterialinput.UNITPRICE, unitprice);
        this.unitprice = unitprice;
    }

    public long getUsedamount() {
        return this.usedamount;
    }

    public void initUsedamount(long usedamount) {
        this.usedamount = usedamount;
    }

    public void setUsedamount(long usedamount) {
        updates.put(IMaterialinput.USEDAMOUNT, usedamount);
        this.usedamount = usedamount;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
