/*
 * View_systemtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.logicview;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import eve.interfaces.logicview.IView_systemtrade;
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
 * View class View_systemtrade
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class View_systemtrade extends eve.view.eView_systemtrade implements IView_systemtrade {

//Custom code, do not change this line
    public static final String SQLSelectAll4Startingsystem = "select starts.id AS startsystem_id, sj.jumps AS startsystem_jumps, view_systemtrade.* from view_systemtrade " + 
        "inner join systemjumps sj on view_systemtrade.sell_system = sj.system_end " +
        "inner join system starts on sj.system_start = starts.id " + 
        "where starts.id = :system.id:";
    
    public long start_system;
    public int start_system_jumps;
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty View_systemtrade entity
     */
    public View_systemtrade() {
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
