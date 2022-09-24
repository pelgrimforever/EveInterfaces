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

public interface ILocation extends LogicEntity {

    public ILocationPK getPrimaryKey();
	
    public static short ID = 1;
    public static short SYSTEM = 2;
    public static short NAME = 3;
    public static short VISITED = 4;
    public static short ACCESS = 5;

    public static final int SIZE_ID = 19;
    public static final int SIZE_SYSTEM = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_VISITED = 1;
    public static final int SIZE_ACCESS = 1;
    public static final String[] fieldnames = { "id", "system", "name", "visited", "access" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_String, Datatypes.type_boolean, Datatypes.type_boolean };

    public static final String[] systemPKfields = { "system.id" };
    public static final String[] systemFKfields = { "location.system" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public boolean getVisited();

    public void setVisited(boolean visited);

    public boolean getAccess();

    public void setAccess(boolean access);

    public ISystemPK getSystemPK();

    public void setSystemPK(ISystemPK systemPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
