/*
 * Faction.java
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
import eve.interfaces.entity.pk.IFactionPK;
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
 * Entity class Faction
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Faction extends eve.entity.eFaction implements IFaction {

    public static final String SQLSelect = "select faction.* from faction";
    public static final String SQLWheresystem = "solar_system = :system.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4system = "select * from faction where " + SQLWheresystem + OrderBy;
    public static final String SQLDelete4system = "delete from faction where " + SQLWheresystem;

    /**
     * Constructor
     * Creates an empty Faction entity
     */
    public Faction() {
    }
    
    /**
     * Constructor
     * build an empty Faction entity with initialized field values
     */
    public Faction(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Faction entity with initialized Primarykey parameter
     * @param factionPK: Faction Primarykey
     */
    public Faction(FactionPK factionPK) {
        super(factionPK);
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
