/*
 * ISystem.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.interfaces.entity.pk.*;
import eve.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Entity Interface ISystem
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ISystem extends LogicEntity {

	public ISystemPK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short CONSTELLATION = 3;
    public static short SECURITY_CLASS = 4;
    public static short SECURITY_STATUS = 5;
    public static short STAR_ID = 6;
    public static short NOACCESS = 7;
    public static short ISCONSTELLATIONBORDER = 8;
    public static short ISREGIONBORDER = 9;
    public static short SECURITY_ISLAND = 10;

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
    public static final String[] fieldnames = { "id", "name", "constellation", "security_class", "security_status", "star_id", "noaccess", "isconstellationborder", "isregionborder", "security_island" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_long, Datatypes.type_String, Datatypes.type_double, Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_long };

    public static final String[] security_islandPKfields = { "security_island.id" };
    public static final String[] security_islandFKfields = { "system.security_island" };
    public static final String[] constellationPKfields = { "constellation.id" };
    public static final String[] constellationFKfields = { "system.constellation" };

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
     * @return security_class value
     */
    public java.lang.String getSecurity_class();

    /**
     * set security_class value
     * @param security_class: new value
     */
    public void setSecurity_class(java.lang.String security_class);

    /**
     * 
     * @return security_status value
     */
    public double getSecurity_status();

    /**
     * set security_status value
     * @param security_status: new value
     */
    public void setSecurity_status(double security_status);

    /**
     * 
     * @return star_id value
     */
    public long getStar_id();

    /**
     * set star_id value
     * @param star_id: new value
     */
    public void setStar_id(long star_id);

    /**
     * 
     * @return noaccess value
     */
    public boolean getNoaccess();

    /**
     * set noaccess value
     * @param noaccess: new value
     */
    public void setNoaccess(boolean noaccess);

    /**
     * 
     * @return isconstellationborder value
     */
    public boolean getIsconstellationborder();

    /**
     * set isconstellationborder value
     * @param isconstellationborder: new value
     */
    public void setIsconstellationborder(boolean isconstellationborder);

    /**
     * 
     * @return isregionborder value
     */
    public boolean getIsregionborder();

    /**
     * set isregionborder value
     * @param isregionborder: new value
     */
    public void setIsregionborder(boolean isregionborder);

    /**
     * 
     * @return foreign key security_islandPK, instance of Security_islandPK
     */
    public ISecurity_islandPK getSecurity_islandPK();

    /**
     * set foreign key security_island
     * @param security_islandPK: instance of Security_islandPK
     */
    public void setSecurity_islandPK(ISecurity_islandPK security_islandPK);

    /**
     * 
     * @return foreign key constellationPK, instance of ConstellationPK
     */
    public IConstellationPK getConstellationPK();

    /**
     * set foreign key constellation
     * @param constellationPK: instance of ConstellationPK
     */
    public void setConstellationPK(IConstellationPK constellationPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
