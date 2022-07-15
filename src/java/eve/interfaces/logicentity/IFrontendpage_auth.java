/*
 * IFrontendpage_auth.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
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

/**
 * Entity Interface IFrontendpage_auth
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IFrontendpage_auth extends LogicEntity {

    public IFrontendpage_authPK getPrimaryKey();
	
    public static short USERNAME = 1;
    public static short FRONTENDPAGE = 2;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_FRONTENDPAGE = 50;
    public static final String[] fieldnames = { "username", "frontendpage" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String };

    public static final String[] frontendpagePKfields = { "frontendpage.name" };
    public static final String[] frontendpageFKfields = { "frontendpage_auth.frontendpage" };
    public static final String[] eveuserPKfields = { "eveuser.username" };
    public static final String[] eveuserFKfields = { "frontendpage_auth.username" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
