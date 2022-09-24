/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IStation_service;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Station_servicePK implements IStation_servicePK {

    private IStationPK stationPK = new StationPK();
    private java.lang.String service;
  
    public Station_servicePK() {
    }

    public Station_servicePK(long station, java.lang.String service) {
        this.stationPK = new StationPK(station);
        this.service = service;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"station_service.station", stationPK.getId()}, 
            {"station_service.service", service}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IStation_service.STATION, stationPK.getId()}, 
            {IStation_service.SERVICE, service}
        };
        return new Entityvalues(keyfields);
    }

    public IStationPK getStationPK() {
        return this.stationPK;
    }

    public void setStationPK(IStationPK stationPK) {
        this.stationPK = stationPK;
    }

    public long getStation() {
        return this.stationPK.getId();
    }

    public void setStation(long station) {
        this.stationPK.setId(station);
    }

    public java.lang.String getService() {
        return this.service;
    }

    public void setService(java.lang.String service) {
        this.service = service;
    }

    public String getKeystring() {
        String key = "";
        key += getStation();
        key += "_";

        if(getService()!=null) key += getService().length() + "_" + getService();
        return key;
    }

    public static Station_servicePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long station = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String service = keys.substring(0, keylength);
            return new Station_servicePK(station, service);
        }
    }

    public boolean equals(IStation_servicePK station_servicePK2) {
        boolean isequal = station_servicePK2!=null;
        if(isequal) {
            isequal = isequal && this.stationPK.equals(station_servicePK2.getStationPK());
            isequal = isequal && this.service.equals(station_servicePK2.getService());
        }
        return isequal;
    }
}
