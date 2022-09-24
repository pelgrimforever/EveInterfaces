/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface ISystemjumpsPK extends EntityPK, Serializable {

    public ISystemPK getSystemsystem_endPK();
    public void setSystemsystem_endPK(ISystemPK systemPK);

    public ISystemPK getSystemsystem_startPK();
    public void setSystemsystem_startPK(ISystemPK systemPK);

    public long getSystem_start();

    public void setSystem_start(long system_start);

    public long getSystem_end();

    public void setSystem_end(long system_end);


    public boolean equals(ISystemjumpsPK systemjumpsPK2);

}
