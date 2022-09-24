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
import eve.interfaces.logicentity.IStargate;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eStargate extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected StargatePK stargatePK;
    private SystemPK systemSystemPK;
    private SystemPK systemTo_systemPK;
    private long to_stargate;
    private java.lang.String name;
    private double x;
    private double y;
    private double z;
    private boolean isconstellationborder;
    private boolean isregionborder;
    private java.sql.Date downloaddate;
	  
    public static final String table = "stargate";
	  
    public String getFieldname(short fieldconstant) {
        return IStargate.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStargate.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eStargate.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eStargate.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eStargate() {
    }

    public eStargate(long id) {
        this.stargatePK = new StargatePK(id);
    }
  
    public eStargate(StargatePK stargatePK) {
        this.stargatePK = stargatePK;
    }

    public boolean isEmpty() {
        return this.stargatePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.stargatePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.stargatePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IStargate.SYSTEM, this.systemSystemPK.getId());

        updates.put(IStargate.TO_SYSTEM, this.systemTo_systemPK.getId());

        updates.put(IStargate.TO_STARGATE, to_stargate);
        updates.put(IStargate.NAME, name);
        updates.put(IStargate.X, x);
        updates.put(IStargate.Y, y);
        updates.put(IStargate.Z, z);
        updates.put(IStargate.ISCONSTELLATIONBORDER, isconstellationborder);
        updates.put(IStargate.ISREGIONBORDER, isregionborder);
        updates.put(IStargate.DOWNLOADDATE, downloaddate);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public StargatePK getPrimaryKey() {
        return this.stargatePK;
    }

    public long getTo_stargate() {
        return this.to_stargate;
    }

    public void initTo_stargate(long to_stargate) {
        this.to_stargate = to_stargate;
    }

    public void setTo_stargate(long to_stargate) {
        updates.put(IStargate.TO_STARGATE, to_stargate);
        this.to_stargate = to_stargate;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IStargate.NAME, name);
        }
        this.name = name;
    }

    public double getX() {
        return this.x;
    }

    public void initX(double x) {
        this.x = x;
    }

    public void setX(double x) {
        updates.put(IStargate.X, x);
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void initY(double y) {
        this.y = y;
    }

    public void setY(double y) {
        updates.put(IStargate.Y, y);
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void initZ(double z) {
        this.z = z;
    }

    public void setZ(double z) {
        updates.put(IStargate.Z, z);
        this.z = z;
    }

    public boolean getIsconstellationborder() {
        return this.isconstellationborder;
    }

    public void initIsconstellationborder(boolean isconstellationborder) {
        this.isconstellationborder = isconstellationborder;
    }

    public void setIsconstellationborder(boolean isconstellationborder) {
        updates.put(IStargate.ISCONSTELLATIONBORDER, isconstellationborder);
        this.isconstellationborder = isconstellationborder;
    }

    public boolean getIsregionborder() {
        return this.isregionborder;
    }

    public void initIsregionborder(boolean isregionborder) {
        this.isregionborder = isregionborder;
    }

    public void setIsregionborder(boolean isregionborder) {
        updates.put(IStargate.ISREGIONBORDER, isregionborder);
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
            updates.put(IStargate.DOWNLOADDATE, downloaddate);
        }
        this.downloaddate = downloaddate;
    }

    public SystemPK getSystemsystemPK() {
        return this.systemSystemPK;
    }

    public void initSystemsystemPK(ISystemPK systemSystemPK) {
        this.systemSystemPK = (SystemPK)systemSystemPK;
    }

    public void setSystemsystemPK(ISystemPK systemSystemPK) {
	if(systemSystemPK==null && systemSystemPK!=this.systemSystemPK || systemSystemPK!=null) {
            if(systemSystemPK==null) {
                updates.put(IStargate.SYSTEM, null);
            } else {
                updates.put(IStargate.SYSTEM, systemSystemPK.getId());
            }
        }
        this.systemSystemPK = (SystemPK)systemSystemPK;
    }

    public SystemPK getSystemto_systemPK() {
        return this.systemTo_systemPK;
    }

    public void initSystemto_systemPK(ISystemPK systemTo_systemPK) {
        this.systemTo_systemPK = (SystemPK)systemTo_systemPK;
    }

    public void setSystemto_systemPK(ISystemPK systemTo_systemPK) {
	if(systemTo_systemPK==null && systemTo_systemPK!=this.systemTo_systemPK || systemTo_systemPK!=null) {
            if(systemTo_systemPK==null) {
                updates.put(IStargate.TO_SYSTEM, null);
            } else {
                updates.put(IStargate.TO_SYSTEM, systemTo_systemPK.getId());
            }
        }
        this.systemTo_systemPK = (SystemPK)systemTo_systemPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
