/*
 * View_order.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
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

/**
 * View class View_order
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class View_order extends eve.view.eView_order implements IView_order {

//Custom code, do not change this line
    public static final String SQLSelectOne = SQLSelectAll + " where view_order.id = :orders.id:";

    public static final String SQLorderbyprice_asc = " order by view_order.price asc";
    public static final String SQLorderbyprice_desc = " order by view_order.price desc";
    public static final String SQLSelect4Evetypebuy = SQLSelectAll + " where view_order.evetype = :evetype.id: and view_order.is_buy_order" + SQLorderbyprice_desc;
    public static final String SQLSelect4Evetypesell = SQLSelectAll + " where view_order.evetype = :evetype.id: and not view_order.is_buy_order" + SQLorderbyprice_asc;
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty View_order entity
     */
    public View_order() {
    }
    
//Custom code, do not change this line
//Custom code, do not change this line
}
