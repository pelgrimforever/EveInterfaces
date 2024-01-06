/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IRegion;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class RegionPK implements IRegionPK {

    private long id;
  
    public RegionPK() {
    }

    public RegionPK(long id) {
        this.id = id;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"region.id", id}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IRegion.ID, id}
        };
        return new Entityvalues(keyfields);
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKeystring() {
        String key = "";
        key += getId();
        return key;
    }

    public static RegionPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long id = Long.valueOf(keys.substring(0, keylength));
            return new RegionPK(id);
        }
    }

    public boolean equals(IRegionPK regionPK2) {
        boolean isequal = regionPK2!=null;
        if(isequal) {
            isequal = isequal && this.id == regionPK2.getId();
        }
        return isequal;
    }
}
