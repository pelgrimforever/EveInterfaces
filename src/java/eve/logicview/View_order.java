/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.logicview;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import eve.interfaces.logicview.IView_order;
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

public class View_order extends eve.view.eView_order implements IView_order {

//Custom code, do not change this line
    private int start_system_jumps = 0;
    private int start_system_jumpslowsec = 0;
    private int start_system_jumpsnullsec = 0;
//Custom code, do not change this line

    public View_order() {
    }
    
//Custom code, do not change this line
    public int getStart_system_jumps() {
        return start_system_jumps;
    }

    public void setStart_system_jumps(int start_system_jumps) {
        this.start_system_jumps = start_system_jumps;
    }

    public int getStart_system_jumpslowsec() {
        return start_system_jumpslowsec;
    }

    public void setStart_system_jumpslowsec(int start_system_jumpslowsec) {
        this.start_system_jumpslowsec = start_system_jumpslowsec;
    }

    public int getStart_system_jumpsnullsec() {
        return start_system_jumpsnullsec;
    }

    public void setStart_system_jumpsnullsec(int start_system_jumpsnullsec) {
        this.start_system_jumpsnullsec = start_system_jumpsnullsec;
    }
//Custom code, do not change this line
}
