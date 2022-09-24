/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_tradeorderssearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_tradeorders;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_tradeorderssearch extends Tablesearch implements IView_tradeorderssearch {

    Numbersearch tradevolume = new Numbersearch("view_tradeorders.tradevolume");
    Numbersearch buy_totalprice = new Numbersearch("view_tradeorders.buy_totalprice");
    Numbersearch sell_totalprice = new Numbersearch("view_tradeorders.sell_totalprice");
    Numbersearch cargo_volume = new Numbersearch("view_tradeorders.cargo_volume");
    Numbersearch sell_id = new Numbersearch("view_tradeorders.sell_id");
    Numbersearch sell_system = new Numbersearch("view_tradeorders.sell_system");
    Numbersearch sell_location = new Numbersearch("view_tradeorders.sell_location");
    Numbersearch sell_evetype = new Numbersearch("view_tradeorders.sell_evetype");
    Numbersearch sell_packaged_volume = new Numbersearch("view_tradeorders.sell_packaged_volume");
    Numbersearch sell_volume_remain = new Numbersearch("view_tradeorders.sell_volume_remain");
    Numbersearch sell_price = new Numbersearch("view_tradeorders.sell_price");
    Numbersearch security_island = new Numbersearch("view_tradeorders.security_island");
    Numbersearch buy_id = new Numbersearch("view_tradeorders.buy_id");
    Numbersearch buy_system = new Numbersearch("view_tradeorders.buy_system");
    Numbersearch buy_location = new Numbersearch("view_tradeorders.buy_location");
    Numbersearch buy_volume_remain = new Numbersearch("view_tradeorders.buy_volume_remain");
    Numbersearch buy_price = new Numbersearch("view_tradeorders.buy_price");
    Numbersearch jumps = new Numbersearch("view_tradeorders.jumps");
    Numbersearch jumpslowsec = new Numbersearch("view_tradeorders.jumpslowsec");
    Numbersearch jumpsnullsec = new Numbersearch("view_tradeorders.jumpsnullsec");

    public String getTable() {
        return View_tradeorders.table;
    }

    public View_tradeorderssearch() {
        setFieldsearchers();
    }

    public View_tradeorderssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(tradevolume);
        addFieldsearcher(buy_totalprice);
        addFieldsearcher(sell_totalprice);
        addFieldsearcher(cargo_volume);
        addFieldsearcher(sell_id);
        addFieldsearcher(sell_system);
        addFieldsearcher(sell_location);
        addFieldsearcher(sell_evetype);
        addFieldsearcher(sell_packaged_volume);
        addFieldsearcher(sell_volume_remain);
        addFieldsearcher(sell_price);
        addFieldsearcher(security_island);
        addFieldsearcher(buy_id);
        addFieldsearcher(buy_system);
        addFieldsearcher(buy_location);
        addFieldsearcher(buy_volume_remain);
        addFieldsearcher(buy_price);
        addFieldsearcher(jumps);
        addFieldsearcher(jumpslowsec);
        addFieldsearcher(jumpsnullsec);
    }

    public void tradevolume(Double[] values, byte[] operators) {
        addNumbervalues(tradevolume, values, operators);
    }
    
    public void tradevolume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(tradevolume, values, operators);
        tradevolume.setAndoroperator(andor);
    }
    
    public void buy_totalprice(Double[] values, byte[] operators) {
        addNumbervalues(buy_totalprice, values, operators);
    }
    
    public void buy_totalprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_totalprice, values, operators);
        buy_totalprice.setAndoroperator(andor);
    }
    
    public void sell_totalprice(Double[] values, byte[] operators) {
        addNumbervalues(sell_totalprice, values, operators);
    }
    
    public void sell_totalprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_totalprice, values, operators);
        sell_totalprice.setAndoroperator(andor);
    }
    
    public void cargo_volume(Double[] values, byte[] operators) {
        addNumbervalues(cargo_volume, values, operators);
    }
    
    public void cargo_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(cargo_volume, values, operators);
        cargo_volume.setAndoroperator(andor);
    }
    
    public void sell_id(Double[] values, byte[] operators) {
        addNumbervalues(sell_id, values, operators);
    }
    
    public void sell_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_id, values, operators);
        sell_id.setAndoroperator(andor);
    }
    
    public void sell_system(Double[] values, byte[] operators) {
        addNumbervalues(sell_system, values, operators);
    }
    
    public void sell_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_system, values, operators);
        sell_system.setAndoroperator(andor);
    }
    
    public void sell_location(Double[] values, byte[] operators) {
        addNumbervalues(sell_location, values, operators);
    }
    
    public void sell_location(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_location, values, operators);
        sell_location.setAndoroperator(andor);
    }
    
    public void sell_evetype(Double[] values, byte[] operators) {
        addNumbervalues(sell_evetype, values, operators);
    }
    
    public void sell_evetype(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_evetype, values, operators);
        sell_evetype.setAndoroperator(andor);
    }
    
    public void sell_packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(sell_packaged_volume, values, operators);
    }
    
    public void sell_packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_packaged_volume, values, operators);
        sell_packaged_volume.setAndoroperator(andor);
    }
    
    public void sell_volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(sell_volume_remain, values, operators);
    }
    
    public void sell_volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_volume_remain, values, operators);
        sell_volume_remain.setAndoroperator(andor);
    }
    
    public void sell_price(Double[] values, byte[] operators) {
        addNumbervalues(sell_price, values, operators);
    }
    
    public void sell_price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(sell_price, values, operators);
        sell_price.setAndoroperator(andor);
    }
    
    public void security_island(Double[] values, byte[] operators) {
        addNumbervalues(security_island, values, operators);
    }
    
    public void security_island(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(security_island, values, operators);
        security_island.setAndoroperator(andor);
    }
    
    public void buy_id(Double[] values, byte[] operators) {
        addNumbervalues(buy_id, values, operators);
    }
    
    public void buy_id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_id, values, operators);
        buy_id.setAndoroperator(andor);
    }
    
    public void buy_system(Double[] values, byte[] operators) {
        addNumbervalues(buy_system, values, operators);
    }
    
    public void buy_system(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_system, values, operators);
        buy_system.setAndoroperator(andor);
    }
    
    public void buy_location(Double[] values, byte[] operators) {
        addNumbervalues(buy_location, values, operators);
    }
    
    public void buy_location(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_location, values, operators);
        buy_location.setAndoroperator(andor);
    }
    
    public void buy_volume_remain(Double[] values, byte[] operators) {
        addNumbervalues(buy_volume_remain, values, operators);
    }
    
    public void buy_volume_remain(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_volume_remain, values, operators);
        buy_volume_remain.setAndoroperator(andor);
    }
    
    public void buy_price(Double[] values, byte[] operators) {
        addNumbervalues(buy_price, values, operators);
    }
    
    public void buy_price(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(buy_price, values, operators);
        buy_price.setAndoroperator(andor);
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
