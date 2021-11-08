/*
 * eCorporation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
 *
 */

package eve.entity;

import eve.eveDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ICorporation;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Corporation
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Corporation Entity
 * 
 * @author Franky Laseure
 */
public class eCorporation extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected CorporationPK corporationPK;
    private StationPK stationPK;
    private FactionPK factionPK;
    private AlliancePK alliancePK;
    private java.lang.String name;
    private long ceo;
    private long creator;
    private int member_count;
    private double tax_rate;
    private java.lang.String ticker;
    private java.sql.Timestamp date_founded;
    private java.lang.String description;
    private int shares;
    private java.lang.String url;
    private boolean war_eligible;
	  
    public static final String table = "corporation";
	  
    public String getFieldname(short fieldconstant) {
        return ICorporation.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ICorporation.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eCorporation.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eCorporation.connectionpool;
    }
    
    /**
     * 
     * @return table name for Corporation
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Corporation class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Corporation entity
     */
    public eCorporation() {
    }

    /**
     * Constructor
     * build an empty Corporation entity with initialized field values
     */
    public eCorporation(long id) {
        this.corporationPK = new CorporationPK(id);
    }
  
    /**
     * Constructor
     * build an empty Corporation entity with initialized Primarykey parameter
     * @param corporationPK: Corporation Primarykey
     */
    public eCorporation(CorporationPK corporationPK) {
        this.corporationPK = corporationPK;
    }

    /**
     * @return is Corporation Empty ?
     */
    public boolean isEmpty() {
        return this.corporationPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.corporationPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.corporationPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ICorporation.HOME_STATION, this.stationPK.getId());

        updates.put(ICorporation.FACTION, this.factionPK.getId());

        updates.put(ICorporation.ALLIANCE, this.alliancePK.getId());

        updates.put(ICorporation.NAME, name);
        updates.put(ICorporation.CEO, ceo);
        updates.put(ICorporation.CREATOR, creator);
        updates.put(ICorporation.MEMBER_COUNT, member_count);
        updates.put(ICorporation.TAX_RATE, tax_rate);
        updates.put(ICorporation.TICKER, ticker);
        updates.put(ICorporation.DATE_FOUNDED, date_founded);
        updates.put(ICorporation.DESCRIPTION, description);
        updates.put(ICorporation.SHARES, shares);
        updates.put(ICorporation.URL, url);
        updates.put(ICorporation.WAR_ELIGIBLE, war_eligible);
        return getAllFields();
    }
	
    /**
     * @return CorporationPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return CorporationPK
     */
    @Override
    public CorporationPK getPrimaryKey() {
        return this.corporationPK;
    }

    /**
     * 
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void initName(java.lang.String name) {
        this.name = name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ICorporation.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return ceo value
     */
    public long getCeo() {
        return this.ceo;
    }

    /**
     * set ceo value
     * @param ceo: new value
     */
    public void initCeo(long ceo) {
        this.ceo = ceo;
    }

    /**
     * set ceo value
     * @param ceo: new value
     */
    public void setCeo(long ceo) {
        updates.put(ICorporation.CEO, ceo);
        this.ceo = ceo;
    }

    /**
     * 
     * @return creator value
     */
    public long getCreator() {
        return this.creator;
    }

    /**
     * set creator value
     * @param creator: new value
     */
    public void initCreator(long creator) {
        this.creator = creator;
    }

    /**
     * set creator value
     * @param creator: new value
     */
    public void setCreator(long creator) {
        updates.put(ICorporation.CREATOR, creator);
        this.creator = creator;
    }

    /**
     * 
     * @return member_count value
     */
    public int getMember_count() {
        return this.member_count;
    }

    /**
     * set member_count value
     * @param member_count: new value
     */
    public void initMember_count(int member_count) {
        this.member_count = member_count;
    }

    /**
     * set member_count value
     * @param member_count: new value
     */
    public void setMember_count(int member_count) {
        updates.put(ICorporation.MEMBER_COUNT, member_count);
        this.member_count = member_count;
    }

    /**
     * 
     * @return tax_rate value
     */
    public double getTax_rate() {
        return this.tax_rate;
    }

    /**
     * set tax_rate value
     * @param tax_rate: new value
     */
    public void initTax_rate(double tax_rate) {
        this.tax_rate = tax_rate;
    }

    /**
     * set tax_rate value
     * @param tax_rate: new value
     */
    public void setTax_rate(double tax_rate) {
        updates.put(ICorporation.TAX_RATE, tax_rate);
        this.tax_rate = tax_rate;
    }

    /**
     * 
     * @return ticker value
     */
    public java.lang.String getTicker() {
        return this.ticker;
    }

    /**
     * set ticker value
     * @param ticker: new value
     */
    public void initTicker(java.lang.String ticker) {
        this.ticker = ticker;
    }

    /**
     * set ticker value
     * @param ticker: new value
     */
    public void setTicker(java.lang.String ticker) {
	if(ticker==null && ticker!=this.ticker || ticker!=null && !ticker.equals(this.ticker)) {
            updates.put(ICorporation.TICKER, ticker);
        }
        this.ticker = ticker;
    }

    /**
     * 
     * @return date_founded value
     */
    public java.sql.Timestamp getDate_founded() {
        return this.date_founded;
    }

    /**
     * set date_founded value
     * @param date_founded: new value
     */
    public void initDate_founded(java.sql.Timestamp date_founded) {
        this.date_founded = date_founded;
    }

    /**
     * set date_founded value
     * @param date_founded: new value
     */
    public void setDate_founded(java.sql.Timestamp date_founded) {
        updates.put(ICorporation.DATE_FOUNDED, date_founded);
        this.date_founded = date_founded;
    }

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(ICorporation.DESCRIPTION, description);
        }
        this.description = description;
    }

    /**
     * 
     * @return shares value
     */
    public int getShares() {
        return this.shares;
    }

    /**
     * set shares value
     * @param shares: new value
     */
    public void initShares(int shares) {
        this.shares = shares;
    }

    /**
     * set shares value
     * @param shares: new value
     */
    public void setShares(int shares) {
        updates.put(ICorporation.SHARES, shares);
        this.shares = shares;
    }

    /**
     * 
     * @return url value
     */
    public java.lang.String getUrl() {
        return this.url;
    }

    /**
     * set url value
     * @param url: new value
     */
    public void initUrl(java.lang.String url) {
        this.url = url;
    }

    /**
     * set url value
     * @param url: new value
     */
    public void setUrl(java.lang.String url) {
	if(url==null && url!=this.url || url!=null && !url.equals(this.url)) {
            updates.put(ICorporation.URL, url);
        }
        this.url = url;
    }

    /**
     * 
     * @return war_eligible value
     */
    public boolean getWar_eligible() {
        return this.war_eligible;
    }

    /**
     * set war_eligible value
     * @param war_eligible: new value
     */
    public void initWar_eligible(boolean war_eligible) {
        this.war_eligible = war_eligible;
    }

    /**
     * set war_eligible value
     * @param war_eligible: new value
     */
    public void setWar_eligible(boolean war_eligible) {
        updates.put(ICorporation.WAR_ELIGIBLE, war_eligible);
        this.war_eligible = war_eligible;
    }

    /**
     * 
     * @return foreign key stationPK, instance of StationPK
     */
    public StationPK getStationPK() {
        return this.stationPK;
    }

    /**
     * set foreign key station
     * @param stationPK: instance of StationPK
     */
    public void initStationPK(IStationPK stationPK) {
        this.stationPK = (StationPK)stationPK;
    }

    /**
     * set foreign key station
     * @param stationPK: instance of StationPK
     */
    public void setStationPK(IStationPK stationPK) {
	if(stationPK==null && stationPK!=this.stationPK || stationPK!=null) {
            if(stationPK==null) {
                updates.put(ICorporation.HOME_STATION, null);
            } else {
                updates.put(ICorporation.HOME_STATION, stationPK.getId());
            }
        }
        this.stationPK = (StationPK)stationPK;
    }

    /**
     * 
     * @return foreign key factionPK, instance of FactionPK
     */
    public FactionPK getFactionPK() {
        return this.factionPK;
    }

    /**
     * set foreign key faction
     * @param factionPK: instance of FactionPK
     */
    public void initFactionPK(IFactionPK factionPK) {
        this.factionPK = (FactionPK)factionPK;
    }

    /**
     * set foreign key faction
     * @param factionPK: instance of FactionPK
     */
    public void setFactionPK(IFactionPK factionPK) {
	if(factionPK==null && factionPK!=this.factionPK || factionPK!=null) {
            if(factionPK==null) {
                updates.put(ICorporation.FACTION, null);
            } else {
                updates.put(ICorporation.FACTION, factionPK.getId());
            }
        }
        this.factionPK = (FactionPK)factionPK;
    }

    /**
     * 
     * @return foreign key alliancePK, instance of AlliancePK
     */
    public AlliancePK getAlliancePK() {
        return this.alliancePK;
    }

    /**
     * set foreign key alliance
     * @param alliancePK: instance of AlliancePK
     */
    public void initAlliancePK(IAlliancePK alliancePK) {
        this.alliancePK = (AlliancePK)alliancePK;
    }

    /**
     * set foreign key alliance
     * @param alliancePK: instance of AlliancePK
     */
    public void setAlliancePK(IAlliancePK alliancePK) {
	if(alliancePK==null && alliancePK!=this.alliancePK || alliancePK!=null) {
            if(alliancePK==null) {
                updates.put(ICorporation.ALLIANCE, null);
            } else {
                updates.put(ICorporation.ALLIANCE, alliancePK.getId());
            }
        }
        this.alliancePK = (AlliancePK)alliancePK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
