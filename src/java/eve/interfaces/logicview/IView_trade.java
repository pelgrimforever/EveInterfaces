/*
 * IView_trade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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
 * View Interface IView_trade
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_trade extends View {

    public static byte SELL_REGIONID = 1;
    public static byte SELL_REGIONNAME = 2;
    public static byte SELL_SYSTEMID = 3;
    public static byte SELL_SYSTEMNAME = 4;
    public static byte SELL_LOCATIONID = 5;
    public static byte SELL_STATIONNAME = 6;
    public static byte EVETYPE_ID = 7;
    public static byte EVETYPE_NAME = 8;
    public static byte PACKAGED_VOLUME = 9;
    public static byte SELL_ID = 10;
    public static byte BUY_ID = 11;
    public static byte SELL_VOLUME_REMAIN = 12;
    public static byte SELL_PRICE = 13;
    public static byte BUY_PRICE = 14;
    public static byte BUY_SYSTEMID = 15;
    public static byte BUY_SYSTEMNAME = 16;
    public static byte BUY_LOCATIONID = 17;
    public static byte BUY_STATIONNAME = 18;
    public static byte BUY_VOLUME_REMAIN = 19;
    public static byte TOTAL_VOLUME = 20;
    public static byte SELL_TOTAL = 21;
    public static byte BUY_TOTAL = 22;
    public static byte TRADE_PROFIT = 23;
    public static byte TRADE_JUMPS = 24;
    public static byte TRADE_JUMPSLOWSEC = 25;
    public static byte TRADE_JUMPSNULLSEC = 26;
    public static byte TRADE_PROFIT_PER_JUMP = 27;
    public static byte TRADE_RUNS = 28;
    public static byte TRADE_TOTAL_JUMPS = 29;
    public static byte TRADE_SINGLERUNPROFIT = 30;
    public static byte TRADE_MAXUNITS_PER_RUN = 31;

    public static final int SIZE_SELL_REGIONID = 19;
    public static final int SIZE_SELL_REGIONNAME = 30;
    public static final int SIZE_SELL_SYSTEMID = 19;
    public static final int SIZE_SELL_SYSTEMNAME = 30;
    public static final int SIZE_SELL_LOCATIONID = 19;
    public static final int SIZE_SELL_STATIONNAME = 100;
    public static final int SIZE_EVETYPE_ID = 19;
    public static final int SIZE_EVETYPE_NAME = 100;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_SELL_ID = 19;
    public static final int SIZE_BUY_ID = 19;
    public static final int SIZE_SELL_VOLUME_REMAIN = 19;
    public static final int SIZE_SELL_PRICE = 17;
    public static final int SIZE_BUY_PRICE = 17;
    public static final int SIZE_BUY_SYSTEMID = 19;
    public static final int SIZE_BUY_SYSTEMNAME = 30;
    public static final int SIZE_BUY_LOCATIONID = 19;
    public static final int SIZE_BUY_STATIONNAME = 100;
    public static final int SIZE_BUY_VOLUME_REMAIN = 19;
    public static final int SIZE_TOTAL_VOLUME = 17;
    public static final int SIZE_SELL_TOTAL = 17;
    public static final int SIZE_BUY_TOTAL = 17;
    public static final int SIZE_TRADE_PROFIT = 17;
    public static final int SIZE_TRADE_JUMPS = 10;
    public static final int SIZE_TRADE_JUMPSLOWSEC = 10;
    public static final int SIZE_TRADE_JUMPSNULLSEC = 10;
    public static final int SIZE_TRADE_PROFIT_PER_JUMP = 17;
    public static final int SIZE_TRADE_RUNS = 10;
    public static final int SIZE_TRADE_TOTAL_JUMPS = 10;
    public static final int SIZE_TRADE_SINGLERUNPROFIT = 17;
    public static final int SIZE_TRADE_MAXUNITS_PER_RUN = 10;
    public static final String[] fieldnames = { "sell_regionid", "sell_regionname", "sell_systemid", "sell_systemname", "sell_locationid", "sell_stationname", "evetype_id", "evetype_name", "packaged_volume", "sell_id", "buy_id", "sell_volume_remain", "sell_price", "buy_price", "buy_systemid", "buy_systemname", "buy_locationid", "buy_stationname", "buy_volume_remain", "total_volume", "sell_total", "buy_total", "trade_profit", "trade_jumps", "trade_jumpslowsec", "trade_jumpsnullsec", "trade_profit_per_jump", "trade_runs", "trade_total_jumps", "trade_singlerunprofit", "trade_maxunits_per_run" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return sell_regionid value
     */
    public long getSell_regionid();

    /**
     * 
     * @return sell_regionname value
     */
    public java.lang.String getSell_regionname();

    /**
     * 
     * @return sell_systemid value
     */
    public long getSell_systemid();

    /**
     * 
     * @return sell_systemname value
     */
    public java.lang.String getSell_systemname();

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
     * @return buy_id value
     */
    public long getBuy_id();

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
     * @return buy_price value
     */
    public double getBuy_price();

    /**
     * 
     * @return buy_systemid value
     */
    public long getBuy_systemid();

    /**
     * 
     * @return buy_systemname value
     */
    public java.lang.String getBuy_systemname();

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

    /**
     * 
     * @return buy_volume_remain value
     */
    public long getBuy_volume_remain();

    /**
     * 
     * @return total_volume value
     */
    public double getTotal_volume();

    /**
     * 
     * @return sell_total value
     */
    public double getSell_total();

    /**
     * 
     * @return buy_total value
     */
    public double getBuy_total();

    /**
     * 
     * @return trade_profit value
     */
    public double getTrade_profit();

    /**
     * 
     * @return trade_jumps value
     */
    public int getTrade_jumps();

    /**
     * 
     * @return trade_jumpslowsec value
     */
    public int getTrade_jumpslowsec();

    /**
     * 
     * @return trade_jumpsnullsec value
     */
    public int getTrade_jumpsnullsec();

    /**
     * 
     * @return trade_profit_per_jump value
     */
    public double getTrade_profit_per_jump();

    /**
     * 
     * @return trade_runs value
     */
    public int getTrade_runs();

    /**
     * 
     * @return trade_total_jumps value
     */
    public int getTrade_total_jumps();

    /**
     * 
     * @return trade_singlerunprofit value
     */
    public double getTrade_singlerunprofit();

    /**
     * 
     * @return trade_maxunits_per_run value
     */
    public int getTrade_maxunits_per_run();

    
//Custom code, do not change this line
//Put custom functions here
    public long getStart_system();

    public void setStart_system(long start_system);

    public int getStart_system_jumps();

    public void setStart_system_jumps(int start_system_jumps);
//Custom code, do not change this line
}
