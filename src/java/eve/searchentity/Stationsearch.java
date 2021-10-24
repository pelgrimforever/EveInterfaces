/*
 * Stationsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:40
 *
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

/**
 * Search class for Station table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Stationsearch extends Tablesearch implements IStationsearch {

    Numbersearch id = new Numbersearch("station.id");
    Stringsearch name = new Stringsearch("station.name");
    Numbersearch office_rental_cost = new Numbersearch("station.office_rental_cost");
    Numbersearch reprocessing_efficiency = new Numbersearch("station.reprocessing_efficiency");
    Numbersearch reprocessing_stations_take = new Numbersearch("station.reprocessing_stations_take");
    Numbersearch max_dockable_ship_volume = new Numbersearch("station.max_dockable_ship_volume");
    Numbersearch owner = new Numbersearch("station.owner");
    Foreignkeysearch racesearcher = new Foreignkeysearch("race", IStation.racePKfields, IStation.raceFKfields);
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IStation.evetypePKfields, IStation.evetypeFKfields);
    Foreignkeysearch systemsearcher = new Foreignkeysearch("system", IStation.systemPKfields, IStation.systemFKfields);
    Primarykeysearch station_servicesearcher = new Primarykeysearch("station_service", IStation_service.stationPKfields, IStation_service.stationFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Station.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Stationsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Stationsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(office_rental_cost);
        addFieldsearcher(reprocessing_efficiency);
        addFieldsearcher(reprocessing_stations_take);
        addFieldsearcher(max_dockable_ship_volume);
        addFieldsearcher(owner);
        addKeysearcher(racesearcher);
        addKeysearcher(evetypesearcher);
        addKeysearcher(systemsearcher);
        addKeysearcher(station_servicesearcher);
    }

    /**
     * add a primary key instance to search for
     * @param stationPK: Station primery key
     */
    public void addPrimarykey(IStationPK stationPK) {
        super.addPrimarykey(stationPK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    /**
     * add String search values for field name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field office_rental_cost, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void office_rental_cost(Double[] values, byte[] operators) {
        addNumbervalues(office_rental_cost, values, operators);
    }
    
    /**
     * add Numeric search values for field office_rental_cost
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void office_rental_cost(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(office_rental_cost, values, operators);
        office_rental_cost.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field reprocessing_efficiency, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void reprocessing_efficiency(Double[] values, byte[] operators) {
        addNumbervalues(reprocessing_efficiency, values, operators);
    }
    
    /**
     * add Numeric search values for field reprocessing_efficiency
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void reprocessing_efficiency(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(reprocessing_efficiency, values, operators);
        reprocessing_efficiency.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field reprocessing_stations_take, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void reprocessing_stations_take(Double[] values, byte[] operators) {
        addNumbervalues(reprocessing_stations_take, values, operators);
    }
    
    /**
     * add Numeric search values for field reprocessing_stations_take
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void reprocessing_stations_take(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(reprocessing_stations_take, values, operators);
        reprocessing_stations_take.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field max_dockable_ship_volume, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void max_dockable_ship_volume(Double[] values, byte[] operators) {
        addNumbervalues(max_dockable_ship_volume, values, operators);
    }
    
    /**
     * add Numeric search values for field max_dockable_ship_volume
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void max_dockable_ship_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_dockable_ship_volume, values, operators);
        max_dockable_ship_volume.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field owner, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void owner(Double[] values, byte[] operators) {
        addNumbervalues(owner, values, operators);
    }
    
    /**
     * add Numeric search values for field owner
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void owner(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(owner, values, operators);
        owner.setAndoroperator(andor);
    }
    
    /**
     * set subsearch race tablesearch
     * @param racesearch: IRacesearch
     */
    public void race(IRacesearch racesearch) {
        racesearcher.setTablesearch(racesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Station
     */
    public IRacesearch getRacesearch() {
        if(racesearcher.used()) {
            return (IRacesearch)racesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if racesearcher is not used
     * @return inner join statement
     */
    public String getRaceInnerjoin() {
        return racesearcher.getInnerjoin();
    }

    /**
     * set subsearch evetype tablesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Station
     */
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if evetypesearcher is not used
     * @return inner join statement
     */
    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

    /**
     * set subsearch system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void system(ISystemsearch systemsearch) {
        systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Station
     */
    public ISystemsearch getSystemsearch() {
        if(systemsearcher.used()) {
            return (ISystemsearch)systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemsearcher is not used
     * @return inner join statement
     */
    public String getSystemInnerjoin() {
        return systemsearcher.getInnerjoin();
    }

    /**
     * set subsearch station_service tablesearch
     * @param station_servicesearch: IStation_servicesearch
     */
    public void station_service(IStation_servicesearch station_servicesearch) {
        station_servicesearcher.setTablesearch(station_servicesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Station
     */
    public IStation_servicesearch getStation_servicesearch() {
        if(station_servicesearcher.used()) {
            return (IStation_servicesearch)station_servicesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
