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

public class eView_stocktrade_system implements eveDatabaseproperties, EntityView {

    public static final String table = "view_stocktrade_system";
    private java.lang.String username;
    private long id;
    private java.lang.String name;
    private java.lang.String region;
    private double sellprice;
    private double totalvolume;
	  
    @Override
    public String getDbtool() {
        return eView_stocktrade_system.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_stocktrade_system.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_stocktrade_system() {
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

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getRegion() {
        return this.region;
    }

    public void setRegion(java.lang.String region) {
        this.region = region;
    }

    public double getSellprice() {
        return this.sellprice;
    }

    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    public double getTotalvolume() {
        return this.totalvolume;
    }

    public void setTotalvolume(double totalvolume) {
        this.totalvolume = totalvolume;
    }

}
