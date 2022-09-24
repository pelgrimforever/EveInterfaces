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
import eve.interfaces.logicentity.IContractitem;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eContractitem.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eContractitem.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eContractitem() {
    }

    public eContractitem(long id) {
        this.contractitemPK = new ContractitemPK(id);
    }
  
    public eContractitem(ContractitemPK contractitemPK) {
        this.contractitemPK = contractitemPK;
    }

    public boolean isEmpty() {
        return this.contractitemPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.contractitemPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.contractitemPK.getPrimarykeyvalues();	  
    }
  
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public ContractitemPK getPrimaryKey() {
        return this.contractitemPK;
    }

    public boolean getBlueprint_copy() {
        return this.blueprint_copy;
    }

    public void initBlueprint_copy(boolean blueprint_copy) {
        this.blueprint_copy = blueprint_copy;
    }

    public void setBlueprint_copy(boolean blueprint_copy) {
        updates.put(IContractitem.BLUEPRINT_COPY, blueprint_copy);
        this.blueprint_copy = blueprint_copy;
    }

    public boolean getIncluded() {
        return this.included;
    }

    public void initIncluded(boolean included) {
        this.included = included;
    }

    public void setIncluded(boolean included) {
        updates.put(IContractitem.INCLUDED, included);
        this.included = included;
    }

    public long getQuantity() {
        return this.quantity;
    }

    public void initQuantity(long quantity) {
        this.quantity = quantity;
    }

    public void setQuantity(long quantity) {
        updates.put(IContractitem.QUANTITY, quantity);
        this.quantity = quantity;
    }

    public int getMaterial_efficiency() {
        return this.material_efficiency;
    }

    public void initMaterial_efficiency(int material_efficiency) {
        this.material_efficiency = material_efficiency;
    }

    public void setMaterial_efficiency(int material_efficiency) {
        updates.put(IContractitem.MATERIAL_EFFICIENCY, material_efficiency);
        this.material_efficiency = material_efficiency;
    }

    public int getRuns() {
        return this.runs;
    }

    public void initRuns(int runs) {
        this.runs = runs;
    }

    public void setRuns(int runs) {
        updates.put(IContractitem.RUNS, runs);
        this.runs = runs;
    }

    public int getTime_efficiency() {
        return this.time_efficiency;
    }

    public void initTime_efficiency(int time_efficiency) {
        this.time_efficiency = time_efficiency;
    }

    public void setTime_efficiency(int time_efficiency) {
        updates.put(IContractitem.TIME_EFFICIENCY, time_efficiency);
        this.time_efficiency = time_efficiency;
    }

    public EvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void initEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = (EvetypePK)evetypePK;
    }

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

    public ContractPK getContractPK() {
        return this.contractPK;
    }

    public void initContractPK(IContractPK contractPK) {
        this.contractPK = (ContractPK)contractPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
