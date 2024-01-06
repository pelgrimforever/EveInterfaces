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

public interface IAllnodes_system extends LogicEntity {

    public IAllnodes_systemPK getPrimaryKey();
	
    public static short ID = 1;
    public static short DEADEND = 2;

    public static final int SIZE_ID = 19;
    public static final int SIZE_DEADEND = 1;
    public static final String[] fieldnames = { "id", "deadend" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_boolean };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public boolean getDeadend();

    public void setDeadend(boolean deadend);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
