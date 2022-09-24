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

public interface ISystemjumps extends LogicEntity {

    public ISystemjumpsPK getPrimaryKey();
	
    public static short SYSTEM_START = 1;
    public static short SYSTEM_END = 2;
    public static short JUMPS = 3;
    public static short JUMPSLOWSEC = 4;
    public static short JUMPSNULLSEC = 5;
    public static short JUMPSSAFE = 6;
    public static short JUMPSSAFELOWSEC = 7;
    public static short JUMPSSAFENULLSEC = 8;

    public static final int SIZE_SYSTEM_START = 19;
    public static final int SIZE_SYSTEM_END = 19;
    public static final int SIZE_JUMPS = 10;
    public static final int SIZE_JUMPSLOWSEC = 10;
    public static final int SIZE_JUMPSNULLSEC = 10;
    public static final int SIZE_JUMPSSAFE = 10;
    public static final int SIZE_JUMPSSAFELOWSEC = 10;
    public static final int SIZE_JUMPSSAFENULLSEC = 10;
    public static final String[] fieldnames = { "system_start", "system_end", "jumps", "jumpslowsec", "jumpsnullsec", "jumpssafe", "jumpssafelowsec", "jumpssafenullsec" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int };

    public static final String[] systemSystem_endPKfields = { "system.id" };
    public static final String[] systemSystem_endFKfields = { "systemjumps.system_end" };
    public static final String[] systemSystem_startPKfields = { "system.id" };
    public static final String[] systemSystem_startFKfields = { "systemjumps.system_start" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public int getJumps();

    public void setJumps(int jumps);

    public int getJumpslowsec();

    public void setJumpslowsec(int jumpslowsec);

    public int getJumpsnullsec();

    public void setJumpsnullsec(int jumpsnullsec);

    public int getJumpssafe();

    public void setJumpssafe(int jumpssafe);

    public int getJumpssafelowsec();

    public void setJumpssafelowsec(int jumpssafelowsec);

    public int getJumpssafenullsec();

    public void setJumpssafenullsec(int jumpssafenullsec);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
