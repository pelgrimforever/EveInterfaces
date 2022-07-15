/*
 * Frontendpage_auth.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IFrontendpage_authPK;
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
 * Entity class Frontendpage_auth
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Frontendpage_auth extends eve.entity.eFrontendpage_auth implements IFrontendpage_auth {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Frontendpage_auth entity
     */
    public Frontendpage_auth() {
    }
    
    /**
     * Constructor
     * build an empty Frontendpage_auth entity with initialized field values
     */
    public Frontendpage_auth(java.lang.String username, java.lang.String frontendpage) {
        super(username, frontendpage);
    }

    /**
     * Constructor
     * build an empty Frontendpage_auth entity with initialized Primarykey parameter
     * @param frontendpage_authPK: Frontendpage_auth Primarykey
     */
    public Frontendpage_auth(Frontendpage_authPK frontendpage_authPK) {
        super(frontendpage_authPK);
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
