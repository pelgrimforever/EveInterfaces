/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IRegion_neighbour;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Region_neighbourPK implements IRegion_neighbourPK {

    private IRegionPK regionRegionPK = new RegionPK();
    private IRegionPK regionNeighbourPK = new RegionPK();
  
    public Region_neighbourPK() {
    }

    public Region_neighbourPK(long region, long neighbour) {
        this.regionRegionPK = new RegionPK(region);
        this.regionNeighbourPK = new RegionPK(neighbour);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"region_neighbour.region", regionRegionPK.getId()}, 
            {"region_neighbour.neighbour", regionNeighbourPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IRegion_neighbour.REGION, regionRegionPK.getId()}, 
            {IRegion_neighbour.NEIGHBOUR, regionNeighbourPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IRegionPK getRegionregionPK() {
        return this.regionRegionPK;
    }

    public void setRegionregionPK(IRegionPK regionPK) {
        this.regionRegionPK = regionPK;
    }

    public IRegionPK getRegionneighbourPK() {
        return this.regionNeighbourPK;
    }

    public void setRegionneighbourPK(IRegionPK regionPK) {
        this.regionNeighbourPK = regionPK;
    }

    public long getRegion() {
        return this.regionRegionPK.getId();
    }

    public void setRegion(long region) {
        this.regionRegionPK.setId(region);
    }

    public long getNeighbour() {
        return this.regionNeighbourPK.getId();
    }

    public void setNeighbour(long neighbour) {
        this.regionNeighbourPK.setId(neighbour);
    }

    public String getKeystring() {
        String key = "";
        key += getRegion();
        key += "_";

        key += getNeighbour();
        return key;
    }

    public static Region_neighbourPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long region = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long neighbour = Long.valueOf(keys.substring(0, keylength));
            return new Region_neighbourPK(region, neighbour);
        }
    }

    public boolean equals(IRegion_neighbourPK region_neighbourPK2) {
        boolean isequal = region_neighbourPK2!=null;
        if(isequal) {
            isequal = isequal && this.regionRegionPK.equals(region_neighbourPK2.getRegionregionPK());
            isequal = isequal && this.regionNeighbourPK.equals(region_neighbourPK2.getRegionneighbourPK());
        }
        return isequal;
    }
}
