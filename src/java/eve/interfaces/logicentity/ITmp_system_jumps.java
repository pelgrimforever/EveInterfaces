/*
 * ITmp_system_jumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
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
 * Entity Interface ITmp_system_jumps
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ITmp_system_jumps extends LogicEntity {

	public ITmp_system_jumpsPK getPrimaryKey();
	
    public static short SYSTEM = 1;
    public static short JUMP = 2;
    public static short MAXJUMPS = 3;
    public static short PREVIOUSSYSTEM = 4;

    public static final int SIZE_SYSTEM = 19;
    public static final int SIZE_JUMP = 10;
    public static final int SIZE_MAXJUMPS = 10;
    public static final int SIZE_PREVIOUSSYSTEM = 19;
    public static final String[] fieldnames = { "system", "jump", "maxjumps", "previoussystem" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_int, Datatypes.type_int, Datatypes.type_long };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return jump value
     */
    public int getJump();

    /**
     * set jump value
     * @param jump: new value
     */
    public void setJump(int jump);

    /**
     * 
     * @return maxjumps value
     */
    public int getMaxjumps();

    /**
     * set maxjumps value
     * @param maxjumps: new value
     */
    public void setMaxjumps(int maxjumps);

    /**
     * 
     * @return previoussystem value
     */
    public long getPrevioussystem();

    /**
     * set previoussystem value
     * @param previoussystem: new value
     */
    public void setPrevioussystem(long previoussystem);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
