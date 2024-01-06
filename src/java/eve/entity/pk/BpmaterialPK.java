/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IBpmaterial;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class BpmaterialPK implements IBpmaterialPK {

    private IEvetypePK evetypeBpPK = new EvetypePK();
    private IEvetypePK evetypeMaterialPK = new EvetypePK();
  
    public BpmaterialPK() {
    }

    public BpmaterialPK(long bp, long material) {
        this.evetypeBpPK = new EvetypePK(bp);
        this.evetypeMaterialPK = new EvetypePK(material);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"bpmaterial.bp", evetypeBpPK.getId()}, 
            {"bpmaterial.material", evetypeMaterialPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IBpmaterial.BP, evetypeBpPK.getId()}, 
            {IBpmaterial.MATERIAL, evetypeMaterialPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IEvetypePK getEvetypebpPK() {
        return this.evetypeBpPK;
    }

    public void setEvetypebpPK(IEvetypePK evetypePK) {
        this.evetypeBpPK = evetypePK;
    }

    public IEvetypePK getEvetypematerialPK() {
        return this.evetypeMaterialPK;
    }

    public void setEvetypematerialPK(IEvetypePK evetypePK) {
        this.evetypeMaterialPK = evetypePK;
    }

    public long getBp() {
        return this.evetypeBpPK.getId();
    }

    public void setBp(long bp) {
        this.evetypeBpPK.setId(bp);
    }

    public long getMaterial() {
        return this.evetypeMaterialPK.getId();
    }

    public void setMaterial(long material) {
        this.evetypeMaterialPK.setId(material);
    }

    public String getKeystring() {
        String key = "";
        key += getBp();
        key += "_";

        key += getMaterial();
        return key;
    }

    public static BpmaterialPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long bp = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long material = Long.valueOf(keys.substring(0, keylength));
            return new BpmaterialPK(bp, material);
        }
    }

    public boolean equals(IBpmaterialPK bpmaterialPK2) {
        boolean isequal = bpmaterialPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypeBpPK.equals(bpmaterialPK2.getEvetypebpPK());
            isequal = isequal && this.evetypeMaterialPK.equals(bpmaterialPK2.getEvetypematerialPK());
        }
        return isequal;
    }
}
