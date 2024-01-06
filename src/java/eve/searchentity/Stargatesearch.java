/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IStargatesearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Stargate;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Stargatesearch extends Tablesearch implements IStargatesearch {

    Numbersearch id = new Numbersearch("stargate.id");
    Numbersearch to_stargate = new Numbersearch("stargate.to_stargate");
    Stringsearch name = new Stringsearch("stargate.name");
    Numbersearch x = new Numbersearch("stargate.x");
    Numbersearch y = new Numbersearch("stargate.y");
    Numbersearch z = new Numbersearch("stargate.z");
    Booleansearch isconstellationborder = new Booleansearch("stargate.isconstellationborder");
    Booleansearch isregionborder = new Booleansearch("stargate.isregionborder");
    Datesearch downloaddate = new Datesearch("stargate.downloaddate");
//foreign keys
    Foreignkeysearch systemSystemsearcher = new Foreignkeysearch("system", IStargate.systemSystemPKfields, IStargate.systemSystemFKfields);
    Foreignkeysearch systemTo_systemsearcher = new Foreignkeysearch("system", IStargate.systemTo_systemPKfields, IStargate.systemTo_systemFKfields);
//external foreign keys

    public String getTable() {
        return Stargate.table;
    }

    public Stargatesearch() {
        setFieldsearchers();
    }

    public Stargatesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(to_stargate);
        addFieldsearcher(name);
        addFieldsearcher(x);
        addFieldsearcher(y);
        addFieldsearcher(z);
        addFieldsearcher(isconstellationborder);
        addFieldsearcher(isregionborder);
        addFieldsearcher(downloaddate);
        addKeysearcher(systemSystemsearcher);
        addKeysearcher(systemTo_systemsearcher);
    }

    public void addPrimarykey(IStargatePK stargatePK) {
        super.addPrimarykey(stargatePK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void to_stargate(Double[] values, byte[] operators) {
        addNumbervalues(to_stargate, values, operators);
    }
    
    public void to_stargate(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(to_stargate, values, operators);
        to_stargate.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void x(Double[] values, byte[] operators) {
        addNumbervalues(x, values, operators);
    }
    
    public void x(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(x, values, operators);
        x.setAndoroperator(andor);
    }
    
    public void y(Double[] values, byte[] operators) {
        addNumbervalues(y, values, operators);
    }
    
    public void y(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(y, values, operators);
        y.setAndoroperator(andor);
    }
    
    public void z(Double[] values, byte[] operators) {
        addNumbervalues(z, values, operators);
    }
    
    public void z(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(z, values, operators);
        z.setAndoroperator(andor);
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
    
    public void systemSystem(ISystemsearch systemsearch) {
        systemSystemsearcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getSystemsystemsearch() {
        if(systemSystemsearcher.used()) {
            return (ISystemsearch)systemSystemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSystemsystemInnerjoin() {
        return systemSystemsearcher.getInnerjoin();
    }

    public void systemTo_system(ISystemsearch systemsearch) {
        systemTo_systemsearcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getSystemto_systemsearch() {
        if(systemTo_systemsearcher.used()) {
            return (ISystemsearch)systemTo_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSystemto_systemInnerjoin() {
        return systemTo_systemsearcher.getInnerjoin();
    }

}
