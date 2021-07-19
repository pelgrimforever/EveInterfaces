/*
 * Tmp_system_jumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ITmp_system_jumpsPK;
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
 * Entity class Tmp_system_jumps
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Tmp_system_jumps extends eve.entity.eTmp_system_jumps implements ITmp_system_jumps {

    public static final String SQLSelect = "select tmp_system_jumps.* from tmp_system_jumps";

//Custom code, do not change this line
    public static final String OrderBy = " order by system";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
    
    public static final String SQLDeleteAll = "delete from tmp_system_jumps";
    public static final String SQLCopySystems4Security_island = 
        "insert into tmp_system_jumps (system) " +
        "select id from system where " + System.SQLWheresecurity_island;
    public static final String SQLResetJump = "update tmp_system_jumps set jump = null";
    public static final String SQLSelectnojump = "select count(*) as count from tmp_system_jumps where jump is null";
    public static final String SQLSetnextjump = 
        "update tmp_system_jumps set jump = :nextjump: " +
        "where system in (" +
        "select sg.to_system from stargate sg " +
        "where sg.system in (select sj.system from tmp_system_jumps sj where sj.jump = :jump:) " +
        "and sg.to_system in (select sj.system from tmp_system_jumps sj where sj.jump is null))";
    public static final String SQLSelect4jump = SQLSelect + " where jump = :jump:";
//Custom code, do not change this line


    /**
     * Constructor
     * Creates an empty Tmp_system_jumps entity
     */
    public Tmp_system_jumps() {
    }
    
    /**
     * Constructor
     * build an empty Tmp_system_jumps entity with initialized field values
     */
    public Tmp_system_jumps(long system) {
        super(system);
    }

    /**
     * Constructor
     * build an empty Tmp_system_jumps entity with initialized Primarykey parameter
     * @param tmp_system_jumpsPK: Tmp_system_jumps Primarykey
     */
    public Tmp_system_jumps(Tmp_system_jumpsPK tmp_system_jumpsPK) {
        super(tmp_system_jumpsPK);
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
