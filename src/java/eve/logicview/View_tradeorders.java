/*
 * View_tradeorders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.logicview;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import eve.interfaces.logicview.IView_tradeorders;
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
 * View class View_tradeorders
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class View_tradeorders extends eve.view.eView_tradeorders implements IView_tradeorders {

//Custom code, do not change this line
    public final static String SQLSelect4tradevalues = "select * from view_tradeorders " +
        "where sell_packaged_volume <= :max_cargovolume: and security_island = :security_island.id: and " +
        "buy_totalprice * :net_perc: - sell_totalprice > :min_profit:";
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty View_tradeorders entity
     */
    public View_tradeorders() {
    }
    
//Custom code, do not change this line
//Custom code, do not change this line
}
