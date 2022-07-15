/*
 * eUserbp.java
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "userbp";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IUserbp.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IUserbp.fieldtypes[fieldconstant-1];
    }
        
    public eUserbp() {
    }

    public eUserbp(java.lang.String username, long bp, int serialnumber) {
        this.userbpPK = new UserbpPK(username, bp, serialnumber);
    }
  
    public eUserbp(UserbpPK userbpPK) {
        this.userbpPK = userbpPK;
    }

    @Override
    public boolean isEmpty() {
        return this.userbpPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.userbpPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.userbpPK.getPrimarykeyvalues();	  
    }
  
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

    public boolean getOriginal() {
        return this.original;
    }

    public void initOriginal(boolean original) {
        this.original = original;
    }

    public void setOriginal(boolean original) {
        updates.put(IUserbp.ORIGINAL, original);
        this.original = original;
    }

    public int getMaterialefficiency() {
        return this.materialefficiency;
    }

    public void initMaterialefficiency(int materialefficiency) {
        this.materialefficiency = materialefficiency;
    }

    public void setMaterialefficiency(int materialefficiency) {
        updates.put(IUserbp.MATERIALEFFICIENCY, materialefficiency);
        this.materialefficiency = materialefficiency;
    }

    public int getAmountproduced() {
        return this.amountproduced;
    }

    public void initAmountproduced(int amountproduced) {
        this.amountproduced = amountproduced;
    }

    public void setAmountproduced(int amountproduced) {
        updates.put(IUserbp.AMOUNTPRODUCED, amountproduced);
        this.amountproduced = amountproduced;
    }

    public int getTotalamount() {
        return this.totalamount;
    }

    public void initTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    public void setTotalamount(int totalamount) {
        updates.put(IUserbp.TOTALAMOUNT, totalamount);
        this.totalamount = totalamount;
    }

    public double getBpprice() {
        return this.bpprice;
    }

    public void initBpprice(double bpprice) {
        this.bpprice = bpprice;
    }

    public void setBpprice(double bpprice) {
        updates.put(IUserbp.BPPRICE, bpprice);
        this.bpprice = bpprice;
    }

    public double getResearchcost() {
        return this.researchcost;
    }

    public void initResearchcost(double researchcost) {
        this.researchcost = researchcost;
    }

    public void setResearchcost(double researchcost) {
        updates.put(IUserbp.RESEARCHCOST, researchcost);
        this.researchcost = researchcost;
    }

    public double getStationfee() {
        return this.stationfee;
    }

    public void initStationfee(double stationfee) {
        this.stationfee = stationfee;
    }

    public void setStationfee(double stationfee) {
        updates.put(IUserbp.STATIONFEE, stationfee);
        this.stationfee = stationfee;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
