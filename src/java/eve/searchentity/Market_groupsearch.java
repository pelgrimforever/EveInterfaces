/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IMarket_groupsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Market_group;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Market_groupsearch extends Tablesearch implements IMarket_groupsearch {

    Numbersearch id = new Numbersearch("market_group.id");
    Stringsearch name = new Stringsearch("market_group.name");
    Stringsearch description = new Stringsearch("market_group.description");
//foreign keys
    Foreignkeysearch market_groupParent_idsearcher = new Foreignkeysearch("market_group", IMarket_group.market_groupParent_idPKfields, IMarket_group.market_groupParent_idFKfields);
//external foreign keys

    public String getTable() {
        return Market_group.table;
    }

    public Market_groupsearch() {
        setFieldsearchers();
    }

    public Market_groupsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(description);
        addKeysearcher(market_groupParent_idsearcher);
    }

    public void addPrimarykey(IMarket_groupPK market_groupPK) {
        super.addPrimarykey(market_groupPK);
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
    
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    public void market_groupParent_id(IMarket_groupsearch market_groupsearch) {
        market_groupParent_idsearcher.setTablesearch(market_groupsearch);
    }
    
    public IMarket_groupsearch getMarket_groupparent_idsearch() {
        if(market_groupParent_idsearcher.used()) {
            return (IMarket_groupsearch)market_groupParent_idsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getMarket_groupparent_idInnerjoin() {
        return market_groupParent_idsearcher.getInnerjoin();
    }

}
