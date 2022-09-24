/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.interfaces.entity.pk.*;
import eve.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

public interface IMarket_group extends LogicEntity {

    public IMarket_groupPK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short DESCRIPTION = 3;
    public static short PARENT_ID = 4;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 50;
    public static final int SIZE_DESCRIPTION = 2147483647;
    public static final int SIZE_PARENT_ID = 19;
    public static final String[] fieldnames = { "id", "name", "description", "parent_id" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_String, Datatypes.type_long };

    public static final String[] market_groupParent_idPKfields = { "market_group.id" };
    public static final String[] market_groupParent_idFKfields = { "market_group.parent_id" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    public IMarket_groupPK getMarket_groupparent_idPK();

    public void setMarket_groupparent_idPK(IMarket_groupPK market_groupParent_idPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
