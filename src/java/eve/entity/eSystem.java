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
import eve.interfaces.logicentity.ISystem;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eSystem extends AbstractEntity implements eveDatabaseproperties, Entity {

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
    private java.sql.Date downloaddate;
	  
    public static final String table = "system";
	  
    public String getFieldname(short fieldconstant) {
        return ISystem.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISystem.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eSystem.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eSystem.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eSystem() {
    }

    public eSystem(long id) {
        this.systemPK = new SystemPK(id);
    }
  
    public eSystem(SystemPK systemPK) {
        this.systemPK = systemPK;
    }

    public boolean isEmpty() {
        return this.systemPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.systemPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.systemPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ISystem.SECURITY_ISLAND, this.security_islandPK.getId());

        updates.put(ISystem.CONSTELLATION, this.constellationPK.getId());

        updates.put(ISystem.NAME, name);
        updates.put(ISystem.SECURITY_CLASS, security_class);
        updates.put(ISystem.SECURITY_STATUS, security_status);
        updates.put(ISystem.STAR_ID, star_id);
        updates.put(ISystem.NOACCESS, noaccess);
        updates.put(ISystem.ISCONSTELLATIONBORDER, isconstellationborder);
        updates.put(ISystem.ISREGIONBORDER, isregionborder);
        updates.put(ISystem.DOWNLOADDATE, downloaddate);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public SystemPK getPrimaryKey() {
        return this.systemPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ISystem.NAME, name);
        }
        this.name = name;
    }

    public java.lang.String getSecurity_class() {
        return this.security_class;
    }

    public void initSecurity_class(java.lang.String security_class) {
        this.security_class = security_class;
    }

    public void setSecurity_class(java.lang.String security_class) {
	if(security_class==null && security_class!=this.security_class || security_class!=null && !security_class.equals(this.security_class)) {
            updates.put(ISystem.SECURITY_CLASS, security_class);
        }
        this.security_class = security_class;
    }

    public double getSecurity_status() {
        return this.security_status;
    }

    public void initSecurity_status(double security_status) {
        this.security_status = security_status;
    }

    public void setSecurity_status(double security_status) {
        updates.put(ISystem.SECURITY_STATUS, security_status);
        this.security_status = security_status;
    }

    public long getStar_id() {
        return this.star_id;
    }

    public void initStar_id(long star_id) {
        this.star_id = star_id;
    }

    public void setStar_id(long star_id) {
        updates.put(ISystem.STAR_ID, star_id);
        this.star_id = star_id;
    }

    public boolean getNoaccess() {
        return this.noaccess;
    }

    public void initNoaccess(boolean noaccess) {
        this.noaccess = noaccess;
    }

    public void setNoaccess(boolean noaccess) {
        updates.put(ISystem.NOACCESS, noaccess);
        this.noaccess = noaccess;
    }

    public boolean getIsconstellationborder() {
        return this.isconstellationborder;
    }

    public void initIsconstellationborder(boolean isconstellationborder) {
        this.isconstellationborder = isconstellationborder;
    }

    public void setIsconstellationborder(boolean isconstellationborder) {
        updates.put(ISystem.ISCONSTELLATIONBORDER, isconstellationborder);
        this.isconstellationborder = isconstellationborder;
    }

    public boolean getIsregionborder() {
        return this.isregionborder;
    }

    public void initIsregionborder(boolean isregionborder) {
        this.isregionborder = isregionborder;
    }

    public void setIsregionborder(boolean isregionborder) {
        updates.put(ISystem.ISREGIONBORDER, isregionborder);
        this.isregionborder = isregionborder;
    }

    public java.sql.Date getDownloaddate() {
        return this.downloaddate;
    }

    public void initDownloaddate(java.sql.Date downloaddate) {
        this.downloaddate = downloaddate;
    }

    public void setDownloaddate(java.sql.Date downloaddate) {
	if(downloaddate==null && downloaddate!=this.downloaddate || downloaddate!=null && !downloaddate.equals(this.downloaddate)) {
            updates.put(ISystem.DOWNLOADDATE, downloaddate);
        }
        this.downloaddate = downloaddate;
    }

    public Security_islandPK getSecurity_islandPK() {
        return this.security_islandPK;
    }

    public void initSecurity_islandPK(ISecurity_islandPK security_islandPK) {
        this.security_islandPK = (Security_islandPK)security_islandPK;
    }

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

    public ConstellationPK getConstellationPK() {
        return this.constellationPK;
    }

    public void initConstellationPK(IConstellationPK constellationPK) {
        this.constellationPK = (ConstellationPK)constellationPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
