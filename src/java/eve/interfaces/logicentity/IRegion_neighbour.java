/*
 * IRegion_neighbour.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:45
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
 * Entity Interface IRegion_neighbour
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IRegion_neighbour extends LogicEntity {

    public IRegion_neighbourPK getPrimaryKey();
	
    public static short REGION = 1;
    public static short NEIGHBOUR = 2;

    public static final int SIZE_REGION = 19;
    public static final int SIZE_NEIGHBOUR = 19;
    public static final String[] fieldnames = { "region", "neighbour" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long };

    public static final String[] regionRegionPKfields = { "region.id" };
    public static final String[] regionRegionFKfields = { "region_neighbour.region" };
    public static final String[] regionNeighbourPKfields = { "region.id" };
    public static final String[] regionNeighbourFKfields = { "region_neighbour.neighbour" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
