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

public class eView_contractswithprofit implements eveDatabaseproperties, EntityView {

    public static final String table = "view_contractswithprofit";
    private long id;
    private java.sql.Timestamp date_expired;
    private java.sql.Timestamp date_issued;
    private int days_to_complete;
    private long end_location_id;
    private double price;
    private double reward;
    private long start_location_id;
    private java.lang.String name;
    private java.lang.String systemname;
    private java.lang.String regionname;
    private java.lang.String title;
    private double volume;
    private double sellprice;
    private double buyprice;
	  
    @Override
    public String getDbtool() {
        return eView_contractswithprofit.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_contractswithprofit.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_contractswithprofit() {
    }

    public boolean isEmpty() {
        return false;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.sql.Timestamp getDate_expired() {
        return this.date_expired;
    }

    public void setDate_expired(java.sql.Timestamp date_expired) {
        this.date_expired = date_expired;
    }

    public java.sql.Timestamp getDate_issued() {
        return this.date_issued;
    }

    public void setDate_issued(java.sql.Timestamp date_issued) {
        this.date_issued = date_issued;
    }

    public int getDays_to_complete() {
        return this.days_to_complete;
    }

    public void setDays_to_complete(int days_to_complete) {
        this.days_to_complete = days_to_complete;
    }

    public long getEnd_location_id() {
        return this.end_location_id;
    }

    public void setEnd_location_id(long end_location_id) {
        this.end_location_id = end_location_id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getReward() {
        return this.reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public long getStart_location_id() {
        return this.start_location_id;
    }

    public void setStart_location_id(long start_location_id) {
        this.start_location_id = start_location_id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getSystemname() {
        return this.systemname;
    }

    public void setSystemname(java.lang.String systemname) {
        this.systemname = systemname;
    }

    public java.lang.String getRegionname() {
        return this.regionname;
    }

    public void setRegionname(java.lang.String regionname) {
        this.regionname = regionname;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSellprice() {
        return this.sellprice;
    }

    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    public double getBuyprice() {
        return this.buyprice;
    }

    public void setBuyprice(double buyprice) {
        this.buyprice = buyprice;
    }

}
