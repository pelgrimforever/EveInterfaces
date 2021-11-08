/*
 * IView_systemtrade_order.java
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
 * View Interface IView_systemtrade_order
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_systemtrade_order extends View {

    public static byte SELL_SYSTEM = 1;
    public static byte BUY_SYSTEM = 2;
    public static byte SELL_ORDER = 3;
    public static byte BUY_ORDER = 4;
    public static byte AMOUNT = 5;
    public static byte SELLPRICE = 6;
    public static byte BUYPRICE = 7;
    public static byte PROFIT = 8;
    public static byte CARGOVOLUME = 9;
    public static byte EVETYPE = 10;
    public static byte EVETYPENAME = 11;
    public static byte SELL_VOLUME_REMAIN = 12;
    public static byte SELL_PRICE = 13;
    public static byte SELL_STATION = 14;
    public static byte SELL_STATIONNAME = 15;
    public static byte BUY_VOLUME_REMAIN = 16;
    public static byte BUY_PRICE = 17;
    public static byte BUY_STATION = 18;
    public static byte BUY_STATIONNAME = 19;

    public static final int SIZE_SELL_SYSTEM = 19;
    public static final int SIZE_BUY_SYSTEM = 19;
    public static final int SIZE_SELL_ORDER = 19;
    public static final int SIZE_BUY_ORDER = 19;
    public static final int SIZE_AMOUNT = 19;
    public static final int SIZE_SELLPRICE = 17;
    public static final int SIZE_BUYPRICE = 17;
    public static final int SIZE_PROFIT = 17;
    public static final int SIZE_CARGOVOLUME = 17;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_EVETYPENAME = 100;
    public static final int SIZE_SELL_VOLUME_REMAIN = 19;
    public static final int SIZE_SELL_PRICE = 17;
    public static final int SIZE_SELL_STATION = 19;
    public static final int SIZE_SELL_STATIONNAME = 100;
    public static final int SIZE_BUY_VOLUME_REMAIN = 19;
    public static final int SIZE_BUY_PRICE = 17;
    public static final int SIZE_BUY_STATION = 19;
    public static final int SIZE_BUY_STATIONNAME = 100;
    public static final String[] fieldnames = { "sell_system", "buy_system", "sell_order", "buy_order", "amount", "sellprice", "buyprice", "profit", "cargovolume", "evetype", "evetypename", "sell_volume_remain", "sell_price", "sell_station", "sell_stationname", "buy_volume_remain", "buy_price", "buy_station", "buy_stationname" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

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
     * @return sell_order value
     */
    public long getSell_order();

    /**
     * 
     * @return buy_order value
     */
    public long getBuy_order();

    /**
     * 
     * @return amount value
     */
    public long getAmount();

    /**
     * 
     * @return sellprice value
     */
    public double getSellprice();

    /**
     * 
     * @return buyprice value
     */
    public double getBuyprice();

    /**
     * 
     * @return profit value
     */
    public double getProfit();

    /**
     * 
     * @return cargovolume value
     */
    public double getCargovolume();

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

    /**
     * 
     * @return evetypename value
     */
    public java.lang.String getEvetypename();

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
     * @return sell_station value
     */
    public long getSell_station();

    /**
     * 
     * @return sell_stationname value
     */
    public java.lang.String getSell_stationname();

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
     * @return buy_station value
     */
    public long getBuy_station();

    /**
     * 
     * @return buy_stationname value
     */
    public java.lang.String getBuy_stationname();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
