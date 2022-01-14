/*
 * IView_trade_systemsevetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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
 * View Interface IView_trade_systemsevetype
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_trade_systemsevetype extends View {

    public static byte SYSTEMSELL = 1;
    public static byte SYSTEMBUY = 2;
    public static byte EVETYPE = 3;
    public static byte JUMPS = 4;
    public static byte JUMPSLOWSEC = 5;
    public static byte JUMPSNULLSEC = 6;

    public static final int SIZE_SYSTEMSELL = 19;
    public static final int SIZE_SYSTEMBUY = 19;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_JUMPS = 10;
    public static final int SIZE_JUMPSLOWSEC = 10;
    public static final int SIZE_JUMPSNULLSEC = 10;
    public static final String[] fieldnames = { "systemsell", "systembuy", "evetype", "jumps", "jumpslowsec", "jumpsnullsec" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return systemsell value
     */
    public long getSystemsell();

    /**
     * 
     * @return systembuy value
     */
    public long getSystembuy();

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

    /**
     * 
     * @return jumps value
     */
    public int getJumps();

    /**
     * 
     * @return jumpslowsec value
     */
    public int getJumpslowsec();

    /**
     * 
     * @return jumpsnullsec value
     */
    public int getJumpsnullsec();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
