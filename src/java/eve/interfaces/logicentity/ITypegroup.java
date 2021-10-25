/*
 * ITypegroup.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
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
 * Entity Interface ITypegroup
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ITypegroup extends LogicEntity {

    public ITypegroupPK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short PUBLISHED = 3;
    public static short CATEGORY = 4;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_PUBLISHED = 1;
    public static final int SIZE_CATEGORY = 19;
    public static final String[] fieldnames = { "id", "name", "published", "category" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_boolean, Datatypes.type_long };

    public static final String[] categoryPKfields = { "category.id" };
    public static final String[] categoryFKfields = { "typegroup.category" };

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
     * @return published value
     */
    public boolean getPublished();

    /**
     * set published value
     * @param published: new value
     */
    public void setPublished(boolean published);

    /**
     * 
     * @return foreign key categoryPK, instance of CategoryPK
     */
    public ICategoryPK getCategoryPK();

    /**
     * set foreign key category
     * @param categoryPK: instance of CategoryPK
     */
    public void setCategoryPK(ICategoryPK categoryPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
