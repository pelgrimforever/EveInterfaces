/*
 * Systemtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ISystemtradePK;
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
 * Entity class Systemtrade
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Systemtrade extends eve.entity.eSystemtrade implements ISystemtrade {

    public static final String SQLSelect = "select systemtrade.* from systemtrade";
    public static final String SQLWheresystemSell_system = "sell_system = :system.id:";
    public static final String SQLWheresystemBuy_system = "buy_system = :system.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by sell_system, buy_system";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
    public static final String SQLdeleteall = "delete from systemtrade";
    public static final String SQLSelectSystemtrade = "select sell_system, buy_system, sum(buy_totalprice * :net_perc: - sell_totalprice) as profit, " +
        "sum(cargo_volume) as total_cargo_volume, max(jumps) as jumps from view_systemtradeorders " +
        "where packaged_volume <= :max_cargovolume: and security_island = :security_island.id: and " +
        "buy_totalprice * :net_perc: > sell_totalprice " +
        "group by sell_system, buy_system " +
        "having sum(buy_totalprice * :net_perc: - sell_totalprice) > :min_profit: " +
        "order by sell_system";
    public static final String SQLInsertSystemtrade = "insert into systemtrade " +
        SQLSelectSystemtrade;
//Custom code, do not change this line

    public static final String SQLSelect4systemSell_system = "select * from systemtrade where " + SQLWheresystemSell_system + OrderBy;
    public static final String SQLDelete4systemSell_system = "delete from systemtrade where " + SQLWheresystemSell_system;
    public static final String SQLSelect4systemBuy_system = "select * from systemtrade where " + SQLWheresystemBuy_system + OrderBy;
    public static final String SQLDelete4systemBuy_system = "delete from systemtrade where " + SQLWheresystemBuy_system;

    /**
     * Constructor
     * Creates an empty Systemtrade entity
     */
    public Systemtrade() {
    }
    
    /**
     * Constructor
     * build an empty Systemtrade entity with initialized field values
     */
    public Systemtrade(long sell_system, long buy_system) {
        super(sell_system, buy_system);
    }

    /**
     * Constructor
     * build an empty Systemtrade entity with initialized Primarykey parameter
     * @param systemtradePK: Systemtrade Primarykey
     */
    public Systemtrade(SystemtradePK systemtradePK) {
        super(systemtradePK);
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
