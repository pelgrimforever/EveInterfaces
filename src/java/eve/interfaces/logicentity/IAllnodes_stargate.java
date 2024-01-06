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

public interface IAllnodes_stargate extends LogicEntity {

    public IAllnodes_stargatePK getPrimaryKey();
	
    public static short ID = 1;
    public static short TO_STARGATE = 2;
    public static short SYSTEM = 3;
    public static short TO_SYSTEM = 4;
    public static short DEADEND = 5;

    public static final int SIZE_ID = 19;
    public static final int SIZE_TO_STARGATE = 19;
    public static final int SIZE_SYSTEM = 19;
    public static final int SIZE_TO_SYSTEM = 19;
    public static final int SIZE_DEADEND = 1;
    public static final String[] fieldnames = { "id", "to_stargate", "system", "to_system", "deadend" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_boolean };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public long getTo_stargate();

    public void setTo_stargate(long to_stargate);

    public long getSystem();

    public void setSystem(long system);

    public long getTo_system();

    public void setTo_system(long to_system);

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
