/*
 * IView_materialinput.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.0.2022 17:52
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
 * View Interface IView_materialinput
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_materialinput extends View {

    public static byte USERNAME = 1;
    public static byte EVETYPE = 2;
    public static byte ADDTIMESTAMP = 3;
    public static byte AMOUNT = 4;
    public static byte UNITPRICE = 5;
    public static byte USEDAMOUNT = 6;
    public static byte NAME = 7;
    public static byte PACKAGED_VOLUME = 8;
    public static byte AVERAGE = 9;
    public static byte HIGHEST = 10;
    public static byte LOWEST = 11;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_ADDTIMESTAMP = 35;
    public static final int SIZE_AMOUNT = 19;
    public static final int SIZE_UNITPRICE = 17;
    public static final int SIZE_USEDAMOUNT = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_AVERAGE = 17;
    public static final int SIZE_HIGHEST = 17;
    public static final int SIZE_LOWEST = 17;
    public static final String[] fieldnames = { "username", "evetype", "addtimestamp", "amount", "unitprice", "usedamount", "name", "packaged_volume", "average", "highest", "lowest" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername();

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

    /**
     * 
     * @return addtimestamp value
     */
    public java.sql.Timestamp getAddtimestamp();

    /**
     * 
     * @return amount value
     */
    public long getAmount();

    /**
     * 
     * @return unitprice value
     */
    public double getUnitprice();

    /**
     * 
     * @return usedamount value
     */
    public long getUsedamount();

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * 
     * @return packaged_volume value
     */
    public double getPackaged_volume();

    /**
     * 
     * @return average value
     */
    public double getAverage();

    /**
     * 
     * @return highest value
     */
    public double getHighest();

    /**
     * 
     * @return lowest value
     */
    public double getLowest();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
