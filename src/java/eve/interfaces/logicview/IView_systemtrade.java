/*
 * IView_systemtrade.java
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
 * View Interface IView_systemtrade
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_systemtrade extends View {

    public static byte SELL_SYSTEM = 1;
    public static byte BUY_SYSTEM = 2;
    public static byte ORDERCOUNT = 3;
    public static byte TOTALSELL = 4;
    public static byte TOTALBUY = 5;
    public static byte PROFIT = 6;
    public static byte TOTAL_CARGO_VOLUME = 7;
    public static byte JUMPS = 8;
    public static byte REGIONSELLNAME = 9;
    public static byte SYSTEMSELLNAME = 10;
    public static byte REGIONBUYNAME = 11;
    public static byte SYSTEMBUYNAME = 12;

    public static final int SIZE_SELL_SYSTEM = 19;
    public static final int SIZE_BUY_SYSTEM = 19;
    public static final int SIZE_ORDERCOUNT = 19;
    public static final int SIZE_TOTALSELL = 17;
    public static final int SIZE_TOTALBUY = 17;
    public static final int SIZE_PROFIT = 17;
    public static final int SIZE_TOTAL_CARGO_VOLUME = 17;
    public static final int SIZE_JUMPS = 10;
    public static final int SIZE_REGIONSELLNAME = 30;
    public static final int SIZE_SYSTEMSELLNAME = 30;
    public static final int SIZE_REGIONBUYNAME = 30;
    public static final int SIZE_SYSTEMBUYNAME = 30;
    public static final String[] fieldnames = { "sell_system", "buy_system", "ordercount", "totalsell", "totalbuy", "profit", "total_cargo_volume", "jumps", "regionsellname", "systemsellname", "regionbuyname", "systembuyname" };

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
     * @return ordercount value
     */
    public long getOrdercount();

    /**
     * 
     * @return totalsell value
     */
    public double getTotalsell();

    /**
     * 
     * @return totalbuy value
     */
    public double getTotalbuy();

    /**
     * 
     * @return profit value
     */
    public double getProfit();

    /**
     * 
     * @return total_cargo_volume value
     */
    public double getTotal_cargo_volume();

    /**
     * 
     * @return jumps value
     */
    public int getJumps();

    /**
     * 
     * @return regionsellname value
     */
    public java.lang.String getRegionsellname();

    /**
     * 
     * @return systemsellname value
     */
    public java.lang.String getSystemsellname();

    /**
     * 
     * @return regionbuyname value
     */
    public java.lang.String getRegionbuyname();

    /**
     * 
     * @return systembuyname value
     */
    public java.lang.String getSystembuyname();

    
//Custom code, do not change this line
//Put custom functions here
    public long getStart_system();

    public void setStart_system(long start_system);

    public int getStart_system_jumps();

    public void setStart_system_jumps(int start_system_jumps);
//Custom code, do not change this line
}
