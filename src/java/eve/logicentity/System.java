/*
 * System.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ISystemPK;
import eve.interfaces.logicentity.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.json.simple.JSONObject;

/**
 * Entity class System
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class System extends eve.entity.eSystem implements ISystem {

    public static final String SQLSelect = "select system.* from system";
    public static final String SQLWheresecurity_island = "security_island = :security_island.id:";
    public static final String SQLWhereconstellation = "constellation = :constellation.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by name";
    public static final String WhereAccess = "not noaccess";
    public static final String SQLSelectAll = SQLSelect + " where " + WhereAccess + OrderBy;
    
    public static final String SQLupdateconstellationborders = "update system set isconstellationborder = :isborder: where id in (select system from stargate where isconstellationborder group by system)";
    public static final String SQLupdateregionborders = "update system set isregionborder = :isborder: where id in (select system from stargate where isregionborder group by system)";

    public static final String updateNoaccess1 = "update system set noaccess = :noaccess: where id not in (select system from stargate)";
    public static final String updateNoaccess2 = "update system set noaccess = :noaccess: where id in (select system from stargate)";

    public static final String SQLRemoveSecurityIslands = "update system set security_island = null";
    public static final String SQLSelectHiSecNoIsland = "select s.* from system s where not noaccess and security_status >= :highsec: and security_island is null order by id";
    public static final String SQLSelectHiSecSystemsConnected = "select s_to.* from stargate sg " +
        "inner join system on sg.system = system.id " +
        "inner join system s_to on sg.to_system = s_to.id " +
        "where system.security_island = :security_island.id: " +
        "and s_to.security_island is null and s_to.security_status >= :highsec:";
    
    private int npc_kills = 0;
    private int pod_kills = 0;
    private int ship_kills = 0;
    
    private int killmailcount = 0;
    private int killmailgatecount = 0;
    private org.json.simple.JSONObject killmaildata = new org.json.simple.JSONObject();
//Custom code, do not change this line

    public static final String SQLSelect4security_island = "select * from system where " + SQLWheresecurity_island + OrderBy;
    public static final String SQLDelete4security_island = "delete from system where " + SQLWheresecurity_island;
    public static final String SQLSelect4constellation = "select * from system where " + SQLWhereconstellation + OrderBy;
    public static final String SQLDelete4constellation = "delete from system where " + SQLWhereconstellation;

    /**
     * Constructor
     * Creates an empty System entity
     */
    public System() {
    }
    
    /**
     * Constructor
     * build an empty System entity with initialized field values
     */
    public System(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty System entity with initialized Primarykey parameter
     * @param systemPK: System Primarykey
     */
    public System(SystemPK systemPK) {
        super(systemPK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
        
    public int getNpc_kills() {
        return npc_kills;
    }

    public void setNpc_kills(int npc_kills) {
        this.npc_kills = npc_kills;
    }

    public int getPod_kills() {
        return pod_kills;
    }

    public void setPod_kills(int pod_kills) {
        this.pod_kills = pod_kills;
    }

    public int getShip_kills() {
        return ship_kills;
    }

    public void setShip_kills(int ship_kills) {
        this.ship_kills = ship_kills;
    }
    
    public int getKillmailcount() {
        return killmailcount;
    }

    public void setKillmailcount(int killmailcount) {
        this.killmailcount = killmailcount;
    }

    public int getKillmailgatecount() {
        return killmailgatecount;
    }

    public void setKillmailgatecount(int killmailgatecount) {
        this.killmailgatecount = killmailgatecount;
    }

    public org.json.simple.JSONObject getKillmaildata() {
        return killmaildata;
    }

    public void setKillmaildata(org.json.simple.JSONObject killmaildata) {
        this.killmaildata = killmaildata;
    }
//Custom code, do not change this line
}
