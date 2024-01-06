/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

public class Corporation extends eve.entity.eCorporation implements ICorporation {

//Custom code, do not change this line
//Custom code, do not change this line

    public Corporation() {
    }
    
    public Corporation(long id) {
        super(id);
    }

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
        String urlcrop = url;
        if(urlcrop!=null)
            urlcrop = urlcrop.substring(0, Math.min(urlcrop.length(), SIZE_URL));
        super.setUrl(urlcrop);
    }
//Custom code, do not change this line
}
