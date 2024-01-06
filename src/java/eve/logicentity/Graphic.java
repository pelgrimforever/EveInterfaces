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
import eve.interfaces.entity.pk.IGraphicPK;
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

public class Graphic extends eve.entity.eGraphic implements IGraphic {

//Custom code, do not change this line
//Custom code, do not change this line

    public Graphic() {
    }
    
    public Graphic(long id) {
        super(id);
    }

    public Graphic(GraphicPK graphicPK) {
        super(graphicPK);
    }

//Custom code, do not change this line
    @Override
    public void setSof_dna(java.lang.String sof_dna) {
	if(sof_dna.length()<201) this.setSof_dna(sof_dna);
    }

    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
