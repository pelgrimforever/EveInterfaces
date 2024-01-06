/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
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
import eve.interfaces.logicentity.IContract;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eContract.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eContract.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eContract() {
    }

    public eContract(long id) {
        this.contractPK = new ContractPK(id);
    }
  
    public eContract(ContractPK contractPK) {
        this.contractPK = contractPK;
    }

    public boolean isEmpty() {
        return this.contractPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.contractPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.contractPK.getPrimarykeyvalues();	  
    }
  
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public ContractPK getPrimaryKey() {
        return this.contractPK;
    }

    public double getCollateral() {
        return this.collateral;
    }

    public void initCollateral(double collateral) {
        this.collateral = collateral;
    }

    public void setCollateral(double collateral) {
        updates.put(IContract.COLLATERAL, collateral);
        this.collateral = collateral;
    }

    public java.sql.Timestamp getDate_expired() {
        return this.date_expired;
    }

    public void initDate_expired(java.sql.Timestamp date_expired) {
        this.date_expired = date_expired;
    }

    public void setDate_expired(java.sql.Timestamp date_expired) {
        updates.put(IContract.DATE_EXPIRED, date_expired);
        this.date_expired = date_expired;
    }

    public java.sql.Timestamp getDate_issued() {
        return this.date_issued;
    }

    public void initDate_issued(java.sql.Timestamp date_issued) {
        this.date_issued = date_issued;
    }

    public void setDate_issued(java.sql.Timestamp date_issued) {
        updates.put(IContract.DATE_ISSUED, date_issued);
        this.date_issued = date_issued;
    }

    public int getDays_to_complete() {
        return this.days_to_complete;
    }

    public void initDays_to_complete(int days_to_complete) {
        this.days_to_complete = days_to_complete;
    }

    public void setDays_to_complete(int days_to_complete) {
        updates.put(IContract.DAYS_TO_COMPLETE, days_to_complete);
        this.days_to_complete = days_to_complete;
    }

    public long getEnd_location_id() {
        return this.end_location_id;
    }

    public void initEnd_location_id(long end_location_id) {
        this.end_location_id = end_location_id;
    }

    public void setEnd_location_id(long end_location_id) {
        updates.put(IContract.END_LOCATION_ID, end_location_id);
        this.end_location_id = end_location_id;
    }

    public boolean getFor_corporation() {
        return this.for_corporation;
    }

    public void initFor_corporation(boolean for_corporation) {
        this.for_corporation = for_corporation;
    }

    public void setFor_corporation(boolean for_corporation) {
        updates.put(IContract.FOR_CORPORATION, for_corporation);
        this.for_corporation = for_corporation;
    }

    public double getPrice() {
        return this.price;
    }

    public void initPrice(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        updates.put(IContract.PRICE, price);
        this.price = price;
    }

    public double getReward() {
        return this.reward;
    }

    public void initReward(double reward) {
        this.reward = reward;
    }

    public void setReward(double reward) {
        updates.put(IContract.REWARD, reward);
        this.reward = reward;
    }

    public long getStart_location_id() {
        return this.start_location_id;
    }

    public void initStart_location_id(long start_location_id) {
        this.start_location_id = start_location_id;
    }

    public void setStart_location_id(long start_location_id) {
        updates.put(IContract.START_LOCATION_ID, start_location_id);
        this.start_location_id = start_location_id;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public void initTitle(java.lang.String title) {
        this.title = title;
    }

    public void setTitle(java.lang.String title) {
	if(title==null && title!=this.title || title!=null && !title.equals(this.title)) {
            updates.put(IContract.TITLE, title);
        }
        this.title = title;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public void initType(java.lang.String type) {
        this.type = type;
    }

    public void setType(java.lang.String type) {
	if(type==null && type!=this.type || type!=null && !type.equals(this.type)) {
            updates.put(IContract.TYPE, type);
        }
        this.type = type;
    }

    public double getVolume() {
        return this.volume;
    }

    public void initVolume(double volume) {
        this.volume = volume;
    }

    public void setVolume(double volume) {
        updates.put(IContract.VOLUME, volume);
        this.volume = volume;
    }

    public int getPage() {
        return this.page;
    }

    public void initPage(int page) {
        this.page = page;
    }

    public void setPage(int page) {
        updates.put(IContract.PAGE, page);
        this.page = page;
    }

    public boolean getActive() {
        return this.active;
    }

    public void initActive(boolean active) {
        this.active = active;
    }

    public void setActive(boolean active) {
        updates.put(IContract.ACTIVE, active);
        this.active = active;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
