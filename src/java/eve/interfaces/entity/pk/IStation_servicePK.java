/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IStation_servicePK extends EntityPK, Serializable {

    public IStationPK getStationPK();
    public void setStationPK(IStationPK stationPK);

    public long getStation();

    public void setStation(long station);

    public java.lang.String getService();

    public void setService(java.lang.String service);


    public boolean equals(IStation_servicePK station_servicePK2);

}
