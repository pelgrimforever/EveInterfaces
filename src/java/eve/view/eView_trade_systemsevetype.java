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

public class eView_trade_systemsevetype implements eveDatabaseproperties, EntityView {

    public static final String table = "view_trade_systemsevetype";
    private long systemsell;
    private long systembuy;
    private long evetype;
    private int jumps;
    private int jumpslowsec;
    private int jumpsnullsec;
	  
    @Override
    public String getDbtool() {
        return eView_trade_systemsevetype.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_trade_systemsevetype.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_trade_systemsevetype() {
    }

    public boolean isEmpty() {
        return false;
    }

    public long getSystemsell() {
        return this.systemsell;
    }

    public void setSystemsell(long systemsell) {
        this.systemsell = systemsell;
    }

    public long getSystembuy() {
        return this.systembuy;
    }

    public void setSystembuy(long systembuy) {
        this.systembuy = systembuy;
    }

    public long getEvetype() {
        return this.evetype;
    }

    public void setEvetype(long evetype) {
        this.evetype = evetype;
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
