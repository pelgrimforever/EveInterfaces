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

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public long getCeo();

    public void setCeo(long ceo);

    public long getCreator();

    public void setCreator(long creator);

    public int getMember_count();

    public void setMember_count(int member_count);

    public double getTax_rate();

    public void setTax_rate(double tax_rate);

    public java.lang.String getTicker();

    public void setTicker(java.lang.String ticker);

    public java.sql.Timestamp getDate_founded();

    public void setDate_founded(java.sql.Timestamp date_founded);

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    public int getShares();

    public void setShares(int shares);

    public java.lang.String getUrl();

    public void setUrl(java.lang.String url);

    public boolean getWar_eligible();

    public void setWar_eligible(boolean war_eligible);

    public IStationPK getStationPK();

    public void setStationPK(IStationPK stationPK);

    public IFactionPK getFactionPK();

    public void setFactionPK(IFactionPK factionPK);

    public IAlliancePK getAlliancePK();

    public void setAlliancePK(IAlliancePK alliancePK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
