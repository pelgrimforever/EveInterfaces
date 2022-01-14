/*
 * Usersettings.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IUsersettingsPK;
import eve.interfaces.logicentity.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 * Entity class Usersettings
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Usersettings extends eve.entity.eUsersettings implements IUsersettings {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Usersettings entity
     */
    public Usersettings() {
    }
    
    /**
     * Constructor
     * build an empty Usersettings entity with initialized field values
     */
    public Usersettings(java.lang.String username, java.lang.String name) {
        super(username, name);
    }

    /**
     * Constructor
     * build an empty Usersettings entity with initialized Primarykey parameter
     * @param usersettingsPK: Usersettings Primarykey
     */
    public Usersettings(UsersettingsPK usersettingsPK) {
        super(usersettingsPK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
