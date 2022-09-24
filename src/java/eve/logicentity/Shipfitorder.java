/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IShipfitorderPK;
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

public class Shipfitorder extends eve.entity.eShipfitorder implements IShipfitorder {

//Custom code, do not change this line
//Custom code, do not change this line

    public Shipfitorder() {
    }
    
    public Shipfitorder(java.lang.String username, java.lang.String shipname, long evetype) {
        super(username, shipname, evetype);
    }

    public Shipfitorder(ShipfitorderPK shipfitorderPK) {
        super(shipfitorderPK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
    
    public void incAmountwanted(int incamountwanted) {
        this.setAmountwanted(this.getAmountwanted() + incamountwanted);
    }

    public void decAmountwanted(int decamountwanted) {
        this.setAmountwanted(Math.max(0, this.getAmountwanted() - decamountwanted));
    }
    
    public void incAmountinstock(int incamountinstock) {
        this.setAmountinstock(this.getAmountinstock() + incamountinstock);
    }    

    public void decAmountinstock(int decamountinstock) {
        this.setAmountinstock(Math.max(0, this.getAmountinstock() - decamountinstock));
    }    

//Custom code, do not change this line
}
