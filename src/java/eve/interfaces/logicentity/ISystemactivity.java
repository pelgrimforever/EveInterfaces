/*
 * ISystemactivity.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.3.2022 17:21
 *
 */

package eve.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.interfaces.entity.pk.*;
import eve.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Entity Interface ISystemactivity
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ISystemactivity extends LogicEntity {

    public ISystemactivityPK getPrimaryKey();
	
    public static short SYSTEMID = 1;
    public static short TIMESLOT = 2;
    public static short SHIP_JUMPS = 3;
    public static short NPC_KILLS = 4;
    public static short SHIP_KILLS = 5;
    public static short POD_KILLS = 6;

    public static final int SIZE_SYSTEMID = 19;
    public static final int SIZE_TIMESLOT = 29;
    public static final int SIZE_SHIP_JUMPS = 19;
    public static final int SIZE_NPC_KILLS = 19;
    public static final int SIZE_SHIP_KILLS = 19;
    public static final int SIZE_POD_KILLS = 19;
    public static final String[] fieldnames = { "systemid", "timeslot", "ship_jumps", "npc_kills", "ship_kills", "pod_kills" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_Timestamp, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long };

    public static final String[] systemPKfields = { "system.id" };
    public static final String[] systemFKfields = { "systemactivity.systemid" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return ship_jumps value
     */
    public long getShip_jumps();

    /**
     * set ship_jumps value
     * @param ship_jumps: new value
     */
    public void setShip_jumps(long ship_jumps);

    /**
     * 
     * @return npc_kills value
     */
    public long getNpc_kills();

    /**
     * set npc_kills value
     * @param npc_kills: new value
     */
    public void setNpc_kills(long npc_kills);

    /**
     * 
     * @return ship_kills value
     */
    public long getShip_kills();

    /**
     * set ship_kills value
     * @param ship_kills: new value
     */
    public void setShip_kills(long ship_kills);

    /**
     * 
     * @return pod_kills value
     */
    public long getPod_kills();

    /**
     * set pod_kills value
     * @param pod_kills: new value
     */
    public void setPod_kills(long pod_kills);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
