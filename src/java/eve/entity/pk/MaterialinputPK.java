/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IMaterialinput;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class MaterialinputPK implements IMaterialinputPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private java.lang.String username;
    private java.sql.Timestamp addtimestamp;
  
    public MaterialinputPK() {
    }

    public MaterialinputPK(java.lang.String username, long evetype, java.sql.Timestamp addtimestamp) {
        this.evetypePK = new EvetypePK(evetype);
        this.username = username;
        this.addtimestamp = addtimestamp;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"materialinput.evetype", evetypePK.getId()}, 
            {"materialinput.username", username}, 
            {"materialinput.addtimestamp", addtimestamp}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IMaterialinput.EVETYPE, evetypePK.getId()}, 
            {IMaterialinput.USERNAME, username}, 
            {IMaterialinput.ADDTIMESTAMP, addtimestamp}
        };
        return new Entityvalues(keyfields);
    }

    public IEvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void setEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    public long getEvetype() {
        return this.evetypePK.getId();
    }

    public void setEvetype(long evetype) {
        this.evetypePK.setId(evetype);
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public java.sql.Timestamp getAddtimestamp() {
        return this.addtimestamp;
    }

    public void setAddtimestamp(java.sql.Timestamp addtimestamp) {
        this.addtimestamp = addtimestamp;
    }

    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        key += getEvetype();
        key += "_";

        if(getAddtimestamp()!=null) key += getAddtimestamp().getTime();
        return key;
    }

    public static MaterialinputPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String username = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long evetype = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            java.sql.Timestamp addtimestamp = new Timestamp(Long.valueOf(keys.substring(0, keylength)));
            return new MaterialinputPK(username, evetype, addtimestamp);
        }
    }

    public boolean equals(IMaterialinputPK materialinputPK2) {
        boolean isequal = materialinputPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(materialinputPK2.getEvetypePK());
            isequal = isequal && this.username.equals(materialinputPK2.getUsername());
            isequal = isequal && this.addtimestamp.equals(materialinputPK2.getAddtimestamp());
        }
        return isequal;
    }
}
