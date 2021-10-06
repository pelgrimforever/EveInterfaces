/*
 * eSystem.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
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
import eve.interfaces.logicentity.ISystem;
import eve.interfaces.entity.pk.*;

/**
 * Entity class System
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> System Entity
 * 
 * @author Franky Laseure
 */
public class eSystem extends AbstractEntity implements EntityInterface {

    protected SystemPK systemPK;
    private Security_islandPK security_islandPK;
    private ConstellationPK constellationPK;
    private java.lang.String name;
    private java.lang.String security_class;
    private double security_status;
    private long star_id;
    private boolean noaccess;
    private boolean isconstellationborder;
    private boolean isregionborder;
	  
    public static final String table = "system";
    public static final String SQLWhere1 = "id = :system.id:";
    public static final String SQLSelect1 = "select system.* from system where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from system where " + SQLWhere1;
    public static final String SQLSelectAll = "select system.* from system";
	  
    public String getFieldname(short fieldconstant) {
        return ISystem.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISystem.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for System
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one System (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one System (=Primarykey)
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
     * @return SQL select statement for all Systems
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return System class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty System entity
     */
    public eSystem() {
    }

    /**
     * Constructor
     * build an empty System entity with initialized field values
     */
    public eSystem(long id) {
        this.systemPK = new SystemPK(id);
    }
  
    /**
     * Constructor
     * build an empty System entity with initialized Primarykey parameter
     * @param systemPK: System Primarykey
     */
    public eSystem(SystemPK systemPK) {
        this.systemPK = systemPK;
    }

    /**
     * @return is System Empty ?
     */
    public boolean isEmpty() {
        return this.systemPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.systemPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.systemPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ISystem.SECURITY_ISLAND, this.security_islandPK.getId());

        updates.put(ISystem.CONSTELLATION, this.constellationPK.getId());

        updates.put(ISystem.NAME, name);
        updates.put(ISystem.SECURITY_CLASS, security_class);
        updates.put(ISystem.SECURITY_STATUS, security_status);
        updates.put(ISystem.STAR_ID, star_id);
        updates.put(ISystem.NOACCESS, noaccess);
        updates.put(ISystem.ISCONSTELLATIONBORDER, isconstellationborder);
        updates.put(ISystem.ISREGIONBORDER, isregionborder);
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
    public SystemPK getPrimaryKey() {
        return this.systemPK;
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
            updates.put(ISystem.NAME, name);
        }

        this.name = name;
    }

    /**
     * 
     * @return security_class value
     */
    public java.lang.String getSecurity_class() {
        return this.security_class;
    }

    /**
     * set security_class value
     * @param security_class: new value
     */
    public void initSecurity_class(java.lang.String security_class) {
        this.security_class = security_class;
    }

    /**
     * set security_class value
     * @param security_class: new value
     */
    public void setSecurity_class(java.lang.String security_class) {
	if(security_class==null && security_class!=this.security_class || security_class!=null && !security_class.equals(this.security_class)) {
            updates.put(ISystem.SECURITY_CLASS, security_class);
        }

        this.security_class = security_class;
    }

    /**
     * 
     * @return security_status value
     */
    public double getSecurity_status() {
        return this.security_status;
    }

    /**
     * set security_status value
     * @param security_status: new value
     */
    public void initSecurity_status(double security_status) {
        this.security_status = security_status;
    }

    /**
     * set security_status value
     * @param security_status: new value
     */
    public void setSecurity_status(double security_status) {
        updates.put(ISystem.SECURITY_STATUS, security_status);

        this.security_status = security_status;
    }

    /**
     * 
     * @return star_id value
     */
    public long getStar_id() {
        return this.star_id;
    }

    /**
     * set star_id value
     * @param star_id: new value
     */
    public void initStar_id(long star_id) {
        this.star_id = star_id;
    }

    /**
     * set star_id value
     * @param star_id: new value
     */
    public void setStar_id(long star_id) {
        updates.put(ISystem.STAR_ID, star_id);

        this.star_id = star_id;
    }

    /**
     * 
     * @return noaccess value
     */
    public boolean getNoaccess() {
        return this.noaccess;
    }

    /**
     * set noaccess value
     * @param noaccess: new value
     */
    public void initNoaccess(boolean noaccess) {
        this.noaccess = noaccess;
    }

    /**
     * set noaccess value
     * @param noaccess: new value
     */
    public void setNoaccess(boolean noaccess) {
        updates.put(ISystem.NOACCESS, noaccess);

        this.noaccess = noaccess;
    }

    /**
     * 
     * @return isconstellationborder value
     */
    public boolean getIsconstellationborder() {
        return this.isconstellationborder;
    }

    /**
     * set isconstellationborder value
     * @param isconstellationborder: new value
     */
    public void initIsconstellationborder(boolean isconstellationborder) {
        this.isconstellationborder = isconstellationborder;
    }

    /**
     * set isconstellationborder value
     * @param isconstellationborder: new value
     */
    public void setIsconstellationborder(boolean isconstellationborder) {
        updates.put(ISystem.ISCONSTELLATIONBORDER, isconstellationborder);

        this.isconstellationborder = isconstellationborder;
    }

    /**
     * 
     * @return isregionborder value
     */
    public boolean getIsregionborder() {
        return this.isregionborder;
    }

    /**
     * set isregionborder value
     * @param isregionborder: new value
     */
    public void initIsregionborder(boolean isregionborder) {
        this.isregionborder = isregionborder;
    }

    /**
     * set isregionborder value
     * @param isregionborder: new value
     */
    public void setIsregionborder(boolean isregionborder) {
        updates.put(ISystem.ISREGIONBORDER, isregionborder);

        this.isregionborder = isregionborder;
    }

    /**
     * 
     * @return foreign key security_islandPK, instance of Security_islandPK
     */
    public Security_islandPK getSecurity_islandPK() {
        return this.security_islandPK;
    }

    /**
     * set foreign key security_island
     * @param security_islandPK: instance of Security_islandPK
     */
    public void initSecurity_islandPK(ISecurity_islandPK security_islandPK) {
        this.security_islandPK = (Security_islandPK)security_islandPK;
    }

    /**
     * set foreign key security_island
     * @param security_islandPK: instance of Security_islandPK
     */
    public void setSecurity_islandPK(ISecurity_islandPK security_islandPK) {
	if(security_islandPK==null && security_islandPK!=this.security_islandPK || security_islandPK!=null) {
            if(security_islandPK==null) {
                updates.put(ISystem.SECURITY_ISLAND, null);
            } else {
                updates.put(ISystem.SECURITY_ISLAND, security_islandPK.getId());
            }
        }
        this.security_islandPK = (Security_islandPK)security_islandPK;
    }

    /**
     * 
     * @return foreign key constellationPK, instance of ConstellationPK
     */
    public ConstellationPK getConstellationPK() {
        return this.constellationPK;
    }

    /**
     * set foreign key constellation
     * @param constellationPK: instance of ConstellationPK
     */
    public void initConstellationPK(IConstellationPK constellationPK) {
        this.constellationPK = (ConstellationPK)constellationPK;
    }

    /**
     * set foreign key constellation
     * @param constellationPK: instance of ConstellationPK
     */
    public void setConstellationPK(IConstellationPK constellationPK) {
	if(constellationPK==null && constellationPK!=this.constellationPK || constellationPK!=null) {
            if(constellationPK==null) {
                updates.put(ISystem.CONSTELLATION, null);
            } else {
                updates.put(ISystem.CONSTELLATION, constellationPK.getId());
            }
        }
        this.constellationPK = (ConstellationPK)constellationPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
