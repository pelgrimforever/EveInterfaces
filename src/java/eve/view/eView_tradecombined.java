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

public class eView_tradecombined implements eveDatabaseproperties, EntityView {

    public static final String table = "view_tradecombined";
    private long sell_regionid;
    private java.lang.String sell_regionname;
    private long sell_systemid;
    private java.lang.String sell_systemname;
    private long evetype_id;
    private java.lang.String evetype_name;
    private double packaged_volume;
    private long orders;
    private float totalamount;
    private double buy_order_total;
    private double sell_order_total;
    private double totalprofit;
    private long buy_systemid;
    private java.lang.String buy_systemname;
    private int trade_jumps;
    private int trade_jumpslowsec;
    private int trade_jumpsnullsec;
	  
    @Override
    public String getDbtool() {
        return eView_tradecombined.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_tradecombined.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_tradecombined() {
    }

    public boolean isEmpty() {
        return false;
    }

    public long getSell_regionid() {
        return this.sell_regionid;
    }

    public void setSell_regionid(long sell_regionid) {
        this.sell_regionid = sell_regionid;
    }

    public java.lang.String getSell_regionname() {
        return this.sell_regionname;
    }

    public void setSell_regionname(java.lang.String sell_regionname) {
        this.sell_regionname = sell_regionname;
    }

    public long getSell_systemid() {
        return this.sell_systemid;
    }

    public void setSell_systemid(long sell_systemid) {
        this.sell_systemid = sell_systemid;
    }

    public java.lang.String getSell_systemname() {
        return this.sell_systemname;
    }

    public void setSell_systemname(java.lang.String sell_systemname) {
        this.sell_systemname = sell_systemname;
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

    public long getOrders() {
        return this.orders;
    }

    public void setOrders(long orders) {
        this.orders = orders;
    }

    public float getTotalamount() {
        return this.totalamount;
    }

    public void setTotalamount(float totalamount) {
        this.totalamount = totalamount;
    }

    public double getBuy_order_total() {
        return this.buy_order_total;
    }

    public void setBuy_order_total(double buy_order_total) {
        this.buy_order_total = buy_order_total;
    }

    public double getSell_order_total() {
        return this.sell_order_total;
    }

    public void setSell_order_total(double sell_order_total) {
        this.sell_order_total = sell_order_total;
    }

    public double getTotalprofit() {
        return this.totalprofit;
    }

    public void setTotalprofit(double totalprofit) {
        this.totalprofit = totalprofit;
    }

    public long getBuy_systemid() {
        return this.buy_systemid;
    }

    public void setBuy_systemid(long buy_systemid) {
        this.buy_systemid = buy_systemid;
    }

    public java.lang.String getBuy_systemname() {
        return this.buy_systemname;
    }

    public void setBuy_systemname(java.lang.String buy_systemname) {
        this.buy_systemname = buy_systemname;
    }

    public int getTrade_jumps() {
        return this.trade_jumps;
    }

    public void setTrade_jumps(int trade_jumps) {
        this.trade_jumps = trade_jumps;
    }

    public int getTrade_jumpslowsec() {
        return this.trade_jumpslowsec;
    }

    public void setTrade_jumpslowsec(int trade_jumpslowsec) {
        this.trade_jumpslowsec = trade_jumpslowsec;
    }

    public int getTrade_jumpsnullsec() {
        return this.trade_jumpsnullsec;
    }

    public void setTrade_jumpsnullsec(int trade_jumpsnullsec) {
        this.trade_jumpsnullsec = trade_jumpsnullsec;
    }

}
