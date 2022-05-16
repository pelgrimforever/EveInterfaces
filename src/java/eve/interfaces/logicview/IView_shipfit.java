/*
 * IView_shipfit.java
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
 * View Interface IView_shipfit
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_shipfit extends View {

    public static byte SHIPTYPE = 1;
    public static byte PACKAGED_VOLUME = 2;
    public static byte USERNAME = 3;
    public static byte SHIPNAME = 4;
    public static byte EVETYPE = 5;

    public static final int SIZE_SHIPTYPE = 100;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_SHIPNAME = 50;
    public static final int SIZE_EVETYPE = 19;
    public static final String[] fieldnames = { "shiptype", "packaged_volume", "username", "shipname", "evetype" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return shiptype value
     */
    public java.lang.String getShiptype();

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

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
