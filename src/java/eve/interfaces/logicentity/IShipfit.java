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

public interface IShipfit extends LogicEntity {

    public IShipfitPK getPrimaryKey();
	
    public static short USERNAME = 1;
    public static short SHIPNAME = 2;
    public static short EVETYPE = 3;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_SHIPNAME = 50;
    public static final int SIZE_EVETYPE = 19;
    public static final String[] fieldnames = { "username", "shipname", "evetype" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_long };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "shipfit.evetype" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public IEvetypePK getEvetypePK();

    public void setEvetypePK(IEvetypePK evetypePK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
