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
public class eView_tradesystem implements eveDatabaseproperties, EntityView {

    public static final String table = "view_tradesystem";
    private long sell_regionid;
    private java.lang.String sell_regionname;
    private long sell_systemid;
    private java.lang.String sell_systemname;
    private float orders;
    private double buy_total;
    private double sell_total;
    private double totalprofit;
    private double totalvolume;
    private long buy_systemid;
    private java.lang.String buy_systemname;
    private int trade_jumps;
    private int trade_jumpslowsec;
    private int trade_jumpsnullsec;
	  
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
	  
    public eView_tradesystem() {
    }

    @Override
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

    public float getOrders() {
        return this.orders;
    }

    public void setOrders(float orders) {
        this.orders = orders;
    }

    public double getBuy_total() {
        return this.buy_total;
    }

    public void setBuy_total(double buy_total) {
        this.buy_total = buy_total;
    }

    public double getSell_total() {
        return this.sell_total;
    }

    public void setSell_total(double sell_total) {
        this.sell_total = sell_total;
    }

    public double getTotalprofit() {
        return this.totalprofit;
    }

    public void setTotalprofit(double totalprofit) {
        this.totalprofit = totalprofit;
    }

    public double getTotalvolume() {
        return this.totalvolume;
    }

    public void setTotalvolume(double totalvolume) {
        this.totalvolume = totalvolume;
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
