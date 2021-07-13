/*
 * IJson_orders.java
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
 * Entity Interface IJson_orders
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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

    /**
     * 
     * @return json value
     */
    public piJson getJson();

    /**
     * set json value
     * @param json: new value
     */
    public void setJson(piJson json);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
