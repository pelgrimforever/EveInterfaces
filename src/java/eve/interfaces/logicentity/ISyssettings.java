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

public interface ISyssettings extends LogicEntity {

    public ISyssettingsPK getPrimaryKey();
	
    public static short NAME = 1;
    public static short VALUE = 2;

    public static final int SIZE_NAME = 30;
    public static final int SIZE_VALUE = 20;
    public static final String[] fieldnames = { "name", "value" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String };


//Custom code, do not change this line
//Put custom variables here
    public static final String BROKER_FEE = "broker fee";
    public static final String MAXCARGO = "maxcargo";
    public static final String MIN_PROFIT = "min_profit";
    public static final String MIN_PROFIT_PER_JUMP = "min_profit_per_jump";    
//Custom code, do not change this line

    public java.lang.String getValue();

    public void setValue(java.lang.String value);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
