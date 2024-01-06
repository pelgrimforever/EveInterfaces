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

public class Frontendpage_auth extends eve.entity.eFrontendpage_auth implements IFrontendpage_auth {

//Custom code, do not change this line
//Custom code, do not change this line

    public Frontendpage_auth() {
    }
    
    public Frontendpage_auth(java.lang.String username, java.lang.String frontendpage) {
        super(username, frontendpage);
    }

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
