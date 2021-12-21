/*
 * IStocktrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:45
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
 * Entity Interface IStocktrade
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IStocktrade extends LogicEntity {

    public IStocktradePK getPrimaryKey();
	
    public static short USERNAME = 1;
    public static short EVETYPE = 2;
    public static short ORDERID = 3;
    public static short SELLAMOUNT = 4;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_ORDERID = 19;
    public static final int SIZE_SELLAMOUNT = 19;
    public static final String[] fieldnames = { "username", "evetype", "orderid", "sellamount" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long };

    public static final String[] stockPKfields = { "stock.username", "stock.evetype" };
    public static final String[] stockFKfields = { "stocktrade.username", "stocktrade.evetype" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return sellamount value
     */
    public long getSellamount();

    /**
     * set sellamount value
     * @param sellamount: new value
     */
    public void setSellamount(long sellamount);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
