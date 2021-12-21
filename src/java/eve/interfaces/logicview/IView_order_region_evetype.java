/*
 * IView_order_region_evetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:45
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
 * View Interface IView_order_region_evetype
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_order_region_evetype extends View {

    public static byte REGION = 1;
    public static byte EVETYPE = 2;

    public static final int SIZE_REGION = 19;
    public static final int SIZE_EVETYPE = 19;
    public static final String[] fieldnames = { "region", "evetype" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return region value
     */
    public long getRegion();

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
