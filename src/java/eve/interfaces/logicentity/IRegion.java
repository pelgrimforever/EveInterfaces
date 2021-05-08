/*
 * IRegion.java
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
 * Entity Interface IRegion
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IRegion extends LogicEntity {

	public IRegionPK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 30;
    public static final String[] fieldnames = { "id", "name" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String };


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

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
