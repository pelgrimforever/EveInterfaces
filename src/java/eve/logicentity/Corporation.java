/*
 * Corporation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ICorporationPK;
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
 * Entity class Corporation
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Corporation extends eve.entity.eCorporation implements ICorporation {

    public static final String SQLSelect = "select corporation.* from corporation";
    public static final String SQLWherestation = "home_station = :station.id:";
    public static final String SQLWherefaction = "faction = :faction.id:";
    public static final String SQLWherealliance = "alliance = :alliance.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4station = "select * from corporation where " + SQLWherestation + OrderBy;
    public static final String SQLDelete4station = "delete from corporation where " + SQLWherestation;
    public static final String SQLSelect4faction = "select * from corporation where " + SQLWherefaction + OrderBy;
    public static final String SQLDelete4faction = "delete from corporation where " + SQLWherefaction;
    public static final String SQLSelect4alliance = "select * from corporation where " + SQLWherealliance + OrderBy;
    public static final String SQLDelete4alliance = "delete from corporation where " + SQLWherealliance;

    /**
     * Constructor
     * Creates an empty Corporation entity
     */
    public Corporation() {
    }
    
    /**
     * Constructor
     * build an empty Corporation entity with initialized field values
     */
    public Corporation(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Corporation entity with initialized Primarykey parameter
     * @param corporationPK: Corporation Primarykey
     */
    public Corporation(CorporationPK corporationPK) {
        super(corporationPK);
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
