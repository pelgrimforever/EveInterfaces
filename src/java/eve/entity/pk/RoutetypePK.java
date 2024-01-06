/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IRoutetype;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class RoutetypePK implements IRoutetypePK {

    private long id;
  
    public RoutetypePK() {
    }

    public RoutetypePK(long id) {
        this.id = id;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"routetype.id", id}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IRoutetype.ID, id}
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

    public static RoutetypePK getKey(String keystring) {
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
            return new RoutetypePK(id);
        }
    }

    public boolean equals(IRoutetypePK routetypePK2) {
        boolean isequal = routetypePK2!=null;
        if(isequal) {
            isequal = isequal && this.id == routetypePK2.getId();
        }
        return isequal;
    }
}
