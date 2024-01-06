/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IStation_servicesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Station_service;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Station_servicesearch extends Tablesearch implements IStation_servicesearch {

    Stringsearch service = new Stringsearch("station_service.service");
//foreign keys
    Foreignkeysearch stationsearcher = new Foreignkeysearch("station", IStation_service.stationPKfields, IStation_service.stationFKfields);
//external foreign keys

    public String getTable() {
        return Station_service.table;
    }

    public Station_servicesearch() {
        setFieldsearchers();
    }

    public Station_servicesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(service);
        addKeysearcher(stationsearcher);
    }

    public void addPrimarykey(IStation_servicePK station_servicePK) {
        super.addPrimarykey(station_servicePK);
    }

    public void service(String[] values) {
        addStringvalues(service, values);
    }
    
    public void service(String[] values, byte compare, byte andor) {
        addStringvalues(service, values);
        service.setCompareoperator(compare);
        service.setAndoroperator(andor);
    }
    
    public void station(IStationsearch stationsearch) {
        stationsearcher.setTablesearch(stationsearch);
    }
    
    public IStationsearch getStationsearch() {
        if(stationsearcher.used()) {
            return (IStationsearch)stationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getStationInnerjoin() {
        return stationsearcher.getInnerjoin();
    }

}
