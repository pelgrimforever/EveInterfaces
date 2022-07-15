/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:23
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
 * @author Franky Laseure
 */
public class eView_stocktrade_orders implements eveDatabaseproperties, EntityView {

    public static final String table = "view_stocktrade_orders";
    private java.lang.String username;
    private long system;
    private long locationid;
    private java.lang.String stationname;
    private java.lang.String locationname;
    private long evetypeid;
    private java.lang.String evetypename;
    private double packaged_volume;
    private int min_volume;
    private long orderid;
    private long sellamount;
    private double price;
    private double totalprice;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }
    
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_stocktrade_orders() {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public long getSystem() {
        return this.system;
    }

    public void setSystem(long system) {
        this.system = system;
    }

    public long getLocationid() {
        return this.locationid;
    }

    public void setLocationid(long locationid) {
        this.locationid = locationid;
    }

    public java.lang.String getStationname() {
        return this.stationname;
    }

    public void setStationname(java.lang.String stationname) {
        this.stationname = stationname;
    }

    public java.lang.String getLocationname() {
        return this.locationname;
    }

    public void setLocationname(java.lang.String locationname) {
        this.locationname = locationname;
    }

    public long getEvetypeid() {
        return this.evetypeid;
    }

    public void setEvetypeid(long evetypeid) {
        this.evetypeid = evetypeid;
    }

    public java.lang.String getEvetypename() {
        return this.evetypename;
    }

    public void setEvetypename(java.lang.String evetypename) {
        this.evetypename = evetypename;
    }

    public double getPackaged_volume() {
        return this.packaged_volume;
    }

    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

    public int getMin_volume() {
        return this.min_volume;
    }

    public void setMin_volume(int min_volume) {
        this.min_volume = min_volume;
    }

    public long getOrderid() {
        return this.orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    public long getSellamount() {
        return this.sellamount;
    }

    public void setSellamount(long sellamount) {
        this.sellamount = sellamount;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalprice() {
        return this.totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

}
