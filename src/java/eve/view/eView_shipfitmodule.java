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

public class eView_shipfitmodule implements eveDatabaseproperties, EntityView {

    public static final String table = "view_shipfitmodule";
    private java.lang.String modulename;
    private double packaged_volume;
    private java.lang.String username;
    private java.lang.String shipname;
    private long moduletype;
    private int amount;
	  
    @Override
    public String getDbtool() {
        return eView_shipfitmodule.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_shipfitmodule.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_shipfitmodule() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getModulename() {
        return this.modulename;
    }

    public void setModulename(java.lang.String modulename) {
        this.modulename = modulename;
    }

    public double getPackaged_volume() {
        return this.packaged_volume;
    }

    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public java.lang.String getShipname() {
        return this.shipname;
    }

    public void setShipname(java.lang.String shipname) {
        this.shipname = shipname;
    }

    public long getModuletype() {
        return this.moduletype;
    }

    public void setModuletype(long moduletype) {
        this.moduletype = moduletype;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
