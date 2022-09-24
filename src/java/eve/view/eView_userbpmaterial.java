/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
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

public class eView_userbpmaterial implements eveDatabaseproperties, EntityView {

    public static final String table = "view_userbpmaterial";
    private java.lang.String username;
    private int serialnumber;
    private long bp;
    private long material;
    private long amount;
    private long category;
    private long typegroupid;
    private java.lang.String typegroupname;
    private java.lang.String name;
    private double marketaverage;
    private double materialinputaverage;
	  
    @Override
    public String getDbtool() {
        return eView_userbpmaterial.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_userbpmaterial.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_userbpmaterial() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public int getSerialnumber() {
        return this.serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public long getBp() {
        return this.bp;
    }

    public void setBp(long bp) {
        this.bp = bp;
    }

    public long getMaterial() {
        return this.material;
    }

    public void setMaterial(long material) {
        this.material = material;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getCategory() {
        return this.category;
    }

    public void setCategory(long category) {
        this.category = category;
    }

    public long getTypegroupid() {
        return this.typegroupid;
    }

    public void setTypegroupid(long typegroupid) {
        this.typegroupid = typegroupid;
    }

    public java.lang.String getTypegroupname() {
        return this.typegroupname;
    }

    public void setTypegroupname(java.lang.String typegroupname) {
        this.typegroupname = typegroupname;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public double getMarketaverage() {
        return this.marketaverage;
    }

    public void setMarketaverage(double marketaverage) {
        this.marketaverage = marketaverage;
    }

    public double getMaterialinputaverage() {
        return this.materialinputaverage;
    }

    public void setMaterialinputaverage(double materialinputaverage) {
        this.materialinputaverage = materialinputaverage;
    }

}
