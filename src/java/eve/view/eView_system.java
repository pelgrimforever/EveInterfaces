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
	  
    @Override
    public String getDbtool() {
        return eView_system.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_system.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_system() {
    }

    public boolean isEmpty() {
        return false;
    }

    public int getJumpssafe() {
        return this.jumpssafe;
    }

    public void setJumpssafe(int jumpssafe) {
        this.jumpssafe = jumpssafe;
    }

    public int getJumpssafelowsec() {
        return this.jumpssafelowsec;
    }

    public void setJumpssafelowsec(int jumpssafelowsec) {
        this.jumpssafelowsec = jumpssafelowsec;
    }

    public int getJumpssafenullsec() {
        return this.jumpssafenullsec;
    }

    public void setJumpssafenullsec(int jumpssafenullsec) {
        this.jumpssafenullsec = jumpssafenullsec;
    }

    public java.lang.String getRegionname() {
        return this.regionname;
    }

    public void setRegionname(java.lang.String regionname) {
        this.regionname = regionname;
    }

    public long getSystem_start() {
        return this.system_start;
    }

    public void setSystem_start(long system_start) {
        this.system_start = system_start;
    }

    public long getSystem_end() {
        return this.system_end;
    }

    public void setSystem_end(long system_end) {
        this.system_end = system_end;
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

    public long getConstellation() {
        return this.constellation;
    }

    public void setConstellation(long constellation) {
        this.constellation = constellation;
    }

    public java.lang.String getSecurity_class() {
        return this.security_class;
    }

    public void setSecurity_class(java.lang.String security_class) {
        this.security_class = security_class;
    }

    public double getSecurity_status() {
        return this.security_status;
    }

    public void setSecurity_status(double security_status) {
        this.security_status = security_status;
    }

    public long getStar_id() {
        return this.star_id;
    }

    public void setStar_id(long star_id) {
        this.star_id = star_id;
    }

    public boolean getNoaccess() {
        return this.noaccess;
    }

    public void setNoaccess(boolean noaccess) {
        this.noaccess = noaccess;
    }

    public boolean getIsconstellationborder() {
        return this.isconstellationborder;
    }

    public void setIsconstellationborder(boolean isconstellationborder) {
        this.isconstellationborder = isconstellationborder;
    }

    public boolean getIsregionborder() {
        return this.isregionborder;
    }

    public void setIsregionborder(boolean isregionborder) {
        this.isregionborder = isregionborder;
    }

    public long getSecurity_island() {
        return this.security_island;
    }

    public void setSecurity_island(long security_island) {
        this.security_island = security_island;
    }

    public java.sql.Date getDownloaddate() {
        return this.downloaddate;
    }

    public void setDownloaddate(java.sql.Date downloaddate) {
        this.downloaddate = downloaddate;
    }

}
