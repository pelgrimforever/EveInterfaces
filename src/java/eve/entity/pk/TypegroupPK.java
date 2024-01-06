/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ITypegroup;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class TypegroupPK implements ITypegroupPK {

    private long id;
  
    public TypegroupPK() {
    }

    public TypegroupPK(long id) {
        this.id = id;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"typegroup.id", id}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ITypegroup.ID, id}
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

    public static TypegroupPK getKey(String keystring) {
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
            return new TypegroupPK(id);
        }
    }

    public boolean equals(ITypegroupPK typegroupPK2) {
        boolean isequal = typegroupPK2!=null;
        if(isequal) {
            isequal = isequal && this.id == typegroupPK2.getId();
        }
        return isequal;
    }
}
