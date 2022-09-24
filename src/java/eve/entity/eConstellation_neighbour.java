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
import eve.interfaces.logicentity.IConstellation_neighbour;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eConstellation_neighbour extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Constellation_neighbourPK constellation_neighbourPK;
	  
    public static final String table = "constellation_neighbour";
	  
    public String getFieldname(short fieldconstant) {
        return IConstellation_neighbour.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IConstellation_neighbour.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eConstellation_neighbour.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eConstellation_neighbour.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eConstellation_neighbour() {
    }

    public eConstellation_neighbour(long constellation, long neighbour) {
        this.constellation_neighbourPK = new Constellation_neighbourPK(constellation, neighbour);
    }
  
    public eConstellation_neighbour(Constellation_neighbourPK constellation_neighbourPK) {
        this.constellation_neighbourPK = constellation_neighbourPK;
    }

    public boolean isEmpty() {
        return this.constellation_neighbourPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.constellation_neighbourPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.constellation_neighbourPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Constellation_neighbourPK getPrimaryKey() {
        return this.constellation_neighbourPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
