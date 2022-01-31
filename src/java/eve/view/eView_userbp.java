/*
 * eView_userbp.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 29.0.2022 18:3
 *
 */

package eve.view;

import eve.eveDatabaseproperties;
import data.interfaces.db.EntityView;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

/**
 * View class View_userbp
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_userbp Entity
 * 
 * @author Franky Laseure
 */
public class eView_userbp implements eveDatabaseproperties, EntityView {

    public static final String table = "view_userbp";
    private java.lang.String blueprintname;
    private java.lang.String typegroupname;
    private java.lang.String username;
    private long bp;
    private int serialnumber;
    private boolean original;
    private int materialefficiency;
    private int amountproduced;
    private int totalamount;
    private double bpprice;
    private double researchcost;
    private double stationfee;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_userbp.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_userbp.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_userbp
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_userbp class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_userbp entity
     */
    public eView_userbp() {
    }

    /**
     * @return is View_userbp Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return blueprintname value
     */
    public java.lang.String getBlueprintname() {
        return this.blueprintname;
    }

    /**
     * set blueprintname value
     * @param blueprintname: new value
     */
    public void setBlueprintname(java.lang.String blueprintname) {
        this.blueprintname = blueprintname;
    }

    /**
     * 
     * @return typegroupname value
     */
    public java.lang.String getTypegroupname() {
        return this.typegroupname;
    }

    /**
     * set typegroupname value
     * @param typegroupname: new value
     */
    public void setTypegroupname(java.lang.String typegroupname) {
        this.typegroupname = typegroupname;
    }

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername() {
        return this.username;
    }

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    /**
     * 
     * @return bp value
     */
    public long getBp() {
        return this.bp;
    }

    /**
     * set bp value
     * @param bp: new value
     */
    public void setBp(long bp) {
        this.bp = bp;
    }

    /**
     * 
     * @return serialnumber value
     */
    public int getSerialnumber() {
        return this.serialnumber;
    }

    /**
     * set serialnumber value
     * @param serialnumber: new value
     */
    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
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
    public void setOriginal(boolean original) {
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
    public void setMaterialefficiency(int materialefficiency) {
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
    public void setAmountproduced(int amountproduced) {
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
    public void setTotalamount(int totalamount) {
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
    public void setBpprice(double bpprice) {
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
    public void setResearchcost(double researchcost) {
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
    public void setStationfee(double stationfee) {
        this.stationfee = stationfee;
    }

}
