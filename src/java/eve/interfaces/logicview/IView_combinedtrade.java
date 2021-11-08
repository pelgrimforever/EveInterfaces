/*
 * IView_combinedtrade.java
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
 * View Interface IView_combinedtrade
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_combinedtrade extends View {

    public static byte SELLREGION = 1;
    public static byte BUYREGION = 2;
    public static byte SELL_SYSTEMID = 3;
    public static byte SELLSYSTEM = 4;
    public static byte BUY_SYSTEMID = 5;
    public static byte BUYSYSTEM = 6;
    public static byte TOTAL_VOLUME = 7;
    public static byte BUY_ORDER_VALUE = 8;
    public static byte SELL_ORDER_VALUE = 9;
    public static byte PROFIT = 10;
    public static byte JUMPS = 11;
    public static byte RUNS = 12;
    public static byte ORDERCOUNT = 13;

    public static final int SIZE_SELLREGION = 30;
    public static final int SIZE_BUYREGION = 30;
    public static final int SIZE_SELL_SYSTEMID = 19;
    public static final int SIZE_SELLSYSTEM = 30;
    public static final int SIZE_BUY_SYSTEMID = 19;
    public static final int SIZE_BUYSYSTEM = 30;
    public static final int SIZE_TOTAL_VOLUME = 17;
    public static final int SIZE_BUY_ORDER_VALUE = 17;
    public static final int SIZE_SELL_ORDER_VALUE = 17;
    public static final int SIZE_PROFIT = 17;
    public static final int SIZE_JUMPS = 10;
    public static final int SIZE_RUNS = 19;
    public static final int SIZE_ORDERCOUNT = 19;
    public static final String[] fieldnames = { "sellregion", "buyregion", "sell_systemid", "sellsystem", "buy_systemid", "buysystem", "total_volume", "buy_order_value", "sell_order_value", "profit", "jumps", "runs", "ordercount" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return sellregion value
     */
    public java.lang.String getSellregion();

    /**
     * 
     * @return buyregion value
     */
    public java.lang.String getBuyregion();

    /**
     * 
     * @return sell_systemid value
     */
    public long getSell_systemid();

    /**
     * 
     * @return sellsystem value
     */
    public java.lang.String getSellsystem();

    /**
     * 
     * @return buy_systemid value
     */
    public long getBuy_systemid();

    /**
     * 
     * @return buysystem value
     */
    public java.lang.String getBuysystem();

    /**
     * 
     * @return total_volume value
     */
    public double getTotal_volume();

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
     * @return jumps value
     */
    public int getJumps();

    /**
     * 
     * @return runs value
     */
    public long getRuns();

    /**
     * 
     * @return ordercount value
     */
    public long getOrdercount();

    
//Custom code, do not change this line
//Put custom functions here
    public long getStart_system();

    public void setStart_system(long start_system);

    public int getStart_system_jumps();

    public void setStart_system_jumps(int start_system_jumps);
//Custom code, do not change this line
}
