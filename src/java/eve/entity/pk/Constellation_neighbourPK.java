/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IConstellation_neighbour;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Constellation_neighbourPK implements IConstellation_neighbourPK {

    private IConstellationPK constellationNeighbourPK = new ConstellationPK();
    private IConstellationPK constellationConstellationPK = new ConstellationPK();
  
    public Constellation_neighbourPK() {
    }

    public Constellation_neighbourPK(long constellation, long neighbour) {
        this.constellationNeighbourPK = new ConstellationPK(neighbour);
        this.constellationConstellationPK = new ConstellationPK(constellation);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"constellation_neighbour.constellation", constellationConstellationPK.getId()}, 
            {"constellation_neighbour.neighbour", constellationNeighbourPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IConstellation_neighbour.CONSTELLATION, constellationConstellationPK.getId()}, 
            {IConstellation_neighbour.NEIGHBOUR, constellationNeighbourPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IConstellationPK getConstellationneighbourPK() {
        return this.constellationNeighbourPK;
    }

    public void setConstellationneighbourPK(IConstellationPK constellationPK) {
        this.constellationNeighbourPK = constellationPK;
    }

    public IConstellationPK getConstellationconstellationPK() {
        return this.constellationConstellationPK;
    }

    public void setConstellationconstellationPK(IConstellationPK constellationPK) {
        this.constellationConstellationPK = constellationPK;
    }

    public long getConstellation() {
        return this.constellationConstellationPK.getId();
    }

    public void setConstellation(long constellation) {
        this.constellationConstellationPK.setId(constellation);
    }

    public long getNeighbour() {
        return this.constellationNeighbourPK.getId();
    }

    public void setNeighbour(long neighbour) {
        this.constellationNeighbourPK.setId(neighbour);
    }

    public String getKeystring() {
        String key = "";
        key += getConstellation();
        key += "_";

        key += getNeighbour();
        return key;
    }

    public static Constellation_neighbourPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long constellation = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long neighbour = Long.valueOf(keys.substring(0, keylength));
            return new Constellation_neighbourPK(constellation, neighbour);
        }
    }

    public boolean equals(IConstellation_neighbourPK constellation_neighbourPK2) {
        boolean isequal = constellation_neighbourPK2!=null;
        if(isequal) {
            isequal = isequal && this.constellationNeighbourPK.equals(constellation_neighbourPK2.getConstellationneighbourPK());
            isequal = isequal && this.constellationConstellationPK.equals(constellation_neighbourPK2.getConstellationconstellationPK());
        }
        return isequal;
    }
}
