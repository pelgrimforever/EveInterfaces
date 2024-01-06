/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:34
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

public interface IGraphic extends LogicEntity {

    public IGraphicPK getPrimaryKey();
	
    public static short ID = 1;
    public static short COLLISION_FILE = 2;
    public static short GRAPHIC_FILE = 3;
    public static short ICON_FOLDER = 4;
    public static short SOF_DNA = 5;
    public static short SOF_FATION_NAME = 6;
    public static short SOF_HULL_NAME = 7;
    public static short SOF_RACE_NAME = 8;

    public static final int SIZE_ID = 19;
    public static final int SIZE_COLLISION_FILE = 150;
    public static final int SIZE_GRAPHIC_FILE = 75;
    public static final int SIZE_ICON_FOLDER = 50;
    public static final int SIZE_SOF_DNA = 200;
    public static final int SIZE_SOF_FATION_NAME = 50;
    public static final int SIZE_SOF_HULL_NAME = 50;
    public static final int SIZE_SOF_RACE_NAME = 50;
    public static final String[] fieldnames = { "id", "collision_file", "graphic_file", "icon_folder", "sof_dna", "sof_fation_name", "sof_hull_name", "sof_race_name" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String };


//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getCollision_file();

    public void setCollision_file(java.lang.String collision_file);

    public java.lang.String getGraphic_file();

    public void setGraphic_file(java.lang.String graphic_file);

    public java.lang.String getIcon_folder();

    public void setIcon_folder(java.lang.String icon_folder);

    public java.lang.String getSof_dna();

    public void setSof_dna(java.lang.String sof_dna);

    public java.lang.String getSof_fation_name();

    public void setSof_fation_name(java.lang.String sof_fation_name);

    public java.lang.String getSof_hull_name();

    public void setSof_hull_name(java.lang.String sof_hull_name);

    public java.lang.String getSof_race_name();

    public void setSof_race_name(java.lang.String sof_race_name);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
