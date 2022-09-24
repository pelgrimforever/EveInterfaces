/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.ISystemjumpssearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Systemjumps;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Systemjumpssearch extends Tablesearch implements ISystemjumpssearch {

    Numbersearch jumps = new Numbersearch("systemjumps.jumps");
    Numbersearch jumpslowsec = new Numbersearch("systemjumps.jumpslowsec");
    Numbersearch jumpsnullsec = new Numbersearch("systemjumps.jumpsnullsec");
    Numbersearch jumpssafe = new Numbersearch("systemjumps.jumpssafe");
    Numbersearch jumpssafelowsec = new Numbersearch("systemjumps.jumpssafelowsec");
    Numbersearch jumpssafenullsec = new Numbersearch("systemjumps.jumpssafenullsec");
//foreign keys
    Foreignkeysearch systemSystem_endsearcher = new Foreignkeysearch("system", ISystemjumps.systemSystem_endPKfields, ISystemjumps.systemSystem_endFKfields);
    Foreignkeysearch systemSystem_startsearcher = new Foreignkeysearch("system", ISystemjumps.systemSystem_startPKfields, ISystemjumps.systemSystem_startFKfields);
//external foreign keys

    public String getTable() {
        return Systemjumps.table;
    }

    public Systemjumpssearch() {
        setFieldsearchers();
    }

    public Systemjumpssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(jumps);
        addFieldsearcher(jumpslowsec);
        addFieldsearcher(jumpsnullsec);
        addFieldsearcher(jumpssafe);
        addFieldsearcher(jumpssafelowsec);
        addFieldsearcher(jumpssafenullsec);
        addKeysearcher(systemSystem_endsearcher);
        addKeysearcher(systemSystem_startsearcher);
    }

    public void addPrimarykey(ISystemjumpsPK systemjumpsPK) {
        super.addPrimarykey(systemjumpsPK);
    }

    public void jumps(Double[] values, byte[] operators) {
        addNumbervalues(jumps, values, operators);
    }
    
    public void jumps(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumps, values, operators);
        jumps.setAndoroperator(andor);
    }
    
    public void jumpslowsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpslowsec, values, operators);
    }
    
    public void jumpslowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpslowsec, values, operators);
        jumpslowsec.setAndoroperator(andor);
    }
    
    public void jumpsnullsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpsnullsec, values, operators);
    }
    
    public void jumpsnullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpsnullsec, values, operators);
        jumpsnullsec.setAndoroperator(andor);
    }
    
    public void jumpssafe(Double[] values, byte[] operators) {
        addNumbervalues(jumpssafe, values, operators);
    }
    
    public void jumpssafe(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpssafe, values, operators);
        jumpssafe.setAndoroperator(andor);
    }
    
    public void jumpssafelowsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpssafelowsec, values, operators);
    }
    
    public void jumpssafelowsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpssafelowsec, values, operators);
        jumpssafelowsec.setAndoroperator(andor);
    }
    
    public void jumpssafenullsec(Double[] values, byte[] operators) {
        addNumbervalues(jumpssafenullsec, values, operators);
    }
    
    public void jumpssafenullsec(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(jumpssafenullsec, values, operators);
        jumpssafenullsec.setAndoroperator(andor);
    }
    
    public void systemSystem_end(ISystemsearch systemsearch) {
        systemSystem_endsearcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getSystemsystem_endsearch() {
        if(systemSystem_endsearcher.used()) {
            return (ISystemsearch)systemSystem_endsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSystemsystem_endInnerjoin() {
        return systemSystem_endsearcher.getInnerjoin();
    }

    public void systemSystem_start(ISystemsearch systemsearch) {
        systemSystem_startsearcher.setTablesearch(systemsearch);
    }
    
    public ISystemsearch getSystemsystem_startsearch() {
        if(systemSystem_startsearcher.used()) {
            return (ISystemsearch)systemSystem_startsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSystemsystem_startInnerjoin() {
        return systemSystem_startsearcher.getInnerjoin();
    }

}
