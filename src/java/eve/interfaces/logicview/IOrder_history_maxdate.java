/*
 * IOrder_history_maxdate.java
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
 * View Interface IOrder_history_maxdate
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IOrder_history_maxdate extends View {

    public static byte MAXDATE = 1;

    public static final int SIZE_MAXDATE = 13;
    public static final String[] fieldnames = { "maxdate" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return maxdate value
     */
    public java.sql.Date getMaxdate();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
