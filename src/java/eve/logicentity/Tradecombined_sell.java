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
import eve.interfaces.entity.pk.ITradecombined_sellPK;
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

public class Tradecombined_sell extends eve.entity.eTradecombined_sell implements ITradecombined_sell {

//Custom code, do not change this line
//Custom code, do not change this line

    public Tradecombined_sell() {
    }
    
    public Tradecombined_sell(long sell_system, long buy_system, long evetype, long buy_order_id, long sell_order_id) {
        super(sell_system, buy_system, evetype, buy_order_id, sell_order_id);
    }

    public Tradecombined_sell(Tradecombined_sellPK tradecombined_sellPK) {
        super(tradecombined_sellPK);
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
