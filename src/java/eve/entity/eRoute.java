/*
 * eRoute.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
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
import eve.interfaces.logicentity.IRoute;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Route
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Route Entity
 * 
 * @author Franky Laseure
 */
public class eRoute extends AbstractEntity implements EntityInterface {

    protected RoutePK routePK;
    private piJson jsonroutes;
	  
    public static final String table = "route";
    public static final String SQLWhere1 = "routetype = :route.routetype: and system = :route.system:";
    public static final String SQLSelect1 = "select route.* from route where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from route where " + SQLWhere1;
    public static final String SQLSelectAll = "select route.* from route";
	  
    public String getFieldname(short fieldconstant) {
        return IRoute.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRoute.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Route
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Route (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Route (=Primarykey)
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
     * @return SQL select statement for all Routes
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.routePK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.routePK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IRoute.JSONROUTES, jsonroutes);
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
