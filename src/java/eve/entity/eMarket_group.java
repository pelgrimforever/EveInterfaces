/*
 * eMarket_group.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
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
import eve.interfaces.logicentity.IMarket_group;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Market_group
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Market_group Entity
 * 
 * @author Franky Laseure
 */
public class eMarket_group extends AbstractEntity implements EntityInterface {

    protected Market_groupPK market_groupPK;
    private Market_groupPK market_groupParent_idPK;
    private java.lang.String name;
    private java.lang.String description;
	  
    public static final String table = "market_group";
    public static final String SQLWhere1 = "id = :market_group.id:";
    public static final String SQLSelect1 = "select market_group.* from market_group where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from market_group where " + SQLWhere1;
    public static final String SQLSelectAll = "select market_group.* from market_group";
	  
    public String getFieldname(short fieldconstant) {
        return IMarket_group.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IMarket_group.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Market_group
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Market_group (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Market_group (=Primarykey)
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
     * @return SQL select statement for all Market_groups
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Market_group class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Market_group entity
     */
    public eMarket_group() {
    }

    /**
     * Constructor
     * build an empty Market_group entity with initialized field values
     */
    public eMarket_group(long id) {
        this.market_groupPK = new Market_groupPK(id);
    }
  
    /**
     * Constructor
     * build an empty Market_group entity with initialized Primarykey parameter
     * @param market_groupPK: Market_group Primarykey
     */
    public eMarket_group(Market_groupPK market_groupPK) {
        this.market_groupPK = market_groupPK;
    }

    /**
     * @return is Market_group Empty ?
     */
    public boolean isEmpty() {
        return this.market_groupPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.market_groupPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.market_groupPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IMarket_group.PARENT_ID, this.market_groupParent_idPK.getId());

        updates.put(IMarket_group.NAME, name);
        updates.put(IMarket_group.DESCRIPTION, description);
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
    public Market_groupPK getPrimaryKey() {
        return this.market_groupPK;
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
            updates.put(IMarket_group.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IMarket_group.DESCRIPTION, description);
        }
        this.description = description;
    }

    /**
     * 
     * @return foreign key market_groupPK1, instance of Market_groupPK
     */
    public Market_groupPK getMarket_groupparent_idPK() {
        return this.market_groupParent_idPK;
    }

    /**
     * set foreign key market_group
     * @param market_groupPK: instance of Market_groupPK
     */
    public void initMarket_groupparent_idPK(IMarket_groupPK market_groupParent_idPK) {
        this.market_groupParent_idPK = (Market_groupPK)market_groupParent_idPK;
    }

    /**
     * set foreign key market_group
     * @param market_groupPK: instance of Market_groupPK
     */
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

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
