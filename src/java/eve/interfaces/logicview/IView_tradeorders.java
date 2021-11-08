/*
 * IView_tradeorders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
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
 * View Interface IView_tradeorders
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_tradeorders extends View {

    public static byte TRADEVOLUME = 1;
    public static byte BUY_TOTALPRICE = 2;
    public static byte SELL_TOTALPRICE = 3;
    public static byte CARGO_VOLUME = 4;
    public static byte SELL_ID = 5;
    public static byte SELL_SYSTEM = 6;
    public static byte SELL_LOCATION = 7;
    public static byte SELL_EVETYPE = 8;
    public static byte SELL_PACKAGED_VOLUME = 9;
    public static byte SELL_VOLUME_REMAIN = 10;
    public static byte SELL_PRICE = 11;
    public static byte SECURITY_ISLAND = 12;
    public static byte BUY_ID = 13;
    public static byte BUY_SYSTEM = 14;
    public static byte BUY_LOCATION = 15;
    public static byte BUY_VOLUME_REMAIN = 16;
    public static byte BUY_PRICE = 17;
    public static byte JUMPS = 18;

    public static final int SIZE_TRADEVOLUME = 19;
    public static final int SIZE_BUY_TOTALPRICE = 17;
    public static final int SIZE_SELL_TOTALPRICE = 17;
    public static final int SIZE_CARGO_VOLUME = 17;
    public static final int SIZE_SELL_ID = 19;
    public static final int SIZE_SELL_SYSTEM = 19;
    public static final int SIZE_SELL_LOCATION = 19;
    public static final int SIZE_SELL_EVETYPE = 19;
    public static final int SIZE_SELL_PACKAGED_VOLUME = 17;
    public static final int SIZE_SELL_VOLUME_REMAIN = 19;
    public static final int SIZE_SELL_PRICE = 17;
    public static final int SIZE_SECURITY_ISLAND = 19;
    public static final int SIZE_BUY_ID = 19;
    public static final int SIZE_BUY_SYSTEM = 19;
    public static final int SIZE_BUY_LOCATION = 19;
    public static final int SIZE_BUY_VOLUME_REMAIN = 19;
    public static final int SIZE_BUY_PRICE = 17;
    public static final int SIZE_JUMPS = 10;
    public static final String[] fieldnames = { "tradevolume", "buy_totalprice", "sell_totalprice", "cargo_volume", "sell_id", "sell_system", "sell_location", "sell_evetype", "sell_packaged_volume", "sell_volume_remain", "sell_price", "security_island", "buy_id", "buy_system", "buy_location", "buy_volume_remain", "buy_price", "jumps" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return tradevolume value
     */
    public long getTradevolume();

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
     * @return sell_id value
     */
    public long getSell_id();

    /**
     * 
     * @return sell_system value
     */
    public long getSell_system();

    /**
     * 
     * @return sell_location value
     */
    public long getSell_location();

    /**
     * 
     * @return sell_evetype value
     */
    public long getSell_evetype();

    /**
     * 
     * @return sell_packaged_volume value
     */
    public double getSell_packaged_volume();

    /**
     * 
     * @return sell_volume_remain value
     */
    public long getSell_volume_remain();

    /**
     * 
     * @return sell_price value
     */
    public double getSell_price();

    /**
     * 
     * @return security_island value
     */
    public long getSecurity_island();

    /**
     * 
     * @return buy_id value
     */
    public long getBuy_id();

    /**
     * 
     * @return buy_system value
     */
    public long getBuy_system();

    /**
     * 
     * @return buy_location value
     */
    public long getBuy_location();

    /**
     * 
     * @return buy_volume_remain value
     */
    public long getBuy_volume_remain();

    /**
     * 
     * @return buy_price value
     */
    public double getBuy_price();

    /**
     * 
     * @return jumps value
     */
    public int getJumps();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
