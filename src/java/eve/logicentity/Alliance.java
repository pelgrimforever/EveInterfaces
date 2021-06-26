/*
 * Alliance.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IAlliancePK;
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
 * Entity class Alliance
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Alliance extends eve.entity.eAlliance implements IAlliance {

    public static final String SQLSelect = "select alliance.* from alliance";
    public static final String SQLWherecorporationCreator_corporation = "creator_corporation = :corporation.id:";
    public static final String SQLWherecorporationExecutor_corporation = "executor_corporation = :corporation.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4corporationCreator_corporation = "select * from alliance where " + SQLWherecorporationCreator_corporation + OrderBy;
    public static final String SQLDelete4corporationCreator_corporation = "delete from alliance where " + SQLWherecorporationCreator_corporation;
    public static final String SQLSelect4corporationExecutor_corporation = "select * from alliance where " + SQLWherecorporationExecutor_corporation + OrderBy;
    public static final String SQLDelete4corporationExecutor_corporation = "delete from alliance where " + SQLWherecorporationExecutor_corporation;

    /**
     * Constructor
     * Creates an empty Alliance entity
     */
    public Alliance() {
    }
    
    /**
     * Constructor
     * build an empty Alliance entity with initialized field values
     */
    public Alliance(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Alliance entity with initialized Primarykey parameter
     * @param alliancePK: Alliance Primarykey
     */
    public Alliance(AlliancePK alliancePK) {
        super(alliancePK);
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
