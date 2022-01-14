/*
 * eContractitem.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
 *
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
import eve.interfaces.logicentity.IContractitem;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Contractitem
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Contractitem Entity
 * 
 * @author Franky Laseure
 */
public class eContractitem extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected ContractitemPK contractitemPK;
    private EvetypePK evetypePK;
    private ContractPK contractPK;
    private boolean blueprint_copy;
    private boolean included;
    private long quantity;
    private int material_efficiency;
    private int runs;
    private int time_efficiency;
	  
    public static final String table = "contractitem";
	  
    public String getFieldname(short fieldconstant) {
        return IContractitem.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IContractitem.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eContractitem.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eContractitem.connectionpool;
    }
    
    /**
     * 
     * @return table name for Contractitem
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Contractitem class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Contractitem entity
     */
    public eContractitem() {
    }

    /**
     * Constructor
     * build an empty Contractitem entity with initialized field values
     */
    public eContractitem(long id) {
        this.contractitemPK = new ContractitemPK(id);
    }
  
    /**
     * Constructor
     * build an empty Contractitem entity with initialized Primarykey parameter
     * @param contractitemPK: Contractitem Primarykey
     */
    public eContractitem(ContractitemPK contractitemPK) {
        this.contractitemPK = contractitemPK;
    }

    /**
     * @return is Contractitem Empty ?
     */
    public boolean isEmpty() {
        return this.contractitemPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.contractitemPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.contractitemPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IContractitem.EVETYPE, this.evetypePK.getId());

        updates.put(IContractitem.CONTRACT, this.contractPK.getId());

        updates.put(IContractitem.BLUEPRINT_COPY, blueprint_copy);
        updates.put(IContractitem.INCLUDED, included);
        updates.put(IContractitem.QUANTITY, quantity);
        updates.put(IContractitem.MATERIAL_EFFICIENCY, material_efficiency);
        updates.put(IContractitem.RUNS, runs);
        updates.put(IContractitem.TIME_EFFICIENCY, time_efficiency);
        return getAllFields();
    }
	
    /**
     * @return ContractitemPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return ContractitemPK
     */
    @Override
    public ContractitemPK getPrimaryKey() {
        return this.contractitemPK;
    }

    /**
     * 
     * @return blueprint_copy value
     */
    public boolean getBlueprint_copy() {
        return this.blueprint_copy;
    }

    /**
     * set blueprint_copy value
     * @param blueprint_copy: new value
     */
    public void initBlueprint_copy(boolean blueprint_copy) {
        this.blueprint_copy = blueprint_copy;
    }

    /**
     * set blueprint_copy value
     * @param blueprint_copy: new value
     */
    public void setBlueprint_copy(boolean blueprint_copy) {
        updates.put(IContractitem.BLUEPRINT_COPY, blueprint_copy);
        this.blueprint_copy = blueprint_copy;
    }

    /**
     * 
     * @return included value
     */
    public boolean getIncluded() {
        return this.included;
    }

    /**
     * set included value
     * @param included: new value
     */
    public void initIncluded(boolean included) {
        this.included = included;
    }

    /**
     * set included value
     * @param included: new value
     */
    public void setIncluded(boolean included) {
        updates.put(IContractitem.INCLUDED, included);
        this.included = included;
    }

    /**
     * 
     * @return quantity value
     */
    public long getQuantity() {
        return this.quantity;
    }

    /**
     * set quantity value
     * @param quantity: new value
     */
    public void initQuantity(long quantity) {
        this.quantity = quantity;
    }

    /**
     * set quantity value
     * @param quantity: new value
     */
    public void setQuantity(long quantity) {
        updates.put(IContractitem.QUANTITY, quantity);
        this.quantity = quantity;
    }

    /**
     * 
     * @return material_efficiency value
     */
    public int getMaterial_efficiency() {
        return this.material_efficiency;
    }

    /**
     * set material_efficiency value
     * @param material_efficiency: new value
     */
    public void initMaterial_efficiency(int material_efficiency) {
        this.material_efficiency = material_efficiency;
    }

    /**
     * set material_efficiency value
     * @param material_efficiency: new value
     */
    public void setMaterial_efficiency(int material_efficiency) {
        updates.put(IContractitem.MATERIAL_EFFICIENCY, material_efficiency);
        this.material_efficiency = material_efficiency;
    }

    /**
     * 
     * @return runs value
     */
    public int getRuns() {
        return this.runs;
    }

    /**
     * set runs value
     * @param runs: new value
     */
    public void initRuns(int runs) {
        this.runs = runs;
    }

    /**
     * set runs value
     * @param runs: new value
     */
    public void setRuns(int runs) {
        updates.put(IContractitem.RUNS, runs);
        this.runs = runs;
    }

    /**
     * 
     * @return time_efficiency value
     */
    public int getTime_efficiency() {
        return this.time_efficiency;
    }

    /**
     * set time_efficiency value
     * @param time_efficiency: new value
     */
    public void initTime_efficiency(int time_efficiency) {
        this.time_efficiency = time_efficiency;
    }

    /**
     * set time_efficiency value
     * @param time_efficiency: new value
     */
    public void setTime_efficiency(int time_efficiency) {
        updates.put(IContractitem.TIME_EFFICIENCY, time_efficiency);
        this.time_efficiency = time_efficiency;
    }

    /**
     * 
     * @return foreign key evetypePK, instance of EvetypePK
     */
    public EvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
    public void initEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = (EvetypePK)evetypePK;
    }

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK) {
	if(evetypePK==null && evetypePK!=this.evetypePK || evetypePK!=null) {
            if(evetypePK==null) {
                updates.put(IContractitem.EVETYPE, null);
            } else {
                updates.put(IContractitem.EVETYPE, evetypePK.getId());
            }
        }
        this.evetypePK = (EvetypePK)evetypePK;
    }

    /**
     * 
     * @return foreign key contractPK, instance of ContractPK
     */
    public ContractPK getContractPK() {
        return this.contractPK;
    }

    /**
     * set foreign key contract
     * @param contractPK: instance of ContractPK
     */
    public void initContractPK(IContractPK contractPK) {
        this.contractPK = (ContractPK)contractPK;
    }

    /**
     * set foreign key contract
     * @param contractPK: instance of ContractPK
     */
    public void setContractPK(IContractPK contractPK) {
	if(contractPK==null && contractPK!=this.contractPK || contractPK!=null) {
            if(contractPK==null) {
                updates.put(IContractitem.CONTRACT, null);
            } else {
                updates.put(IContractitem.CONTRACT, contractPK.getId());
            }
        }
        this.contractPK = (ContractPK)contractPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
