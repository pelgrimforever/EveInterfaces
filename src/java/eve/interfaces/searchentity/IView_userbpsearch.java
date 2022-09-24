/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.searchentity.*;

public interface IView_userbpsearch extends Tablesearcher {

	public void blueprintname(String[] values);
	
	public void blueprintname(String[] values, byte compare, byte andor);
	
	public void typegroupname(String[] values);
	
	public void typegroupname(String[] values, byte compare, byte andor);
	
	public void username(String[] values);
	
	public void username(String[] values, byte compare, byte andor);
	
	public void bp(Double[] values, byte[] operators);
	
	public void bp(Double[] values, byte[] operators, byte andor);
	
	public void serialnumber(Double[] values, byte[] operators);
	
	public void serialnumber(Double[] values, byte[] operators, byte andor);
	
	public void original(Boolean value);
	
	public void materialefficiency(Double[] values, byte[] operators);
	
	public void materialefficiency(Double[] values, byte[] operators, byte andor);
	
	public void amountproduced(Double[] values, byte[] operators);
	
	public void amountproduced(Double[] values, byte[] operators, byte andor);
	
	public void totalamount(Double[] values, byte[] operators);
	
	public void totalamount(Double[] values, byte[] operators, byte andor);
	
	public void bpprice(Double[] values, byte[] operators);
	
	public void bpprice(Double[] values, byte[] operators, byte andor);
	
	public void researchcost(Double[] values, byte[] operators);
	
	public void researchcost(Double[] values, byte[] operators, byte andor);
	
	public void stationfee(Double[] values, byte[] operators);
	
	public void stationfee(Double[] values, byte[] operators, byte andor);
	
}
