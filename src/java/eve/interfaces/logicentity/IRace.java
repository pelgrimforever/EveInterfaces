/*
 * IRace.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.4.2021 13:20
 *
 */

package eve.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import eve.interfaces.entity.pk.*;
import eve.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Entity Interface IRace
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IRace extends LogicEntity {

	public IRacePK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short DESCRIPTION = 3;
    public static short ALLIANCE = 4;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 30;
    public static final int SIZE_DESCRIPTION = 2147483647;
    public static final int SIZE_ALLIANCE = 19;
    public static final String[] fieldnames = { "id", "name", "description", "alliance" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_String, Datatypes.type_long };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name);

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription();

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description);

    /**
     * 
     * @return alliance value
     */
    public long getAlliance();

    /**
     * set alliance value
     * @param alliance: new value
     */
    public void setAlliance(long alliance);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
