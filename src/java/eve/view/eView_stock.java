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

public class eView_stock implements eveDatabaseproperties, EntityView {

    public static final String table = "view_stock";
    private java.lang.String username;
    private long evetype;
    private long amount;
    private java.lang.String name;
	  
    @Override
    public String getDbtool() {
        return eView_stock.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_stock.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_stock() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public long getEvetype() {
        return this.evetype;
    }

    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

}
