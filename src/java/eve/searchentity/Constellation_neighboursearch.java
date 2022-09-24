/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IConstellation_neighboursearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Constellation_neighbour;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Constellation_neighboursearch extends Tablesearch implements IConstellation_neighboursearch {

//foreign keys
    Foreignkeysearch constellationNeighboursearcher = new Foreignkeysearch("constellation", IConstellation_neighbour.constellationNeighbourPKfields, IConstellation_neighbour.constellationNeighbourFKfields);
    Foreignkeysearch constellationConstellationsearcher = new Foreignkeysearch("constellation", IConstellation_neighbour.constellationConstellationPKfields, IConstellation_neighbour.constellationConstellationFKfields);
//external foreign keys

    public String getTable() {
        return Constellation_neighbour.table;
    }

    public Constellation_neighboursearch() {
        setFieldsearchers();
    }

    public Constellation_neighboursearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addKeysearcher(constellationNeighboursearcher);
        addKeysearcher(constellationConstellationsearcher);
    }

    public void addPrimarykey(IConstellation_neighbourPK constellation_neighbourPK) {
        super.addPrimarykey(constellation_neighbourPK);
    }

    public void constellationNeighbour(IConstellationsearch constellationsearch) {
        constellationNeighboursearcher.setTablesearch(constellationsearch);
    }
    
    public IConstellationsearch getConstellationneighboursearch() {
        if(constellationNeighboursearcher.used()) {
            return (IConstellationsearch)constellationNeighboursearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getConstellationneighbourInnerjoin() {
        return constellationNeighboursearcher.getInnerjoin();
    }

    public void constellationConstellation(IConstellationsearch constellationsearch) {
        constellationConstellationsearcher.setTablesearch(constellationsearch);
    }
    
    public IConstellationsearch getConstellationconstellationsearch() {
        if(constellationConstellationsearcher.used()) {
            return (IConstellationsearch)constellationConstellationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getConstellationconstellationInnerjoin() {
        return constellationConstellationsearcher.getInnerjoin();
    }

}
