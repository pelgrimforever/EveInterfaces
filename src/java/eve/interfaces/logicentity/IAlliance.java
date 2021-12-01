/*
 * IAlliance.java
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
 * Entity Interface IAlliance
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IAlliance extends LogicEntity {

    public IAlliancePK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short CREATOR_CORPORATION = 3;
    public static short CREATOR = 4;
    public static short DATE_FOUNDED = 5;
    public static short EXECUTOR_CORPORATION = 6;
    public static short TICKER = 7;
    public static short FACTION_ID = 8;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_CREATOR_CORPORATION = 19;
    public static final int SIZE_CREATOR = 19;
    public static final int SIZE_DATE_FOUNDED = 29;
    public static final int SIZE_EXECUTOR_CORPORATION = 19;
    public static final int SIZE_TICKER = 20;
    public static final int SIZE_FACTION_ID = 19;
    public static final String[] fieldnames = { "id", "name", "creator_corporation", "creator", "date_founded", "executor_corporation", "ticker", "faction_id" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_long, Datatypes.type_long, Datatypes.type_Timestamp, Datatypes.type_long, Datatypes.type_String, Datatypes.type_long };

    public static final String[] corporationCreator_corporationPKfields = { "corporation.id" };
    public static final String[] corporationCreator_corporationFKfields = { "alliance.creator_corporation" };
    public static final String[] corporationExecutor_corporationPKfields = { "corporation.id" };
    public static final String[] corporationExecutor_corporationFKfields = { "alliance.executor_corporation" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name);

    /**
     * 
     * @return creator value
     */
    public long getCreator();

    /**
     * set creator value
     * @param creator: new value
     */
    public void setCreator(long creator);

    /**
     * 
     * @return date_founded value
     */
    public java.sql.Timestamp getDate_founded();

    /**
     * set date_founded value
     * @param date_founded: new value
     */
    public void setDate_founded(java.sql.Timestamp date_founded);

    /**
     * 
     * @return ticker value
     */
    public java.lang.String getTicker();

    /**
     * set ticker value
     * @param ticker: new value
     */
    public void setTicker(java.lang.String ticker);

    /**
     * 
     * @return faction_id value
     */
    public long getFaction_id();

    /**
     * set faction_id value
     * @param faction_id: new value
     */
    public void setFaction_id(long faction_id);

    /**
     * 
     * @return foreign key corporationCreator_corporationPK, instance of CorporationPK
     */
    public ICorporationPK getCorporationcreator_corporationPK();

    /**
     * set foreign key corporation
     * @param corporationCreator_corporationPK: instance of CorporationPK
     */
    public void setCorporationcreator_corporationPK(ICorporationPK corporationCreator_corporationPK);

    /**
     * 
     * @return foreign key corporationExecutor_corporationPK, instance of CorporationPK
     */
    public ICorporationPK getCorporationexecutor_corporationPK();

    /**
     * set foreign key corporation
     * @param corporationExecutor_corporationPK: instance of CorporationPK
     */
    public void setCorporationexecutor_corporationPK(ICorporationPK corporationExecutor_corporationPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
