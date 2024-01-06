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
import eve.interfaces.logicentity.IRace;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eRace extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected RacePK racePK;
    private FactionPK factionPK;
    private java.lang.String name;
    private java.lang.String description;
	  
    public static final String table = "race";
	  
    public String getFieldname(short fieldconstant) {
        return IRace.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRace.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eRace.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eRace.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eRace() {
    }

    public eRace(long id) {
        this.racePK = new RacePK(id);
    }
  
    public eRace(RacePK racePK) {
        this.racePK = racePK;
    }

    public boolean isEmpty() {
        return this.racePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.racePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.racePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IRace.FACTION, this.factionPK.getId());

        updates.put(IRace.NAME, name);
        updates.put(IRace.DESCRIPTION, description);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public RacePK getPrimaryKey() {
        return this.racePK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IRace.NAME, name);
        }
        this.name = name;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IRace.DESCRIPTION, description);
        }
        this.description = description;
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
                updates.put(IRace.FACTION, null);
            } else {
                updates.put(IRace.FACTION, factionPK.getId());
            }
        }
        this.factionPK = (FactionPK)factionPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
