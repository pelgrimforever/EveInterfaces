/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

public interface IView_shipfitorder extends View {

    public static byte EVETYPENAME = 1;
    public static byte PACKAGED_VOLUME = 2;
    public static byte USERNAME = 3;
    public static byte SHIPNAME = 4;
    public static byte EVETYPE = 5;
    public static byte AMOUNTWANTED = 6;
    public static byte AMOUNTINSTOCK = 7;
    public static byte AMOUNTPLANNED = 8;

    public static final int SIZE_EVETYPENAME = 100;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_SHIPNAME = 50;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_AMOUNTWANTED = 10;
    public static final int SIZE_AMOUNTINSTOCK = 10;
    public static final int SIZE_AMOUNTPLANNED = 19;
    public static final String[] fieldnames = { "evetypename", "packaged_volume", "username", "shipname", "evetype", "amountwanted", "amountinstock", "amountplanned" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return evetypename value
     */
    public java.lang.String getEvetypename();

    /**
     * 
     * @return packaged_volume value
     */
    public double getPackaged_volume();

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername();

    /**
     * 
     * @return shipname value
     */
    public java.lang.String getShipname();

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

    /**
     * 
     * @return amountwanted value
     */
    public int getAmountwanted();

    /**
     * 
     * @return amountinstock value
     */
    public int getAmountinstock();

    /**
     * 
     * @return amountplanned value
     */
    public long getAmountplanned();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
