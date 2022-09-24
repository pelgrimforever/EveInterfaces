/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
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

public interface IView_bpmaterial extends View {

    public static byte BP = 1;
    public static byte MATERIAL = 2;
    public static byte AMOUNT = 3;
    public static byte CATEGORY = 4;
    public static byte TYPEGROUPID = 5;
    public static byte TYPEGROUPNAME = 6;
    public static byte NAME = 7;
    public static byte AVERAGE = 8;

    public static final int SIZE_BP = 19;
    public static final int SIZE_MATERIAL = 19;
    public static final int SIZE_AMOUNT = 19;
    public static final int SIZE_CATEGORY = 19;
    public static final int SIZE_TYPEGROUPID = 19;
    public static final int SIZE_TYPEGROUPNAME = 100;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_AVERAGE = 17;
    public static final String[] fieldnames = { "bp", "material", "amount", "category", "typegroupid", "typegroupname", "name", "average" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

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
     * @return average value
     */
    public double getAverage();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
