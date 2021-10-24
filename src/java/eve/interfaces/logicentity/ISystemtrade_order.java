/*
 * ISystemtrade_order.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:40
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
 * Entity Interface ISystemtrade_order
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ISystemtrade_order extends LogicEntity {

	public ISystemtrade_orderPK getPrimaryKey();
	
    public static short SELL_SYSTEM = 1;
    public static short BUY_SYSTEM = 2;
    public static short SELL_ORDER = 3;
    public static short BUY_ORDER = 4;
    public static short AMOUNT = 5;
    public static short SELLPRICE = 6;
    public static short BUYPRICE = 7;
    public static short PROFIT = 8;
    public static short CARGOVOLUME = 9;

    public static final int SIZE_SELL_SYSTEM = 19;
    public static final int SIZE_BUY_SYSTEM = 19;
    public static final int SIZE_SELL_ORDER = 19;
    public static final int SIZE_BUY_ORDER = 19;
    public static final int SIZE_AMOUNT = 19;
    public static final int SIZE_SELLPRICE = 17;
    public static final int SIZE_BUYPRICE = 17;
    public static final int SIZE_PROFIT = 17;
    public static final int SIZE_CARGOVOLUME = 17;
    public static final String[] fieldnames = { "sell_system", "buy_system", "sell_order", "buy_order", "amount", "sellprice", "buyprice", "profit", "cargovolume" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double };

    public static final String[] ordersBuy_orderPKfields = { "orders.id" };
    public static final String[] ordersBuy_orderFKfields = { "systemtrade_order.buy_order" };
    public static final String[] ordersSell_orderPKfields = { "orders.id" };
    public static final String[] ordersSell_orderFKfields = { "systemtrade_order.sell_order" };
    public static final String[] systemtradePKfields = { "systemtrade.buy_system", "systemtrade.sell_system" };
    public static final String[] systemtradeFKfields = { "systemtrade_order.buy_system", "systemtrade_order.sell_system" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return amount value
     */
    public long getAmount();

    /**
     * set amount value
     * @param amount: new value
     */
    public void setAmount(long amount);

    /**
     * 
     * @return sellprice value
     */
    public double getSellprice();

    /**
     * set sellprice value
     * @param sellprice: new value
     */
    public void setSellprice(double sellprice);

    /**
     * 
     * @return buyprice value
     */
    public double getBuyprice();

    /**
     * set buyprice value
     * @param buyprice: new value
     */
    public void setBuyprice(double buyprice);

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
     * @return cargovolume value
     */
    public double getCargovolume();

    /**
     * set cargovolume value
     * @param cargovolume: new value
     */
    public void setCargovolume(double cargovolume);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
