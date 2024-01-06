/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import eve.interfaces.entity.pk.*;
import eve.interfaces.searchentity.*;

public interface ICorporationsearch extends Tablesearcher {

    public void addPrimarykey(ICorporationPK corporationPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void ceo(Double[] values, byte[] operators);
	
	public void ceo(Double[] values, byte[] operators, byte andor);
	
	public void creator(Double[] values, byte[] operators);
	
	public void creator(Double[] values, byte[] operators, byte andor);
	
	public void member_count(Double[] values, byte[] operators);
	
	public void member_count(Double[] values, byte[] operators, byte andor);
	
	public void tax_rate(Double[] values, byte[] operators);
	
	public void tax_rate(Double[] values, byte[] operators, byte andor);
	
	public void ticker(String[] values);
	
	public void ticker(String[] values, byte compare, byte andor);
	
	public void date_founded(Timestamp[] values, byte[] operators);
	
	public void date_founded(Timestamp[] values, byte[] operators, byte andor);
	
	public void description(String[] values);
	
	public void description(String[] values, byte compare, byte andor);
	
	public void shares(Double[] values, byte[] operators);
	
	public void shares(Double[] values, byte[] operators, byte andor);
	
	public void url(String[] values);
	
	public void url(String[] values, byte compare, byte andor);
	
	public void war_eligible(Boolean value);
	
	public void station(IStationsearch stationsearch);
	
	public void faction(IFactionsearch factionsearch);
	
	public void alliance(IAlliancesearch alliancesearch);
	
}
