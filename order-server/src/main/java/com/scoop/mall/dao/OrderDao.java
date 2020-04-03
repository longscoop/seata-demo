package com.scoop.mall.dao;

import com.scoop.mall.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author scoop
 */
@Repository
public interface OrderDao {

	/**
	 * 创建订单
	 *
	 * @param order
	 * @return
	 */
	void create(Order order);

	/**
	 * 修改订单金额
	 *
	 * @param userId
	 * @param money
	 * @param status
	 */
	void update(@Param("userId") Long userId, @Param("money") BigDecimal money, @Param("status") Integer status);
}
