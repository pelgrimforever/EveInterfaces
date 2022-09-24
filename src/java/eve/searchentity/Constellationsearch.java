/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IConstellationsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Constellation;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Constellationsearch extends Tablesearch implements IConstellationsearch {

    Numbersearch id = new Numbersearch("constellation.id");
    Stringsearch name = new Stringsearch("constellation.name");
    Booleansearch noaccess = new Booleansearch("constellation.noaccess");
//foreign keys
    Foreignkeysearch regionsearcher = new Foreignkeysearch("region", IConstellation.regionPKfields, IConstellation.regionFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch constellation_neighbourNeighboursearcher = new Primarykeysearch("constellation_neighbour", IConstellation_neighbour.constellationNeighbourPKfields, IConstellation_neighbour.constellationNeighbourFKfields);
    //foreign key
    Primarykeysearch constellation_neighbourConstellationsearcher = new Primarykeysearch("constellation_neighbour", IConstellation_neighbour.constellationConstellationPKfields, IConstellation_neighbour.constellationConstellationFKfields);

    public String getTable() {
        return Constellation.table;
    }

    public Constellationsearch() {
        setFieldsearchers();
    }

    public Constellationsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(noaccess);
        addKeysearcher(regionsearcher);
        addKeysearcher(constellation_neighbourNeighboursearcher);
        addKeysearcher(constellation_neighbourConstellationsearcher);
    }

    public void addPrimarykey(IConstellationPK constellationPK) {
        super.addPrimarykey(constellationPK);
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
    
    public void noaccess(Boolean value) {
        addBooleanvalue(noaccess, value);
    }
    
    public void region(IRegionsearch regionsearch) {
        regionsearcher.setTablesearch(regionsearch);
    }
    
    public IRegionsearch getRegionsearch() {
        if(regionsearcher.used()) {
            return (IRegionsearch)regionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getRegionInnerjoin() {
        return regionsearcher.getInnerjoin();
    }

    public void constellation_neighbourNeighbour(IConstellation_neighboursearch constellation_neighboursearch) {
        constellation_neighbourNeighboursearcher.setTablesearch(constellation_neighboursearch);
    }
    
    public IConstellation_neighboursearch getConstellation_neighbourneighboursearch() {
        if(constellation_neighbourNeighboursearcher.used()) {
            return (IConstellation_neighboursearch)constellation_neighbourNeighboursearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void constellation_neighbourConstellation(IConstellation_neighboursearch constellation_neighboursearch) {
        constellation_neighbourConstellationsearcher.setTablesearch(constellation_neighboursearch);
    }
    
    public IConstellation_neighboursearch getConstellation_neighbourconstellationsearch() {
        if(constellation_neighbourConstellationsearcher.used()) {
            return (IConstellation_neighboursearch)constellation_neighbourConstellationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
