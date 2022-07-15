/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:23
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
 * @author Franky Laseure
 */
public class eOrder_history_maxdate implements eveDatabaseproperties, EntityView {

    public static final String table = "order_history_maxdate";
    private java.sql.Date maxdate;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }
    
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };
	  
    public eOrder_history_maxdate() {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public java.sql.Date getMaxdate() {
        return this.maxdate;
    }

    public void setMaxdate(java.sql.Date maxdate) {
        this.maxdate = maxdate;
    }

}
