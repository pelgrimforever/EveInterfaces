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

public interface IContract extends LogicEntity {

    public IContractPK getPrimaryKey();
	
    public static short ID = 1;
    public static short COLLATERAL = 2;
    public static short DATE_EXPIRED = 3;
    public static short DATE_ISSUED = 4;
    public static short DAYS_TO_COMPLETE = 5;
    public static short END_LOCATION_ID = 6;
    public static short FOR_CORPORATION = 7;
    public static short PRICE = 8;
    public static short REWARD = 9;
    public static short START_LOCATION_ID = 10;
    public static short TITLE = 11;
    public static short TYPE = 12;
    public static short VOLUME = 13;
    public static short PAGE = 14;
    public static short ACTIVE = 15;

    public static final int SIZE_ID = 19;
    public static final int SIZE_COLLATERAL = 17;
    public static final int SIZE_DATE_EXPIRED = 29;
    public static final int SIZE_DATE_ISSUED = 29;
    public static final int SIZE_DAYS_TO_COMPLETE = 10;
    public static final int SIZE_END_LOCATION_ID = 19;
    public static final int SIZE_FOR_CORPORATION = 1;
    public static final int SIZE_PRICE = 17;
    public static final int SIZE_REWARD = 17;
    public static final int SIZE_START_LOCATION_ID = 19;
    public static final int SIZE_TITLE = 100;
    public static final int SIZE_TYPE = 13;
    public static final int SIZE_VOLUME = 17;
    public static final int SIZE_PAGE = 10;
    public static final int SIZE_ACTIVE = 1;
    public static final String[] fieldnames = { "id", "collateral", "date_expired", "date_issued", "days_to_complete", "end_location_id", "for_corporation", "price", "reward", "start_location_id", "title", "type", "volume", "page", "active" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_double, Datatypes.type_Timestamp, Datatypes.type_Timestamp, Datatypes.type_int, Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_double, Datatypes.type_double, Datatypes.type_long, Datatypes.type_String, Datatypes.type_String, Datatypes.type_double, Datatypes.type_int, Datatypes.type_boolean };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public double getCollateral();

    public void setCollateral(double collateral);

    public java.sql.Timestamp getDate_expired();

    public void setDate_expired(java.sql.Timestamp date_expired);

    public java.sql.Timestamp getDate_issued();

    public void setDate_issued(java.sql.Timestamp date_issued);

    public int getDays_to_complete();

    public void setDays_to_complete(int days_to_complete);

    public long getEnd_location_id();

    public void setEnd_location_id(long end_location_id);

    public boolean getFor_corporation();

    public void setFor_corporation(boolean for_corporation);

    public double getPrice();

    public void setPrice(double price);

    public double getReward();

    public void setReward(double reward);

    public long getStart_location_id();

    public void setStart_location_id(long start_location_id);

    public java.lang.String getTitle();

    public void setTitle(java.lang.String title);

    public java.lang.String getType();

    public void setType(java.lang.String type);

    public double getVolume();

    public void setVolume(double volume);

    public int getPage();

    public void setPage(int page);

    public boolean getActive();

    public void setActive(boolean active);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
