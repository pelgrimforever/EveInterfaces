/*
 * IView_shipfitmodule.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
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
 * View Interface IView_shipfitmodule
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_shipfitmodule extends View {

    public static byte MODULENAME = 1;
    public static byte PACKAGED_VOLUME = 2;
    public static byte USERNAME = 3;
    public static byte SHIPNAME = 4;
    public static byte MODULETYPE = 5;
    public static byte AMOUNT = 6;

    public static final int SIZE_MODULENAME = 100;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_SHIPNAME = 50;
    public static final int SIZE_MODULETYPE = 19;
    public static final int SIZE_AMOUNT = 10;
    public static final String[] fieldnames = { "modulename", "packaged_volume", "username", "shipname", "moduletype", "amount" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return modulename value
     */
    public java.lang.String getModulename();

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
     * @return moduletype value
     */
    public long getModuletype();

    /**
     * 
     * @return amount value
     */
    public int getAmount();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
