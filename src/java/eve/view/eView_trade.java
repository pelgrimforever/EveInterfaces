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

public class eView_trade implements eveDatabaseproperties, EntityView {

    public static final String table = "view_trade";
    private long sell_regionid;
    private java.lang.String sell_regionname;
    private long sell_systemid;
    private java.lang.String sell_systemname;
    private long sell_locationid;
    private java.lang.String sell_stationname;
    private long evetype_id;
    private java.lang.String evetype_name;
    private double packaged_volume;
    private long sell_id;
    private long buy_id;
    private long sell_volume_remain;
    private double sell_price;
    private double buy_price;
    private long buy_systemid;
    private java.lang.String buy_systemname;
    private long buy_locationid;
    private java.lang.String buy_stationname;
    private long buy_volume_remain;
    private double total_volume;
    private double sell_total;
    private double buy_total;
    private double trade_profit;
    private int trade_jumps;
    private int trade_jumpslowsec;
    private int trade_jumpsnullsec;
    private double trade_profit_per_jump;
    private int trade_runs;
    private int trade_total_jumps;
    private double trade_singlerunprofit;
    private int trade_maxunits_per_run;
	  
    @Override
    public String getDbtool() {
        return eView_trade.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_trade.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_trade() {
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

    public long getBuy_id() {
        return this.buy_id;
    }

    public void setBuy_id(long buy_id) {
        this.buy_id = buy_id;
    }

    public long getSell_volume_remain() {
        return this.sell_volume_remain;
    }

    public void setSell_volume_remain(long sell_volume_remain) {
        this.sell_volume_remain = sell_volume_remain;
    }

    public double getSell_price() {
        return this.sell_price;
    }

    public void setSell_price(double sell_price) {
        this.sell_price = sell_price;
    }

    public double getBuy_price() {
        return this.buy_price;
    }

    public void setBuy_price(double buy_price) {
        this.buy_price = buy_price;
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

    public long getBuy_volume_remain() {
        return this.buy_volume_remain;
    }

    public void setBuy_volume_remain(long buy_volume_remain) {
        this.buy_volume_remain = buy_volume_remain;
    }

    public double getTotal_volume() {
        return this.total_volume;
    }

    public void setTotal_volume(double total_volume) {
        this.total_volume = total_volume;
    }

    public double getSell_total() {
        return this.sell_total;
    }

    public void setSell_total(double sell_total) {
        this.sell_total = sell_total;
    }

    public double getBuy_total() {
        return this.buy_total;
    }

    public void setBuy_total(double buy_total) {
        this.buy_total = buy_total;
    }

    public double getTrade_profit() {
        return this.trade_profit;
    }

    public void setTrade_profit(double trade_profit) {
        this.trade_profit = trade_profit;
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

    public double getTrade_profit_per_jump() {
        return this.trade_profit_per_jump;
    }

    public void setTrade_profit_per_jump(double trade_profit_per_jump) {
        this.trade_profit_per_jump = trade_profit_per_jump;
    }

    public int getTrade_runs() {
        return this.trade_runs;
    }

    public void setTrade_runs(int trade_runs) {
        this.trade_runs = trade_runs;
    }

    public int getTrade_total_jumps() {
        return this.trade_total_jumps;
    }

    public void setTrade_total_jumps(int trade_total_jumps) {
        this.trade_total_jumps = trade_total_jumps;
    }

    public double getTrade_singlerunprofit() {
        return this.trade_singlerunprofit;
    }

    public void setTrade_singlerunprofit(double trade_singlerunprofit) {
        this.trade_singlerunprofit = trade_singlerunprofit;
    }

    public int getTrade_maxunits_per_run() {
        return this.trade_maxunits_per_run;
    }

    public void setTrade_maxunits_per_run(int trade_maxunits_per_run) {
        this.trade_maxunits_per_run = trade_maxunits_per_run;
    }

}
