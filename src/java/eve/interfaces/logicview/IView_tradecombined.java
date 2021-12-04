/*
 * IView_tradecombined.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.11.2021 14:51
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
 * View Interface IView_tradecombined
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_tradecombined extends View {

    public static byte SELL_REGIONID = 1;
    public static byte SELL_REGIONNAME = 2;
    public static byte SELL_SYSTEMID = 3;
    public static byte SELL_SYSTEMNAME = 4;
    public static byte EVETYPE_ID = 5;
    public static byte EVETYPE_NAME = 6;
    public static byte PACKAGED_VOLUME = 7;
    public static byte ORDERS = 8;
    public static byte TOTALAMOUNT = 9;
    public static byte BUY_ORDER_TOTAL = 10;
    public static byte SELL_ORDER_TOTAL = 11;
    public static byte TOTALPROFIT = 12;
    public static byte BUY_SYSTEMID = 13;
    public static byte BUY_SYSTEMNAME = 14;
    public static byte TRADE_JUMPS = 15;

    public static final int SIZE_SELL_REGIONID = 19;
    public static final int SIZE_SELL_REGIONNAME = 30;
    public static final int SIZE_SELL_SYSTEMID = 19;
    public static final int SIZE_SELL_SYSTEMNAME = 30;
    public static final int SIZE_EVETYPE_ID = 19;
    public static final int SIZE_EVETYPE_NAME = 100;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_ORDERS = 19;
    public static final int SIZE_TOTALAMOUNT = 131089;
    public static final int SIZE_BUY_ORDER_TOTAL = 17;
    public static final int SIZE_SELL_ORDER_TOTAL = 17;
    public static final int SIZE_TOTALPROFIT = 17;
    public static final int SIZE_BUY_SYSTEMID = 19;
    public static final int SIZE_BUY_SYSTEMNAME = 30;
    public static final int SIZE_TRADE_JUMPS = 10;
    public static final String[] fieldnames = { "sell_regionid", "sell_regionname", "sell_systemid", "sell_systemname", "evetype_id", "evetype_name", "packaged_volume", "orders", "totalamount", "buy_order_total", "sell_order_total", "totalprofit", "buy_systemid", "buy_systemname", "trade_jumps" };

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
     * @return orders value
     */
    public long getOrders();

    /**
     * 
     * @return totalamount value
     */
    public float getTotalamount();

    /**
     * 
     * @return buy_order_total value
     */
    public double getBuy_order_total();

    /**
     * 
     * @return sell_order_total value
     */
    public double getSell_order_total();

    /**
     * 
     * @return totalprofit value
     */
    public double getTotalprofit();

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

    
//Custom code, do not change this line
//Put custom functions here
    public long getStart_system();

    public void setStart_system(long start_system);

    public int getStart_system_jumps();

    public void setStart_system_jumps(int start_system_jumps);
//Custom code, do not change this line
}
