/*
 * Corporation.java
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
import eve.interfaces.entity.pk.ICorporationPK;
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
 * Entity class Corporation
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Corporation extends eve.entity.eCorporation implements ICorporation {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Corporation entity
     */
    public Corporation() {
    }
    
    /**
     * Constructor
     * build an empty Corporation entity with initialized field values
     */
    public Corporation(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Corporation entity with initialized Primarykey parameter
     * @param corporationPK: Corporation Primarykey
     */
    public Corporation(CorporationPK corporationPK) {
        super(corporationPK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }

    /**
     * set url value
     * @param url: new value
     */
    public void setUrl(java.lang.String url) {
        String urlcrop = url.substring(0, Math.min(url.length(), SIZE_URL));
        super.setUrl(urlcrop);
    }
//Custom code, do not change this line
}
