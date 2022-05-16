/*
 * Frontendpage.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IFrontendpagePK;
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
 * Entity class Frontendpage
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Frontendpage extends eve.entity.eFrontendpage implements IFrontendpage {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Frontendpage entity
     */
    public Frontendpage() {
    }
    
    /**
     * Constructor
     * build an empty Frontendpage entity with initialized field values
     */
    public Frontendpage(java.lang.String name) {
        super(name);
    }

    /**
     * Constructor
     * build an empty Frontendpage entity with initialized Primarykey parameter
     * @param frontendpagePK: Frontendpage Primarykey
     */
    public Frontendpage(FrontendpagePK frontendpagePK) {
        super(frontendpagePK);
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
