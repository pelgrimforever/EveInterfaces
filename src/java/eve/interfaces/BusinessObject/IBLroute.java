/*
 * IBLroute.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IRoute;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Route
 * 
 * methods for manipulating data- and database objects
 * for Entity Route and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLroute extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Route()
     * @return new empty IRoute object
     */
    public IRoute newRoute();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Route(primarykey fields)
     * @return new IRoute object with initialized primary key
     */
    public IRoute newRoute(long routetype, long system);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Route(IRoutePK routePK)
     * @param routePK: primary key
     * @return new IRoute object with initialized primary key
     */
    public IRoute newRoute(IRoutePK routePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new RoutePK()
     * @return new empty IRoutePK object
     */
    public IRoutePK newRoutePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new RoutePK(primarykey fields)
     * @return new IRoutePK object with initialized primary key
     */
    public IRoutePK newRoutePK(long routetype, long system);

    /**
     * 
     * @return all Route objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Route objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRoutes() throws CustomException;

    /**
     * 
     * @param routePK: Route primary key
     * @return Route Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IRoute getRoute(IRoutePK routePK) throws CustomException;

    /**
     * Search route in database for routePK:
     * @param routePK: Route Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getRouteExists(IRoutePK routePK) throws DBException;

    /**
     * try to insert Route object in database
     * commit transaction
     * @param route: Route Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertRoute(IRoute route) throws CustomException, DataException;

    /**
     * check if Route exists
     * insert if not, update if found
     * do not commit transaction
     * @param route: Route Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateRoute(IRoute route) throws CustomException, DataException;

    /**
     * try to update Route object in database
     * commit transaction
     * @param route: Route Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateRoute(IRoute route) throws CustomException, DataException;
    
    /**
     * try to delete Route object in database
     * commit transaction
     * @param route: Route Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteRoute(IRoute route) throws CustomException;

    /**
     * try to insert Route object in database
     * do not commit transaction
     * @param route: Route Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertRoute(IRoute route) throws CustomException, DataException;

    /**
     * try to update Route object in database
     * do not commit transaction
     * @param route: Route Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateRoute(IRoute route) throws CustomException, DataException;
    
    /**
     * try to delete Route object in database
     * do not commit transaction
     * @param route: Route Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteRoute(IRoute route) throws CustomException;
    
    /**
     * @param routetypePK: foreign key for Routetype
     * @return all Route Entity objects for Routetype
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRoutes4routetype(IRoutetypePK routetypePK) throws CustomException;

    /**
     * @param systemPK: foreign key for System
     * @return all Route Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRoutes4system(ISystemPK systemPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
