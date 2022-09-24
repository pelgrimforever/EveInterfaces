/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IWishlistsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Wishlist;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Wishlistsearch extends Tablesearch implements IWishlistsearch {

    Stringsearch username = new Stringsearch("wishlist.username");
    Numbersearch maxprice = new Numbersearch("wishlist.maxprice");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IWishlist.evetypePKfields, IWishlist.evetypeFKfields);
//external foreign keys

    public String getTable() {
        return Wishlist.table;
    }

    public Wishlistsearch() {
        setFieldsearchers();
    }

    public Wishlistsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(maxprice);
        addKeysearcher(evetypesearcher);
    }

    public void addPrimarykey(IWishlistPK wishlistPK) {
        super.addPrimarykey(wishlistPK);
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
    
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

}
