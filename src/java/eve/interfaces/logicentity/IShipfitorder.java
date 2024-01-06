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

public interface IShipfitorder extends LogicEntity {

    public IShipfitorderPK getPrimaryKey();
	
    public static short USERNAME = 1;
    public static short SHIPNAME = 2;
    public static short EVETYPE = 3;
    public static short AMOUNTWANTED = 4;
    public static short AMOUNTINSTOCK = 5;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_SHIPNAME = 50;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_AMOUNTWANTED = 10;
    public static final int SIZE_AMOUNTINSTOCK = 10;
    public static final String[] fieldnames = { "username", "shipname", "evetype", "amountwanted", "amountinstock" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_long, Datatypes.type_int, Datatypes.type_int };

    public static final String[] shipfitPKfields = { "shipfit.username", "shipfit.shipname" };
    public static final String[] shipfitFKfields = { "shipfitorder.username", "shipfitorder.shipname" };
    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "shipfitorder.evetype" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public int getAmountwanted();

    public void setAmountwanted(int amountwanted);

    public int getAmountinstock();

    public void setAmountinstock(int amountinstock);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
