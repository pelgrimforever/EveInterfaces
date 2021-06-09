/*
 * Region_neighboursearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IRegion_neighboursearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eRegion_neighbour;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Region_neighbour table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Region_neighboursearch extends Tablesearch implements IRegion_neighboursearch {

    Foreignkeysearch regionRegionsearcher = new Foreignkeysearch("region", IRegion_neighbour.regionRegionPKfields, IRegion_neighbour.regionRegionFKfields);
    Foreignkeysearch regionNeighboursearcher = new Foreignkeysearch("region", IRegion_neighbour.regionNeighbourPKfields, IRegion_neighbour.regionNeighbourFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Region_neighboursearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Region_neighboursearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addKeysearcher(regionRegionsearcher);
        addKeysearcher(regionNeighboursearcher);
    }

    /**
     * add a primary key instance to search for
     * @param region_neighbourPK: Region_neighbour primery key
     */
    public void addPrimarykey(IRegion_neighbourPK region_neighbourPK) {
        super.addPrimarykey(region_neighbourPK);
    }

    /**
     * set subsearch regionRegion tablesearch
     * @param regionsearch: IRegionsearch
     */
    public void regionRegion(IRegionsearch regionsearch) {
        regionRegionsearcher.setTablesearch(regionsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Region_neighbour
     */
    public IRegionsearch getRegionregionsearch() {
        if(regionRegionsearcher.used()) {
            return (IRegionsearch)regionRegionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if regionRegionsearcher is not used
     * @return inner join statement
     */
    public String getRegionregionInnerjoin() {
        return regionRegionsearcher.getInnerjoin();
    }

    /**
     * set subsearch regionNeighbour tablesearch
     * @param regionsearch: IRegionsearch
     */
    public void regionNeighbour(IRegionsearch regionsearch) {
        regionNeighboursearcher.setTablesearch(regionsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Region_neighbour
     */
    public IRegionsearch getRegionneighboursearch() {
        if(regionNeighboursearcher.used()) {
            return (IRegionsearch)regionNeighboursearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if regionNeighboursearcher is not used
     * @return inner join statement
     */
    public String getRegionneighbourInnerjoin() {
        return regionNeighboursearcher.getInnerjoin();
    }

}
