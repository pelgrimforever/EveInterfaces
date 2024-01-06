/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IRegionsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Region;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Regionsearch extends Tablesearch implements IRegionsearch {

    Numbersearch id = new Numbersearch("region.id");
    Stringsearch name = new Stringsearch("region.name");
    Booleansearch noaccess = new Booleansearch("region.noaccess");
    Numbersearch orderpages = new Numbersearch("region.orderpages");
    Numbersearch ordererrors = new Numbersearch("region.ordererrors");
    Numbersearch contractpages = new Numbersearch("region.contractpages");
    Numbersearch contracterrors = new Numbersearch("region.contracterrors");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch order_history_monthsearcher = new Primarykeysearch("order_history_month", IOrder_history_month.regionPKfields, IOrder_history_month.regionFKfields);
    //relational key
    Relationalkeysearch relevetype1searcher = new Relationalkeysearch("order_history_month", IOrder_history_month.regionPKfields, IOrder_history_month.regionFKfields, "evetype", IOrder_history_month.evetypePKfields, IOrder_history_month.evetypeFKfields);
    //foreign key
    Primarykeysearch order_historysearcher = new Primarykeysearch("order_history", IOrder_history.regionPKfields, IOrder_history.regionFKfields);
    //relational key
    Relationalkeysearch relevetype2searcher = new Relationalkeysearch("order_history", IOrder_history.regionPKfields, IOrder_history.regionFKfields, "evetype", IOrder_history.evetypePKfields, IOrder_history.evetypeFKfields);
    //foreign key
    Primarykeysearch region_neighbourRegionsearcher = new Primarykeysearch("region_neighbour", IRegion_neighbour.regionRegionPKfields, IRegion_neighbour.regionRegionFKfields);
    //foreign key
    Primarykeysearch region_neighbourNeighboursearcher = new Primarykeysearch("region_neighbour", IRegion_neighbour.regionNeighbourPKfields, IRegion_neighbour.regionNeighbourFKfields);

    public String getTable() {
        return Region.table;
    }

    public Regionsearch() {
        setFieldsearchers();
    }

    public Regionsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(noaccess);
        addFieldsearcher(orderpages);
        addFieldsearcher(ordererrors);
        addFieldsearcher(contractpages);
        addFieldsearcher(contracterrors);
        addKeysearcher(order_history_monthsearcher);
        addKeysearcher(relevetype1searcher);
        addKeysearcher(order_historysearcher);
        addKeysearcher(relevetype2searcher);
        addKeysearcher(region_neighbourRegionsearcher);
        addKeysearcher(region_neighbourNeighboursearcher);
    }

    public void addPrimarykey(IRegionPK regionPK) {
        super.addPrimarykey(regionPK);
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
    
    public void orderpages(Double[] values, byte[] operators) {
        addNumbervalues(orderpages, values, operators);
    }
    
    public void orderpages(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(orderpages, values, operators);
        orderpages.setAndoroperator(andor);
    }
    
    public void ordererrors(Double[] values, byte[] operators) {
        addNumbervalues(ordererrors, values, operators);
    }
    
    public void ordererrors(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(ordererrors, values, operators);
        ordererrors.setAndoroperator(andor);
    }
    
    public void contractpages(Double[] values, byte[] operators) {
        addNumbervalues(contractpages, values, operators);
    }
    
    public void contractpages(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(contractpages, values, operators);
        contractpages.setAndoroperator(andor);
    }
    
    public void contracterrors(Double[] values, byte[] operators) {
        addNumbervalues(contracterrors, values, operators);
    }
    
    public void contracterrors(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(contracterrors, values, operators);
        contracterrors.setAndoroperator(andor);
    }
    
    public void order_history_month(IOrder_history_monthsearch order_history_monthsearch) {
        order_history_monthsearcher.setTablesearch(order_history_monthsearch);
    }
    
    public IOrder_history_monthsearch getOrder_history_monthsearch() {
        if(order_history_monthsearcher.used()) {
            return (IOrder_history_monthsearch)order_history_monthsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relevetype1(IEvetypesearch evetypesearch) {
        relevetype1searcher.setTablesearch(evetypesearch);
    }
    
    public IEvetypesearch getRelEvetype1search() {
        if(relevetype1searcher.used()) {
            return (IEvetypesearch)relevetype1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void order_history(IOrder_historysearch order_historysearch) {
        order_historysearcher.setTablesearch(order_historysearch);
    }
    
    public IOrder_historysearch getOrder_historysearch() {
        if(order_historysearcher.used()) {
            return (IOrder_historysearch)order_historysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relevetype2(IEvetypesearch evetypesearch) {
        relevetype2searcher.setTablesearch(evetypesearch);
    }
    
    public IEvetypesearch getRelEvetype2search() {
        if(relevetype2searcher.used()) {
            return (IEvetypesearch)relevetype2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void region_neighbourRegion(IRegion_neighboursearch region_neighboursearch) {
        region_neighbourRegionsearcher.setTablesearch(region_neighboursearch);
    }
    
    public IRegion_neighboursearch getRegion_neighbourregionsearch() {
        if(region_neighbourRegionsearcher.used()) {
            return (IRegion_neighboursearch)region_neighbourRegionsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void region_neighbourNeighbour(IRegion_neighboursearch region_neighboursearch) {
        region_neighbourNeighboursearcher.setTablesearch(region_neighboursearch);
    }
    
    public IRegion_neighboursearch getRegion_neighbourneighboursearch() {
        if(region_neighbourNeighboursearcher.used()) {
            return (IRegion_neighboursearch)region_neighbourNeighboursearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
