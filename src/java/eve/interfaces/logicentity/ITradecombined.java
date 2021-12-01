/*
 * ITradecombined.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
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
 * Entity Interface ITradecombined
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ITradecombined extends LogicEntity {

    public ITradecombinedPK getPrimaryKey();
	
    public static short SELL_SYSTEM = 1;
    public static short BUY_SYSTEM = 2;
    public static short EVETYPE = 3;
    public static short JUMPS = 4;

    public static final int SIZE_SELL_SYSTEM = 19;
    public static final int SIZE_BUY_SYSTEM = 19;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_JUMPS = 10;
    public static final String[] fieldnames = { "sell_system", "buy_system", "evetype", "jumps" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_int };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "tradecombined.evetype" };
    public static final String[] systemBuy_systemPKfields = { "system.id" };
    public static final String[] systemBuy_systemFKfields = { "tradecombined.buy_system" };
    public static final String[] systemSell_systemPKfields = { "system.id" };
    public static final String[] systemSell_systemFKfields = { "tradecombined.sell_system" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return jumps value
     */
    public int getJumps();

    /**
     * set jumps value
     * @param jumps: new value
     */
    public void setJumps(int jumps);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
