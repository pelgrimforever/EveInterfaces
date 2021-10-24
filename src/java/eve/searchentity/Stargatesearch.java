/*
 * Stargatesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:40
 *
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

/**
 * Search class for Stargate table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Stargatesearch extends Tablesearch implements IStargatesearch {

    Numbersearch id = new Numbersearch("stargate.id");
    Numbersearch to_stargate = new Numbersearch("stargate.to_stargate");
    Stringsearch name = new Stringsearch("stargate.name");
    Numbersearch x = new Numbersearch("stargate.x");
    Numbersearch y = new Numbersearch("stargate.y");
    Numbersearch z = new Numbersearch("stargate.z");
    Booleansearch isconstellationborder = new Booleansearch("stargate.isconstellationborder");
    Booleansearch isregionborder = new Booleansearch("stargate.isregionborder");
    Foreignkeysearch systemSystemsearcher = new Foreignkeysearch("system", IStargate.systemSystemPKfields, IStargate.systemSystemFKfields);
    Foreignkeysearch systemTo_systemsearcher = new Foreignkeysearch("system", IStargate.systemTo_systemPKfields, IStargate.systemTo_systemFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Stargate.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Stargatesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Stargatesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(to_stargate);
        addFieldsearcher(name);
        addFieldsearcher(x);
        addFieldsearcher(y);
        addFieldsearcher(z);
        addFieldsearcher(isconstellationborder);
        addFieldsearcher(isregionborder);
        addKeysearcher(systemSystemsearcher);
        addKeysearcher(systemTo_systemsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param stargatePK: Stargate primery key
     */
    public void addPrimarykey(IStargatePK stargatePK) {
        super.addPrimarykey(stargatePK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field to_stargate, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void to_stargate(Double[] values, byte[] operators) {
        addNumbervalues(to_stargate, values, operators);
    }
    
    /**
     * add Numeric search values for field to_stargate
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void to_stargate(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(to_stargate, values, operators);
        to_stargate.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    /**
     * add String search values for field name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field x, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void x(Double[] values, byte[] operators) {
        addNumbervalues(x, values, operators);
    }
    
    /**
     * add Numeric search values for field x
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void x(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(x, values, operators);
        x.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field y, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void y(Double[] values, byte[] operators) {
        addNumbervalues(y, values, operators);
    }
    
    /**
     * add Numeric search values for field y
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void y(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(y, values, operators);
        y.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field z, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void z(Double[] values, byte[] operators) {
        addNumbervalues(z, values, operators);
    }
    
    /**
     * add Numeric search values for field z
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void z(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(z, values, operators);
        z.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field isconstellationborder
     * @param value: true or false
     */
    public void isconstellationborder(Boolean value) {
        addBooleanvalue(isconstellationborder, value);
    }
    
    /**
     * add Boolean search values for field isregionborder
     * @param value: true or false
     */
    public void isregionborder(Boolean value) {
        addBooleanvalue(isregionborder, value);
    }
    
    /**
     * set subsearch systemSystem tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void systemSystem(ISystemsearch systemsearch) {
        systemSystemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Stargate
     */
    public ISystemsearch getSystemsystemsearch() {
        if(systemSystemsearcher.used()) {
            return (ISystemsearch)systemSystemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemSystemsearcher is not used
     * @return inner join statement
     */
    public String getSystemsystemInnerjoin() {
        return systemSystemsearcher.getInnerjoin();
    }

    /**
     * set subsearch systemTo_system tablesearch
     * @param systemsearch: ISystemsearch
     */
    public void systemTo_system(ISystemsearch systemsearch) {
        systemTo_systemsearcher.setTablesearch(systemsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Stargate
     */
    public ISystemsearch getSystemto_systemsearch() {
        if(systemTo_systemsearcher.used()) {
            return (ISystemsearch)systemTo_systemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if systemTo_systemsearcher is not used
     * @return inner join statement
     */
    public String getSystemto_systemInnerjoin() {
        return systemTo_systemsearcher.getInnerjoin();
    }

}
