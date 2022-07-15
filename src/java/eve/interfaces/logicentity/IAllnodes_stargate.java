/*
 * IAllnodes_stargate.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
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
 * Entity Interface IAllnodes_stargate
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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
     * @return system value
     */
    public long getSystem();

    /**
     * set system value
     * @param system: new value
     */
    public void setSystem(long system);

    /**
     * 
     * @return to_system value
     */
    public long getTo_system();

    /**
     * set to_system value
     * @param to_system: new value
     */
    public void setTo_system(long to_system);

    /**
     * 
     * @return deadend value
     */
    public boolean getDeadend();

    /**
     * set deadend value
     * @param deadend: new value
     */
    public void setDeadend(boolean deadend);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
