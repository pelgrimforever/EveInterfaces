/*
 * eAlliance.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IAlliance;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Alliance
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Alliance Entity
 * 
 * @author Franky Laseure
 */
public class eAlliance extends AbstractEntity implements EntityInterface {

    protected AlliancePK alliancePK;
    private CorporationPK corporationCreator_corporationPK;
    private CorporationPK corporationExecutor_corporationPK;
    private java.lang.String name;
    private long creator;
    private java.sql.Timestamp date_founded;
    private java.lang.String ticker;
    private long faction_id;
	  
    public static final String table = "alliance";
    public static final String SQLWhere1 = "id = :alliance.id:";
    public static final String SQLSelect1 = "select alliance.* from alliance where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from alliance where " + SQLWhere1;
    public static final String SQLSelectAll = "select alliance.* from alliance";
	  
    public String getFieldname(short fieldconstant) {
        return IAlliance.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IAlliance.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Alliance
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Alliance (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Alliance (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Alliances
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Alliance class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Alliance entity
     */
    public eAlliance() {
    }

    /**
     * Constructor
     * build an empty Alliance entity with initialized field values
     */
    public eAlliance(long id) {
        this.alliancePK = new AlliancePK(id);
    }
  
    /**
     * Constructor
     * build an empty Alliance entity with initialized Primarykey parameter
     * @param alliancePK: Alliance Primarykey
     */
    public eAlliance(AlliancePK alliancePK) {
        this.alliancePK = alliancePK;
    }

    /**
     * @return is Alliance Empty ?
     */
    public boolean isEmpty() {
        return this.alliancePK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.alliancePK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.alliancePK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IAlliance.CREATOR_CORPORATION, this.corporationCreator_corporationPK.getId());

        updates.put(IAlliance.EXECUTOR_CORPORATION, this.corporationExecutor_corporationPK.getId());

        updates.put(IAlliance.NAME, name);
        updates.put(IAlliance.CREATOR, creator);
        updates.put(IAlliance.DATE_FOUNDED, date_founded);
        updates.put(IAlliance.TICKER, ticker);
        updates.put(IAlliance.FACTION_ID, faction_id);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
    public AlliancePK getPrimaryKey() {
        return this.alliancePK;
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
            updates.put(IAlliance.NAME, name);
        }
        this.name = name;
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
        updates.put(IAlliance.CREATOR, creator);
        this.creator = creator;
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
        updates.put(IAlliance.DATE_FOUNDED, date_founded);
        this.date_founded = date_founded;
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
            updates.put(IAlliance.TICKER, ticker);
        }
        this.ticker = ticker;
    }

    /**
     * 
     * @return faction_id value
     */
    public long getFaction_id() {
        return this.faction_id;
    }

    /**
     * set faction_id value
     * @param faction_id: new value
     */
    public void initFaction_id(long faction_id) {
        this.faction_id = faction_id;
    }

    /**
     * set faction_id value
     * @param faction_id: new value
     */
    public void setFaction_id(long faction_id) {
        updates.put(IAlliance.FACTION_ID, faction_id);
        this.faction_id = faction_id;
    }

    /**
     * 
     * @return foreign key corporationPK1, instance of CorporationPK
     */
    public CorporationPK getCorporationcreator_corporationPK() {
        return this.corporationCreator_corporationPK;
    }

    /**
     * set foreign key corporation
     * @param corporationPK: instance of CorporationPK
     */
    public void initCorporationcreator_corporationPK(ICorporationPK corporationCreator_corporationPK) {
        this.corporationCreator_corporationPK = (CorporationPK)corporationCreator_corporationPK;
    }

    /**
     * set foreign key corporation
     * @param corporationPK: instance of CorporationPK
     */
    public void setCorporationcreator_corporationPK(ICorporationPK corporationCreator_corporationPK) {
	if(corporationCreator_corporationPK==null && corporationCreator_corporationPK!=this.corporationCreator_corporationPK || corporationCreator_corporationPK!=null) {
            if(corporationCreator_corporationPK==null) {
                updates.put(IAlliance.CREATOR_CORPORATION, null);
            } else {
                updates.put(IAlliance.CREATOR_CORPORATION, corporationCreator_corporationPK.getId());
            }
        }
        this.corporationCreator_corporationPK = (CorporationPK)corporationCreator_corporationPK;
    }

    /**
     * 
     * @return foreign key corporationPK, instance of CorporationPK
     */
    public CorporationPK getCorporationexecutor_corporationPK() {
        return this.corporationExecutor_corporationPK;
    }

    /**
     * set foreign key corporation
     * @param corporationPK: instance of CorporationPK
     */
    public void initCorporationexecutor_corporationPK(ICorporationPK corporationExecutor_corporationPK) {
        this.corporationExecutor_corporationPK = (CorporationPK)corporationExecutor_corporationPK;
    }

    /**
     * set foreign key corporation
     * @param corporationPK: instance of CorporationPK
     */
    public void setCorporationexecutor_corporationPK(ICorporationPK corporationExecutor_corporationPK) {
	if(corporationExecutor_corporationPK==null && corporationExecutor_corporationPK!=this.corporationExecutor_corporationPK || corporationExecutor_corporationPK!=null) {
            if(corporationExecutor_corporationPK==null) {
                updates.put(IAlliance.EXECUTOR_CORPORATION, null);
            } else {
                updates.put(IAlliance.EXECUTOR_CORPORATION, corporationExecutor_corporationPK.getId());
            }
        }
        this.corporationExecutor_corporationPK = (CorporationPK)corporationExecutor_corporationPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
