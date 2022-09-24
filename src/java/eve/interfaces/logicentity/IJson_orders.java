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

public interface IJson_orders extends LogicEntity {

    public IJson_ordersPK getPrimaryKey();
	
    public static short ID = 1;
    public static short JSON = 2;

    public static final int SIZE_ID = 10;
    public static final int SIZE_JSON = 2147483647;
    public static final String[] fieldnames = { "id", "json" };
    public static final byte[] fieldtypes = { Datatypes.type_int_serial, Datatypes.type_piJson };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public piJson getJson();

    public void setJson(piJson json);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
