/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_trade_systemsevetypesearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_trade_systemsevetype;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_trade_systemsevetypesearch extends Tablesearch implements IView_trade_systemsevetypesearch {

    Numbersearch systemsell = new Numbersearch("view_trade_systemsevetype.systemsell");
    Numbersearch systembuy = new Numbersearch("view_trade_systemsevetype.systembuy");
    Numbersearch evetype = new Numbersearch("view_trade_systemsevetype.evetype");
    Numbersearch jumps = new Numbersearch("view_trade_systemsevetype.jumps");
    Numbersearch jumpslowsec = new Numbersearch("view_trade_systemsevetype.jumpslowsec");
    Numbersearch jumpsnullsec = new Numbersearch("view_trade_systemsevetype.jumpsnullsec");

    public String getTable() {
        return View_trade_systemsevetype.table;
    }

    public View_trade_systemsevetypesearch() {
        setFieldsearchers();
    }

    public View_trade_systemsevetypesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(systemsell);
        addFieldsearcher(systembuy);
        addFieldsearcher(evetype);
        addFieldsearcher(jumps);
        addFieldsearcher(jumpslowsec);
        addFieldsearcher(jumpsnullsec);
    }

    public void systemsell(Double[] values, byte[] operators) {
        addNumbervalues(systemsell, values, operators);
    }
    
    public void systemsell(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(systemsell, values, operators);
        systemsell.setAndoroperator(andor);
    }
    
    public void systembuy(Double[] values, byte[] operators) {
        addNumbervalues(systembuy, values, operators);
    }
    
    public void systembuy(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(systembuy, values, operators);
        systembuy.setAndoroperator(andor);
    }
    
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
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
    
}
