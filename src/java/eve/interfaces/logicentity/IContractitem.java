/*
 * IContractitem.java
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
 * Entity Interface IContractitem
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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

    /**
     * 
     * @return blueprint_copy value
     */
    public boolean getBlueprint_copy();

    /**
     * set blueprint_copy value
     * @param blueprint_copy: new value
     */
    public void setBlueprint_copy(boolean blueprint_copy);

    /**
     * 
     * @return included value
     */
    public boolean getIncluded();

    /**
     * set included value
     * @param included: new value
     */
    public void setIncluded(boolean included);

    /**
     * 
     * @return quantity value
     */
    public long getQuantity();

    /**
     * set quantity value
     * @param quantity: new value
     */
    public void setQuantity(long quantity);

    /**
     * 
     * @return material_efficiency value
     */
    public int getMaterial_efficiency();

    /**
     * set material_efficiency value
     * @param material_efficiency: new value
     */
    public void setMaterial_efficiency(int material_efficiency);

    /**
     * 
     * @return runs value
     */
    public int getRuns();

    /**
     * set runs value
     * @param runs: new value
     */
    public void setRuns(int runs);

    /**
     * 
     * @return time_efficiency value
     */
    public int getTime_efficiency();

    /**
     * set time_efficiency value
     * @param time_efficiency: new value
     */
    public void setTime_efficiency(int time_efficiency);

    /**
     * 
     * @return foreign key evetypePK, instance of EvetypePK
     */
    public IEvetypePK getEvetypePK();

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK);

    /**
     * 
     * @return foreign key contractPK, instance of ContractPK
     */
    public IContractPK getContractPK();

    /**
     * set foreign key contract
     * @param contractPK: instance of ContractPK
     */
    public void setContractPK(IContractPK contractPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
