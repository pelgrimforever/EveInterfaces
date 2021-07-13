/*
 * ITrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
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
 * Entity Interface ITrade
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ITrade extends LogicEntity {

	public ITradePK getPrimaryKey();
	
    public static short SELL_ORDER_ID = 1;
    public static short BUY_ORDER_ID = 2;
    public static short TOTAL_VOLUME = 3;
    public static short BUY_ORDER_VALUE = 4;
    public static short SELL_ORDER_VALUE = 5;
    public static short PROFIT = 6;
    public static short JUMPS = 7;
    public static short RUNS = 8;
    public static short TOTAL_JUMPS = 9;
    public static short PROFIT_PER_JUMP = 10;
    public static short SINGLERUN_PROFIT_PER_JUMP = 11;
    public static short MAXUNITS_PER_RUN = 12;

    public static final int SIZE_SELL_ORDER_ID = 19;
    public static final int SIZE_BUY_ORDER_ID = 19;
    public static final int SIZE_TOTAL_VOLUME = 17;
    public static final int SIZE_BUY_ORDER_VALUE = 17;
    public static final int SIZE_SELL_ORDER_VALUE = 17;
    public static final int SIZE_PROFIT = 17;
    public static final int SIZE_JUMPS = 10;
    public static final int SIZE_RUNS = 10;
    public static final int SIZE_TOTAL_JUMPS = 10;
    public static final int SIZE_PROFIT_PER_JUMP = 17;
    public static final int SIZE_SINGLERUN_PROFIT_PER_JUMP = 17;
    public static final int SIZE_MAXUNITS_PER_RUN = 10;
    public static final String[] fieldnames = { "sell_order_id", "buy_order_id", "total_volume", "buy_order_value", "sell_order_value", "profit", "jumps", "runs", "total_jumps", "profit_per_jump", "singlerun_profit_per_jump", "maxunits_per_run" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int, Datatypes.type_double, Datatypes.type_double, Datatypes.type_int };

    public static final String[] ordersSell_order_idPKfields = { "orders.id" };
    public static final String[] ordersSell_order_idFKfields = { "trade.sell_order_id" };
    public static final String[] ordersBuy_order_idPKfields = { "orders.id" };
    public static final String[] ordersBuy_order_idFKfields = { "trade.buy_order_id" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return total_volume value
     */
    public double getTotal_volume();

    /**
     * set total_volume value
     * @param total_volume: new value
     */
    public void setTotal_volume(double total_volume);

    /**
     * 
     * @return buy_order_value value
     */
    public double getBuy_order_value();

    /**
     * set buy_order_value value
     * @param buy_order_value: new value
     */
    public void setBuy_order_value(double buy_order_value);

    /**
     * 
     * @return sell_order_value value
     */
    public double getSell_order_value();

    /**
     * set sell_order_value value
     * @param sell_order_value: new value
     */
    public void setSell_order_value(double sell_order_value);

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
     * @return jumps value
     */
    public int getJumps();

    /**
     * set jumps value
     * @param jumps: new value
     */
    public void setJumps(int jumps);

    /**
     * 
     * @return runs value
     */
    public int getRuns();

    /**
     * set runs value
     * @param runs: new value
     */
    public void setRuns(int runs);

    /**
     * 
     * @return total_jumps value
     */
    public int getTotal_jumps();

    /**
     * set total_jumps value
     * @param total_jumps: new value
     */
    public void setTotal_jumps(int total_jumps);

    /**
     * 
     * @return profit_per_jump value
     */
    public double getProfit_per_jump();

    /**
     * set profit_per_jump value
     * @param profit_per_jump: new value
     */
    public void setProfit_per_jump(double profit_per_jump);

    /**
     * 
     * @return singlerun_profit_per_jump value
     */
    public double getSinglerun_profit_per_jump();

    /**
     * set singlerun_profit_per_jump value
     * @param singlerun_profit_per_jump: new value
     */
    public void setSinglerun_profit_per_jump(double singlerun_profit_per_jump);

    /**
     * 
     * @return maxunits_per_run value
     */
    public int getMaxunits_per_run();

    /**
     * set maxunits_per_run value
     * @param maxunits_per_run: new value
     */
    public void setMaxunits_per_run(int maxunits_per_run);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
