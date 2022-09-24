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

public interface IContractitem extends LogicEntity {

    public IContractitemPK getPrimaryKey();
	
    public static short ID = 1;
    public static short CONTRACT = 2;
    public static short BLUEPRINT_COPY = 3;
    public static short INCLUDED = 4;
    public static short QUANTITY = 5;
    public static short EVETYPE = 6;
    public static short MATERIAL_EFFICIENCY = 7;
    public static short RUNS = 8;
    public static short TIME_EFFICIENCY = 9;

    public static final int SIZE_ID = 19;
    public static final int SIZE_CONTRACT = 19;
    public static final int SIZE_BLUEPRINT_COPY = 1;
    public static final int SIZE_INCLUDED = 1;
    public static final int SIZE_QUANTITY = 19;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_MATERIAL_EFFICIENCY = 10;
    public static final int SIZE_RUNS = 10;
    public static final int SIZE_TIME_EFFICIENCY = 10;
    public static final String[] fieldnames = { "id", "contract", "blueprint_copy", "included", "quantity", "evetype", "material_efficiency", "runs", "time_efficiency" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_long, Datatypes.type_long, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "contractitem.evetype" };
    public static final String[] contractPKfields = { "contract.id" };
    public static final String[] contractFKfields = { "contractitem.contract" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public boolean getBlueprint_copy();

    public void setBlueprint_copy(boolean blueprint_copy);

    public boolean getIncluded();

    public void setIncluded(boolean included);

    public long getQuantity();

    public void setQuantity(long quantity);

    public int getMaterial_efficiency();

    public void setMaterial_efficiency(int material_efficiency);

    public int getRuns();

    public void setRuns(int runs);

    public int getTime_efficiency();

    public void setTime_efficiency(int time_efficiency);

    public IEvetypePK getEvetypePK();

    public void setEvetypePK(IEvetypePK evetypePK);

    public IContractPK getContractPK();

    public void setContractPK(IContractPK contractPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
