/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_systemsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_system;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_systemsearch extends Tablesearch implements IView_systemsearch {

    Numbersearch jumpssafe = new Numbersearch("view_system.jumpssafe");
    Numbersearch jumpssafelowsec = new Numbersearch("view_system.jumpssafelowsec");
    Numbersearch jumpssafenullsec = new Numbersearch("view_system.jumpssafenullsec");
    Stringsearch regionname = new Stringsearch("view_system.regionname");
    Numbersearch system_start = new Numbersearch("view_system.system_start");
    Numbersearch system_end = new Numbersearch("view_system.system_end");
    Numbersearch id = new Numbersearch("view_system.id");
    Stringsearch name = new Stringsearch("view_system.name");
    Numbersearch constellation = new Numbersearch("view_system.constellation");
    Stringsearch security_class = new Stringsearch("view_system.security_class");
    Numbersearch security_status = new Numbersearch("view_system.security_status");
    Numbersearch star_id = new Numbersearch("view_system.star_id");
    Booleansearch noaccess = new Booleansearch("view_system.noaccess");
    Booleansearch isconstellationborder = new Booleansearch("view_system.isconstellationborder");
    Booleansearch isregionborder = new Booleansearch("view_system.isregionborder");
    Numbersearch security_island = new Numbersearch("view_system.security_island");
    Datesearch downloaddate = new Datesearch("view_system.downloaddate");

    public String getTable() {
        return View_system.table;
    }

    public View_systemsearch() {
        setFieldsearchers();
    }

    public View_systemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(jumpssafe);
        addFieldsearcher(jumpssafelowsec);
        addFieldsearcher(jumpssafenullsec);
        addFieldsearcher(regionname);
        addFieldsearcher(system_start);
        addFieldsearcher(system_end);
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(constellation);
        addFieldsearcher(security_class);
        addFieldsearcher(security_status);
        addFieldsearcher(star_id);
        addFieldsearcher(noaccess);
        addFieldsearcher(isconstellationborder);
        addFieldsearcher(isregionborder);
        addFieldsearcher(security_island);
        addFieldsearcher(downloaddate);
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
    
    public void regionname(String[] values) {
        addStringvalues(regionname, values);
    }
    
    public void regionname(String[] values, byte compare, byte andor) {
        addStringvalues(regionname, values);
        regionname.setCompareoperator(compare);
        regionname.setAndoroperator(andor);
    }
    
    public void system_start(Double[] values, byte[] operators) {
        addNumbervalues(system_start, values, operators);
    }
    
    public void system_start(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(system_start, values, operators);
        system_start.setAndoroperator(andor);
    }
    
    public void system_end(Double[] values, byte[] operators) {
        addNumbervalues(system_end, values, operators);
    }
    
    public void system_end(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(system_end, values, operators);
        system_end.setAndoroperator(andor);
    }
    
    public void id(Double[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(Double[] values, byte[] operators, byte andor) {
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
    
    public void constellation(Double[] values, byte[] operators) {
        addNumbervalues(constellation, values, operators);
    }
    
    public void constellation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(constellation, values, operators);
        constellation.setAndoroperator(andor);
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
    
    public void security_island(Double[] values, byte[] operators) {
        addNumbervalues(security_island, values, operators);
    }
    
    public void security_island(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(security_island, values, operators);
        security_island.setAndoroperator(andor);
    }
    
    public void downloaddate(Date[] values, byte[] operators) {
        addDatevalues(downloaddate, values, operators);
    }
    
    public void downloaddate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(downloaddate, values, operators);
        downloaddate.setAndoroperator(andor);
    }
    
}
