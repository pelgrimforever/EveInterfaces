/*
 * Race.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IRacePK;
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
 * Entity class Race
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Race extends eve.entity.eRace implements IRace {

    public static final String SQLSelect = "select race.* from race";
    public static final String SQLWherefaction = "faction = :faction.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4faction = "select * from race where " + SQLWherefaction + OrderBy;
    public static final String SQLDelete4faction = "delete from race where " + SQLWherefaction;

    /**
     * Constructor
     * Creates an empty Race entity
     */
    public Race() {
    }
    
    /**
     * Constructor
     * build an empty Race entity with initialized field values
     */
    public Race(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Race entity with initialized Primarykey parameter
     * @param racePK: Race Primarykey
     */
    public Race(RacePK racePK) {
        super(racePK);
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
