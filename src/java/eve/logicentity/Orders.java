/*
 * Orders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IOrdersPK;
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
 * Entity class Orders
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Orders extends eve.entity.eOrders implements IOrders {

    public static final String SQLSelect = "select orders.* from orders";
    public static final String SQLWhereevetype = "evetype = :evetype.id:";
    public static final String SQLWheresystem = "system = :system.id:";

//Custom code, do not change this line
    public static final String Truncate = "truncate table systemtrade_order, trade, orders";
    
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;

    public static final String SQLdeleteall = "delete from orders";
    public static final String SQLreset = "update orders set isopen = :isopen:";
    
    public static final String SQLgetSellorders4system = "select * from orders o " +
        "where o.system = :system.id: and o.id in " +
        "(select sellorderid from view_systemtradeorders " +
        "where packaged_volume <= :max_cargovolume: and buy_totalprice * :net_perc: > sell_totalprice) " +
        "order by evetype, price";
    public static final String SQLgetBuyorders4system = "select * from orders o " +
        "where o.system = :system.id: and o.id in " +
        "(select buyorderid from view_systemtradeorders " +
        "where packaged_volume <= :max_cargovolume: and buy_totalprice * :net_perc: > sell_totalprice) " +
        "order by evetype, price desc";
    public static final String SQLgetSellorders4system2 = "select * from orders o inner join evetype e on e.id = o.evetype " +
        "where not o.is_buy_order and o.system = :system.id: and e.packaged_volume <= :max_cargovolume: " +
        "order by evetype, price";
    public static final String SQLgetSellorders4systemevetype = "select * from orders " +
        "where not is_buy_order and system = :system.id: and evetype = :evetype.id: and price < :max_price: " +
        "order by price";
    public static final String SQLgetBuyorders4system2 = "select * from orders o inner join evetype e on e.id = o.evetype " +
        "where o.is_buy_order and o.system = :system.id: and e.packaged_volume <= :max_cargovolume: " +
        "order by evetype, price desc";

/*    
    public static final String SQLbuy_orders = "select o.*, e.packaged_volume from orders o " +
        "inner join evetype e on e.id = o.evetype and o.price > e.min_selorder and e.packaged_volume<=:maxvolume: " +
        "inner join system s on s.id = o.system and s.security_island = :security_island.id: " +
        "where o.is_buy_order " +
        "order by o.evetype, o.system, o.volume_remain*o.price desc";
    public static final String SQLbuy_orders4evetype = "select o.*, e.packaged_volume from orders o " +
        "inner join evetype e on e.id = o.evetype and e.id = :evetype.id: and o.price > e.min_selorder and e.packaged_volume<=:maxvolume: " +
        "inner join system s on s.id = o.system and s.security_island = :security_island.id: " +
        "where o.is_buy_order";
    public static final String SQLsell_orders = "select o.*, e.packaged_volume from orders o " +
        "inner join evetype e on e.id = o.evetype and o.price < e.max_buyorder and e.packaged_volume<=:maxvolume: " +
        "inner join system s on s.id = o.system and s.security_island = :security_island.id: " +
        "where not o.is_buy_order " +
        "order by o.evetype, o.system, o.volume_remain*o.price";
*/    
    private double packaged_volume = 0;
//Custom code, do not change this line

    public static final String SQLSelect4evetype = "select * from orders where " + SQLWhereevetype + OrderBy;
    public static final String SQLDelete4evetype = "delete from orders where " + SQLWhereevetype;
    public static final String SQLSelect4system = "select * from orders where " + SQLWheresystem + OrderBy;
    public static final String SQLDelete4system = "delete from orders where " + SQLWheresystem;

    /**
     * Constructor
     * Creates an empty Orders entity
     */
    public Orders() {
    }
    
    /**
     * Constructor
     * build an empty Orders entity with initialized field values
     */
    public Orders(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Orders entity with initialized Primarykey parameter
     * @param ordersPK: Orders Primarykey
     */
    public Orders(OrdersPK ordersPK) {
        super(ordersPK);
    }

//Custom code, do not change this line
    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }
    
    public double getPackaged_volume() {
        return this.packaged_volume;
    }
    
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
