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

public interface IRace extends LogicEntity {

    public IRacePK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short DESCRIPTION = 3;
    public static short FACTION = 4;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 30;
    public static final int SIZE_DESCRIPTION = 2147483647;
    public static final int SIZE_FACTION = 19;
    public static final String[] fieldnames = { "id", "name", "description", "faction" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_String, Datatypes.type_long };

    public static final String[] factionPKfields = { "faction.id" };
    public static final String[] factionFKfields = { "race.faction" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    public IFactionPK getFactionPK();

    public void setFactionPK(IFactionPK factionPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
