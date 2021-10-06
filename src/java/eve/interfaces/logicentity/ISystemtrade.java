/*
 * ISystemtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
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
 * Entity Interface ISystemtrade
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ISystemtrade extends LogicEntity {

	public ISystemtradePK getPrimaryKey();
	
    public static short SELL_SYSTEM = 1;
    public static short BUY_SYSTEM = 2;
    public static short PROFIT = 3;
    public static short TOTAL_CARGO_VOLUME = 4;
    public static short JUMPS = 5;

    public static final int SIZE_SELL_SYSTEM = 19;
    public static final int SIZE_BUY_SYSTEM = 19;
    public static final int SIZE_PROFIT = 17;
    public static final int SIZE_TOTAL_CARGO_VOLUME = 17;
    public static final int SIZE_JUMPS = 10;
    public static final String[] fieldnames = { "sell_system", "buy_system", "profit", "total_cargo_volume", "jumps" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_double, Datatypes.type_double, Datatypes.type_int };

    public static final String[] systemSell_systemPKfields = { "system.id" };
    public static final String[] systemSell_systemFKfields = { "systemtrade.sell_system" };
    public static final String[] systemBuy_systemPKfields = { "system.id" };
    public static final String[] systemBuy_systemFKfields = { "systemtrade.buy_system" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return profit value
     */
    public double getProfit();

    /**
     * set profit value
     * @param profit: new value
     */
    public void setProfit(double profit);

    /**
     * 
     * @return total_cargo_volume value
     */
    public double getTotal_cargo_volume();

    /**
     * set total_cargo_volume value
     * @param total_cargo_volume: new value
     */
    public void setTotal_cargo_volume(double total_cargo_volume);

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
