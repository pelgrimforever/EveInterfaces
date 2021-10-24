/*
 * IView_stocktrade_system.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:40
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
 * View Interface IView_stocktrade_system
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_stocktrade_system extends View {

    public static byte USERNAME = 1;
    public static byte ID = 2;
    public static byte NAME = 3;
    public static byte SELLPRICE = 4;
    public static byte TOTALVOLUME = 5;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 30;
    public static final int SIZE_SELLPRICE = 17;
    public static final int SIZE_TOTALVOLUME = 17;
    public static final String[] fieldnames = { "username", "id", "name", "sellprice", "totalvolume" };

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
     * @return id value
     */
    public long getId();

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * 
     * @return sellprice value
     */
    public double getSellprice();

    /**
     * 
     * @return totalvolume value
     */
    public double getTotalvolume();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}