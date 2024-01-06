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

public interface IMaterialinput extends LogicEntity {

    public IMaterialinputPK getPrimaryKey();
	
    public static short USERNAME = 1;
    public static short EVETYPE = 2;
    public static short ADDTIMESTAMP = 3;
    public static short AMOUNT = 4;
    public static short UNITPRICE = 5;
    public static short USEDAMOUNT = 6;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_ADDTIMESTAMP = 35;
    public static final int SIZE_AMOUNT = 19;
    public static final int SIZE_UNITPRICE = 17;
    public static final int SIZE_USEDAMOUNT = 19;
    public static final String[] fieldnames = { "username", "evetype", "addtimestamp", "amount", "unitprice", "usedamount" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_long, Datatypes.type_Timestamp, Datatypes.type_long, Datatypes.type_double, Datatypes.type_long };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "materialinput.evetype" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public long getAmount();

    public void setAmount(long amount);

    public double getUnitprice();

    public void setUnitprice(double unitprice);

    public long getUsedamount();

    public void setUsedamount(long usedamount);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
