/*
 * ICorporation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
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
 * Entity Interface ICorporation
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface ICorporation extends LogicEntity {

	public ICorporationPK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short CEO = 3;
    public static short CREATOR = 4;
    public static short MEMBER_COUNT = 5;
    public static short TAX_RATE = 6;
    public static short TICKER = 7;
    public static short ALLIANCE = 8;
    public static short DATE_FOUNDED = 9;
    public static short DESCRIPTION = 10;
    public static short FACTION = 11;
    public static short HOME_STATION = 12;
    public static short SHARES = 13;
    public static short URL = 14;
    public static short WAR_ELIGIBLE = 15;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_CEO = 19;
    public static final int SIZE_CREATOR = 19;
    public static final int SIZE_MEMBER_COUNT = 10;
    public static final int SIZE_TAX_RATE = 17;
    public static final int SIZE_TICKER = 20;
    public static final int SIZE_ALLIANCE = 19;
    public static final int SIZE_DATE_FOUNDED = 29;
    public static final int SIZE_DESCRIPTION = 2147483647;
    public static final int SIZE_FACTION = 19;
    public static final int SIZE_HOME_STATION = 19;
    public static final int SIZE_SHARES = 10;
    public static final int SIZE_URL = 200;
    public static final int SIZE_WAR_ELIGIBLE = 1;
    public static final String[] fieldnames = { "id", "name", "ceo", "creator", "member_count", "tax_rate", "ticker", "alliance", "date_founded", "description", "faction", "home_station", "shares", "url", "war_eligible" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_long, Datatypes.type_long, Datatypes.type_int, Datatypes.type_double, Datatypes.type_String, Datatypes.type_long, Datatypes.type_Timestamp, Datatypes.type_String, Datatypes.type_long, Datatypes.type_long, Datatypes.type_int, Datatypes.type_String, Datatypes.type_boolean };

    public static final String[] stationPKfields = { "station.id" };
    public static final String[] stationFKfields = { "corporation.home_station" };
    public static final String[] factionPKfields = { "faction.id" };
    public static final String[] factionFKfields = { "corporation.faction" };
    public static final String[] alliancePKfields = { "alliance.id" };
    public static final String[] allianceFKfields = { "corporation.alliance" };

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
     * @return ceo value
     */
    public long getCeo();

    /**
     * set ceo value
     * @param ceo: new value
     */
    public void setCeo(long ceo);

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
     * @return member_count value
     */
    public int getMember_count();

    /**
     * set member_count value
     * @param member_count: new value
     */
    public void setMember_count(int member_count);

    /**
     * 
     * @return tax_rate value
     */
    public double getTax_rate();

    /**
     * set tax_rate value
     * @param tax_rate: new value
     */
    public void setTax_rate(double tax_rate);

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
     * @return description value
     */
    public java.lang.String getDescription();

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description);

    /**
     * 
     * @return shares value
     */
    public int getShares();

    /**
     * set shares value
     * @param shares: new value
     */
    public void setShares(int shares);

    /**
     * 
     * @return url value
     */
    public java.lang.String getUrl();

    /**
     * set url value
     * @param url: new value
     */
    public void setUrl(java.lang.String url);

    /**
     * 
     * @return war_eligible value
     */
    public boolean getWar_eligible();

    /**
     * set war_eligible value
     * @param war_eligible: new value
     */
    public void setWar_eligible(boolean war_eligible);

    /**
     * 
     * @return foreign key stationPK, instance of StationPK
     */
    public IStationPK getStationPK();

    /**
     * set foreign key station
     * @param stationPK: instance of StationPK
     */
    public void setStationPK(IStationPK stationPK);

    /**
     * 
     * @return foreign key factionPK, instance of FactionPK
     */
    public IFactionPK getFactionPK();

    /**
     * set foreign key faction
     * @param factionPK: instance of FactionPK
     */
    public void setFactionPK(IFactionPK factionPK);

    /**
     * 
     * @return foreign key alliancePK, instance of AlliancePK
     */
    public IAlliancePK getAlliancePK();

    /**
     * set foreign key alliance
     * @param alliancePK: instance of AlliancePK
     */
    public void setAlliancePK(IAlliancePK alliancePK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
