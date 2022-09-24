/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_shipfitsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_shipfit;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_shipfitsearch extends Tablesearch implements IView_shipfitsearch {

    Stringsearch shiptype = new Stringsearch("view_shipfit.shiptype");
    Numbersearch packaged_volume = new Numbersearch("view_shipfit.packaged_volume");
    Stringsearch username = new Stringsearch("view_shipfit.username");
    Stringsearch shipname = new Stringsearch("view_shipfit.shipname");
    Numbersearch evetype = new Numbersearch("view_shipfit.evetype");

    public String getTable() {
        return View_shipfit.table;
    }

    public View_shipfitsearch() {
        setFieldsearchers();
    }

    public View_shipfitsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(shiptype);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(username);
        addFieldsearcher(shipname);
        addFieldsearcher(evetype);
    }

    public void shiptype(String[] values) {
        addStringvalues(shiptype, values);
    }
    
    public void shiptype(String[] values, byte compare, byte andor) {
        addStringvalues(shiptype, values);
        shiptype.setCompareoperator(compare);
        shiptype.setAndoroperator(andor);
    }
    
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
    }
    
    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void shipname(String[] values) {
        addStringvalues(shipname, values);
    }
    
    public void shipname(String[] values, byte compare, byte andor) {
        addStringvalues(shipname, values);
        shipname.setCompareoperator(compare);
        shipname.setAndoroperator(andor);
    }
    
    public void evetype(Double[] values, byte[] operators) {
        addNumbervalues(evetype, values, operators);
    }
    
    public void evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(evetype, values, operators);
        evetype.setAndoroperator(andor);
    }
    
}
