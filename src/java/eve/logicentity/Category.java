/*
 * Category.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.4.2021 13:20
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ICategoryPK;
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

/**
 * Entity class Category
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Category extends eve.entity.eCategory implements ICategory {

    public static final String SQLSelect = "select category.* from category";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line


    /**
     * Constructor
     * Creates an empty Category entity
     */
    public Category() {
    }
    
    /**
     * Constructor
     * build an empty Category entity with initialized field values
     */
    public Category(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Category entity with initialized Primarykey parameter
     * @param categoryPK: Category Primarykey
     */
    public Category(CategoryPK categoryPK) {
        super(categoryPK);
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
