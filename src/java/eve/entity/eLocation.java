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
import eve.interfaces.logicentity.ILocation;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eLocation extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected LocationPK locationPK;
    private SystemPK systemPK;
    private java.lang.String name;
    private boolean visited;
    private boolean access;
	  
    public static final String table = "location";
	  
    public String getFieldname(short fieldconstant) {
        return ILocation.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ILocation.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eLocation.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eLocation.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eLocation() {
    }

    public eLocation(long id) {
        this.locationPK = new LocationPK(id);
    }
  
    public eLocation(LocationPK locationPK) {
        this.locationPK = locationPK;
    }

    public boolean isEmpty() {
        return this.locationPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.locationPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.locationPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ILocation.SYSTEM, this.systemPK.getId());

        updates.put(ILocation.NAME, name);
        updates.put(ILocation.VISITED, visited);
        updates.put(ILocation.ACCESS, access);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public LocationPK getPrimaryKey() {
        return this.locationPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ILocation.NAME, name);
        }
        this.name = name;
    }

    public boolean getVisited() {
        return this.visited;
    }

    public void initVisited(boolean visited) {
        this.visited = visited;
    }

    public void setVisited(boolean visited) {
        updates.put(ILocation.VISITED, visited);
        this.visited = visited;
    }

    public boolean getAccess() {
        return this.access;
    }

    public void initAccess(boolean access) {
        this.access = access;
    }

    public void setAccess(boolean access) {
        updates.put(ILocation.ACCESS, access);
        this.access = access;
    }

    public SystemPK getSystemPK() {
        return this.systemPK;
    }

    public void initSystemPK(ISystemPK systemPK) {
        this.systemPK = (SystemPK)systemPK;
    }

    public void setSystemPK(ISystemPK systemPK) {
	if(systemPK==null && systemPK!=this.systemPK || systemPK!=null) {
            if(systemPK==null) {
                updates.put(ILocation.SYSTEM, null);
            } else {
                updates.put(ILocation.SYSTEM, systemPK.getId());
            }
        }
        this.systemPK = (SystemPK)systemPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
