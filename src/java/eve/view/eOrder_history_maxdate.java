/*
 * eOrder_history_maxdate.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.view;

import eve.eveDatabaseproperties;
import data.interfaces.db.EntityView;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

/**
 * View class Order_history_maxdate
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Order_history_maxdate Entity
 * 
 * @author Franky Laseure
 */
public class eOrder_history_maxdate implements eveDatabaseproperties, EntityView {

    public static final String table = "order_history_maxdate";
    private java.sql.Date maxdate;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eOrder_history_maxdate.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eOrder_history_maxdate.connectionpool;
    }
    
    /**
     * 
     * @return view name for Order_history_maxdate
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Order_history_maxdate class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Order_history_maxdate entity
     */
    public eOrder_history_maxdate() {
    }

    /**
     * @return is Order_history_maxdate Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return maxdate value
     */
    public java.sql.Date getMaxdate() {
        return this.maxdate;
    }

    /**
     * set maxdate value
     * @param maxdate: new value
     */
    public void setMaxdate(java.sql.Date maxdate) {
        this.maxdate = maxdate;
    }

}
