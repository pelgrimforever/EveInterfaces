/*
 * IView_userbpmaterial.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.1.2022 21:46
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
 * View Interface IView_userbpmaterial
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_userbpmaterial extends View {

    public static byte USERNAME = 1;
    public static byte SERIALNUMBER = 2;
    public static byte BP = 3;
    public static byte MATERIAL = 4;
    public static byte AMOUNT = 5;
    public static byte CATEGORY = 6;
    public static byte TYPEGROUPID = 7;
    public static byte TYPEGROUPNAME = 8;
    public static byte NAME = 9;
    public static byte MARKETAVERAGE = 10;
    public static byte MATERIALINPUTAVERAGE = 11;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_SERIALNUMBER = 10;
    public static final int SIZE_BP = 19;
    public static final int SIZE_MATERIAL = 19;
    public static final int SIZE_AMOUNT = 19;
    public static final int SIZE_CATEGORY = 19;
    public static final int SIZE_TYPEGROUPID = 19;
    public static final int SIZE_TYPEGROUPNAME = 100;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_MARKETAVERAGE = 17;
    public static final int SIZE_MATERIALINPUTAVERAGE = 17;
    public static final String[] fieldnames = { "username", "serialnumber", "bp", "material", "amount", "category", "typegroupid", "typegroupname", "name", "marketaverage", "materialinputaverage" };

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
     * @return serialnumber value
     */
    public int getSerialnumber();

    /**
     * 
     * @return bp value
     */
    public long getBp();

    /**
     * 
     * @return material value
     */
    public long getMaterial();

    /**
     * 
     * @return amount value
     */
    public long getAmount();

    /**
     * 
     * @return category value
     */
    public long getCategory();

    /**
     * 
     * @return typegroupid value
     */
    public long getTypegroupid();

    /**
     * 
     * @return typegroupname value
     */
    public java.lang.String getTypegroupname();

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * 
     * @return marketaverage value
     */
    public double getMarketaverage();

    /**
     * 
     * @return materialinputaverage value
     */
    public double getMaterialinputaverage();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
