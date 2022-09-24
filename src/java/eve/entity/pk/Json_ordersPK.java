/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IJson_orders;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Json_ordersPK implements IJson_ordersPK {

    private int id;
  
    public Json_ordersPK() {
    }

    public Json_ordersPK(int id) {
        this.id = id;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"json_orders.id", id}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IJson_orders.ID, id}
        };
        return new Entityvalues(keyfields);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeystring() {
        String key = "";
        key += getId();
        return key;
    }

    public static Json_ordersPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int id = Integer.valueOf(keys.substring(0, keylength));
            return new Json_ordersPK(id);
        }
    }

    public boolean equals(IJson_ordersPK json_ordersPK2) {
        boolean isequal = json_ordersPK2!=null;
        if(isequal) {
            isequal = isequal && this.id == json_ordersPK2.getId();
        }
        return isequal;
    }
}
