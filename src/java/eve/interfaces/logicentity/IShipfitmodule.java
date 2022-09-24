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

public interface IShipfitmodule extends LogicEntity {

    public IShipfitmodulePK getPrimaryKey();
	
    public static short USERNAME = 1;
    public static short SHIPNAME = 2;
    public static short MODULETYPE = 3;
    public static short AMOUNT = 4;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_SHIPNAME = 50;
    public static final int SIZE_MODULETYPE = 19;
    public static final int SIZE_AMOUNT = 10;
    public static final String[] fieldnames = { "username", "shipname", "moduletype", "amount" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_long, Datatypes.type_int };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "shipfitmodule.moduletype" };
    public static final String[] shipfitPKfields = { "shipfit.username", "shipfit.shipname" };
    public static final String[] shipfitFKfields = { "shipfitmodule.username", "shipfitmodule.shipname" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public int getAmount();

    public void setAmount(int amount);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
