/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

public class eOrder_history_maxdate implements eveDatabaseproperties, EntityView {

    public static final String table = "order_history_maxdate";
    private java.sql.Date maxdate;
	  
    @Override
    public String getDbtool() {
        return eOrder_history_maxdate.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eOrder_history_maxdate.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eOrder_history_maxdate() {
    }

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
