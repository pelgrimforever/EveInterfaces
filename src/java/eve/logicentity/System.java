/*
 * System.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
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

//Custom code, do not change this line
    private int npc_kills = 0;
    private int pod_kills = 0;
    private int ship_kills = 0;
    
    private int killmailcount = 0;
    private int killmailgatecount = 0;
    private org.json.simple.JSONObject killmaildata = new org.json.simple.JSONObject();
//Custom code, do not change this line

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
