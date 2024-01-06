/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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
    public static short JUMPSLOWSEC = 13;
    public static short JUMPSNULLSEC = 14;

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
    public static final int SIZE_JUMPSLOWSEC = 10;
    public static final int SIZE_JUMPSNULLSEC = 10;
    public static final String[] fieldnames = { "sell_order_id", "buy_order_id", "total_volume", "buy_order_value", "sell_order_value", "profit", "jumps", "runs", "total_jumps", "profit_per_jump", "singlerun_profit_per_jump", "maxunits_per_run", "jumpslowsec", "jumpsnullsec" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int, Datatypes.type_double, Datatypes.type_double, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int };

    public static final String[] ordersSell_order_idPKfields = { "orders.id" };
    public static final String[] ordersSell_order_idFKfields = { "trade.sell_order_id" };
    public static final String[] ordersBuy_order_idPKfields = { "orders.id" };
    public static final String[] ordersBuy_order_idFKfields = { "trade.buy_order_id" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public double getTotal_volume();

    public void setTotal_volume(double total_volume);

    public double getBuy_order_value();

    public void setBuy_order_value(double buy_order_value);

    public double getSell_order_value();

    public void setSell_order_value(double sell_order_value);

    public double getProfit();

    public void setProfit(double profit);

    public int getJumps();

    public void setJumps(int jumps);

    public int getRuns();

    public void setRuns(int runs);

    public int getTotal_jumps();

    public void setTotal_jumps(int total_jumps);

    public double getProfit_per_jump();

    public void setProfit_per_jump(double profit_per_jump);

    public double getSinglerun_profit_per_jump();

    public void setSinglerun_profit_per_jump(double singlerun_profit_per_jump);

    public int getMaxunits_per_run();

    public void setMaxunits_per_run(int maxunits_per_run);

    public int getJumpslowsec();

    public void setJumpslowsec(int jumpslowsec);

    public int getJumpsnullsec();

    public void setJumpsnullsec(int jumpsnullsec);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
