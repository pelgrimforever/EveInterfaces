/*
 * Constellation_neighboursearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.searchentity;

import eve.interfaces.searchentity.IConstellation_neighboursearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.entity.eConstellation_neighbour;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Constellation_neighbour table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Constellation_neighboursearch extends Tablesearch implements IConstellation_neighboursearch {

    Foreignkeysearch constellationNeighboursearcher = new Foreignkeysearch("constellation", IConstellation_neighbour.constellationNeighbourPKfields, IConstellation_neighbour.constellationNeighbourFKfields);
    Foreignkeysearch constellationConstellationsearcher = new Foreignkeysearch("constellation", IConstellation_neighbour.constellationConstellationPKfields, IConstellation_neighbour.constellationConstellationFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Constellation_neighboursearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Constellation_neighboursearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addKeysearcher(constellationNeighboursearcher);
        addKeysearcher(constellationConstellationsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param constellation_neighbourPK: Constellation_neighbour primery key
     */
    public void addPrimarykey(IConstellation_neighbourPK constellation_neighbourPK) {
        super.addPrimarykey(constellation_neighbourPK);
    }

    /**
     * set subsearch constellationNeighbour tablesearch
     * @param constellationsearch: IConstellationsearch
     */
    public void constellationNeighbour(IConstellationsearch constellationsearch) {
        constellationNeighboursearcher.setTablesearch(constellationsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Constellation_neighbour
     */
    public IConstellationsearch getConstellationneighboursearch() {
        if(constellationNeighboursearcher.used()) {
            return (IConstellationsearch)constellationNeighboursearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if constellationNeighboursearcher is not used
     * @return inner join statement
     */
    public String getConstellationneighbourInnerjoin() {
        return constellationNeighboursearcher.getInnerjoin();
    }

    /**
     * set subsearch constellationConstellation tablesearch
     * @param constellationsearch: IConstellationsearch
     */
    public void constellationConstellation(IConstellationsearch constellationsearch) {
        constellationConstellationsearcher.setTablesearch(constellationsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Constellation_neighbour
     */
    public IConstellationsearch getConstellationconstellationsearch() {
        if(constellationConstellationsearcher.used()) {
            return (IConstellationsearch)constellationConstellationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if constellationConstellationsearcher is not used
     * @return inner join statement
     */
    public String getConstellationconstellationInnerjoin() {
        return constellationConstellationsearcher.getInnerjoin();
    }

}
