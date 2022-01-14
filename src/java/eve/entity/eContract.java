/*
 * eContract.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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
import eve.interfaces.logicentity.IContract;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Contract
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Contract Entity
 * 
 * @author Franky Laseure
 */
public class eContract extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected ContractPK contractPK;
    private double collateral;
    private java.sql.Timestamp date_expired;
    private java.sql.Timestamp date_issued;
    private int days_to_complete;
    private long end_location_id;
    private boolean for_corporation;
    private double price;
    private double reward;
    private long start_location_id;
    private java.lang.String title;
    private java.lang.String type;
    private double volume;
    private int page;
    private boolean active;
	  
    public static final String table = "contract";
	  
    public String getFieldname(short fieldconstant) {
        return IContract.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IContract.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eContract.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eContract.connectionpool;
    }
    
    /**
     * 
     * @return table name for Contract
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Contract class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Contract entity
     */
    public eContract() {
    }

    /**
     * Constructor
     * build an empty Contract entity with initialized field values
     */
    public eContract(long id) {
        this.contractPK = new ContractPK(id);
    }
  
    /**
     * Constructor
     * build an empty Contract entity with initialized Primarykey parameter
     * @param contractPK: Contract Primarykey
     */
    public eContract(ContractPK contractPK) {
        this.contractPK = contractPK;
    }

    /**
     * @return is Contract Empty ?
     */
    public boolean isEmpty() {
        return this.contractPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.contractPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.contractPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IContract.COLLATERAL, collateral);
        updates.put(IContract.DATE_EXPIRED, date_expired);
        updates.put(IContract.DATE_ISSUED, date_issued);
        updates.put(IContract.DAYS_TO_COMPLETE, days_to_complete);
        updates.put(IContract.END_LOCATION_ID, end_location_id);
        updates.put(IContract.FOR_CORPORATION, for_corporation);
        updates.put(IContract.PRICE, price);
        updates.put(IContract.REWARD, reward);
        updates.put(IContract.START_LOCATION_ID, start_location_id);
        updates.put(IContract.TITLE, title);
        updates.put(IContract.TYPE, type);
        updates.put(IContract.VOLUME, volume);
        updates.put(IContract.PAGE, page);
        updates.put(IContract.ACTIVE, active);
        return getAllFields();
    }
	
    /**
     * @return ContractPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return ContractPK
     */
    @Override
    public ContractPK getPrimaryKey() {
        return this.contractPK;
    }

    /**
     * 
     * @return collateral value
     */
    public double getCollateral() {
        return this.collateral;
    }

    /**
     * set collateral value
     * @param collateral: new value
     */
    public void initCollateral(double collateral) {
        this.collateral = collateral;
    }

    /**
     * set collateral value
     * @param collateral: new value
     */
    public void setCollateral(double collateral) {
        updates.put(IContract.COLLATERAL, collateral);
        this.collateral = collateral;
    }

    /**
     * 
     * @return date_expired value
     */
    public java.sql.Timestamp getDate_expired() {
        return this.date_expired;
    }

    /**
     * set date_expired value
     * @param date_expired: new value
     */
    public void initDate_expired(java.sql.Timestamp date_expired) {
        this.date_expired = date_expired;
    }

    /**
     * set date_expired value
     * @param date_expired: new value
     */
    public void setDate_expired(java.sql.Timestamp date_expired) {
        updates.put(IContract.DATE_EXPIRED, date_expired);
        this.date_expired = date_expired;
    }

    /**
     * 
     * @return date_issued value
     */
    public java.sql.Timestamp getDate_issued() {
        return this.date_issued;
    }

    /**
     * set date_issued value
     * @param date_issued: new value
     */
    public void initDate_issued(java.sql.Timestamp date_issued) {
        this.date_issued = date_issued;
    }

    /**
     * set date_issued value
     * @param date_issued: new value
     */
    public void setDate_issued(java.sql.Timestamp date_issued) {
        updates.put(IContract.DATE_ISSUED, date_issued);
        this.date_issued = date_issued;
    }

    /**
     * 
     * @return days_to_complete value
     */
    public int getDays_to_complete() {
        return this.days_to_complete;
    }

    /**
     * set days_to_complete value
     * @param days_to_complete: new value
     */
    public void initDays_to_complete(int days_to_complete) {
        this.days_to_complete = days_to_complete;
    }

    /**
     * set days_to_complete value
     * @param days_to_complete: new value
     */
    public void setDays_to_complete(int days_to_complete) {
        updates.put(IContract.DAYS_TO_COMPLETE, days_to_complete);
        this.days_to_complete = days_to_complete;
    }

    /**
     * 
     * @return end_location_id value
     */
    public long getEnd_location_id() {
        return this.end_location_id;
    }

    /**
     * set end_location_id value
     * @param end_location_id: new value
     */
    public void initEnd_location_id(long end_location_id) {
        this.end_location_id = end_location_id;
    }

    /**
     * set end_location_id value
     * @param end_location_id: new value
     */
    public void setEnd_location_id(long end_location_id) {
        updates.put(IContract.END_LOCATION_ID, end_location_id);
        this.end_location_id = end_location_id;
    }

    /**
     * 
     * @return for_corporation value
     */
    public boolean getFor_corporation() {
        return this.for_corporation;
    }

    /**
     * set for_corporation value
     * @param for_corporation: new value
     */
    public void initFor_corporation(boolean for_corporation) {
        this.for_corporation = for_corporation;
    }

    /**
     * set for_corporation value
     * @param for_corporation: new value
     */
    public void setFor_corporation(boolean for_corporation) {
        updates.put(IContract.FOR_CORPORATION, for_corporation);
        this.for_corporation = for_corporation;
    }

    /**
     * 
     * @return price value
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * set price value
     * @param price: new value
     */
    public void initPrice(double price) {
        this.price = price;
    }

    /**
     * set price value
     * @param price: new value
     */
    public void setPrice(double price) {
        updates.put(IContract.PRICE, price);
        this.price = price;
    }

    /**
     * 
     * @return reward value
     */
    public double getReward() {
        return this.reward;
    }

    /**
     * set reward value
     * @param reward: new value
     */
    public void initReward(double reward) {
        this.reward = reward;
    }

    /**
     * set reward value
     * @param reward: new value
     */
    public void setReward(double reward) {
        updates.put(IContract.REWARD, reward);
        this.reward = reward;
    }

    /**
     * 
     * @return start_location_id value
     */
    public long getStart_location_id() {
        return this.start_location_id;
    }

    /**
     * set start_location_id value
     * @param start_location_id: new value
     */
    public void initStart_location_id(long start_location_id) {
        this.start_location_id = start_location_id;
    }

    /**
     * set start_location_id value
     * @param start_location_id: new value
     */
    public void setStart_location_id(long start_location_id) {
        updates.put(IContract.START_LOCATION_ID, start_location_id);
        this.start_location_id = start_location_id;
    }

    /**
     * 
     * @return title value
     */
    public java.lang.String getTitle() {
        return this.title;
    }

    /**
     * set title value
     * @param title: new value
     */
    public void initTitle(java.lang.String title) {
        this.title = title;
    }

    /**
     * set title value
     * @param title: new value
     */
    public void setTitle(java.lang.String title) {
	if(title==null && title!=this.title || title!=null && !title.equals(this.title)) {
            updates.put(IContract.TITLE, title);
        }
        this.title = title;
    }

    /**
     * 
     * @return type value
     */
    public java.lang.String getType() {
        return this.type;
    }

    /**
     * set type value
     * @param type: new value
     */
    public void initType(java.lang.String type) {
        this.type = type;
    }

    /**
     * set type value
     * @param type: new value
     */
    public void setType(java.lang.String type) {
	if(type==null && type!=this.type || type!=null && !type.equals(this.type)) {
            updates.put(IContract.TYPE, type);
        }
        this.type = type;
    }

    /**
     * 
     * @return volume value
     */
    public double getVolume() {
        return this.volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void initVolume(double volume) {
        this.volume = volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(double volume) {
        updates.put(IContract.VOLUME, volume);
        this.volume = volume;
    }

    /**
     * 
     * @return page value
     */
    public int getPage() {
        return this.page;
    }

    /**
     * set page value
     * @param page: new value
     */
    public void initPage(int page) {
        this.page = page;
    }

    /**
     * set page value
     * @param page: new value
     */
    public void setPage(int page) {
        updates.put(IContract.PAGE, page);
        this.page = page;
    }

    /**
     * 
     * @return active value
     */
    public boolean getActive() {
        return this.active;
    }

    /**
     * set active value
     * @param active: new value
     */
    public void initActive(boolean active) {
        this.active = active;
    }

    /**
     * set active value
     * @param active: new value
     */
    public void setActive(boolean active) {
        updates.put(IContract.ACTIVE, active);
        this.active = active;
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
