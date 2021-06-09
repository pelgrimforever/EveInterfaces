/*
 * Market_group.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IMarket_groupPK;
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
 * Entity class Market_group
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Market_group extends eve.entity.eMarket_group implements IMarket_group {

    public static final String SQLSelect = "select market_group.* from market_group";
    public static final String SQLWheremarket_groupParent_id = "parent_id = :market_group.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4market_groupParent_id = "select * from market_group where " + SQLWheremarket_groupParent_id + OrderBy;
    public static final String SQLDelete4market_groupParent_id = "delete from market_group where " + SQLWheremarket_groupParent_id;

    /**
     * Constructor
     * Creates an empty Market_group entity
     */
    public Market_group() {
    }
    
    /**
     * Constructor
     * build an empty Market_group entity with initialized field values
     */
    public Market_group(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Market_group entity with initialized Primarykey parameter
     * @param market_groupPK: Market_group Primarykey
     */
    public Market_group(Market_groupPK market_groupPK) {
        super(market_groupPK);
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
