/*
 * Systemjumps.java
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
import eve.interfaces.entity.pk.ISystemjumpsPK;
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
 * Entity class Systemjumps
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Systemjumps extends eve.entity.eSystemjumps implements ISystemjumps {

    public static final String SQLSelect = "select systemjumps.* from systemjumps";
    public static final String SQLWheresystemSystem_end = "system_end = :system.id:";
    public static final String SQLWheresystemSystem_start = "system_start = :system.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by system_start, system_end";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
    
    public static final String SQLDeleteall = "delete from systemjumps";
    
    public static final String SQLcopy_from_tmpjups = "insert into systemjumps " +
        "select :system.id: as system_start, system, jump from tmp_system_jumps";
    public static final String SQLset0jumpsto1 = "update systemjumps set jumps = 1 where jumps = 0";
//Custom code, do not change this line

    public static final String SQLSelect4systemSystem_end = "select * from systemjumps where " + SQLWheresystemSystem_end + OrderBy;
    public static final String SQLDelete4systemSystem_end = "delete from systemjumps where " + SQLWheresystemSystem_end;
    public static final String SQLSelect4systemSystem_start = "select * from systemjumps where " + SQLWheresystemSystem_start + OrderBy;
    public static final String SQLDelete4systemSystem_start = "delete from systemjumps where " + SQLWheresystemSystem_start;

    /**
     * Constructor
     * Creates an empty Systemjumps entity
     */
    public Systemjumps() {
    }
    
    /**
     * Constructor
     * build an empty Systemjumps entity with initialized field values
     */
    public Systemjumps(long system_start, long system_end) {
        super(system_start, system_end);
    }

    /**
     * Constructor
     * build an empty Systemjumps entity with initialized Primarykey parameter
     * @param systemjumpsPK: Systemjumps Primarykey
     */
    public Systemjumps(SystemjumpsPK systemjumpsPK) {
        super(systemjumpsPK);
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
