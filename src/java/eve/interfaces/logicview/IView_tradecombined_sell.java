/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

public interface IView_tradecombined_sell extends View {

    public static byte SELL_SYSTEM = 1;
    public static byte BUY_SYSTEM = 2;
    public static byte ORDERAMOUNT = 3;
    public static byte BUY_ORDER_VALUE = 4;
    public static byte SELL_ORDER_VALUE = 5;
    public static byte PROFIT = 6;
    public static byte SELL_LOCATIONID = 7;
    public static byte SELL_STATIONNAME = 8;
    public static byte EVETYPE_ID = 9;
    public static byte EVETYPE_NAME = 10;
    public static byte PACKAGED_VOLUME = 11;
    public static byte SELL_ID = 12;
    public static byte SELL_VOLUME_TOTAL = 13;
    public static byte SELL_VOLUME_REMAIN = 14;
    public static byte SELL_MIN_VOLUME = 15;
    public static byte SELL_UPDATED = 16;
    public static byte BUY_ID = 17;
    public static byte SELL_PRICE = 18;
    public static byte BUY_VOLUME_TOTAL = 19;
    public static byte BUY_VOLUME_REMAIN = 20;
    public static byte BUY_MIN_VOLUME = 21;
    public static byte BUY_UPDATED = 22;
    public static byte BUY_PRICE = 23;
    public static byte BUY_LOCATIONID = 24;
    public static byte BUY_STATIONNAME = 25;

    public static final int SIZE_SELL_SYSTEM = 19;
    public static final int SIZE_BUY_SYSTEM = 19;
    public static final int SIZE_ORDERAMOUNT = 19;
    public static final int SIZE_BUY_ORDER_VALUE = 17;
    public static final int SIZE_SELL_ORDER_VALUE = 17;
    public static final int SIZE_PROFIT = 17;
    public static final int SIZE_SELL_LOCATIONID = 19;
    public static final int SIZE_SELL_STATIONNAME = 100;
    public static final int SIZE_EVETYPE_ID = 19;
    public static final int SIZE_EVETYPE_NAME = 100;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_SELL_ID = 19;
    public static final int SIZE_SELL_VOLUME_TOTAL = 19;
    public static final int SIZE_SELL_VOLUME_REMAIN = 19;
    public static final int SIZE_SELL_MIN_VOLUME = 10;
    public static final int SIZE_SELL_UPDATED = 19;
    public static final int SIZE_BUY_ID = 19;
    public static final int SIZE_SELL_PRICE = 17;
    public static final int SIZE_BUY_VOLUME_TOTAL = 19;
    public static final int SIZE_BUY_VOLUME_REMAIN = 19;
    public static final int SIZE_BUY_MIN_VOLUME = 10;
    public static final int SIZE_BUY_UPDATED = 19;
    public static final int SIZE_BUY_PRICE = 17;
    public static final int SIZE_BUY_LOCATIONID = 19;
    public static final int SIZE_BUY_STATIONNAME = 100;
    public static final String[] fieldnames = { "sell_system", "buy_system", "orderamount", "buy_order_value", "sell_order_value", "profit", "sell_locationid", "sell_stationname", "evetype_id", "evetype_name", "packaged_volume", "sell_id", "sell_volume_total", "sell_volume_remain", "sell_min_volume", "sell_updated", "buy_id", "sell_price", "buy_volume_total", "buy_volume_remain", "buy_min_volume", "buy_updated", "buy_price", "buy_locationid", "buy_stationname" };

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
     * @return orderamount value
     */
    public long getOrderamount();

    /**
     * 
     * @return buy_order_value value
     */
    public double getBuy_order_value();

    /**
     * 
     * @return sell_order_value value
     */
    public double getSell_order_value();

    /**
     * 
     * @return profit value
     */
    public double getProfit();

    /**
     * 
     * @return sell_locationid value
     */
    public long getSell_locationid();

    /**
     * 
     * @return sell_stationname value
     */
    public java.lang.String getSell_stationname();

    /**
     * 
     * @return evetype_id value
     */
    public long getEvetype_id();

    /**
     * 
     * @return evetype_name value
     */
    public java.lang.String getEvetype_name();

    /**
     * 
     * @return packaged_volume value
     */
    public double getPackaged_volume();

    /**
     * 
     * @return sell_id value
     */
    public long getSell_id();

    /**
     * 
     * @return sell_volume_total value
     */
    public long getSell_volume_total();

    /**
     * 
     * @return sell_volume_remain value
     */
    public long getSell_volume_remain();

    /**
     * 
     * @return sell_min_volume value
     */
    public int getSell_min_volume();

    /**
     * 
     * @return sell_updated value
     */
    public long getSell_updated();

    /**
     * 
     * @return buy_id value
     */
    public long getBuy_id();

    /**
     * 
     * @return sell_price value
     */
    public double getSell_price();

    /**
     * 
     * @return buy_volume_total value
     */
    public long getBuy_volume_total();

    /**
     * 
     * @return buy_volume_remain value
     */
    public long getBuy_volume_remain();

    /**
     * 
     * @return buy_min_volume value
     */
    public int getBuy_min_volume();

    /**
     * 
     * @return buy_updated value
     */
    public long getBuy_updated();

    /**
     * 
     * @return buy_price value
     */
    public double getBuy_price();

    /**
     * 
     * @return buy_locationid value
     */
    public long getBuy_locationid();

    /**
     * 
     * @return buy_stationname value
     */
    public java.lang.String getBuy_stationname();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
