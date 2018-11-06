package com.fastsun.framework.jpa.base;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.domain.Sort.Direction;
import java.util.ArrayList;
import java.util.List;

public class SimpleSortBuilder {

    public static Sort generateSort(String... fields) {
        List<Order> orders = new ArrayList<Order>();
        for(String f:fields) {
            orders.add(generateOrder(f));
        }
        return Sort.by(orders);
    }
    private static Order generateOrder(String f) {
        Order order = null;
        String[] ff = f.split("_");
        if(ff.length>=2) {
            if(ff[1].equals("d")) {
                order = new Order(Direction.DESC,ff[0]);
            } else {
                order = new Order(Direction.ASC,ff[0]);
            }
            return order;
        }
        order = Order.by(f);
        return order;
    }

}
