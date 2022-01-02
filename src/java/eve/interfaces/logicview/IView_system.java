/*
 * IView_system.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.11.2021 19:35
 *
 */

package eve.interfaces.logicview;

import data.gis.shape.*;
import data.interfaces.db.View;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * View Interface IView_system
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_system extends View {

    public static byte JUMPSSAFE = 1;
    public static byte JUMPSSAFELOWSEC = 2;
    public static byte JUMPSSAFENULLSEC = 3;
    public static byte REGIONNAME = 4;
    public static byte SYSTEM_START = 5;
    public static byte SYSTEM_END = 6;
    public static byte ID = 7;
    public static byte NAME = 8;
    public static byte CONSTELLATION = 9;
    public static byte SECURITY_CLASS = 10;
    public static byte SECURITY_STATUS = 11;
    public static byte STAR_ID = 12;
    public static byte NOACCESS = 13;
    public static byte ISCONSTELLATIONBORDER = 14;
    public static byte ISREGIONBORDER = 15;
    public static byte SECURITY_ISLAND = 16;
    public static byte DOWNLOADDATE = 17;

    public static final int SIZE_JUMPSSAFE = 10;
    public static final int SIZE_JUMPSSAFELOWSEC = 10;
    public static final int SIZE_JUMPSSAFENULLSEC = 10;
    public static final int SIZE_REGIONNAME = 30;
    public static final int SIZE_SYSTEM_START = 19;
    public static final int SIZE_SYSTEM_END = 19;
    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 30;
    public static final int SIZE_CONSTELLATION = 19;
    public static final int SIZE_SECURITY_CLASS = 1;
    public static final int SIZE_SECURITY_STATUS = 17;
    public static final int SIZE_STAR_ID = 19;
    public static final int SIZE_NOACCESS = 1;
    public static final int SIZE_ISCONSTELLATIONBORDER = 1;
    public static final int SIZE_ISREGIONBORDER = 1;
    public static final int SIZE_SECURITY_ISLAND = 19;
    public static final int SIZE_DOWNLOADDATE = 13;
    public static final String[] fieldnames = { "jumpssafe", "jumpssafelowsec", "jumpssafenullsec", "regionname", "system_start", "system_end", "id", "name", "constellation", "security_class", "security_status", "star_id", "noaccess", "isconstellationborder", "isregionborder", "security_island", "downloaddate" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return jumpssafe value
     */
    public int getJumpssafe();

    /**
     * 
     * @return jumpssafelowsec value
     */
    public int getJumpssafelowsec();

    /**
     * 
     * @return jumpssafenullsec value
     */
    public int getJumpssafenullsec();

    /**
     * 
     * @return regionname value
     */
    public java.lang.String getRegionname();

    /**
     * 
     * @return system_start value
     */
    public long getSystem_start();

    /**
     * 
     * @return system_end value
     */
    public long getSystem_end();

    /**
     * 
     * @return id value
     */
    public long getId();

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * 
     * @return constellation value
     */
    public long getConstellation();

    /**
     * 
     * @return security_class value
     */
    public java.lang.String getSecurity_class();

    /**
     * 
     * @return security_status value
     */
    public double getSecurity_status();

    /**
     * 
     * @return star_id value
     */
    public long getStar_id();

    /**
     * 
     * @return noaccess value
     */
    public boolean getNoaccess();

    /**
     * 
     * @return isconstellationborder value
     */
    public boolean getIsconstellationborder();

    /**
     * 
     * @return isregionborder value
     */
    public boolean getIsregionborder();

    /**
     * 
     * @return security_island value
     */
    public long getSecurity_island();

    /**
     * 
     * @return downloaddate value
     */
    public java.sql.Date getDownloaddate();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
