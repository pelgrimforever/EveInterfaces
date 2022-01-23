/*
 * eMaterialinput.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 19.0.2022 21:56
 *
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

/**
 * Entity class Materialinput
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Materialinput Entity
 * 
 * @author Franky Laseure
 */
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
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eMaterialinput.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eMaterialinput.connectionpool;
    }
    
    /**
     * 
     * @return table name for Materialinput
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Materialinput class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Materialinput entity
     */
    public eMaterialinput() {
    }

    /**
     * Constructor
     * build an empty Materialinput entity with initialized field values
     */
    public eMaterialinput(java.lang.String username, long evetype, java.sql.Timestamp addtimestamp) {
        this.materialinputPK = new MaterialinputPK(username, evetype, addtimestamp);
    }
  
    /**
     * Constructor
     * build an empty Materialinput entity with initialized Primarykey parameter
     * @param materialinputPK: Materialinput Primarykey
     */
    public eMaterialinput(MaterialinputPK materialinputPK) {
        this.materialinputPK = materialinputPK;
    }

    /**
     * @return is Materialinput Empty ?
     */
    public boolean isEmpty() {
        return this.materialinputPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.materialinputPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.materialinputPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IMaterialinput.AMOUNT, amount);
        updates.put(IMaterialinput.UNITPRICE, unitprice);
        updates.put(IMaterialinput.USEDAMOUNT, usedamount);
        return getAllFields();
    }
	
    /**
     * @return MaterialinputPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return MaterialinputPK
     */
    @Override
    public MaterialinputPK getPrimaryKey() {
        return this.materialinputPK;
    }

    /**
     * 
     * @return amount value
     */
    public long getAmount() {
        return this.amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void initAmount(long amount) {
        this.amount = amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void setAmount(long amount) {
        updates.put(IMaterialinput.AMOUNT, amount);
        this.amount = amount;
    }

    /**
     * 
     * @return unitprice value
     */
    public double getUnitprice() {
        return this.unitprice;
    }

    /**
     * set unitprice value
     * @param unitprice: new value
     */
    public void initUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    /**
     * set unitprice value
     * @param unitprice: new value
     */
    public void setUnitprice(double unitprice) {
        updates.put(IMaterialinput.UNITPRICE, unitprice);
        this.unitprice = unitprice;
    }

    /**
     * 
     * @return usedamount value
     */
    public long getUsedamount() {
        return this.usedamount;
    }

    /**
     * set usedamount value
     * @param usedamount: new value
     */
    public void initUsedamount(long usedamount) {
        this.usedamount = usedamount;
    }

    /**
     * set usedamount value
     * @param usedamount: new value
     */
    public void setUsedamount(long usedamount) {
        updates.put(IMaterialinput.USEDAMOUNT, usedamount);
        this.usedamount = usedamount;
    }

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
