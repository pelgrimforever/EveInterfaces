/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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
	  
    @Override
    public String getDbtool() {
        return eView_userbp.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_userbp.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_userbp() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getBlueprintname() {
        return this.blueprintname;
    }

    public void setBlueprintname(java.lang.String blueprintname) {
        this.blueprintname = blueprintname;
    }

    public java.lang.String getTypegroupname() {
        return this.typegroupname;
    }

    public void setTypegroupname(java.lang.String typegroupname) {
        this.typegroupname = typegroupname;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public long getBp() {
        return this.bp;
    }

    public void setBp(long bp) {
        this.bp = bp;
    }

    public int getSerialnumber() {
        return this.serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public boolean getOriginal() {
        return this.original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }

    public int getMaterialefficiency() {
        return this.materialefficiency;
    }

    public void setMaterialefficiency(int materialefficiency) {
        this.materialefficiency = materialefficiency;
    }

    public int getAmountproduced() {
        return this.amountproduced;
    }

    public void setAmountproduced(int amountproduced) {
        this.amountproduced = amountproduced;
    }

    public int getTotalamount() {
        return this.totalamount;
    }

    public void setTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    public double getBpprice() {
        return this.bpprice;
    }

    public void setBpprice(double bpprice) {
        this.bpprice = bpprice;
    }

    public double getResearchcost() {
        return this.researchcost;
    }

    public void setResearchcost(double researchcost) {
        this.researchcost = researchcost;
    }

    public double getStationfee() {
        return this.stationfee;
    }

    public void setStationfee(double stationfee) {
        this.stationfee = stationfee;
    }

}
