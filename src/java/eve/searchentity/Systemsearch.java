/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISystemsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.System;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Systemsearch extends Tablesearch implements ISystemsearch {

    Numbersearch id = new Numbersearch("system.id");
    Stringsearch name = new Stringsearch("system.name");
    Stringsearch security_class = new Stringsearch("system.security_class");
    Numbersearch security_status = new Numbersearch("system.security_status");
    Numbersearch star_id = new Numbersearch("system.star_id");
    Booleansearch noaccess = new Booleansearch("system.noaccess");
    Booleansearch isconstellationborder = new Booleansearch("system.isconstellationborder");
    Booleansearch isregionborder = new Booleansearch("system.isregionborder");
    Datesearch downloaddate = new Datesearch("system.downloaddate");
//foreign keys
    Foreignkeysearch security_islandsearcher = new Foreignkeysearch("security_island", ISystem.security_islandPKfields, ISystem.security_islandFKfields);
    Foreignkeysearch constellationsearcher = new Foreignkeysearch("constellation", ISystem.constellationPKfields, ISystem.constellationFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch systemjumpsSystem_endsearcher = new Primarykeysearch("systemjumps", ISystemjumps.systemSystem_endPKfields, ISystemjumps.systemSystem_endFKfields);
    //foreign key
    Primarykeysearch systemjumpsSystem_startsearcher = new Primarykeysearch("systemjumps", ISystemjumps.systemSystem_startPKfields, ISystemjumps.systemSystem_startFKfields);
    //foreign key
    Primarykeysearch tradecombinedBuy_systemsearcher = new Primarykeysearch("tradecombined", ITradecombined.systemBuy_systemPKfields, ITradecombined.systemBuy_systemFKfields);
    //relational key
    Relationalkeysearch relevetype1searcher = new Relationalkeysearch("tradecombined", ITradecombined.systemBuy_systemPKfields, ITradecombined.systemBuy_systemFKfields, "evetype", ITradecombined.evetypePKfields, ITradecombined.evetypeFKfields);
    //foreign key
    Primarykeysearch tradecombinedSell_systemsearcher = new Primarykeysearch("tradecombined", ITradecombined.systemSell_systemPKfields, ITradecombined.systemSell_systemFKfields);
    //relational key
    Relationalkeysearch relevetype2searcher = new Relationalkeysearch("tradecombined", ITradecombined.systemSell_systemPKfields, ITradecombined.systemSell_systemFKfields, "evetype", ITradecombined.evetypePKfields, ITradecombined.evetypeFKfields);

    public String getTable() {
        return System.table;
    }

    public Systemsearch() {
        setFieldsearchers();
    }

    public Systemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(security_class);
        addFieldsearcher(security_status);
        addFieldsearcher(star_id);
        addFieldsearcher(noaccess);
        addFieldsearcher(isconstellationborder);
        addFieldsearcher(isregionborder);
        addFieldsearcher(downloaddate);
        addKeysearcher(security_islandsearcher);
        addKeysearcher(constellationsearcher);
        addKeysearcher(systemjumpsSystem_endsearcher);
        addKeysearcher(systemjumpsSystem_startsearcher);
        addKeysearcher(tradecombinedBuy_systemsearcher);
        addKeysearcher(relevetype1searcher);
        addKeysearcher(tradecombinedSell_systemsearcher);
        addKeysearcher(relevetype2searcher);
    }

    public void addPrimarykey(ISystemPK systemPK) {
        super.addPrimarykey(systemPK);
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
    
    public void security_class(String[] values) {
        addStringvalues(security_class, values);
    }
    
    public void security_class(String[] values, byte compare, byte andor) {
        addStringvalues(security_class, values);
        security_class.setCompareoperator(compare);
        security_class.setAndoroperator(andor);
    }
    
    public void security_status(Double[] values, byte[] operators) {
        addNumbervalues(security_status, values, operators);
    }
    
    public void security_status(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(security_status, values, operators);
        security_status.setAndoroperator(andor);
    }
    
    public void star_id(Double[] values, byte[] operators) {
        addNumbervalues(star_id, values, operators);
    }
    
    public void star_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(star_id, values, operators);
        star_id.setAndoroperator(andor);
    }
    
    public void noaccess(Boolean value) {
        addBooleanvalue(noaccess, value);
    }
    
    public void isconstellationborder(Boolean value) {
        addBooleanvalue(isconstellationborder, value);
    }
    
    public void isregionborder(Boolean value) {
        addBooleanvalue(isregionborder, value);
    }
    
    public void downloaddate(Date[] values, byte[] operators) {
        addDatevalues(downloaddate, values, operators);
    }
    
    public void downloaddate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(downloaddate, values, operators);
        downloaddate.setAndoroperator(andor);
    }
    
    public void security_island(ISecurity_islandsearch security_islandsearch) {
        security_islandsearcher.setTablesearch(security_islandsearch);
    }
    
    public ISecurity_islandsearch getSecurity_islandsearch() {
        if(security_islandsearcher.used()) {
            return (ISecurity_islandsearch)security_islandsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSecurity_islandInnerjoin() {
        return security_islandsearcher.getInnerjoin();
    }

    public void constellation(IConstellationsearch constellationsearch) {
        constellationsearcher.setTablesearch(constellationsearch);
    }
    
    public IConstellationsearch getConstellationsearch() {
        if(constellationsearcher.used()) {
            return (IConstellationsearch)constellationsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getConstellationInnerjoin() {
        return constellationsearcher.getInnerjoin();
    }

    public void systemjumpsSystem_end(ISystemjumpssearch systemjumpssearch) {
        systemjumpsSystem_endsearcher.setTablesearch(systemjumpssearch);
    }
    
    public ISystemjumpssearch getSystemjumpssystem_endsearch() {
        if(systemjumpsSystem_endsearcher.used()) {
            return (ISystemjumpssearch)systemjumpsSystem_endsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void systemjumpsSystem_start(ISystemjumpssearch systemjumpssearch) {
        systemjumpsSystem_startsearcher.setTablesearch(systemjumpssearch);
    }
    
    public ISystemjumpssearch getSystemjumpssystem_startsearch() {
        if(systemjumpsSystem_startsearcher.used()) {
            return (ISystemjumpssearch)systemjumpsSystem_startsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void tradecombinedBuy_system(ITradecombinedsearch tradecombinedsearch) {
        tradecombinedBuy_systemsearcher.setTablesearch(tradecombinedsearch);
    }
    
    public ITradecombinedsearch getTradecombinedbuy_systemsearch() {
        if(tradecombinedBuy_systemsearcher.used()) {
            return (ITradecombinedsearch)tradecombinedBuy_systemsearcher.getTablesearches().get(0);
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

    public void tradecombinedSell_system(ITradecombinedsearch tradecombinedsearch) {
        tradecombinedSell_systemsearcher.setTablesearch(tradecombinedsearch);
    }
    
    public ITradecombinedsearch getTradecombinedsell_systemsearch() {
        if(tradecombinedSell_systemsearcher.used()) {
            return (ITradecombinedsearch)tradecombinedSell_systemsearcher.getTablesearches().get(0);
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

}
