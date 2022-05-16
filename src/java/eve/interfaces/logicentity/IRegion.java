/*
 * IRegion.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
    public static short NOACCESS = 3;
    public static short ORDERPAGES = 4;
    public static short ORDERERRORS = 5;
    public static short CONTRACTPAGES = 6;
    public static short CONTRACTERRORS = 7;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 30;
    public static final int SIZE_NOACCESS = 1;
    public static final int SIZE_ORDERPAGES = 10;
    public static final int SIZE_ORDERERRORS = 10;
    public static final int SIZE_CONTRACTPAGES = 10;
    public static final int SIZE_CONTRACTERRORS = 10;
    public static final String[] fieldnames = { "id", "name", "noaccess", "orderpages", "ordererrors", "contractpages", "contracterrors" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_boolean, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int };


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
     * @return orderpages value
     */
    public int getOrderpages();

    /**
     * set orderpages value
     * @param orderpages: new value
     */
    public void setOrderpages(int orderpages);

    /**
     * 
     * @return ordererrors value
     */
    public int getOrdererrors();

    /**
     * set ordererrors value
     * @param ordererrors: new value
     */
    public void setOrdererrors(int ordererrors);

    /**
     * 
     * @return contractpages value
     */
    public int getContractpages();

    /**
     * set contractpages value
     * @param contractpages: new value
     */
    public void setContractpages(int contractpages);

    /**
     * 
     * @return contracterrors value
     */
    public int getContracterrors();

    /**
     * set contracterrors value
     * @param contracterrors: new value
     */
    public void setContracterrors(int contracterrors);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
