/*
 * eView_trade_systemsevetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
 *
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
 * View class View_trade_systemsevetype
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_trade_systemsevetype Entity
 * 
 * @author Franky Laseure
 */
public class eView_trade_systemsevetype implements eveDatabaseproperties, EntityView {

    public static final String table = "view_trade_systemsevetype";
    private long systemsell;
    private long systembuy;
    private long evetype;
    private int jumps;
    private int jumpslowsec;
    private int jumpsnullsec;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_trade_systemsevetype.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_trade_systemsevetype.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_trade_systemsevetype
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_trade_systemsevetype class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_trade_systemsevetype entity
     */
    public eView_trade_systemsevetype() {
    }

    /**
     * @return is View_trade_systemsevetype Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return systemsell value
     */
    public long getSystemsell() {
        return this.systemsell;
    }

    /**
     * set systemsell value
     * @param systemsell: new value
     */
    public void setSystemsell(long systemsell) {
        this.systemsell = systemsell;
    }

    /**
     * 
     * @return systembuy value
     */
    public long getSystembuy() {
        return this.systembuy;
    }

    /**
     * set systembuy value
     * @param systembuy: new value
     */
    public void setSystembuy(long systembuy) {
        this.systembuy = systembuy;
    }

    /**
     * 
     * @return evetype value
     */
    public long getEvetype() {
        return this.evetype;
    }

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

    /**
     * 
     * @return jumps value
     */
    public int getJumps() {
        return this.jumps;
    }

    /**
     * set jumps value
     * @param jumps: new value
     */
    public void setJumps(int jumps) {
        this.jumps = jumps;
    }

    /**
     * 
     * @return jumpslowsec value
     */
    public int getJumpslowsec() {
        return this.jumpslowsec;
    }

    /**
     * set jumpslowsec value
     * @param jumpslowsec: new value
     */
    public void setJumpslowsec(int jumpslowsec) {
        this.jumpslowsec = jumpslowsec;
    }

    /**
     * 
     * @return jumpsnullsec value
     */
    public int getJumpsnullsec() {
        return this.jumpsnullsec;
    }

    /**
     * set jumpsnullsec value
     * @param jumpsnullsec: new value
     */
    public void setJumpsnullsec(int jumpsnullsec) {
        this.jumpsnullsec = jumpsnullsec;
    }

}
