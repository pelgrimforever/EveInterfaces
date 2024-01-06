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

public interface IView_security_island_systemcount extends View {

    public static byte ID = 1;
    public static byte NAME = 2;
    public static byte SYSTEMS = 3;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 30;
    public static final int SIZE_SYSTEMS = 19;
    public static final String[] fieldnames = { "id", "name", "systems" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

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
     * @return systems value
     */
    public long getSystems();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
