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

public class eView_tradeorders implements eveDatabaseproperties, EntityView {

    public static final String table = "view_tradeorders";
    private long tradevolume;
    private double buy_totalprice;
    private double sell_totalprice;
    private double cargo_volume;
    private long sell_id;
    private long sell_system;
    private long sell_location;
    private long sell_evetype;
    private double sell_packaged_volume;
    private long sell_volume_remain;
    private double sell_price;
    private long security_island;
    private long buy_id;
    private long buy_system;
    private long buy_location;
    private long buy_volume_remain;
    private double buy_price;
    private int jumps;
    private int jumpslowsec;
    private int jumpsnullsec;
	  
    @Override
    public String getDbtool() {
        return eView_tradeorders.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_tradeorders.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_tradeorders() {
    }

    public boolean isEmpty() {
        return false;
    }

    public long getTradevolume() {
        return this.tradevolume;
    }

    public void setTradevolume(long tradevolume) {
        this.tradevolume = tradevolume;
    }

    public double getBuy_totalprice() {
        return this.buy_totalprice;
    }

    public void setBuy_totalprice(double buy_totalprice) {
        this.buy_totalprice = buy_totalprice;
    }

    public double getSell_totalprice() {
        return this.sell_totalprice;
    }

    public void setSell_totalprice(double sell_totalprice) {
        this.sell_totalprice = sell_totalprice;
    }

    public double getCargo_volume() {
        return this.cargo_volume;
    }

    public void setCargo_volume(double cargo_volume) {
        this.cargo_volume = cargo_volume;
    }

    public long getSell_id() {
        return this.sell_id;
    }

    public void setSell_id(long sell_id) {
        this.sell_id = sell_id;
    }

    public long getSell_system() {
        return this.sell_system;
    }

    public void setSell_system(long sell_system) {
        this.sell_system = sell_system;
    }

    public long getSell_location() {
        return this.sell_location;
    }

    public void setSell_location(long sell_location) {
        this.sell_location = sell_location;
    }

    public long getSell_evetype() {
        return this.sell_evetype;
    }

    public void setSell_evetype(long sell_evetype) {
        this.sell_evetype = sell_evetype;
    }

    public double getSell_packaged_volume() {
        return this.sell_packaged_volume;
    }

    public void setSell_packaged_volume(double sell_packaged_volume) {
        this.sell_packaged_volume = sell_packaged_volume;
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

    public long getSecurity_island() {
        return this.security_island;
    }

    public void setSecurity_island(long security_island) {
        this.security_island = security_island;
    }

    public long getBuy_id() {
        return this.buy_id;
    }

    public void setBuy_id(long buy_id) {
        this.buy_id = buy_id;
    }

    public long getBuy_system() {
        return this.buy_system;
    }

    public void setBuy_system(long buy_system) {
        this.buy_system = buy_system;
    }

    public long getBuy_location() {
        return this.buy_location;
    }

    public void setBuy_location(long buy_location) {
        this.buy_location = buy_location;
    }

    public long getBuy_volume_remain() {
        return this.buy_volume_remain;
    }

    public void setBuy_volume_remain(long buy_volume_remain) {
        this.buy_volume_remain = buy_volume_remain;
    }

    public double getBuy_price() {
        return this.buy_price;
    }

    public void setBuy_price(double buy_price) {
        this.buy_price = buy_price;
    }

    public int getJumps() {
        return this.jumps;
    }

    public void setJumps(int jumps) {
        this.jumps = jumps;
    }

    public int getJumpslowsec() {
        return this.jumpslowsec;
    }

    public void setJumpslowsec(int jumpslowsec) {
        this.jumpslowsec = jumpslowsec;
    }

    public int getJumpsnullsec() {
        return this.jumpsnullsec;
    }

    public void setJumpsnullsec(int jumpsnullsec) {
        this.jumpsnullsec = jumpsnullsec;
    }

}
