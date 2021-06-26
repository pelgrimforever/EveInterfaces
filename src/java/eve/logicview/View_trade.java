/*
 * View_trade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.logicview;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import eve.interfaces.logicview.IView_trade;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 * View class View_trade
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class View_trade extends eve.view.eView_trade implements IView_trade {

//Custom code, do not change this line
    public static final String SQLSelectAll4Startingsystem = "select starts.id AS startsystem_id, sj.jumps AS startsystem_jumps, view_trade.* from view_trade " + 
        "inner join systemjumps sj on view_trade.sell_systemid = sj.system_end " +
        "inner join system starts on sj.system_start = starts.id " + 
        "where starts.id = :system.id:";
    
    public long start_system;
    public int start_system_jumps;
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty View_trade entity
     */
    public View_trade() {
    }
    
//Custom code, do not change this line
    public long getStart_system() {
        return start_system;
    }

    public void setStart_system(long start_system) {
        this.start_system = start_system;
    }

    public int getStart_system_jumps() {
        return start_system_jumps;
    }

    public void setStart_system_jumps(int start_system_jumps) {
        this.start_system_jumps = start_system_jumps;
    }
//Custom code, do not change this line
}
