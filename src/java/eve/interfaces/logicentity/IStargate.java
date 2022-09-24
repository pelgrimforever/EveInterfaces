/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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
    public static short DOWNLOADDATE = 11;

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
    public static final int SIZE_DOWNLOADDATE = 13;
    public static final String[] fieldnames = { "id", "to_stargate", "system", "to_system", "name", "x", "y", "z", "isconstellationborder", "isregionborder", "downloaddate" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_String, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_Date };

    public static final String[] systemSystemPKfields = { "system.id" };
    public static final String[] systemSystemFKfields = { "stargate.system" };
    public static final String[] systemTo_systemPKfields = { "system.id" };
    public static final String[] systemTo_systemFKfields = { "stargate.to_system" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public long getTo_stargate();

    public void setTo_stargate(long to_stargate);

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public double getX();

    public void setX(double x);

    public double getY();

    public void setY(double y);

    public double getZ();

    public void setZ(double z);

    public boolean getIsconstellationborder();

    public void setIsconstellationborder(boolean isconstellationborder);

    public boolean getIsregionborder();

    public void setIsregionborder(boolean isregionborder);

    public java.sql.Date getDownloaddate();

    public void setDownloaddate(java.sql.Date downloaddate);

    public ISystemPK getSystemsystemPK();

    public void setSystemsystemPK(ISystemPK systemSystemPK);

    public ISystemPK getSystemto_systemPK();

    public void setSystemto_systemPK(ISystemPK systemTo_systemPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
