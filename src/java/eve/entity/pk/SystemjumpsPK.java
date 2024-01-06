/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ISystemjumps;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class SystemjumpsPK implements ISystemjumpsPK {

    private ISystemPK systemSystem_endPK = new SystemPK();
    private ISystemPK systemSystem_startPK = new SystemPK();
  
    public SystemjumpsPK() {
    }

    public SystemjumpsPK(long system_start, long system_end) {
        this.systemSystem_endPK = new SystemPK(system_end);
        this.systemSystem_startPK = new SystemPK(system_start);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"systemjumps.system_start", systemSystem_startPK.getId()}, 
            {"systemjumps.system_end", systemSystem_endPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISystemjumps.SYSTEM_START, systemSystem_startPK.getId()}, 
            {ISystemjumps.SYSTEM_END, systemSystem_endPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public ISystemPK getSystemsystem_endPK() {
        return this.systemSystem_endPK;
    }

    public void setSystemsystem_endPK(ISystemPK systemPK) {
        this.systemSystem_endPK = systemPK;
    }

    public ISystemPK getSystemsystem_startPK() {
        return this.systemSystem_startPK;
    }

    public void setSystemsystem_startPK(ISystemPK systemPK) {
        this.systemSystem_startPK = systemPK;
    }

    public long getSystem_start() {
        return this.systemSystem_startPK.getId();
    }

    public void setSystem_start(long system_start) {
        this.systemSystem_startPK.setId(system_start);
    }

    public long getSystem_end() {
        return this.systemSystem_endPK.getId();
    }

    public void setSystem_end(long system_end) {
        this.systemSystem_endPK.setId(system_end);
    }

    public String getKeystring() {
        String key = "";
        key += getSystem_start();
        key += "_";

        key += getSystem_end();
        return key;
    }

    public static SystemjumpsPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long system_start = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long system_end = Long.valueOf(keys.substring(0, keylength));
            return new SystemjumpsPK(system_start, system_end);
        }
    }

    public boolean equals(ISystemjumpsPK systemjumpsPK2) {
        boolean isequal = systemjumpsPK2!=null;
        if(isequal) {
            isequal = isequal && this.systemSystem_endPK.equals(systemjumpsPK2.getSystemsystem_endPK());
            isequal = isequal && this.systemSystem_startPK.equals(systemjumpsPK2.getSystemsystem_startPK());
        }
        return isequal;
    }
}
