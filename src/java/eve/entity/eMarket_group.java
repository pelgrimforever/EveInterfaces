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
import eve.interfaces.logicentity.IMarket_group;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eMarket_group extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Market_groupPK market_groupPK;
    private Market_groupPK market_groupParent_idPK;
    private java.lang.String name;
    private java.lang.String description;
	  
    public static final String table = "market_group";
	  
    public String getFieldname(short fieldconstant) {
        return IMarket_group.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IMarket_group.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eMarket_group.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eMarket_group.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eMarket_group() {
    }

    public eMarket_group(long id) {
        this.market_groupPK = new Market_groupPK(id);
    }
  
    public eMarket_group(Market_groupPK market_groupPK) {
        this.market_groupPK = market_groupPK;
    }

    public boolean isEmpty() {
        return this.market_groupPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.market_groupPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.market_groupPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IMarket_group.PARENT_ID, this.market_groupParent_idPK.getId());

        updates.put(IMarket_group.NAME, name);
        updates.put(IMarket_group.DESCRIPTION, description);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Market_groupPK getPrimaryKey() {
        return this.market_groupPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IMarket_group.NAME, name);
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
            updates.put(IMarket_group.DESCRIPTION, description);
        }
        this.description = description;
    }

    public Market_groupPK getMarket_groupparent_idPK() {
        return this.market_groupParent_idPK;
    }

    public void initMarket_groupparent_idPK(IMarket_groupPK market_groupParent_idPK) {
        this.market_groupParent_idPK = (Market_groupPK)market_groupParent_idPK;
    }

    public void setMarket_groupparent_idPK(IMarket_groupPK market_groupParent_idPK) {
	if(market_groupParent_idPK==null && market_groupParent_idPK!=this.market_groupParent_idPK || market_groupParent_idPK!=null) {
            if(market_groupParent_idPK==null) {
                updates.put(IMarket_group.PARENT_ID, null);
            } else {
                updates.put(IMarket_group.PARENT_ID, market_groupParent_idPK.getId());
            }
        }
        this.market_groupParent_idPK = (Market_groupPK)market_groupParent_idPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
