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

public class eView_tradecombined_sell implements eveDatabaseproperties, EntityView {

    public static final String table = "view_tradecombined_sell";
    private long sell_system;
    private long buy_system;
    private long orderamount;
    private double buy_order_value;
    private double sell_order_value;
    private double profit;
    private long sell_locationid;
    private java.lang.String sell_stationname;
    private long evetype_id;
    private java.lang.String evetype_name;
    private double packaged_volume;
    private long sell_id;
    private long sell_volume_total;
    private long sell_volume_remain;
    private int sell_min_volume;
    private long sell_updated;
    private long buy_id;
    private double sell_price;
    private long buy_volume_total;
    private long buy_volume_remain;
    private int buy_min_volume;
    private long buy_updated;
    private double buy_price;
    private long buy_locationid;
    private java.lang.String buy_stationname;
	  
    @Override
    public String getDbtool() {
        return eView_tradecombined_sell.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_tradecombined_sell.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_tradecombined_sell() {
    }

    public boolean isEmpty() {
        return false;
    }

    public long getSell_system() {
        return this.sell_system;
    }

    public void setSell_system(long sell_system) {
        this.sell_system = sell_system;
    }

    public long getBuy_system() {
        return this.buy_system;
    }

    public void setBuy_system(long buy_system) {
        this.buy_system = buy_system;
    }

    public long getOrderamount() {
        return this.orderamount;
    }

    public void setOrderamount(long orderamount) {
        this.orderamount = orderamount;
    }

    public double getBuy_order_value() {
        return this.buy_order_value;
    }

    public void setBuy_order_value(double buy_order_value) {
        this.buy_order_value = buy_order_value;
    }

    public double getSell_order_value() {
        return this.sell_order_value;
    }

    public void setSell_order_value(double sell_order_value) {
        this.sell_order_value = sell_order_value;
    }

    public double getProfit() {
        return this.profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public long getSell_locationid() {
        return this.sell_locationid;
    }

    public void setSell_locationid(long sell_locationid) {
        this.sell_locationid = sell_locationid;
    }

    public java.lang.String getSell_stationname() {
        return this.sell_stationname;
    }

    public void setSell_stationname(java.lang.String sell_stationname) {
        this.sell_stationname = sell_stationname;
    }

    public long getEvetype_id() {
        return this.evetype_id;
    }

    public void setEvetype_id(long evetype_id) {
        this.evetype_id = evetype_id;
    }

    public java.lang.String getEvetype_name() {
        return this.evetype_name;
    }

    public void setEvetype_name(java.lang.String evetype_name) {
        this.evetype_name = evetype_name;
    }

    public double getPackaged_volume() {
        return this.packaged_volume;
    }

    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

    public long getSell_id() {
        return this.sell_id;
    }

    public void setSell_id(long sell_id) {
        this.sell_id = sell_id;
    }

    public long getSell_volume_total() {
        return this.sell_volume_total;
    }

    public void setSell_volume_total(long sell_volume_total) {
        this.sell_volume_total = sell_volume_total;
    }

    public long getSell_volume_remain() {
        return this.sell_volume_remain;
    }

    public void setSell_volume_remain(long sell_volume_remain) {
        this.sell_volume_remain = sell_volume_remain;
    }

    public int getSell_min_volume() {
        return this.sell_min_volume;
    }

    public void setSell_min_volume(int sell_min_volume) {
        this.sell_min_volume = sell_min_volume;
    }

    public long getSell_updated() {
        return this.sell_updated;
    }

    public void setSell_updated(long sell_updated) {
        this.sell_updated = sell_updated;
    }

    public long getBuy_id() {
        return this.buy_id;
    }

    public void setBuy_id(long buy_id) {
        this.buy_id = buy_id;
    }

    public double getSell_price() {
        return this.sell_price;
    }

    public void setSell_price(double sell_price) {
        this.sell_price = sell_price;
    }

    public long getBuy_volume_total() {
        return this.buy_volume_total;
    }

    public void setBuy_volume_total(long buy_volume_total) {
        this.buy_volume_total = buy_volume_total;
    }

    public long getBuy_volume_remain() {
        return this.buy_volume_remain;
    }

    public void setBuy_volume_remain(long buy_volume_remain) {
        this.buy_volume_remain = buy_volume_remain;
    }

    public int getBuy_min_volume() {
        return this.buy_min_volume;
    }

    public void setBuy_min_volume(int buy_min_volume) {
        this.buy_min_volume = buy_min_volume;
    }

    public long getBuy_updated() {
        return this.buy_updated;
    }

    public void setBuy_updated(long buy_updated) {
        this.buy_updated = buy_updated;
    }

    public double getBuy_price() {
        return this.buy_price;
    }

    public void setBuy_price(double buy_price) {
        this.buy_price = buy_price;
    }

    public long getBuy_locationid() {
        return this.buy_locationid;
    }

    public void setBuy_locationid(long buy_locationid) {
        this.buy_locationid = buy_locationid;
    }

    public java.lang.String getBuy_stationname() {
        return this.buy_stationname;
    }

    public void setBuy_stationname(java.lang.String buy_stationname) {
        this.buy_stationname = buy_stationname;
    }

}
