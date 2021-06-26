/*
 * eView_order_region_evetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.view;

import data.interfaces.db.EntityViewInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

/**
 * View class View_order_region_evetype
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_order_region_evetype Entity
 * 
 * @author Franky Laseure
 */
public class eView_order_region_evetype implements EntityViewInterface {

    private long region;
    private long evetype;
	  
    public static final String table = "view_order_region_evetype";
    public static final String SQLSelectAll = "select view_order_region_evetype.* from view_order_region_evetype";
	  
    /**
     * 
     * @return view name for View_order_region_evetype
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_order_region_evetypes
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_order_region_evetype class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_order_region_evetype entity
     */
    public eView_order_region_evetype() {
    }

    /**
     * @return is View_order_region_evetype Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return region value
     */
    public long getRegion() {
        return this.region;
    }

    /**
     * set region value
     * @param region: new value
     */
    public void setRegion(long region) {
        this.region = region;
    }

    /**
     * 
     * @return evetype value
     */
    public long getEvetype() {
        return this.evetype;
    }

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

}
