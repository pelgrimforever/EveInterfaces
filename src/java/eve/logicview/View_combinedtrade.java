/*
 * View_combinedtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.logicview;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import eve.interfaces.logicview.IView_combinedtrade;
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
 * View class View_combinedtrade
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class View_combinedtrade extends eve.view.eView_combinedtrade implements IView_combinedtrade {

//Custom code, do not change this line
    public static final String SQLSelectAll4Startingsystem = "select starts.id AS startsystem_id, sj.jumps AS startsystem_jumps, view_combinedtrade.* from view_combinedtrade " + 
        "inner join systemjumps sj on view_combinedtrade.sell_systemid = sj.system_end " +
        "inner join system starts on sj.system_start = starts.id " + 
        "where starts.id = :system.id:";
    
    public static final String SQLSelect4Startendsystem = "select starts.id AS startsystem_id, sj.jumps AS startsystem_jumps, view_combinedtrade.* from view_combinedtrade " + 
        "inner join systemjumps sj on view_combinedtrade.sell_systemid = sj.system_end " +
        "inner join system starts on sj.system_start = starts.id " + 
        "where starts.id = :system.id: and view_combinedtrade.sell_systemid = :startsystemid: and view_combinedtrade.buy_systemid = :endsystemid:";
    
    public long start_system;
    public int start_system_jumps;
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty View_combinedtrade entity
     */
    public View_combinedtrade() {
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
