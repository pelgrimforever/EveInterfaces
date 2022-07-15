/*
 * eRegion.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:24
 *
 */

package eve.entity;

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

import eve.eveDatabaseproperties;
import eve.entity.pk.*;
import eve.interfaces.logicentity.IRegion;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Region
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Region Entity
 * 
 * @author Franky Laseure
 */
public class eRegion extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected RegionPK regionPK;
    private java.lang.String name;
    private boolean noaccess;
    private int orderpages;
    private int ordererrors;
    private int contractpages;
    private int contracterrors;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "region";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IRegion.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRegion.fieldtypes[fieldconstant-1];
    }
        
    public eRegion() {
    }

    public eRegion(long id) {
        this.regionPK = new RegionPK(id);
    }
  
    public eRegion(RegionPK regionPK) {
        this.regionPK = regionPK;
    }

    @Override
    public boolean isEmpty() {
        return this.regionPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.regionPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.regionPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IRegion.NAME, name);
        updates.put(IRegion.NOACCESS, noaccess);
        updates.put(IRegion.ORDERPAGES, orderpages);
        updates.put(IRegion.ORDERERRORS, ordererrors);
        updates.put(IRegion.CONTRACTPAGES, contractpages);
        updates.put(IRegion.CONTRACTERRORS, contracterrors);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return RegionPK
     */
    @Override
    public RegionPK getPrimaryKey() {
        return this.regionPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IRegion.NAME, name);
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
        updates.put(IRegion.NOACCESS, noaccess);
        this.noaccess = noaccess;
    }

    public int getOrderpages() {
        return this.orderpages;
    }

    public void initOrderpages(int orderpages) {
        this.orderpages = orderpages;
    }

    public void setOrderpages(int orderpages) {
        updates.put(IRegion.ORDERPAGES, orderpages);
        this.orderpages = orderpages;
    }

    public int getOrdererrors() {
        return this.ordererrors;
    }

    public void initOrdererrors(int ordererrors) {
        this.ordererrors = ordererrors;
    }

    public void setOrdererrors(int ordererrors) {
        updates.put(IRegion.ORDERERRORS, ordererrors);
        this.ordererrors = ordererrors;
    }

    public int getContractpages() {
        return this.contractpages;
    }

    public void initContractpages(int contractpages) {
        this.contractpages = contractpages;
    }

    public void setContractpages(int contractpages) {
        updates.put(IRegion.CONTRACTPAGES, contractpages);
        this.contractpages = contractpages;
    }

    public int getContracterrors() {
        return this.contracterrors;
    }

    public void initContracterrors(int contracterrors) {
        this.contracterrors = contracterrors;
    }

    public void setContracterrors(int contracterrors) {
        updates.put(IRegion.CONTRACTERRORS, contracterrors);
        this.contracterrors = contracterrors;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
