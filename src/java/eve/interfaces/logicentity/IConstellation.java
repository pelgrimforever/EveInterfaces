/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
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

public interface IConstellation extends LogicEntity {

    public IConstellationPK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short REGION = 3;
    public static short NOACCESS = 4;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 30;
    public static final int SIZE_REGION = 19;
    public static final int SIZE_NOACCESS = 1;
    public static final String[] fieldnames = { "id", "name", "region", "noaccess" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_long, Datatypes.type_boolean };

    public static final String[] regionPKfields = { "region.id" };
    public static final String[] regionFKfields = { "constellation.region" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public boolean getNoaccess();

    public void setNoaccess(boolean noaccess);

    public IRegionPK getRegionPK();

    public void setRegionPK(IRegionPK regionPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
