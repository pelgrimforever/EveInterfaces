/*
 * IBpmaterial.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
 * Entity Interface IBpmaterial
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IBpmaterial extends LogicEntity {

    public IBpmaterialPK getPrimaryKey();
	
    public static short BP = 1;
    public static short MATERIAL = 2;
    public static short AMOUNT = 3;

    public static final int SIZE_BP = 19;
    public static final int SIZE_MATERIAL = 19;
    public static final int SIZE_AMOUNT = 19;
    public static final String[] fieldnames = { "bp", "material", "amount" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_long };

    public static final String[] evetypeBpPKfields = { "evetype.id" };
    public static final String[] evetypeBpFKfields = { "bpmaterial.bp" };
    public static final String[] evetypeMaterialPKfields = { "evetype.id" };
    public static final String[] evetypeMaterialFKfields = { "bpmaterial.material" };

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

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
