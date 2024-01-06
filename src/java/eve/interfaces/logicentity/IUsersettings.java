/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
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

public interface IUsersettings extends LogicEntity {

    public IUsersettingsPK getPrimaryKey();
	
    public static short USERNAME = 1;
    public static short NAME = 2;
    public static short VALUE = 3;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_NAME = 30;
    public static final int SIZE_VALUE = 20;
    public static final String[] fieldnames = { "username", "name", "value" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_String };

    public static final String[] settingsPKfields = { "settings.name" };
    public static final String[] settingsFKfields = { "usersettings.name" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getValue();

    public void setValue(java.lang.String value);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
