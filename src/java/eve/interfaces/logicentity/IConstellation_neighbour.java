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

public interface IConstellation_neighbour extends LogicEntity {

    public IConstellation_neighbourPK getPrimaryKey();
	
    public static short CONSTELLATION = 1;
    public static short NEIGHBOUR = 2;

    public static final int SIZE_CONSTELLATION = 19;
    public static final int SIZE_NEIGHBOUR = 19;
    public static final String[] fieldnames = { "constellation", "neighbour" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long };

    public static final String[] constellationNeighbourPKfields = { "constellation.id" };
    public static final String[] constellationNeighbourFKfields = { "constellation_neighbour.neighbour" };
    public static final String[] constellationConstellationPKfields = { "constellation.id" };
    public static final String[] constellationConstellationFKfields = { "constellation_neighbour.constellation" };

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
