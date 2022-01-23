/*
 * IMaterialinput.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.0.2022 17:52
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
 * Entity Interface IMaterialinput
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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

    /**
     * 
     * @return amount value
     */
    public long getAmount();

    /**
     * set amount value
     * @param amount: new value
     */
    public void setAmount(long amount);

    /**
     * 
     * @return unitprice value
     */
    public double getUnitprice();

    /**
     * set unitprice value
     * @param unitprice: new value
     */
    public void setUnitprice(double unitprice);

    /**
     * 
     * @return usedamount value
     */
    public long getUsedamount();

    /**
     * set usedamount value
     * @param usedamount: new value
     */
    public void setUsedamount(long usedamount);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
