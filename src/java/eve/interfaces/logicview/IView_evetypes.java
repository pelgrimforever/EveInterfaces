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

public interface IView_evetypes extends View {

    public static byte CATEGORY = 1;
    public static byte TYPEGROUPID = 2;
    public static byte TYPEGROUPNAME = 3;
    public static byte ID = 4;
    public static byte NAME = 5;
    public static byte CONFIGUREDBP = 6;

    public static final int SIZE_CATEGORY = 19;
    public static final int SIZE_TYPEGROUPID = 19;
    public static final int SIZE_TYPEGROUPNAME = 100;
    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_CONFIGUREDBP = 1;
    public static final String[] fieldnames = { "category", "typegroupid", "typegroupname", "id", "name", "configuredbp" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

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
     * @return configuredbp value
     */
    public boolean getConfiguredbp();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
