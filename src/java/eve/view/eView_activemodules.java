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

public class eView_activemodules implements eveDatabaseproperties, EntityView {

    public static final String table = "view_activemodules";
    private long typegroupid;
    private java.lang.String typegroupname;
    private long id;
    private java.lang.String name;
	  
    @Override
    public String getDbtool() {
        return eView_activemodules.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_activemodules.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_activemodules() {
    }

    public boolean isEmpty() {
        return false;
    }

    public long getTypegroupid() {
        return this.typegroupid;
    }

    public void setTypegroupid(long typegroupid) {
        this.typegroupid = typegroupid;
    }

    public java.lang.String getTypegroupname() {
        return this.typegroupname;
    }

    public void setTypegroupname(java.lang.String typegroupname) {
        this.typegroupname = typegroupname;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

}
