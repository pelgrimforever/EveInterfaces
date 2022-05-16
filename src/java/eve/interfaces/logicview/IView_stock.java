/*
 * IView_stock.java
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
 * View Interface IView_stock
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_stock extends View {

    public static byte USERNAME = 1;
    public static byte EVETYPE = 2;
    public static byte AMOUNT = 3;
    public static byte NAME = 4;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_AMOUNT = 19;
    public static final int SIZE_NAME = 100;
    public static final String[] fieldnames = { "username", "evetype", "amount", "name" };

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
     * @return evetype value
     */
    public long getEvetype();

    /**
     * 
     * @return amount value
     */
    public long getAmount();

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    
//Custom code, do not change this line
//Put custom functions here
//Custom code, do not change this line
}
