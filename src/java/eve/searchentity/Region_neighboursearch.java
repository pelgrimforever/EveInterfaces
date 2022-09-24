/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

public class Region_neighboursearch extends Tablesearch implements IRegion_neighboursearch {

//foreign keys
    Foreignkeysearch regionRegionsearcher = new Foreignkeysearch("region", IRegion_neighbour.regionRegionPKfields, IRegion_neighbour.regionRegionFKfields);
    Foreignkeysearch regionNeighboursearcher = new Foreignkeysearch("region", IRegion_neighbour.regionNeighbourPKfields, IRegion_neighbour.regionNeighbourFKfields);
//external foreign keys

    public String getTable() {
        return Region_neighbour.table;
    }

    public Region_neighboursearch() {
        setFieldsearchers();
    }

    public Region_neighboursearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addKeysearcher(regionRegionsearcher);
        addKeysearcher(regionNeighboursearcher);
    }

    public void addPrimarykey(IRegion_neighbourPK region_neighbourPK) {
        super.addPrimarykey(region_neighbourPK);
    }

    public void regionRegion(IRegionsearch regionsearch) {
        regionRegionsearcher.setTablesearch(regionsearch);
    }
    
    public IRegionsearch getRegionregionsearch() {
        if(regionRegionsearcher.used()) {
            return (IRegionsearch)regionRegionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getRegionregionInnerjoin() {
        return regionRegionsearcher.getInnerjoin();
    }

    public void regionNeighbour(IRegionsearch regionsearch) {
        regionNeighboursearcher.setTablesearch(regionsearch);
    }
    
    public IRegionsearch getRegionneighboursearch() {
        if(regionNeighboursearcher.used()) {
            return (IRegionsearch)regionNeighboursearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getRegionneighbourInnerjoin() {
        return regionNeighboursearcher.getInnerjoin();
    }

}
