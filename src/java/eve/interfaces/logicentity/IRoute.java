/*
 * IRoute.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:40
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
 * Entity Interface IRoute
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IRoute extends LogicEntity {

	public IRoutePK getPrimaryKey();
	
    public static short ROUTETYPE = 1;
    public static short SYSTEM = 2;
    public static short JSONROUTES = 3;

    public static final int SIZE_ROUTETYPE = 19;
    public static final int SIZE_SYSTEM = 19;
    public static final int SIZE_JSONROUTES = 2147483647;
    public static final String[] fieldnames = { "routetype", "system", "jsonroutes" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_piJson };

    public static final String[] routetypePKfields = { "routetype.id" };
    public static final String[] routetypeFKfields = { "route.routetype" };
    public static final String[] systemPKfields = { "system.id" };
    public static final String[] systemFKfields = { "route.system" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return jsonroutes value
     */
    public piJson getJsonroutes();

    /**
     * set jsonroutes value
     * @param jsonroutes: new value
     */
    public void setJsonroutes(piJson jsonroutes);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
