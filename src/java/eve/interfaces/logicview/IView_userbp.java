/*
 * IView_userbp.java
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
 * View Interface IView_userbp
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_userbp extends View {

    public static byte BLUEPRINTNAME = 1;
    public static byte TYPEGROUPNAME = 2;
    public static byte USERNAME = 3;
    public static byte BP = 4;
    public static byte SERIALNUMBER = 5;
    public static byte ORIGINAL = 6;
    public static byte MATERIALEFFICIENCY = 7;
    public static byte AMOUNTPRODUCED = 8;
    public static byte TOTALAMOUNT = 9;
    public static byte BPPRICE = 10;
    public static byte RESEARCHCOST = 11;
    public static byte STATIONFEE = 12;

    public static final int SIZE_BLUEPRINTNAME = 100;
    public static final int SIZE_TYPEGROUPNAME = 100;
    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_BP = 19;
    public static final int SIZE_SERIALNUMBER = 10;
    public static final int SIZE_ORIGINAL = 1;
    public static final int SIZE_MATERIALEFFICIENCY = 5;
    public static final int SIZE_AMOUNTPRODUCED = 10;
    public static final int SIZE_TOTALAMOUNT = 10;
    public static final int SIZE_BPPRICE = 17;
    public static final int SIZE_RESEARCHCOST = 17;
    public static final int SIZE_STATIONFEE = 17;
    public static final String[] fieldnames = { "blueprintname", "typegroupname", "username", "bp", "serialnumber", "original", "materialefficiency", "amountproduced", "totalamount", "bpprice", "researchcost", "stationfee" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return blueprintname value
     */
    public java.lang.String getBlueprintname();

    /**
     * 
     * @return typegroupname value
     */
    public java.lang.String getTypegroupname();

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername();

    /**
     * 
     * @return bp value
     */
    public long getBp();

    /**
     * 
     * @return serialnumber value
     */
    public int getSerialnumber();

    /**
     * 
     * @return original value
     */
    public boolean getOriginal();

    /**
     * 
     * @return materialefficiency value
     */
    public int getMaterialefficiency();

    /**
     * 
     * @return amountproduced value
     */
    public int getAmountproduced();

    /**
     * 
     * @return totalamount value
     */
    public int getTotalamount();

    /**
     * 
     * @return bpprice value
     */
    public double getBpprice();

    /**
     * 
     * @return researchcost value
     */
    public double getResearchcost();

    /**
     * 
     * @return stationfee value
     */
    public double getStationfee();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
