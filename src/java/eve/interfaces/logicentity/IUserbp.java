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

public interface IUserbp extends LogicEntity {

    public IUserbpPK getPrimaryKey();
	
    public static short USERNAME = 1;
    public static short BP = 2;
    public static short SERIALNUMBER = 3;
    public static short ORIGINAL = 4;
    public static short MATERIALEFFICIENCY = 5;
    public static short AMOUNTPRODUCED = 6;
    public static short TOTALAMOUNT = 7;
    public static short BPPRICE = 8;
    public static short RESEARCHCOST = 9;
    public static short STATIONFEE = 10;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_BP = 19;
    public static final int SIZE_SERIALNUMBER = 10;
    public static final int SIZE_ORIGINAL = 1;
    public static final int SIZE_MATERIALEFFICIENCY = 5;
    public static final int SIZE_AMOUNTPRODUCED = 10;
    public static final int SIZE_TOTALAMOUNT = 10;
    public static final int SIZE_BPPRICE = 17;
    public static final int SIZE_RESEARCHCOST = 17;
    public static final int SIZE_STATIONFEE = 17;
    public static final String[] fieldnames = { "username", "bp", "serialnumber", "original", "materialefficiency", "amountproduced", "totalamount", "bpprice", "researchcost", "stationfee" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_long, Datatypes.type_int, Datatypes.type_boolean, Datatypes.type_int, Datatypes.type_int, Datatypes.type_int, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "userbp.bp" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public boolean getOriginal();

    public void setOriginal(boolean original);

    public int getMaterialefficiency();

    public void setMaterialefficiency(int materialefficiency);

    public int getAmountproduced();

    public void setAmountproduced(int amountproduced);

    public int getTotalamount();

    public void setTotalamount(int totalamount);

    public double getBpprice();

    public void setBpprice(double bpprice);

    public double getResearchcost();

    public void setResearchcost(double researchcost);

    public double getStationfee();

    public void setStationfee(double stationfee);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
