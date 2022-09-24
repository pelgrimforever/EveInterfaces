/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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
        
    @Override
    public String getDbtool() {
        return eCorporation.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eCorporation.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eCorporation() {
    }

    public eCorporation(long id) {
        this.corporationPK = new CorporationPK(id);
    }
  
    public eCorporation(CorporationPK corporationPK) {
        this.corporationPK = corporationPK;
    }

    public boolean isEmpty() {
        return this.corporationPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.corporationPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.corporationPK.getPrimarykeyvalues();	  
    }
  
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public CorporationPK getPrimaryKey() {
        return this.corporationPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ICorporation.NAME, name);
        }
        this.name = name;
    }

    public long getCeo() {
        return this.ceo;
    }

    public void initCeo(long ceo) {
        this.ceo = ceo;
    }

    public void setCeo(long ceo) {
        updates.put(ICorporation.CEO, ceo);
        this.ceo = ceo;
    }

    public long getCreator() {
        return this.creator;
    }

    public void initCreator(long creator) {
        this.creator = creator;
    }

    public void setCreator(long creator) {
        updates.put(ICorporation.CREATOR, creator);
        this.creator = creator;
    }

    public int getMember_count() {
        return this.member_count;
    }

    public void initMember_count(int member_count) {
        this.member_count = member_count;
    }

    public void setMember_count(int member_count) {
        updates.put(ICorporation.MEMBER_COUNT, member_count);
        this.member_count = member_count;
    }

    public double getTax_rate() {
        return this.tax_rate;
    }

    public void initTax_rate(double tax_rate) {
        this.tax_rate = tax_rate;
    }

    public void setTax_rate(double tax_rate) {
        updates.put(ICorporation.TAX_RATE, tax_rate);
        this.tax_rate = tax_rate;
    }

    public java.lang.String getTicker() {
        return this.ticker;
    }

    public void initTicker(java.lang.String ticker) {
        this.ticker = ticker;
    }

    public void setTicker(java.lang.String ticker) {
	if(ticker==null && ticker!=this.ticker || ticker!=null && !ticker.equals(this.ticker)) {
            updates.put(ICorporation.TICKER, ticker);
        }
        this.ticker = ticker;
    }

    public java.sql.Timestamp getDate_founded() {
        return this.date_founded;
    }

    public void initDate_founded(java.sql.Timestamp date_founded) {
        this.date_founded = date_founded;
    }

    public void setDate_founded(java.sql.Timestamp date_founded) {
        updates.put(ICorporation.DATE_FOUNDED, date_founded);
        this.date_founded = date_founded;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(ICorporation.DESCRIPTION, description);
        }
        this.description = description;
    }

    public int getShares() {
        return this.shares;
    }

    public void initShares(int shares) {
        this.shares = shares;
    }

    public void setShares(int shares) {
        updates.put(ICorporation.SHARES, shares);
        this.shares = shares;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public void initUrl(java.lang.String url) {
        this.url = url;
    }

    public void setUrl(java.lang.String url) {
	if(url==null && url!=this.url || url!=null && !url.equals(this.url)) {
            updates.put(ICorporation.URL, url);
        }
        this.url = url;
    }

    public boolean getWar_eligible() {
        return this.war_eligible;
    }

    public void initWar_eligible(boolean war_eligible) {
        this.war_eligible = war_eligible;
    }

    public void setWar_eligible(boolean war_eligible) {
        updates.put(ICorporation.WAR_ELIGIBLE, war_eligible);
        this.war_eligible = war_eligible;
    }

    public StationPK getStationPK() {
        return this.stationPK;
    }

    public void initStationPK(IStationPK stationPK) {
        this.stationPK = (StationPK)stationPK;
    }

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

    public FactionPK getFactionPK() {
        return this.factionPK;
    }

    public void initFactionPK(IFactionPK factionPK) {
        this.factionPK = (FactionPK)factionPK;
    }

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

    public AlliancePK getAlliancePK() {
        return this.alliancePK;
    }

    public void initAlliancePK(IAlliancePK alliancePK) {
        this.alliancePK = (AlliancePK)alliancePK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
