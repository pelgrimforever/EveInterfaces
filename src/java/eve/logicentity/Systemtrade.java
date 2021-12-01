/*
 * Systemtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ISystemtradePK;
import eve.interfaces.logicentity.*;
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
 * Entity class Systemtrade
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Systemtrade extends eve.entity.eSystemtrade implements ISystemtrade {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Systemtrade entity
     */
    public Systemtrade() {
    }
    
    /**
     * Constructor
     * build an empty Systemtrade entity with initialized field values
     */
    public Systemtrade(long sell_system, long buy_system) {
        super(sell_system, buy_system);
    }

    /**
     * Constructor
     * build an empty Systemtrade entity with initialized Primarykey parameter
     * @param systemtradePK: Systemtrade Primarykey
     */
    public Systemtrade(SystemtradePK systemtradePK) {
        super(systemtradePK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
