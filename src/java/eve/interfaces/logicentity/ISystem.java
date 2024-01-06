/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
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

public interface ISystem extends LogicEntity {

    public ISystemPK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short CONSTELLATION = 3;
    public static short SECURITY_CLASS = 4;
    public static short SECURITY_STATUS = 5;
    public static short STAR_ID = 6;
    public static short NOACCESS = 7;
    public static short ISCONSTELLATIONBORDER = 8;
    public static short ISREGIONBORDER = 9;
    public static short SECURITY_ISLAND = 10;
    public static short DOWNLOADDATE = 11;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 30;
    public static final int SIZE_CONSTELLATION = 19;
    public static final int SIZE_SECURITY_CLASS = 1;
    public static final int SIZE_SECURITY_STATUS = 17;
    public static final int SIZE_STAR_ID = 19;
    public static final int SIZE_NOACCESS = 1;
    public static final int SIZE_ISCONSTELLATIONBORDER = 1;
    public static final int SIZE_ISREGIONBORDER = 1;
    public static final int SIZE_SECURITY_ISLAND = 19;
    public static final int SIZE_DOWNLOADDATE = 13;
    public static final String[] fieldnames = { "id", "name", "constellation", "security_class", "security_status", "star_id", "noaccess", "isconstellationborder", "isregionborder", "security_island", "downloaddate" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_long, Datatypes.type_String, Datatypes.type_double, Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_long, Datatypes.type_Date };

    public static final String[] security_islandPKfields = { "security_island.id" };
    public static final String[] security_islandFKfields = { "system.security_island" };
    public static final String[] constellationPKfields = { "constellation.id" };
    public static final String[] constellationFKfields = { "system.constellation" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getSecurity_class();

    public void setSecurity_class(java.lang.String security_class);

    public double getSecurity_status();

    public void setSecurity_status(double security_status);

    public long getStar_id();

    public void setStar_id(long star_id);

    public boolean getNoaccess();

    public void setNoaccess(boolean noaccess);

    public boolean getIsconstellationborder();

    public void setIsconstellationborder(boolean isconstellationborder);

    public boolean getIsregionborder();

    public void setIsregionborder(boolean isregionborder);

    public java.sql.Date getDownloaddate();

    public void setDownloaddate(java.sql.Date downloaddate);

    public ISecurity_islandPK getSecurity_islandPK();

    public void setSecurity_islandPK(ISecurity_islandPK security_islandPK);

    public IConstellationPK getConstellationPK();

    public void setConstellationPK(IConstellationPK constellationPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();

    public int getNpc_kills();

    public void setNpc_kills(int npc_kills);

    public int getPod_kills();

    public void setPod_kills(int pod_kills);

    public int getShip_kills();

    public void setShip_kills(int ship_kills);

    public int getKillmailcount();

    public void setKillmailcount(int killmailcount);

    public int getKillmailgatecount();

    public void setKillmailgatecount(int killmailgatecount);

    public org.json.simple.JSONObject getKillmaildata();

    public void setKillmaildata(org.json.simple.JSONObject killmaildata);
//Custom code, do not change this line
}
