/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

public class View_trade extends eve.view.eView_trade implements IView_trade {

//Custom code, do not change this line
    public long start_system;
    public int start_system_jumps;
//Custom code, do not change this line

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
