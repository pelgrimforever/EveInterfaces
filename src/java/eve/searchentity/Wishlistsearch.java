/*
 * Wishlistsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 11.4.2022 9:13
 *
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

/**
 * Search class for Wishlist table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Wishlistsearch extends Tablesearch implements IWishlistsearch {

    Stringsearch username = new Stringsearch("wishlist.username");
    Numbersearch maxprice = new Numbersearch("wishlist.maxprice");
//foreign keys
    Foreignkeysearch evetypesearcher = new Foreignkeysearch("evetype", IWishlist.evetypePKfields, IWishlist.evetypeFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Wishlist.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Wishlistsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Wishlistsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(username);
        addFieldsearcher(maxprice);
        addKeysearcher(evetypesearcher);
    }

    /**
     * add a primary key instance to search for
     * @param wishlistPK: Wishlist primery key
     */
    public void addPrimarykey(IWishlistPK wishlistPK) {
        super.addPrimarykey(wishlistPK);
    }

    /**
     * add String search values for field username, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void username(String[] values) {
        addStringvalues(username, values);
    }
    
    /**
     * add String search values for field username
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void username(String[] values, byte compare, byte andor) {
        addStringvalues(username, values);
        username.setCompareoperator(compare);
        username.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field maxprice, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void maxprice(Double[] values, byte[] operators) {
        addNumbervalues(maxprice, values, operators);
    }
    
    /**
     * add Numeric search values for field maxprice
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void maxprice(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(maxprice, values, operators);
        maxprice.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch evetype IEvetypesearch
     * @param evetypesearch: IEvetypesearch
     */
    public void evetype(IEvetypesearch evetypesearch) {
        evetypesearcher.setTablesearch(evetypesearch);
    }
    
    /**
     * get foreign key subsearch evetype IEvetypesearch
     * @return Tablesearch for Wishlist
     */
    public IEvetypesearch getEvetypesearch() {
        if(evetypesearcher.used()) {
            return (IEvetypesearch)evetypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if evetypesearcher is not used
     * @return inner join statement
     */
    public String getEvetypeInnerjoin() {
        return evetypesearcher.getInnerjoin();
    }

}
