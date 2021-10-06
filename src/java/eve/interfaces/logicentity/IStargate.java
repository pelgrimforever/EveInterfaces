/*
 * IStargate.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
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
 * Entity Interface IStargate
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IStargate extends LogicEntity {

	public IStargatePK getPrimaryKey();
	
    public static short ID = 1;
    public static short TO_STARGATE = 2;
    public static short SYSTEM = 3;
    public static short TO_SYSTEM = 4;
    public static short NAME = 5;
    public static short X = 6;
    public static short Y = 7;
    public static short Z = 8;
    public static short ISCONSTELLATIONBORDER = 9;
    public static short ISREGIONBORDER = 10;

    public static final int SIZE_ID = 19;
    public static final int SIZE_TO_STARGATE = 19;
    public static final int SIZE_SYSTEM = 19;
    public static final int SIZE_TO_SYSTEM = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_X = 17;
    public static final int SIZE_Y = 17;
    public static final int SIZE_Z = 17;
    public static final int SIZE_ISCONSTELLATIONBORDER = 1;
    public static final int SIZE_ISREGIONBORDER = 1;
    public static final String[] fieldnames = { "id", "to_stargate", "system", "to_system", "name", "x", "y", "z", "isconstellationborder", "isregionborder" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_String, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_boolean, Datatypes.type_boolean };

    public static final String[] systemSystemPKfields = { "system.id" };
    public static final String[] systemSystemFKfields = { "stargate.system" };
    public static final String[] systemTo_systemPKfields = { "system.id" };
    public static final String[] systemTo_systemFKfields = { "stargate.to_system" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return to_stargate value
     */
    public long getTo_stargate();

    /**
     * set to_stargate value
     * @param to_stargate: new value
     */
    public void setTo_stargate(long to_stargate);

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name);

    /**
     * 
     * @return x value
     */
    public double getX();

    /**
     * set x value
     * @param x: new value
     */
    public void setX(double x);

    /**
     * 
     * @return y value
     */
    public double getY();

    /**
     * set y value
     * @param y: new value
     */
    public void setY(double y);

    /**
     * 
     * @return z value
     */
    public double getZ();

    /**
     * set z value
     * @param z: new value
     */
    public void setZ(double z);

    /**
     * 
     * @return isconstellationborder value
     */
    public boolean getIsconstellationborder();

    /**
     * set isconstellationborder value
     * @param isconstellationborder: new value
     */
    public void setIsconstellationborder(boolean isconstellationborder);

    /**
     * 
     * @return isregionborder value
     */
    public boolean getIsregionborder();

    /**
     * set isregionborder value
     * @param isregionborder: new value
     */
    public void setIsregionborder(boolean isregionborder);

    /**
     * 
     * @return foreign key systemSystemPK, instance of SystemPK
     */
    public ISystemPK getSystemsystemPK();

    /**
     * set foreign key system
     * @param systemSystemPK: instance of SystemPK
     */
    public void setSystemsystemPK(ISystemPK systemSystemPK);

    /**
     * 
     * @return foreign key systemTo_systemPK, instance of SystemPK
     */
    public ISystemPK getSystemto_systemPK();

    /**
     * set foreign key system
     * @param systemTo_systemPK: instance of SystemPK
     */
    public void setSystemto_systemPK(ISystemPK systemTo_systemPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
