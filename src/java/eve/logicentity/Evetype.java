/*
 * Evetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.4.2021 13:20
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IEvetypePK;
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
 * Entity class Evetype
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Evetype extends eve.entity.eEvetype implements IEvetype {

    public static final String SQLSelect = "select evetype.* from evetype";
    public static final String SQLWheremarket_group = "market_group = :market_group.id:";
    public static final String SQLWheretypegroup = "typegroup = :typegroup.id:";
    public static final String SQLWheregraphic = "graphic = :graphic.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4market_group = "select * from evetype where " + SQLWheremarket_group + OrderBy;
    public static final String SQLDelete4market_group = "delete from evetype where " + SQLWheremarket_group + OrderBy;
    public static final String SQLSelect4typegroup = "select * from evetype where " + SQLWheretypegroup + OrderBy;
    public static final String SQLDelete4typegroup = "delete from evetype where " + SQLWheretypegroup + OrderBy;
    public static final String SQLSelect4graphic = "select * from evetype where " + SQLWheregraphic + OrderBy;
    public static final String SQLDelete4graphic = "delete from evetype where " + SQLWheregraphic + OrderBy;

    /**
     * Constructor
     * Creates an empty Evetype entity
     */
    public Evetype() {
    }
    
    /**
     * Constructor
     * build an empty Evetype entity with initialized field values
     */
    public Evetype(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Evetype entity with initialized Primarykey parameter
     * @param evetypePK: Evetype Primarykey
     */
    public Evetype(EvetypePK evetypePK) {
        super(evetypePK);
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
