/*
 * ISettings.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
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
 * Entity Interface ISettings
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ISettings extends LogicEntity {

    public ISettingsPK getPrimaryKey();
	
    public static short NAME = 1;
    public static short VALUE = 2;

    public static final int SIZE_NAME = 30;
    public static final int SIZE_VALUE = 20;
    public static final String[] fieldnames = { "name", "value" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String };


//Custom code, do not change this line
//Put custom variables here
    public static final String BROKER_FEE = "broker fee";
    public static final String STOCKSYSTEMID = "stocksystemid";
    
    public static final Object[][] DEFAULTS = {
        { BROKER_FEE, "0.08" },
        { STOCKSYSTEMID, null }
    };
//Custom code, do not change this line

    /**
     * 
     * @return value value
     */
    public java.lang.String getValue();

    /**
     * set value value
     * @param value: new value
     */
    public void setValue(java.lang.String value);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
