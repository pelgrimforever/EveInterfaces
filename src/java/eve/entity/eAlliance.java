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
import eve.interfaces.logicentity.IAlliance;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eAlliance extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected AlliancePK alliancePK;
    private CorporationPK corporationCreator_corporationPK;
    private CorporationPK corporationExecutor_corporationPK;
    private java.lang.String name;
    private long creator;
    private java.sql.Timestamp date_founded;
    private java.lang.String ticker;
    private long faction_id;
	  
    public static final String table = "alliance";
	  
    public String getFieldname(short fieldconstant) {
        return IAlliance.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IAlliance.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eAlliance.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eAlliance.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eAlliance() {
    }

    public eAlliance(long id) {
        this.alliancePK = new AlliancePK(id);
    }
  
    public eAlliance(AlliancePK alliancePK) {
        this.alliancePK = alliancePK;
    }

    public boolean isEmpty() {
        return this.alliancePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.alliancePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.alliancePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IAlliance.CREATOR_CORPORATION, this.corporationCreator_corporationPK.getId());

        updates.put(IAlliance.EXECUTOR_CORPORATION, this.corporationExecutor_corporationPK.getId());

        updates.put(IAlliance.NAME, name);
        updates.put(IAlliance.CREATOR, creator);
        updates.put(IAlliance.DATE_FOUNDED, date_founded);
        updates.put(IAlliance.TICKER, ticker);
        updates.put(IAlliance.FACTION_ID, faction_id);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public AlliancePK getPrimaryKey() {
        return this.alliancePK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IAlliance.NAME, name);
        }
        this.name = name;
    }

    public long getCreator() {
        return this.creator;
    }

    public void initCreator(long creator) {
        this.creator = creator;
    }

    public void setCreator(long creator) {
        updates.put(IAlliance.CREATOR, creator);
        this.creator = creator;
    }

    public java.sql.Timestamp getDate_founded() {
        return this.date_founded;
    }

    public void initDate_founded(java.sql.Timestamp date_founded) {
        this.date_founded = date_founded;
    }

    public void setDate_founded(java.sql.Timestamp date_founded) {
        updates.put(IAlliance.DATE_FOUNDED, date_founded);
        this.date_founded = date_founded;
    }

    public java.lang.String getTicker() {
        return this.ticker;
    }

    public void initTicker(java.lang.String ticker) {
        this.ticker = ticker;
    }

    public void setTicker(java.lang.String ticker) {
	if(ticker==null && ticker!=this.ticker || ticker!=null && !ticker.equals(this.ticker)) {
            updates.put(IAlliance.TICKER, ticker);
        }
        this.ticker = ticker;
    }

    public long getFaction_id() {
        return this.faction_id;
    }

    public void initFaction_id(long faction_id) {
        this.faction_id = faction_id;
    }

    public void setFaction_id(long faction_id) {
        updates.put(IAlliance.FACTION_ID, faction_id);
        this.faction_id = faction_id;
    }

    public CorporationPK getCorporationcreator_corporationPK() {
        return this.corporationCreator_corporationPK;
    }

    public void initCorporationcreator_corporationPK(ICorporationPK corporationCreator_corporationPK) {
        this.corporationCreator_corporationPK = (CorporationPK)corporationCreator_corporationPK;
    }

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

    public CorporationPK getCorporationexecutor_corporationPK() {
        return this.corporationExecutor_corporationPK;
    }

    public void initCorporationexecutor_corporationPK(ICorporationPK corporationExecutor_corporationPK) {
        this.corporationExecutor_corporationPK = (CorporationPK)corporationExecutor_corporationPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
