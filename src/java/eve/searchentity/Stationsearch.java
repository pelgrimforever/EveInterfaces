/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IStationsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Station;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Stationsearch extends Tablesearch implements IStationsearch {

    Numbersearch id = new Numbersearch("station.id");
    Stringsearch name = new Stringsearch("station.name");
    Numbersearch office_rental_cost = new Numbersearch("station.office_rental_cost");
    Numbersearch reprocessing_efficiency = new Numbersearch("station.reprocessing_efficiency");
    Numbersearch reprocessing_stations_take = new Numbersearch("station.reprocessing_stations_take");
    Numbersearch max_dockable_ship_volume = new Numbersearch("station.max_dockable_ship_volume");
    Numbersearch owner = new Numbersearch("station.owner");
    Datesearch downloaddate = new Datesearch("station.downloaddate");
//foreign keys
    Foreignkeysearch racesearcher = new Foreignkeysearch("race", IStation.racePKfields, IStation.raceFKfields);
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IStation.evetypePKfields, IStation.evetypeFKfields);
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", IStation.systemPKfields, IStation.systemFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch station_servicesearcher = new Primarykeysearch("station_service", IStation_service.stationPKfields, IStation_service.stationFKfields);

    public String getTable() {
        return Station.table;
    }

    public Stationsearch() {
        setFieldsearchers();
    }

    public Stationsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(office_rental_cost);
        addFieldsearcher(reprocessing_efficiency);
        addFieldsearcher(reprocessing_stations_take);
        addFieldsearcher(max_dockable_ship_volume);
        addFieldsearcher(owner);
        addFieldsearcher(downloaddate);
        addKeysearcher(racesearcher);
        addKeysearcher(evetypesearcher);
        addKeysearcher(systemsearcher);
        addKeysearcher(station_servicesearcher);
    }

    public void addPrimarykey(IStationPK stationPK) {
        super.addPrimarykey(stationPK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void office_rental_cost(Double[] values, byte[] operators) {
        addNumbervalues(office_rental_cost, values, operators);
    }
    
    public void office_rental_cost(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(office_rental_cost, values, operators);
        office_rental_cost.setAndoroperator(andor);
    }
    
    public void reprocessing_efficiency(Double[] values, byte[] operators) {
        addNumbervalues(reprocessing_efficiency, values, operators);
    }
    
    public void reprocessing_efficiency(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(reprocessing_efficiency, values, operators);
        reprocessing_efficiency.setAndoroperator(andor);
    }
    
    public void reprocessing_stations_take(Double[] values, byte[] operators) {
        addNumbervalues(reprocessing_stations_take, values, operators);
    }
    
    public void reprocessing_stations_take(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(reprocessing_stations_take, values, operators);
        reprocessing_stations_take.setAndoroperator(andor);
    }
    
    public void max_dockable_ship_volume(Double[] values, byte[] operators) {
        addNumbervalues(max_dockable_ship_volume, values, operators);
    }
    
    public void max_dockable_ship_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_dockable_ship_volume, values, operators);
        max_dockable_ship_volume.setAndoroperator(andor);
    }
    
    public void owner(Double[] values, byte[] operators) {
        addNumbervalues(owner, values, operators);
    }
    
    public void owner(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(owner, values, operators);
        owner.setAndoroperator(andor);
    }
    
    public void downloaddate(Date[] values, byte[] operators) {
        addDatevalues(downloaddate, values, operators);
    }
    
    public void downloaddate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(downloaddate, values, operators);
        downloaddate.setAndoroperator(andor);
    }
    
    public void race(IRacesearch racesearch) {
        racesearcher.setTablesearch(racesearch);
    }
    
    public IRacesearch getRacesearch() {
        if(racesearcher.used()) {
            return (IRacesearch)racesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getRaceInnerjoin() {
        return racesearcher.getInnerjoin();
    }

    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getSystemsearch() {
        if(systemsearcher.used()) {
            return (ISystemsearch)systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSystemInnerjoin() {
        return systemsearcher.getInnerjoin();
    }

    public void station_service(IStation_servicesearch station_servicesearch) {
        station_servicesearcher.setTablesearch(station_servicesearch);
    }
    
    public IStation_servicesearch getStation_servicesearch() {
        if(station_servicesearcher.used()) {
            return (IStation_servicesearch)station_servicesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
