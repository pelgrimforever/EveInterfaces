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
import eve.interfaces.logicentity.IConstellation;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eConstellation extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected ConstellationPK constellationPK;
    private RegionPK regionPK;
    private java.lang.String name;
    private boolean noaccess;
	  
    public static final String table = "constellation";
	  
    public String getFieldname(short fieldconstant) {
        return IConstellation.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IConstellation.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eConstellation.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eConstellation.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eConstellation() {
    }

    public eConstellation(long id) {
        this.constellationPK = new ConstellationPK(id);
    }
  
    public eConstellation(ConstellationPK constellationPK) {
        this.constellationPK = constellationPK;
    }

    public boolean isEmpty() {
        return this.constellationPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.constellationPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.constellationPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IConstellation.REGION, this.regionPK.getId());

        updates.put(IConstellation.NAME, name);
        updates.put(IConstellation.NOACCESS, noaccess);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public ConstellationPK getPrimaryKey() {
        return this.constellationPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IConstellation.NAME, name);
        }
        this.name = name;
    }

    public boolean getNoaccess() {
        return this.noaccess;
    }

    public void initNoaccess(boolean noaccess) {
        this.noaccess = noaccess;
    }

    public void setNoaccess(boolean noaccess) {
        updates.put(IConstellation.NOACCESS, noaccess);
        this.noaccess = noaccess;
    }

    public RegionPK getRegionPK() {
        return this.regionPK;
    }

    public void initRegionPK(IRegionPK regionPK) {
        this.regionPK = (RegionPK)regionPK;
    }

    public void setRegionPK(IRegionPK regionPK) {
	if(regionPK==null && regionPK!=this.regionPK || regionPK!=null) {
            if(regionPK==null) {
                updates.put(IConstellation.REGION, null);
            } else {
                updates.put(IConstellation.REGION, regionPK.getId());
            }
        }
        this.regionPK = (RegionPK)regionPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
