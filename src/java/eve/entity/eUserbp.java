/*
 * eUserbp.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
import eve.interfaces.logicentity.IUserbp;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Userbp
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Userbp Entity
 * 
 * @author Franky Laseure
 */
public class eUserbp extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected UserbpPK userbpPK;
    private boolean original;
    private int materialefficiency;
    private int amountproduced;
    private int totalamount;
    private double bpprice;
    private double researchcost;
    private double stationfee;
	  
    public static final String table = "userbp";
	  
    public String getFieldname(short fieldconstant) {
        return IUserbp.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IUserbp.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eUserbp.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eUserbp.connectionpool;
    }
    
    /**
     * 
     * @return table name for Userbp
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Userbp class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Userbp entity
     */
    public eUserbp() {
    }

    /**
     * Constructor
     * build an empty Userbp entity with initialized field values
     */
    public eUserbp(java.lang.String username, long bp, int serialnumber) {
        this.userbpPK = new UserbpPK(username, bp, serialnumber);
    }
  
    /**
     * Constructor
     * build an empty Userbp entity with initialized Primarykey parameter
     * @param userbpPK: Userbp Primarykey
     */
    public eUserbp(UserbpPK userbpPK) {
        this.userbpPK = userbpPK;
    }

    /**
     * @return is Userbp Empty ?
     */
    public boolean isEmpty() {
        return this.userbpPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.userbpPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.userbpPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IUserbp.ORIGINAL, original);
        updates.put(IUserbp.MATERIALEFFICIENCY, materialefficiency);
        updates.put(IUserbp.AMOUNTPRODUCED, amountproduced);
        updates.put(IUserbp.TOTALAMOUNT, totalamount);
        updates.put(IUserbp.BPPRICE, bpprice);
        updates.put(IUserbp.RESEARCHCOST, researchcost);
        updates.put(IUserbp.STATIONFEE, stationfee);
        return getAllFields();
    }
	
    /**
     * @return UserbpPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return UserbpPK
     */
    @Override
    public UserbpPK getPrimaryKey() {
        return this.userbpPK;
    }

    /**
     * 
     * @return original value
     */
    public boolean getOriginal() {
        return this.original;
    }

    /**
     * set original value
     * @param original: new value
     */
    public void initOriginal(boolean original) {
        this.original = original;
    }

    /**
     * set original value
     * @param original: new value
     */
    public void setOriginal(boolean original) {
        updates.put(IUserbp.ORIGINAL, original);
        this.original = original;
    }

    /**
     * 
     * @return materialefficiency value
     */
    public int getMaterialefficiency() {
        return this.materialefficiency;
    }

    /**
     * set materialefficiency value
     * @param materialefficiency: new value
     */
    public void initMaterialefficiency(int materialefficiency) {
        this.materialefficiency = materialefficiency;
    }

    /**
     * set materialefficiency value
     * @param materialefficiency: new value
     */
    public void setMaterialefficiency(int materialefficiency) {
        updates.put(IUserbp.MATERIALEFFICIENCY, materialefficiency);
        this.materialefficiency = materialefficiency;
    }

    /**
     * 
     * @return amountproduced value
     */
    public int getAmountproduced() {
        return this.amountproduced;
    }

    /**
     * set amountproduced value
     * @param amountproduced: new value
     */
    public void initAmountproduced(int amountproduced) {
        this.amountproduced = amountproduced;
    }

    /**
     * set amountproduced value
     * @param amountproduced: new value
     */
    public void setAmountproduced(int amountproduced) {
        updates.put(IUserbp.AMOUNTPRODUCED, amountproduced);
        this.amountproduced = amountproduced;
    }

    /**
     * 
     * @return totalamount value
     */
    public int getTotalamount() {
        return this.totalamount;
    }

    /**
     * set totalamount value
     * @param totalamount: new value
     */
    public void initTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    /**
     * set totalamount value
     * @param totalamount: new value
     */
    public void setTotalamount(int totalamount) {
        updates.put(IUserbp.TOTALAMOUNT, totalamount);
        this.totalamount = totalamount;
    }

    /**
     * 
     * @return bpprice value
     */
    public double getBpprice() {
        return this.bpprice;
    }

    /**
     * set bpprice value
     * @param bpprice: new value
     */
    public void initBpprice(double bpprice) {
        this.bpprice = bpprice;
    }

    /**
     * set bpprice value
     * @param bpprice: new value
     */
    public void setBpprice(double bpprice) {
        updates.put(IUserbp.BPPRICE, bpprice);
        this.bpprice = bpprice;
    }

    /**
     * 
     * @return researchcost value
     */
    public double getResearchcost() {
        return this.researchcost;
    }

    /**
     * set researchcost value
     * @param researchcost: new value
     */
    public void initResearchcost(double researchcost) {
        this.researchcost = researchcost;
    }

    /**
     * set researchcost value
     * @param researchcost: new value
     */
    public void setResearchcost(double researchcost) {
        updates.put(IUserbp.RESEARCHCOST, researchcost);
        this.researchcost = researchcost;
    }

    /**
     * 
     * @return stationfee value
     */
    public double getStationfee() {
        return this.stationfee;
    }

    /**
     * set stationfee value
     * @param stationfee: new value
     */
    public void initStationfee(double stationfee) {
        this.stationfee = stationfee;
    }

    /**
     * set stationfee value
     * @param stationfee: new value
     */
    public void setStationfee(double stationfee) {
        updates.put(IUserbp.STATIONFEE, stationfee);
        this.stationfee = stationfee;
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
