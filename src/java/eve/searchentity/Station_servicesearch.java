/*
 * Station_servicesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 16.11.2021 15:45
 *
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

/**
 * Search class for Station_service table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Station_servicesearch extends Tablesearch implements IStation_servicesearch {

    Stringsearch service = new Stringsearch("station_service.service");
//foreign keys
    Foreignkeysearch stationsearcher = new Foreignkeysearch("station", IStation_service.stationPKfields, IStation_service.stationFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Station_service.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Station_servicesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Station_servicesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(service);
        addKeysearcher(stationsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param station_servicePK: Station_service primery key
     */
    public void addPrimarykey(IStation_servicePK station_servicePK) {
        super.addPrimarykey(station_servicePK);
    }

    /**
     * add String search values for field service, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void service(String[] values) {
        addStringvalues(service, values);
    }
    
    /**
     * add String search values for field service
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void service(String[] values, byte compare, byte andor) {
        addStringvalues(service, values);
        service.setCompareoperator(compare);
        service.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch station IStationsearch
     * @param stationsearch: IStationsearch
     */
    public void station(IStationsearch stationsearch) {
        stationsearcher.setTablesearch(stationsearch);
    }
    
    /**
     * get foreign key subsearch station IStationsearch
     * @return Tablesearch for Station_service
     */
    public IStationsearch getStationsearch() {
        if(stationsearcher.used()) {
            return (IStationsearch)stationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if stationsearcher is not used
     * @return inner join statement
     */
    public String getStationInnerjoin() {
        return stationsearcher.getInnerjoin();
    }

}
