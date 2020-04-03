package com.scoop.mall.service;

import com.scoop.mall.entity.Order;
import java.math.BigDecimal;

/**
 * @author scoop
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    void create(Order order);

    /**
     * 修改订单状态
     * @param userId
     * @param money
     * @param status
     */
    void update(Long userId,BigDecimal money,Integer status);
}
