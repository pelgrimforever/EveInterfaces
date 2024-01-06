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

public interface IGraphicsearch extends Tablesearcher {

    public void addPrimarykey(IGraphicPK graphicPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void collision_file(String[] values);
	
	public void collision_file(String[] values, byte compare, byte andor);
	
	public void graphic_file(String[] values);
	
	public void graphic_file(String[] values, byte compare, byte andor);
	
	public void icon_folder(String[] values);
	
	public void icon_folder(String[] values, byte compare, byte andor);
	
	public void sof_dna(String[] values);
	
	public void sof_dna(String[] values, byte compare, byte andor);
	
	public void sof_fation_name(String[] values);
	
	public void sof_fation_name(String[] values, byte compare, byte andor);
	
	public void sof_hull_name(String[] values);
	
	public void sof_hull_name(String[] values, byte compare, byte andor);
	
	public void sof_race_name(String[] values);
	
	public void sof_race_name(String[] values, byte compare, byte andor);
	
}
