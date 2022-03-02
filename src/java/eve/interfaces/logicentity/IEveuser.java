/*
 * IEveuser.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.1.2022 20:53
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
 * Entity Interface IEveuser
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IEveuser extends LogicEntity {

    public IEveuserPK getPrimaryKey();
	
    public static short USERNAME = 1;
    public static short CREATEDAT = 2;
    public static short ADMIN = 3;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_CREATEDAT = 13;
    public static final int SIZE_ADMIN = 1;
    public static final String[] fieldnames = { "username", "createdat", "admin" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_Date, Datatypes.type_boolean };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return createdat value
     */
    public java.sql.Date getCreatedat();

    /**
     * set createdat value
     * @param createdat: new value
     */
    public void setCreatedat(java.sql.Date createdat);

    /**
     * 
     * @return admin value
     */
    public boolean getAdmin();

    /**
     * set admin value
     * @param admin: new value
     */
    public void setAdmin(boolean admin);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
