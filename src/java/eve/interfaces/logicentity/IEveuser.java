/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

    public java.sql.Date getCreatedat();

    public void setCreatedat(java.sql.Date createdat);

    public boolean getAdmin();

    public void setAdmin(boolean admin);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
