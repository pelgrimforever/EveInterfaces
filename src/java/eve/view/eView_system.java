/*
 * eView_system.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.11.2021 19:35
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
 * View class View_system
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_system Entity
 * 
 * @author Franky Laseure
 */
public class eView_system implements eveDatabaseproperties, EntityView {

    public static final String table = "view_system";
    private int jumpssafe;
    private int jumpssafelowsec;
    private int jumpssafenullsec;
    private java.lang.String regionname;
    private long system_start;
    private long system_end;
    private long id;
    private java.lang.String name;
    private long constellation;
    private java.lang.String security_class;
    private double security_status;
    private long star_id;
    private boolean noaccess;
    private boolean isconstellationborder;
    private boolean isregionborder;
    private long security_island;
    private java.sql.Date downloaddate;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_system.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_system.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_system
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_system class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_system entity
     */
    public eView_system() {
    }

    /**
     * @return is View_system Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return jumpssafe value
     */
    public int getJumpssafe() {
        return this.jumpssafe;
    }

    /**
     * set jumpssafe value
     * @param jumpssafe: new value
     */
    public void setJumpssafe(int jumpssafe) {
        this.jumpssafe = jumpssafe;
    }

    /**
     * 
     * @return jumpssafelowsec value
     */
    public int getJumpssafelowsec() {
        return this.jumpssafelowsec;
    }

    /**
     * set jumpssafelowsec value
     * @param jumpssafelowsec: new value
     */
    public void setJumpssafelowsec(int jumpssafelowsec) {
        this.jumpssafelowsec = jumpssafelowsec;
    }

    /**
     * 
     * @return jumpssafenullsec value
     */
    public int getJumpssafenullsec() {
        return this.jumpssafenullsec;
    }

    /**
     * set jumpssafenullsec value
     * @param jumpssafenullsec: new value
     */
    public void setJumpssafenullsec(int jumpssafenullsec) {
        this.jumpssafenullsec = jumpssafenullsec;
    }

    /**
     * 
     * @return regionname value
     */
    public java.lang.String getRegionname() {
        return this.regionname;
    }

    /**
     * set regionname value
     * @param regionname: new value
     */
    public void setRegionname(java.lang.String regionname) {
        this.regionname = regionname;
    }

    /**
     * 
     * @return system_start value
     */
    public long getSystem_start() {
        return this.system_start;
    }

    /**
     * set system_start value
     * @param system_start: new value
     */
    public void setSystem_start(long system_start) {
        this.system_start = system_start;
    }

    /**
     * 
     * @return system_end value
     */
    public long getSystem_end() {
        return this.system_end;
    }

    /**
     * set system_end value
     * @param system_end: new value
     */
    public void setSystem_end(long system_end) {
        this.system_end = system_end;
    }

    /**
     * 
     * @return id value
     */
    public long getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 
     * @return constellation value
     */
    public long getConstellation() {
        return this.constellation;
    }

    /**
     * set constellation value
     * @param constellation: new value
     */
    public void setConstellation(long constellation) {
        this.constellation = constellation;
    }

    /**
     * 
     * @return security_class value
     */
    public java.lang.String getSecurity_class() {
        return this.security_class;
    }

    /**
     * set security_class value
     * @param security_class: new value
     */
    public void setSecurity_class(java.lang.String security_class) {
        this.security_class = security_class;
    }

    /**
     * 
     * @return security_status value
     */
    public double getSecurity_status() {
        return this.security_status;
    }

    /**
     * set security_status value
     * @param security_status: new value
     */
    public void setSecurity_status(double security_status) {
        this.security_status = security_status;
    }

    /**
     * 
     * @return star_id value
     */
    public long getStar_id() {
        return this.star_id;
    }

    /**
     * set star_id value
     * @param star_id: new value
     */
    public void setStar_id(long star_id) {
        this.star_id = star_id;
    }

    /**
     * 
     * @return noaccess value
     */
    public boolean getNoaccess() {
        return this.noaccess;
    }

    /**
     * set noaccess value
     * @param noaccess: new value
     */
    public void setNoaccess(boolean noaccess) {
        this.noaccess = noaccess;
    }

    /**
     * 
     * @return isconstellationborder value
     */
    public boolean getIsconstellationborder() {
        return this.isconstellationborder;
    }

    /**
     * set isconstellationborder value
     * @param isconstellationborder: new value
     */
    public void setIsconstellationborder(boolean isconstellationborder) {
        this.isconstellationborder = isconstellationborder;
    }

    /**
     * 
     * @return isregionborder value
     */
    public boolean getIsregionborder() {
        return this.isregionborder;
    }

    /**
     * set isregionborder value
     * @param isregionborder: new value
     */
    public void setIsregionborder(boolean isregionborder) {
        this.isregionborder = isregionborder;
    }

    /**
     * 
     * @return security_island value
     */
    public long getSecurity_island() {
        return this.security_island;
    }

    /**
     * set security_island value
     * @param security_island: new value
     */
    public void setSecurity_island(long security_island) {
        this.security_island = security_island;
    }

    /**
     * 
     * @return downloaddate value
     */
    public java.sql.Date getDownloaddate() {
        return this.downloaddate;
    }

    /**
     * set downloaddate value
     * @param downloaddate: new value
     */
    public void setDownloaddate(java.sql.Date downloaddate) {
        this.downloaddate = downloaddate;
    }

}
