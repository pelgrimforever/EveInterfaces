/*
 * IView_systemtradeorders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.interfaces.logicview;

import data.gis.shape.*;
import data.interfaces.db.View;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * View Interface IView_systemtradeorders
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_systemtradeorders extends View {

    public static byte BUY_TOTALPRICE = 1;
    public static byte SELL_TOTALPRICE = 2;
    public static byte CARGO_VOLUME = 3;
    public static byte SELLORDERID = 4;
    public static byte BUYORDERID = 5;
    public static byte EVETYPE = 6;
    public static byte PACKAGED_VOLUME = 7;
    public static byte SECURITY_ISLAND = 8;
    public static byte SELL_SYSTEM = 9;
    public static byte BUY_SYSTEM = 10;
    public static byte JUMPS = 11;

    public static final int SIZE_BUY_TOTALPRICE = 17;
    public static final int SIZE_SELL_TOTALPRICE = 17;
    public static final int SIZE_CARGO_VOLUME = 17;
    public static final int SIZE_SELLORDERID = 19;
    public static final int SIZE_BUYORDERID = 19;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_SECURITY_ISLAND = 19;
    public static final int SIZE_SELL_SYSTEM = 19;
    public static final int SIZE_BUY_SYSTEM = 19;
    public static final int SIZE_JUMPS = 10;
    public static final String[] fieldnames = { "buy_totalprice", "sell_totalprice", "cargo_volume", "sellorderid", "buyorderid", "evetype", "packaged_volume", "security_island", "sell_system", "buy_system", "jumps" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return buy_totalprice value
     */
    public double getBuy_totalprice();

    /**
     * 
     * @return sell_totalprice value
     */
    public double getSell_totalprice();

    /**
     * 
     * @return cargo_volume value
     */
    public double getCargo_volume();

    /**
     * 
     * @return sellorderid value
     */
    public long getSellorderid();

    /**
     * 
     * @return buyorderid value
     */
    public long getBuyorderid();

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

    /**
     * 
     * @return packaged_volume value
     */
    public double getPackaged_volume();

    /**
     * 
     * @return security_island value
     */
    public long getSecurity_island();

    /**
     * 
     * @return sell_system value
     */
    public long getSell_system();

    /**
     * 
     * @return buy_system value
     */
    public long getBuy_system();

    /**
     * 
     * @return jumps value
     */
    public int getJumps();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
