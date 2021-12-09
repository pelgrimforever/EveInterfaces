/*
 * Region_neighboursearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 9.11.2021 14:30
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IRegion_neighboursearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Region_neighbour;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Region_neighbour table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Region_neighboursearch extends Tablesearch implements IRegion_neighboursearch {

//foreign keys
    Foreignkeysearch regionRegionsearcher = new Foreignkeysearch("region", IRegion_neighbour.regionRegionPKfields, IRegion_neighbour.regionRegionFKfields);
    Foreignkeysearch regionNeighboursearcher = new Foreignkeysearch("region", IRegion_neighbour.regionNeighbourPKfields, IRegion_neighbour.regionNeighbourFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Region_neighbour.table;
    }

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
     * set foreign key subsearch regionRegion IRegionsearch
     * @param regionsearch: IRegionsearch
     */
    public void regionRegion(IRegionsearch regionsearch) {
        regionRegionsearcher.setTablesearch(regionsearch);
    }
    
    /**
     * get foreign key subsearch regionRegion IRegionsearch
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
     * set foreign key subsearch regionNeighbour IRegionsearch
     * @param regionsearch: IRegionsearch
     */
    public void regionNeighbour(IRegionsearch regionsearch) {
        regionNeighboursearcher.setTablesearch(regionsearch);
    }
    
    /**
     * get foreign key subsearch regionNeighbour IRegionsearch
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
