/*
 * eRoute.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
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
import eve.interfaces.logicentity.IRoute;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Route
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Route Entity
 * 
 * @author Franky Laseure
 */
public class eRoute extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected RoutePK routePK;
    private piJson jsonroutes;
	  
    public static final String table = "route";
	  
    public String getFieldname(short fieldconstant) {
        return IRoute.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRoute.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eRoute.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eRoute.connectionpool;
    }
    
    /**
     * 
     * @return table name for Route
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Route class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Route entity
     */
    public eRoute() {
    }

    /**
     * Constructor
     * build an empty Route entity with initialized field values
     */
    public eRoute(long routetype, long system) {
        this.routePK = new RoutePK(routetype, system);
    }
  
    /**
     * Constructor
     * build an empty Route entity with initialized Primarykey parameter
     * @param routePK: Route Primarykey
     */
    public eRoute(RoutePK routePK) {
        this.routePK = routePK;
    }

    /**
     * @return is Route Empty ?
     */
    public boolean isEmpty() {
        return this.routePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.routePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.routePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IRoute.JSONROUTES, jsonroutes);
        return getAllFields();
    }
	
    /**
     * @return RoutePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return RoutePK
     */
    @Override
    public RoutePK getPrimaryKey() {
        return this.routePK;
    }

    /**
     * 
     * @return jsonroutes value
     */
    public piJson getJsonroutes() {
        return this.jsonroutes;
    }

    /**
     * set jsonroutes value
     * @param jsonroutes: new value
     */
    public void initJsonroutes(piJson jsonroutes) {
        this.jsonroutes = jsonroutes;
    }

    /**
     * set jsonroutes value
     * @param jsonroutes: new value
     */
    public void setJsonroutes(piJson jsonroutes) {
	if(jsonroutes==null && jsonroutes!=this.jsonroutes || jsonroutes!=null && !jsonroutes.equals(this.jsonroutes)) {
            updates.put(IRoute.JSONROUTES, jsonroutes);
        }
        this.jsonroutes = jsonroutes;
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
