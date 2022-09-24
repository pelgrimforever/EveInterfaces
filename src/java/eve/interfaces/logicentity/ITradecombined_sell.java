/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
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

public interface ITradecombined_sell extends LogicEntity {

    public ITradecombined_sellPK getPrimaryKey();
	
    public static short SELL_SYSTEM = 1;
    public static short BUY_SYSTEM = 2;
    public static short EVETYPE = 3;
    public static short BUY_ORDER_ID = 4;
    public static short SELL_ORDER_ID = 5;
    public static short AMOUNT = 6;
    public static short BUY_ORDER_VALUE = 7;
    public static short SELL_ORDER_VALUE = 8;
    public static short PROFIT = 9;

    public static final int SIZE_SELL_SYSTEM = 19;
    public static final int SIZE_BUY_SYSTEM = 19;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_BUY_ORDER_ID = 19;
    public static final int SIZE_SELL_ORDER_ID = 19;
    public static final int SIZE_AMOUNT = 19;
    public static final int SIZE_BUY_ORDER_VALUE = 17;
    public static final int SIZE_SELL_ORDER_VALUE = 17;
    public static final int SIZE_PROFIT = 17;
    public static final String[] fieldnames = { "sell_system", "buy_system", "evetype", "buy_order_id", "sell_order_id", "amount", "buy_order_value", "sell_order_value", "profit" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double };

    public static final String[] ordersBuy_order_idPKfields = { "orders.id" };
    public static final String[] ordersBuy_order_idFKfields = { "tradecombined_sell.buy_order_id" };
    public static final String[] ordersSell_order_idPKfields = { "orders.id" };
    public static final String[] ordersSell_order_idFKfields = { "tradecombined_sell.sell_order_id" };
    public static final String[] tradecombinedPKfields = { "tradecombined.sell_system", "tradecombined.buy_system", "tradecombined.evetype" };
    public static final String[] tradecombinedFKfields = { "tradecombined_sell.sell_system", "tradecombined_sell.buy_system", "tradecombined_sell.evetype" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public long getAmount();

    public void setAmount(long amount);

    public double getBuy_order_value();

    public void setBuy_order_value(double buy_order_value);

    public double getSell_order_value();

    public void setSell_order_value(double sell_order_value);

    public double getProfit();

    public void setProfit(double profit);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
