/*
 * ISystemjumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
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
    public static short JUMPSLOWSEC = 4;
    public static short JUMPSNULLSEC = 5;
    public static short JUMPSSAFE = 6;
    public static short JUMPSSAFELOWSEC = 7;
    public static short JUMPSSAFENULLSEC = 8;

    public static final int SIZE_SYSTEM_START = 19;
    public static final int SIZE_SYSTEM_END = 19;
    public static final int SIZE_JUMPS = 10;
    public static final int SIZE_JUMPSLOWSEC = 10;
    public static final int SIZE_JUMPSNULLSEC = 10;
    public static final int SIZE_JUMPSSAFE = 10;
    public static final int SIZE_JUMPSSAFELOWSEC = 10;
    public static final int SIZE_JUMPSSAFENULLSEC = 10;
    public static final String[] fieldnames = { "system_start", "system_end", "jumps", "jumpslowsec", "jumpsnullsec", "jumpssafe", "jumpssafelowsec", "jumpssafenullsec" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int };

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

    /**
     * 
     * @return jumpslowsec value
     */
    public int getJumpslowsec();

    /**
     * set jumpslowsec value
     * @param jumpslowsec: new value
     */
    public void setJumpslowsec(int jumpslowsec);

    /**
     * 
     * @return jumpsnullsec value
     */
    public int getJumpsnullsec();

    /**
     * set jumpsnullsec value
     * @param jumpsnullsec: new value
     */
    public void setJumpsnullsec(int jumpsnullsec);

    /**
     * 
     * @return jumpssafe value
     */
    public int getJumpssafe();

    /**
     * set jumpssafe value
     * @param jumpssafe: new value
     */
    public void setJumpssafe(int jumpssafe);

    /**
     * 
     * @return jumpssafelowsec value
     */
    public int getJumpssafelowsec();

    /**
     * set jumpssafelowsec value
     * @param jumpssafelowsec: new value
     */
    public void setJumpssafelowsec(int jumpssafelowsec);

    /**
     * 
     * @return jumpssafenullsec value
     */
    public int getJumpssafenullsec();

    /**
     * set jumpssafenullsec value
     * @param jumpssafenullsec: new value
     */
    public void setJumpssafenullsec(int jumpssafenullsec);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
