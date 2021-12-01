/*
 * ISystemjumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
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
 * Entity Interface ISystemjumps
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ISystemjumps extends LogicEntity {

    public ISystemjumpsPK getPrimaryKey();
	
    public static short SYSTEM_START = 1;
    public static short SYSTEM_END = 2;
    public static short JUMPS = 3;

    public static final int SIZE_SYSTEM_START = 19;
    public static final int SIZE_SYSTEM_END = 19;
    public static final int SIZE_JUMPS = 10;
    public static final String[] fieldnames = { "system_start", "system_end", "jumps" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_int };

    public static final String[] systemSystem_endPKfields = { "system.id" };
    public static final String[] systemSystem_endFKfields = { "systemjumps.system_end" };
    public static final String[] systemSystem_startPKfields = { "system.id" };
    public static final String[] systemSystem_startFKfields = { "systemjumps.system_start" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return jumps value
     */
    public int getJumps();

    /**
     * set jumps value
     * @param jumps: new value
     */
    public void setJumps(int jumps);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
