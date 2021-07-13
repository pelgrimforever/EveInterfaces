/*
 * Stargate.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IStargatePK;
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
 * Entity class Stargate
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Stargate extends eve.entity.eStargate implements IStargate {

    public static final String SQLSelect = "select stargate.* from stargate";
    public static final String SQLWheresystemSystem = "system = :system.id:";
    public static final String SQLWheresystemTo_system = "to_system = :system.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;

    public static final String SQLSelect4systemCount = "select count(*) as count from stargate where " + SQLWheresystemSystem;
    
    public static final String SQLupdateconstellationborders = "update stargate set isconstellationborder = :isborder: from stargate sg " +
        "inner join system on system.id = sg.system " +
        "inner join system systemto on systemto.id = sg.to_system " +
        "inner join constellation on constellation.id = system.constellation " +
        "inner join constellation constellationto on constellationto.id = systemto.constellation " +
        "where constellation.id <> constellationto.id";
    public static final String SQLupdateregionborders = "update stargate set isregionborder = :isborder: from stargate sg " +
        "inner join system on system.id = sg.system " +
        "inner join system systemto on systemto.id = sg.to_system " +
        "inner join constellation on constellation.id = system.constellation " +
        "inner join constellation constellationto on constellationto.id = systemto.constellation " +
        "where constellation.region <> constellationto.region";
    
    //select only 1 stargate prevous to the given system id in the tmp_system_jumps configuration
    public static final String SQLselectpreviousTMP = "select sg.* from tmp_system_jumps tmp " +
        "inner join stargate sg on sg.to_system = tmp.system " +
        "inner join tmp_system_jumps tmp2 on tmp2.system = sg.system and tmp2.jump+1 = tmp.jump " +
        "where tmp.system = :system.id: " +
        "limit 1";
//Custom code, do not change this line

    public static final String SQLSelect4systemSystem = "select * from stargate where " + SQLWheresystemSystem + OrderBy;
    public static final String SQLDelete4systemSystem = "delete from stargate where " + SQLWheresystemSystem;
    public static final String SQLSelect4systemTo_system = "select * from stargate where " + SQLWheresystemTo_system + OrderBy;
    public static final String SQLDelete4systemTo_system = "delete from stargate where " + SQLWheresystemTo_system;

    /**
     * Constructor
     * Creates an empty Stargate entity
     */
    public Stargate() {
    }
    
    /**
     * Constructor
     * build an empty Stargate entity with initialized field values
     */
    public Stargate(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Stargate entity with initialized Primarykey parameter
     * @param stargatePK: Stargate Primarykey
     */
    public Stargate(StargatePK stargatePK) {
        super(stargatePK);
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
