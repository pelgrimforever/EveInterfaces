/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IView_wishlistsearch;
import data.interfaces.db.*;
import eve.interfaces.logicview.*;
import eve.interfaces.searchentity.*;
import eve.logicview.View_wishlist;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_wishlistsearch extends Tablesearch implements IView_wishlistsearch {

    Stringsearch username = new Stringsearch("view_wishlist.username");
    Numbersearch maxprice = new Numbersearch("view_wishlist.maxprice");
    Numbersearch id = new Numbersearch("view_wishlist.id");
    Stringsearch name = new Stringsearch("view_wishlist.name");
    Numbersearch typegroup = new Numbersearch("view_wishlist.typegroup");
    Booleansearch published = new Booleansearch("view_wishlist.published");
    Stringsearch description = new Stringsearch("view_wishlist.description");
    Numbersearch capacity = new Numbersearch("view_wishlist.capacity");
    Numbersearch graphic = new Numbersearch("view_wishlist.graphic");
    Numbersearch icon = new Numbersearch("view_wishlist.icon");
    Numbersearch market_group = new Numbersearch("view_wishlist.market_group");
    Numbersearch mass = new Numbersearch("view_wishlist.mass");
    Numbersearch packaged_volume = new Numbersearch("view_wishlist.packaged_volume");
    Numbersearch portion_size = new Numbersearch("view_wishlist.portion_size");
    Numbersearch radius = new Numbersearch("view_wishlist.radius");
    Numbersearch volume = new Numbersearch("view_wishlist.volume");
    Numbersearch avg_buyorder = new Numbersearch("view_wishlist.avg_buyorder");
    Numbersearch avg_sellorder = new Numbersearch("view_wishlist.avg_sellorder");
    Numbersearch min_buyorder = new Numbersearch("view_wishlist.min_buyorder");
    Numbersearch max_buyorder = new Numbersearch("view_wishlist.max_buyorder");
    Numbersearch min_selorder = new Numbersearch("view_wishlist.min_selorder");
    Numbersearch max_selorder = new Numbersearch("view_wishlist.max_selorder");

    public String getTable() {
        return View_wishlist.table;
    }

    public View_wishlistsearch() {
        setFieldsearchers();
    }

    public View_wishlistsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(maxprice);
        addFieldsearcher(id);
        addFieldsearcher(name);
        addFieldsearcher(typegroup);
        addFieldsearcher(published);
        addFieldsearcher(description);
        addFieldsearcher(capacity);
        addFieldsearcher(graphic);
        addFieldsearcher(icon);
        addFieldsearcher(market_group);
        addFieldsearcher(mass);
        addFieldsearcher(packaged_volume);
        addFieldsearcher(portion_size);
        addFieldsearcher(radius);
        addFieldsearcher(volume);
        addFieldsearcher(avg_buyorder);
        addFieldsearcher(avg_sellorder);
        addFieldsearcher(min_buyorder);
        addFieldsearcher(max_buyorder);
        addFieldsearcher(min_selorder);
        addFieldsearcher(max_selorder);
    }

    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    public void maxprice(Double[] values, byte[] operators) {
        addNumbervalues(maxprice, values, operators);
    }
    
    public void maxprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(maxprice, values, operators);
        maxprice.setAndoroperator(andor);
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
    
    public void typegroup(Double[] values, byte[] operators) {
        addNumbervalues(typegroup, values, operators);
    }
    
    public void typegroup(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(typegroup, values, operators);
        typegroup.setAndoroperator(andor);
    }
    
    public void published(Boolean value) {
        addBooleanvalue(published, value);
    }
    
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    public void capacity(Double[] values, byte[] operators) {
        addNumbervalues(capacity, values, operators);
    }
    
    public void capacity(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(capacity, values, operators);
        capacity.setAndoroperator(andor);
    }
    
    public void graphic(Double[] values, byte[] operators) {
        addNumbervalues(graphic, values, operators);
    }
    
    public void graphic(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(graphic, values, operators);
        graphic.setAndoroperator(andor);
    }
    
    public void icon(Double[] values, byte[] operators) {
        addNumbervalues(icon, values, operators);
    }
    
    public void icon(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(icon, values, operators);
        icon.setAndoroperator(andor);
    }
    
    public void market_group(Double[] values, byte[] operators) {
        addNumbervalues(market_group, values, operators);
    }
    
    public void market_group(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(market_group, values, operators);
        market_group.setAndoroperator(andor);
    }
    
    public void mass(Double[] values, byte[] operators) {
        addNumbervalues(mass, values, operators);
    }
    
    public void mass(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(mass, values, operators);
        mass.setAndoroperator(andor);
    }
    
    public void packaged_volume(Double[] values, byte[] operators) {
        addNumbervalues(packaged_volume, values, operators);
    }
    
    public void packaged_volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(packaged_volume, values, operators);
        packaged_volume.setAndoroperator(andor);
    }
    
    public void portion_size(Double[] values, byte[] operators) {
        addNumbervalues(portion_size, values, operators);
    }
    
    public void portion_size(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(portion_size, values, operators);
        portion_size.setAndoroperator(andor);
    }
    
    public void radius(Double[] values, byte[] operators) {
        addNumbervalues(radius, values, operators);
    }
    
    public void radius(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(radius, values, operators);
        radius.setAndoroperator(andor);
    }
    
    public void volume(Double[] values, byte[] operators) {
        addNumbervalues(volume, values, operators);
    }
    
    public void volume(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(volume, values, operators);
        volume.setAndoroperator(andor);
    }
    
    public void avg_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_buyorder, values, operators);
    }
    
    public void avg_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_buyorder, values, operators);
        avg_buyorder.setAndoroperator(andor);
    }
    
    public void avg_sellorder(Double[] values, byte[] operators) {
        addNumbervalues(avg_sellorder, values, operators);
    }
    
    public void avg_sellorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(avg_sellorder, values, operators);
        avg_sellorder.setAndoroperator(andor);
    }
    
    public void min_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(min_buyorder, values, operators);
    }
    
    public void min_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_buyorder, values, operators);
        min_buyorder.setAndoroperator(andor);
    }
    
    public void max_buyorder(Double[] values, byte[] operators) {
        addNumbervalues(max_buyorder, values, operators);
    }
    
    public void max_buyorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_buyorder, values, operators);
        max_buyorder.setAndoroperator(andor);
    }
    
    public void min_selorder(Double[] values, byte[] operators) {
        addNumbervalues(min_selorder, values, operators);
    }
    
    public void min_selorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(min_selorder, values, operators);
        min_selorder.setAndoroperator(andor);
    }
    
    public void max_selorder(Double[] values, byte[] operators) {
        addNumbervalues(max_selorder, values, operators);
    }
    
    public void max_selorder(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(max_selorder, values, operators);
        max_selorder.setAndoroperator(andor);
    }
    
}
