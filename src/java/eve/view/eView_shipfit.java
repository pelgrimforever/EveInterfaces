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
public class eView_shipfit implements eveDatabaseproperties, EntityView {

    public static final String table = "view_shipfit";
    private java.lang.String shiptype;
    private double packaged_volume;
    private java.lang.String username;
    private java.lang.String shipname;
    private long evetype;
	  
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
	  
    public eView_shipfit() {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getShiptype() {
        return this.shiptype;
    }

    public void setShiptype(java.lang.String shiptype) {
        this.shiptype = shiptype;
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

    public long getEvetype() {
        return this.evetype;
    }

    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

}
