/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
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

public class eView_order_region_evetype implements eveDatabaseproperties, EntityView {

    public static final String table = "view_order_region_evetype";
    private long region;
    private long evetype;
	  
    @Override
    public String getDbtool() {
        return eView_order_region_evetype.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_order_region_evetype.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_order_region_evetype() {
    }

    public boolean isEmpty() {
        return false;
    }

    public long getRegion() {
        return this.region;
    }

    public void setRegion(long region) {
        this.region = region;
    }

    public long getEvetype() {
        return this.evetype;
    }

    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

}
