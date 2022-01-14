/*
 * IContract.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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
 * Entity Interface IContract
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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

    /**
     * 
     * @return collateral value
     */
    public double getCollateral();

    /**
     * set collateral value
     * @param collateral: new value
     */
    public void setCollateral(double collateral);

    /**
     * 
     * @return date_expired value
     */
    public java.sql.Timestamp getDate_expired();

    /**
     * set date_expired value
     * @param date_expired: new value
     */
    public void setDate_expired(java.sql.Timestamp date_expired);

    /**
     * 
     * @return date_issued value
     */
    public java.sql.Timestamp getDate_issued();

    /**
     * set date_issued value
     * @param date_issued: new value
     */
    public void setDate_issued(java.sql.Timestamp date_issued);

    /**
     * 
     * @return days_to_complete value
     */
    public int getDays_to_complete();

    /**
     * set days_to_complete value
     * @param days_to_complete: new value
     */
    public void setDays_to_complete(int days_to_complete);

    /**
     * 
     * @return end_location_id value
     */
    public long getEnd_location_id();

    /**
     * set end_location_id value
     * @param end_location_id: new value
     */
    public void setEnd_location_id(long end_location_id);

    /**
     * 
     * @return for_corporation value
     */
    public boolean getFor_corporation();

    /**
     * set for_corporation value
     * @param for_corporation: new value
     */
    public void setFor_corporation(boolean for_corporation);

    /**
     * 
     * @return price value
     */
    public double getPrice();

    /**
     * set price value
     * @param price: new value
     */
    public void setPrice(double price);

    /**
     * 
     * @return reward value
     */
    public double getReward();

    /**
     * set reward value
     * @param reward: new value
     */
    public void setReward(double reward);

    /**
     * 
     * @return start_location_id value
     */
    public long getStart_location_id();

    /**
     * set start_location_id value
     * @param start_location_id: new value
     */
    public void setStart_location_id(long start_location_id);

    /**
     * 
     * @return title value
     */
    public java.lang.String getTitle();

    /**
     * set title value
     * @param title: new value
     */
    public void setTitle(java.lang.String title);

    /**
     * 
     * @return type value
     */
    public java.lang.String getType();

    /**
     * set type value
     * @param type: new value
     */
    public void setType(java.lang.String type);

    /**
     * 
     * @return volume value
     */
    public double getVolume();

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(double volume);

    /**
     * 
     * @return page value
     */
    public int getPage();

    /**
     * set page value
     * @param page: new value
     */
    public void setPage(int page);

    /**
     * 
     * @return active value
     */
    public boolean getActive();

    /**
     * set active value
     * @param active: new value
     */
    public void setActive(boolean active);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
