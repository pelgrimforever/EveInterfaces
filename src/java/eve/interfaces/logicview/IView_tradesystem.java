/*
 * IView_tradesystem.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
 * View Interface IView_tradesystem
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_tradesystem extends View {

    public static byte SELL_REGIONID = 1;
    public static byte SELL_REGIONNAME = 2;
    public static byte SELL_SYSTEMID = 3;
    public static byte SELL_SYSTEMNAME = 4;
    public static byte ORDERS = 5;
    public static byte BUY_TOTAL = 6;
    public static byte SELL_TOTAL = 7;
    public static byte TOTALPROFIT = 8;
    public static byte TOTALVOLUME = 9;
    public static byte BUY_SYSTEMID = 10;
    public static byte BUY_SYSTEMNAME = 11;
    public static byte TRADE_JUMPS = 12;
    public static byte TRADE_JUMPSLOWSEC = 13;
    public static byte TRADE_JUMPSNULLSEC = 14;

    public static final int SIZE_SELL_REGIONID = 19;
    public static final int SIZE_SELL_REGIONNAME = 30;
    public static final int SIZE_SELL_SYSTEMID = 19;
    public static final int SIZE_SELL_SYSTEMNAME = 30;
    public static final int SIZE_ORDERS = 131089;
    public static final int SIZE_BUY_TOTAL = 17;
    public static final int SIZE_SELL_TOTAL = 17;
    public static final int SIZE_TOTALPROFIT = 17;
    public static final int SIZE_TOTALVOLUME = 17;
    public static final int SIZE_BUY_SYSTEMID = 19;
    public static final int SIZE_BUY_SYSTEMNAME = 30;
    public static final int SIZE_TRADE_JUMPS = 10;
    public static final int SIZE_TRADE_JUMPSLOWSEC = 10;
    public static final int SIZE_TRADE_JUMPSNULLSEC = 10;
    public static final String[] fieldnames = { "sell_regionid", "sell_regionname", "sell_systemid", "sell_systemname", "orders", "buy_total", "sell_total", "totalprofit", "totalvolume", "buy_systemid", "buy_systemname", "trade_jumps", "trade_jumpslowsec", "trade_jumpsnullsec" };

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
     * @return orders value
     */
    public float getOrders();

    /**
     * 
     * @return buy_total value
     */
    public double getBuy_total();

    /**
     * 
     * @return sell_total value
     */
    public double getSell_total();

    /**
     * 
     * @return totalprofit value
     */
    public double getTotalprofit();

    /**
     * 
     * @return totalvolume value
     */
    public double getTotalvolume();

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

    
//Custom code, do not change this line
//Put custom functions here
    public long getStart_system();

    public void setStart_system(long start_system);

    public int getStart_system_jumps();

    public void setStart_system_jumps(int start_system_jumps);

//Custom code, do not change this line
}
